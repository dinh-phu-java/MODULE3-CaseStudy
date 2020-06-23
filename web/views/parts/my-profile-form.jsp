<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<section class="content">
    <section class="block">
        <div class="container">
            <div class="row">
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
                <!--end col-md-3-->
                <div class="col-md-9">
                    <form class="form" method="POST" action="user-control">
                        <input type="hidden" name="action" value="edit-profile">
                        <div class="row">
                            <div class="col-md-8">

                                <h2>Personal Information</h2>
                                <section>
                                    <div class="row">

                                        <div class="col-md-12">
                                            <div class="form-group">
                                                <label for="fullName" class="col-form-label required">Full Name</label>
                                                <input name="fullName" type="text" class="form-control" id="fullName" placeholder="Your Name" value="${sessionScope.loginUser.fullName}" required>
                                            </div>
                                            <!--end form-group-->
                                        </div>
                                        <!--end col-md-8-->
                                    </div>
                                    <!--end row-->
                                    <div class="form-group">
                                        <label for="userName" class="col-form-label required">Your username</label>
                                        <input name="userName" type="text" class="form-control" id="userName" placeholder="Your username" value="${sessionScope.loginUser.userName}" disabled>
                                    </div>
                                    <!--end form-group-->

                                </section>

                                <section>
                                    <h2>Contact</h2>
                                    <div class="form-group">
                                        <label for="address" class="col-form-label">Address</label>
                                        <input name="address" type="text" class="form-control" id="address" placeholder="Your Address" value="${sessionScope.loginUser.address}">
                                    </div>
                                    <!--end form-group-->
                                    <div class="form-group">
                                        <label for="email" class="col-form-label">Email</label>
                                        <input name="email" type="email" class="form-control" id="email" placeholder="Your Email" value="${sessionScope.loginUser.email}" disabled>
                                    </div>
                                    <!--end form-group-->
                                </section>

                                <section class="clearfix">
                                    <button type="submit" class="btn btn-outline-danger float-left">Save Changes</button>
                                </section>

                                <p style="color:green;">${message}</p>
                                <c:if test="${message !=null}">
                                    <c:remove  var="message"/>
                                </c:if>
                            </div>
                            <!--end col-md-8-->

                        </div>
                    </form>
                </div>
            </div>
            <!--end row-->

        </div>
        <!--end container-->

    </section>
    <!--end block-->

</section>
<!--end content-->