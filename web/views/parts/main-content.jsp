<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<main class="container" id="main-post">
    <article class="row">
        <section class="col-md-8">
            <h6>
                <span>Most Popular</span>
            </h6>
            <div class="row no-gutters">
                <div class="col-xs-12 col-sm-12 col-md-12 col-lg-4">
                    <img src='<c:url value="/images/car-1.jpg"></c:url>' class="card-img" alt="...">
                </div>
                <div class="col-xs-12 col-sm-12 col-md-12 col-lg-8">
                    <div class="card-body">
                        <h4 class="card-title">The best super car of all time</h4>
                        <h5><span>Car Sport</span> <span>Adam smith</span> <span>26 August, 2020</span></h5>
                        <p class="card-text">This is a wider card with supporting text below as a natural lead-in to additional content. This content is a little bit longer, This content is a little bit longer...</p>

                    </div>
                </div>

            </div>

            <section class="load-more">
                <button class="btn my-bg my-white-color">Load more</button>
            </section>
        </section>

        <section id="main-latest-review" class="col-md-4">
            <h6 class="post-border-black">
                <span class="post-black">Latest Review</span>
            </h6>
            <div class="row no-gutters">
                <div class="col-xs-12 col-sm-12 col-md-12 col-lg-4">
                    <img src='<c:url value="/images/car-5.jpg"></c:url>' class="card-img" alt="...">
                </div>
                <div class="col-xs-12 col-sm-12 col-md-12 col-lg-8">
                    <div class="card-body">
                        <h4 class="card-title">The best super car of all time</h4>
                        <h5><span>26 August, 2020</span></h5>
                    </div>
                </div>
            </div>


        </section>
    </article>
</main>