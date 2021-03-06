<!-- <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@page contentType="text/html" pageEncoding="UTF-8" %> -->
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Admin Page</title>
    <link rel="stylesheet" href="./assets/css/style.css">
    <!--<link rel="stylesheet" href="./assets/scss/style-upload-image.scss">-->
    <link rel="stylesheet" href="./assets/font/themify-icons/themify-icons.css">
</head>

<body>
    <div id="main">
        <div id="header">
            <ul id="nav">
                <li><a href="/home">HOME</a></li>
                <li><a href="admin-product">PRODUCT</a></li>


            </ul>
            <!--End nav-->
            <!--Begin: Shop button -->
            <div class="shop-button">
                <i class="shop-icon ti-shopping-cart"></i>
            </div>
            <!--End: Shop button -->
            <!-- Begin: Search button -->
            <div class="search-button">
                <i class="search-icon ti-search"></i>
            </div>
            <!--End: Search button -->
            <!--Begin: User-Button-->
            <a class="user-button" href="/login.jsp">
                <div>

                    <i class="user-icon ti-user"></i>

                </div>
            </a>
            <!--End: User-Button -->

        </div>

        <div id="slider">
            <div class="slider-img"
                style="background-image: url(https://glab.vn/storage/uploads/advert/6066ad800c62c.jpg);"></div>
        </div>

        <div id="admin-content">
            <div class="letf-content">
                <div class="category">
                    <h1 class="product-shoes">Shoes</h1>
                    <div class="insert-product">
                        <a class="insert" href="#">Thêm sản phẩm</a>
                    </div>
                </div>
                <form action="insert-product" method="post" enctype="multipart/form-data">
                    <div class="form-group">
                        <label>ID</label>
                        <input type="text" class="form-control" name="product-id" placeholder="Enter id">
                    </div>
                    <!--
-->
                    <div class="form-group">
                        <label>Name Product</label>
                        <input type="text" class="form-control" name="product-name" placeholder="Enter name">
                    </div>

                    <div class="form-group">
                        <label>Photo</label> <br />

                        <input type="file" class="form-control" name="product-image" placeholder="Enter photo">
                    </div>
                    <div class="form-group">
                        <label>Price</label>
                        <input type="text" class="form-control" name="product-price" placeholder="Enter pride">
                    </div>

                    <button type="submit" class="btn btn-primary">Submit</button>
                    <button type="reset" class="btn btn-primary">Cancel</button>
                </form>



                <!--                        size: <input type="text" name="product_size"></br>-->
                <!--<input type="submit" value="Submit" />-->
                <!--</form>-->

            </div>

            <div class="right-content">

            </div>
        </div>

        <div id="footer">


        </div>
    </div>

    <!--<script src="./assets/js/upload-image.js"></script>-->
</body>

</html>