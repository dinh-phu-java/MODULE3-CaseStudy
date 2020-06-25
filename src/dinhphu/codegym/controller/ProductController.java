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
        String action=request.getParameter("action");
        String url="/views/my_profile.jsp";
        if (action==null){
            action="views";
        }
        switch(action){
            case "add-car":
                addCar(request,response);
                break;
        }

    }

    private void addCar(HttpServletRequest request, HttpServletResponse response) {
        String engine_type=request.getParameter("engine_type");
        String gear= request.getParameter("gear");
        String front_wheel=request.getParameter("front-wheel");
        String fuel_type=request.getParameter("fuel-type");
        String valves= request.getParameter("valves");
        String price=request.getParameter("price");
        String date_of_manufacture= request.getParameter("date_of_manufacture");
        String vendor=request.getParameter("vendor");
        String car_type=request.getParameter("car_type");
        String description=request.getParameter("description");



    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//
    }
}
