package dinhphu.codegym.controller;

import dinhphu.codegym.model.Product;
import dinhphu.codegym.model.User;
import dinhphu.codegym.services.ProductServices;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.regex.Pattern;

@WebServlet(name = "ProductController",urlPatterns="/product-controller")
public class ProductController extends HttpServlet {
    private ProductServices productServices=new ProductServices();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action=request.getParameter("action");
        String url="/views/my_profile.jsp";
        if (action==null){
            action="views";
        }
        switch(action){
            case "add-car":
                System.out.println("access switch action");
                addCar(request,response);
                break;
        }

    }

    private void addCar(HttpServletRequest request, HttpServletResponse response) {
        System.out.println("hello add car");
        String engine_type=request.getParameter("engine_type");
        String gear= request.getParameter("gear");
        String front_wheel=request.getParameter("front-wheel");
        String fuel_type=request.getParameter("fuel-type");
        String valves= request.getParameter("valves");

        String description=request.getParameter("description");
        String date_of_manufacture= request.getParameter("date_of_manufacture");
        String vendor=request.getParameter("vendor");
        String car_type=request.getParameter("car_type");
        String car_name=request.getParameter("car_name");

        String url="/views/add_car.jsp";
        ArrayList<String> messages=new ArrayList<>();
        HttpSession session=request.getSession();
        User loginUser=(User)session.getAttribute("loginUser");

        String numberRegex= "^\\d[\\d]{1,20}\\.[\\d]{1,20}";
        boolean checkNumberBoolean= Pattern.matches(numberRegex,request.getParameter("price"));
        if (checkNumberBoolean){

            double price=Double.parseDouble(request.getParameter("price"));
            Product car=new Product(0,loginUser.getId(),1,engine_type,gear,front_wheel,fuel_type,valves,price,description,date_of_manufacture,date_of_manufacture,vendor,car_type,car_name);
            if (productServices.insertProduct(car,loginUser.getId())){
                messages.add("Add Car Completed!");
            }else{
                messages.add("Can't add car");
            }
        }else{
            messages.add("Price should be a number!");
        }


            request.setAttribute("messages",messages);
            try {
                getServletContext().getRequestDispatcher(url).forward(request,response);
            } catch (ServletException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//
    }
}
