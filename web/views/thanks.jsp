<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Dinh Phu
  Date: 6/22/2020
  Time: 5:01 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Thanks</title>
    <c:import  url="parts/head.jsp" />
</head>
<body>

<c:import url="parts/navbar.jsp"/>

<c:forEach items="${message}" var="m">
    <p>${m}</p>
</c:forEach>

<c:import url="parts/footer.jsp"/>


</body>
</html>
