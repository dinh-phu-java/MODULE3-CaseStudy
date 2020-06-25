package dinhphu.codegym.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ProductController",urlPatterns="/product-controller")
public class ProductController extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String description =request.getParameter("description");
        System.out.println(description);
        PrintWriter writer=response.getWriter();

        writer.println(description);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//            String action=request.getParameter("action");
//            String url="/views/home.jsp";
//            if (action==null){
//                action="views";
//            }
//            switch (action){
//                case "add-car":
//                    url="/views/add_car.jsp";
//                break;
//            }
//            getServletContext().getRequestDispatcher(url).forward(request,response);
    }
}
