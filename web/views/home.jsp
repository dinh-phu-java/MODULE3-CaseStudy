<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Dinh Phu
  Date: 6/20/2020
  Time: 10:04 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>Complete Bootstrap 4 Website Layout</title>
<%--    import necessary source--%>
    <c:import url="parts/head.jsp"/>
</head>
<body>
<%--top-page-header--%>
<c:import url="parts/top-page-header.jsp"/>

<%--main-banner--%>
<c:import url="parts/main-banner.jsp"/>

<%--navbar--%>
<c:import url="parts/navbar.jsp"/>

<%--main-slider--%>
<c:import url="parts/main-slider.jsp"/>

<%--main-content--%>
<c:import url="parts/main-content.jsp"/>

<%--footer--%>
<c:import url="parts/footer.jsp"/>

</body>
</html>

