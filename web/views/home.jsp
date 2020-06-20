<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Dinh Phu
  Date: 6/20/2020
  Time: 10:04 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Car Market</title>
    <c:import url="parts/head.jsp"/>
</head>
<body>
<i class="fas fa-user"></i> <!-- uses solid style -->
<i class="far fa-user"></i> <!-- uses regular style -->
<i class="fal fa-user"></i> <!-- uses light style -->
<!--brand icon-->
<i class="fab fa-github-square"></i> <!-- uses brands style -->
<i class="fas fa-heart"></i>
    <nav class="navbar navbar-expand-md navbar-light bg-light sticky-top">
        <div class="container-fluid">
            <a href="#" class="navbar-brand">
                <img src="images/logo.png">
            </a>
            <button class="navbar-toggler" data-toggle="collapse" type="button" data-target="#navbarResponsive">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="navbarResponsive">
                <ul class="navbar-nav ml-auto">
                    <li class="nav-item">
                        <a href="#" class="nav-link">Home</a>
                    </li>
                    <li class="nav-item">
                        <a href="#" class="nav-link">About</a>
                    </li>
                    <li class="nav-item">
                        <a href="#" class="nav-link">Services</a>
                    </li>
                    <li class="nav-item">
                        <a href="#" class="nav-link">Team</a>
                    </li>
                    <li class="nav-item">
                        <a href="#" class="nav-link">Connect</a>
                    </li>
                </ul>
            </div>
        </div>
    </nav>

</body>
</html>
