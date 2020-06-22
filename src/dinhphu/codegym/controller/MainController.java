package dinhphu.codegym.controller;

import dinhphu.codegym.model.User;
import dinhphu.codegym.services.IUserServices;
import dinhphu.codegym.services.UserServices;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

@WebServlet(name = "MainController",urlPatterns={"/home","/register-user"})
public class MainController extends HttpServlet {
    private static IUserServices userServices= new UserServices();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session=request.getSession();
        String username=(String)session.getAttribute("username");
        String action=request.getParameter("action");
        String url="/views/home.jsp";
        System.out.println(action);
        if (action==null){
            action="";
        }
        switch (action){
            case "login":
                url="/views/home.jsp";
                User loginUser=userServices.selectUser(username);
                session.setAttribute("loginUser",loginUser);
                break;

        }


        getServletContext().getRequestDispatcher(url).forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action=request.getParameter("action");
        String url="/views/home.jsp";

        if (action==null){
            action="view";
        }
        switch (action){
            case "register-user":
                url="/views/register_user.jsp";
                break;
            case "login":
                url="/views/login.jsp";
                break;

            default:
                url="/views/home.jsp";
                break;
        }

        getServletContext().getRequestDispatcher(url).forward(request,response);

    }
}
