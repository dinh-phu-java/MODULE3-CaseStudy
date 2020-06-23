package dinhphu.codegym.controller;

import dinhphu.codegym.model.User;
import dinhphu.codegym.services.IUserServices;
import dinhphu.codegym.services.PasswordUtil;
import dinhphu.codegym.services.UserServices;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.regex.Pattern;

@WebServlet(name = "UserController",urlPatterns = {"/user-action","/user-control"})
public class UserController extends HttpServlet {
    private static IUserServices userServices=new UserServices();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action=request.getParameter("action");
        String url="/views/home.jsp";

        if (action==null){
            action="view";
            getServletContext().getRequestDispatcher(url).forward(request,response);
        }
        switch(action){
            case "register":
                registerUser(request,response);
                break;
            case "login":
                loginUser(request,response);
                break;
            case "edit-profile":
               editUser(request,response);
                break;
            case "change-password":
                changePassword(request,response);
                break;
        }


    }

    private void changePassword(HttpServletRequest request, HttpServletResponse response) {
        String currentPassword=request.getParameter("currentPassword");
        String hashPassword=PasswordUtil.hashPassword(currentPassword);
        String newPassword=request.getParameter("newPassword");
        String confirmNewPassword=request.getParameter("confirmNewPassword");
        HttpSession session=request.getSession();
        User loginUser=(User)session.getAttribute("loginUser");
        String username=loginUser.getUserName();
        ArrayList<User> allUser=new ArrayList<>(userServices.selectAllUser()) ;
        ArrayList<String> message=new ArrayList<>();
        boolean findUser=false;
        for (User user:allUser){
            if (username.equals(user.getUserName()) && hashPassword.equals(user.getPassword())){
                findUser=true;
                break;
            }
        }

        if (findUser){

            String passwordExpression= "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$";
            Boolean passwordCheck= Pattern.matches(passwordExpression,newPassword);
            if (passwordCheck && (newPassword.equals(confirmNewPassword))){
                String hashNewPassword=PasswordUtil.hashPassword(newPassword);
                if (userServices.updatePassword(loginUser,hashNewPassword)){
                    message.add("Edit password Completed!");
                }else{
                    message.add("Can't edit password!");
                }

            }else{
                message.add("Password length must be at least 8 characters and include upper,lower,digit and special character");
                message.add("new Password is not match!");
            }

        }else{
            message.add("Current password is not correct!");
        }

        request.setAttribute("message",message);
        String url="/views/change-password.jsp";
        try {
            getServletContext().getRequestDispatcher(url).forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void editUser(HttpServletRequest request, HttpServletResponse response) {
        String fullName=request.getParameter("fullName");
        String address=request.getParameter("address");
        HttpSession session=request.getSession();
        User sessionUser=(User)session.getAttribute("loginUser");
        boolean editBoolean=false;
        User editUser=null;
        ArrayList<String> message=new ArrayList<>();
        String url="/views/home.jsp";
        String action="";

        if (fullName.equals("") || address.equals("") || fullName ==null || address==null){
            message.add("Name or Address can't be null");
        }else{
            editUser=new User(sessionUser.getId(),fullName.trim(),sessionUser.getUserName(),sessionUser.getEmail(),sessionUser.getPassword(),address.trim());
            editBoolean=userServices.editUser(editUser);
        }


        if (editBoolean){
            message.add("Edit user Completed!");
            url="/home";
            action=request.getParameter("action");
            session.setAttribute("loginUser",editUser);
        }else{
            message.add("Can't edit user!");
            action=request.getParameter("action");
            url="/home";
        }
        try {
            request.setAttribute("message",message);
            request.setAttribute("action",action);
            getServletContext().getRequestDispatcher(url).forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void loginUser(HttpServletRequest request, HttpServletResponse response) {
        String userName= request.getParameter("userName");
        String password=request.getParameter("password");

        String emailExpression="[\\w\\d]*[\\.\\w\\d]*@[\\w]*[\\.\\w](.com||.vn||.org)";
        String userNameExpression="^\\w[\\w\\d]{1,19}";

        Boolean emailCheck= Pattern.matches(emailExpression,userName);
        Boolean userCheck=Pattern.matches(userNameExpression,userName);

        String passwordExpression= "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$";
        Boolean passwordCheck= Pattern.matches(passwordExpression,password);

        String hashPassword= PasswordUtil.hashPassword(password);
        ArrayList<String> message= new ArrayList<>();
        String url="/views/login.jsp";
        if ((userCheck || emailCheck) && passwordCheck){
            ArrayList<User> userList=new ArrayList<>(userServices.selectAllUser());
            boolean userMatch=false;
            for (User user : userList){
                if ( (user.getEmail().equalsIgnoreCase(userName) || user.getUserName().equalsIgnoreCase(userName)) && user.getPassword().equalsIgnoreCase(hashPassword)){
                    userMatch=true;
                    break;
                }
            }
            if (userMatch){
                message.add("Login successfully!");
                url="/home";
                HttpSession session=request.getSession();
                session.setMaxInactiveInterval(-1);
                session.setAttribute("username",userName);
            }else{
                message.add("User name or password is not correct");
                url="/views/login.jsp";
            }
        }else{
            message.add("User name or password format is not correct");
            url="/views/login.jsp";
        }

        request.setAttribute("message",message);
        try {
            getServletContext().getRequestDispatcher(url).forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void registerUser(HttpServletRequest request, HttpServletResponse response) {

        String fullName=request.getParameter("fullName");
        String userName=request.getParameter("userName");
        String email=request.getParameter("email");
        String password=request.getParameter("password");
        String repeat_password=request.getParameter("repeat_password");
        String address=request.getParameter("address");
        //check email
        String emailExpression="[\\w\\d]*[\\.\\w\\d]*@[\\w]*[\\.\\w](.com||.vn||.org)";
        Boolean emailCheck= Pattern.matches(emailExpression,email);
        //check username
        String userNameExpression="^\\w[\\w\\d]{1,19}";
        Boolean userCheck=Pattern.matches(userNameExpression,userName);
        // check password
        String passwordExpression= "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$";
        boolean passwordCheck= password.equals(repeat_password);
        Boolean passwordCheckExpression= Pattern.matches(passwordExpression,password);

        ArrayList<String> message=new ArrayList<>();
        String url="/views/register_user.jsp";
        if (emailCheck && userCheck && passwordCheck && passwordCheckExpression){
            //thuc hien dang ky

            int rowCount=userServices.rowCount();
            int userId=rowCount+1;
            User insertUser= new User(userId,fullName,userName,email,password,address);
            if (rowCount==0){
                //insert luon
                if(userServices.insertUser(insertUser)) {
                    message.add("Inserted User Completed");
                }else{
                    message.add("Can't insert user");
                }
                url="/views/thanks.jsp";
            }else{
                //kiem tra ko co moi insert
                ArrayList<User>  existUserList=new ArrayList<>(userServices.selectAllUser());
                boolean checkDuplicateUser=false;
                for (User user : existUserList) {
                    if (email.equalsIgnoreCase(user.getEmail()) || userName.equals(user.getUserName())){
                        if (email.equalsIgnoreCase(user.getEmail())){
                            message.add("Email already in use!");
                        }
                        if (userName.equalsIgnoreCase(user.getUserName())){
                            message.add("user name already exists");
                        }
                        checkDuplicateUser=true;
                        break;
                    }
                }

                if (!checkDuplicateUser){
                    if (userServices.insertUser(insertUser)){
                        message.add("Inserted User Completed");
                    }else{
                        message.add("Can't insert user");
                    }
                }
                url="/views/thanks.jsp";
            }
        }else{
            if (!emailCheck){
                message.add("Email incorrect!");
            }
            if (!userCheck){
                message.add("user name only contain lower case and digit");
            }
            if (!passwordCheck){
                message.add("Password is not match");
            }
            if(!passwordCheckExpression){
                message.add("Password length must be at least 8 characters and include upper,lower,digit and special character");
            }
        }


        request.setAttribute("message",message);
        try {
            getServletContext().getRequestDispatcher(url).forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            String action= request.getParameter("action");
            String url="/views/home.jsp";
            System.out.println(action);
            if (action==null){
                action="views";
            }
            switch (action){
                case "user-profile":
                    url="/views/my-profile.jsp";
                    break;
                case "user-logout":
                    url="/views/home.jsp";
                    HttpSession session=request.getSession();
                    session.removeAttribute("username");
                    session.removeAttribute("loginUser");
                    break;
                case "change-password":
                    url="/views/change-password.jsp";
                    break;
            }

            getServletContext().getRequestDispatcher(url).forward(request,response);

    }


}
