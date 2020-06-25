<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>My Profile</title>
    <c:import url="parts/head.jsp"/>
</head>
<body>

<aside class="main-sidebar sidebar-dark-primary elevation-4">

    <div class="sidebar">
        <div class="col-md-12">
            <c:import url="parts/profile-sidebar.jsp"/>
        </div>
    </div>

</aside>

<div class="content-wrapper">
    <c:import url="parts/change-password-form.jsp"/>
</div>

</body>
</html>