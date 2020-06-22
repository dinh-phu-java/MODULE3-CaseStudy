package dinhphu.codegym.controller;

import dinhphu.codegym.model.User;
import dinhphu.codegym.services.IUserServices;
import dinhphu.codegym.services.UserServices;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.regex.Pattern;

@WebServlet(name = "UserController",urlPatterns = "/user-action")
public class UserController extends HttpServlet {
    private static IUserServices userServices=new UserServices();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action=request.getParameter("action");

        if (action==null){
            action="view";
            String url="/views/home.jsp";
            getServletContext().getRequestDispatcher("url").forward(request,response);
        }
        switch(action){
            case "register":
                registerUser(request,response);
                break;
            case "login":
                loginUser(request,response);
                break;
        }
    }

    private void loginUser(HttpServletRequest request, HttpServletResponse response) {
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

            }
//            ArrayList<User>  existUserList=new ArrayList<>(userServices.selectAllUser());

        }else{
            if (!emailCheck){
                message.add("Email incorrect!");
            }
            if (!userCheck){
                message.add("user name only contain lower word and digit");
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

    }
}
