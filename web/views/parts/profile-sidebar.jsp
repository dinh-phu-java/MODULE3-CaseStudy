<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<div class="col-md-3">
    <nav class="nav flex-column side-nav">
        <a class="nav-link active icon" href="<c:url value="/user-control?action=user-profile"/>">
            <i class="fa fa-user"></i>My Profile
        </a>
        <a class="nav-link icon" href="my-ads.html">
            <i class="fa fa-heart"></i>My Ads Listing
        </a>
        <a class="nav-link icon" href="bookmarks.html">
            <i class="fa fa-star"></i>Bookmarks
        </a>
        <a class="nav-link icon" href="change-password.html">
            <i class="fa fa-recycle"></i>Change Password
        </a>
        <a class="nav-link icon" href="sold-items.html">
            <i class="fa fa-check"></i>Sold Items
        </a>
    </nav>
</div>