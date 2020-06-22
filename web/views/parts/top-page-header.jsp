<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<article id="top-page-header" class="container-fluid">
    <section class="container">
        <aside class="header-left">
            <a href="<c:url value="/register-user?action=register-user"/>"><i class="fas fa-users-cog"></i> sign in / join</a>
            <a href="<c:url value="/register-user?action=login"/>" style="margin-left:10px"><i class="fas fa-sign-in-alt"></i> login</a>
        </aside>
        <aside class="header-right">
            <a href="#"><i class="fab fa-facebook"></i></a>
            <a href="#"><i class="fab fa-twitter"></i></a>
            <a href="#"><i class="fab fa-instagram"></i></a>
            <a href="#"><i class="fab fa-youtube"></i></a>
        </aside>
    </section>
</article>