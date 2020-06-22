<nav class="navbar navbar-expand-md navbar-light bg-red sticky-top" >
    <div class="container">
        <button class="navbar-toggler" data-toggle="collapse" type="button" data-target="#navbarResponsive">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="my-nav-child"></div>
        <div class="collapse navbar-collapse my-nav-child" id="navbarResponsive">
            <ul class="navbar-nav" >
                <li class="nav-item">
                    <a href="#" class="nav-link">Home</a>
                </li>
                <li class="nav-item">
                    <a href="#" class="nav-link">About</a>
                </li>
                <li class="nav-item dropdown">
                    <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="true">
                        Dropdown
                    </a>
                    <div class="dropdown-menu my-drop-menu" aria-labelledby="navbarDropdown">
                        <a class="dropdown-item" href="#">Action</a>
                        <a class="dropdown-item" href="#">Another action</a>
                        <div class="dropdown-divider"></div>
                        <a class="dropdown-item" href="#">Something else here</a>

                    </div>
                </li>
                <li class="nav-item">
                    <a href="#" class="nav-link">Team</a>
                </li>
                <li class="nav-item">
                    <a href="#" class="nav-link">Connect</a>
                </li>
            </ul>
        </div>
        <div class="my-nav-child">
            <form class="form-inline d-flex justify-content-center md-form form-sm active-pink-2 mt-2">
                <input class="form-control form-control-sm mr-3 w-75" type="text" placeholder="Search"
                       aria-label="Search">
                <i class="fas fa-search" aria-hidden="true"></i>
            </form>
        </div>
    </div>
</nav>