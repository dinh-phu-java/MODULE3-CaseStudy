<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

    <nav class="nav flex-column side-nav">
        <a class="nav-link icon" href="<c:url value="/home"/>">
            <i class="fa fa-home"></i> Home
        </a>
        <a class="nav-link active icon" href="<c:url value="/user-control?action=user-profile"/>">
            <i class="fa fa-user"></i>My Profile
        </a>
        <a class="nav-link icon" href="my-ads.html">
            <i class="fa fa-heart"></i>My Ads Listing
        </a>
        <a class="nav-link icon" href="bookmarks.html">
            <i class="fa fa-star"></i>Bookmarks
        </a>
        <a class="nav-link icon" href='<c:url value="/user-control?action=change-password"/>'>
            <i class="fa fa-recycle"></i>Change Password
        </a>
        <a class="nav-link icon" href="<c:url value="/user-control?action=add-car"/>">
            <i class="fa fa-check"></i>Add Car
        </a>
        <a class="nav-link icon" href='<c:url value="/user-control?action=user-logout"/>' >
            <i class="fas fa-sign-out-alt"></i>Logout
        </a>
    </nav>
