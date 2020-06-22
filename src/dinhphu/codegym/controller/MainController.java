package dinhphu.codegym.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "MainController",urlPatterns={"/home","/register-user"})
public class MainController extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

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
            default:
                url="/views/home.jsp";
                break;
        }

        getServletContext().getRequestDispatcher(url).forward(request,response);

    }
}
