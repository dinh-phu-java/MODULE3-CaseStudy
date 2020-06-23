<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Dinh Phu
  Date: 6/22/2020
  Time: 11:19 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>My Profile</title>
    <c:import  url="parts/head.jsp" />
</head>
<body>
<c:import url="parts/navbar.jsp"/>



<section class="content">
    <section class="block">
        <div class="container">
            <div class="row">

                <c:import url="parts/profile-sidebar.jsp"/>

                <!--end col-md-3-->
                <c:import url="parts/my-profile-form.jsp"/>
            </div>
            <!--end row-->
        </div>
        <!--end container-->
    </section>
    <!--end block-->

</section>
<!--end content-->

<c:import url="parts/footer.jsp"/>
</body>
</html>
