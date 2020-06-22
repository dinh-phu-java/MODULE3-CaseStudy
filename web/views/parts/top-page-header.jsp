<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<article id="top-page-header" class="container-fluid">
    <section class="container">
        <aside class="header-left">

            <c:choose>
                <c:when test="${sessionScope.username == null}">
                    <a href="<c:url value="/register-user?action=register-user"/>"><i class="fas fa-users-cog"></i> sign in / join</a>
                    <a href="<c:url value="/register-user?action=login"/>" style="margin-left:10px"><i class="fas fa-sign-in-alt"></i> login</a>
                </c:when>
                <c:otherwise>
<%--                    <a href=""><c:out value="${sessionScope.loginUser.userName}" /></a>--%>
<%--                    <a href=""><c:out value="${sessionScope.loginUser.email}" /></a>--%>
<%--                    <a href=""><c:out value="${sessionScope.loginUser.fullName}" /></a>--%>
                    <a href='<c:url value="/user-control?action=user-profile&id=${sessionScope.loginUser.id}"/>'><i class="fas fa-user"></i> User Profile</a>
                </c:otherwise>
            </c:choose>

        </aside>
        <aside class="header-right">
            <a href="#"><i class="fab fa-facebook"></i></a>
            <a href="#"><i class="fab fa-twitter"></i></a>
            <a href="#"><i class="fab fa-instagram"></i></a>
            <a href="#"><i class="fab fa-youtube"></i></a>
        </aside>
    </section>
</article>