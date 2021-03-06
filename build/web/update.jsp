<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Admin Page</title>
        <link rel="stylesheet" href="./assets/css/style.css">
        <link rel="stylesheet" href="./assets/font/themify-icons/themify-icons.css">
    </head>

    <body>
        <div id="main">
            <div id="header">
                <ul id="nav">
                    <li><a href="/home">HOME</a></li>
                    <li><a href="">BAND</a></li>
                    <li><a href="">TOUR</a></li>
                    <li><a href="">CONTACT</a></li>

                    <li>
                        <a href="">
                            MORE
                            <i class="nav-icon-down ti-angle-down"></i>
                        </a>
                        <ul class="subnav">
                            <li><a href="">Merchandise</a></li>
                            <li><a href="">Extras</a></li>
                            <li><a href="">Media</a></li>
                        </ul>
                    </li>
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
                <a class="user-button" href="/login.html">
                    <div >

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
                <!--Begin: Box-User -->
                <div class="box-customer">
                    <i class="box-user-icon ti-user"></i>
                    <h2 class="number">0</h2>
                </div>
                <!--End: Box-User -->
                <!--Begin: Box-order -->
                <div class="box-order">
                    <i class="box-order-icon ti-shopping-cart"></i>
                    <h2 class="number">0</h2>
                </div>
                <!--End: Box-order -->
                <!--Begin: Box-product -->
                <div class="box-product">
                    <i class="box-product-icon ti-package"></i>
                    <h2 class="number">${sum}</h2>
                </div>
                <!--End: Box-product -->
                <!--Begin: Box-income -->
                <div class="box-income">
                    <i class="box-income-icon ti-money"></i>
                    <h2 class="number">0</h2>
                </div>
                <!--End: Box-income -->

                <div class="letf-content">
                    <div class="category">
                        <h1 class="product-shoes">Shoes</h1>
                        <div class="insert-product">
                            <a class="insert" href="#">Th??m s???n ph???m</a>
                        </div>
                    </div>
                    <!--Infomation All Product-->
                    <form action="/Demo/update" method="post">           
                        id:       <input type="text"  name="product-id" value="${up.id}"></br> 
                        name:       <input type="text"  name="product-name" value="${up.name}" ></br>                        
                        price:   <input type="text"  name="product-price" value="${up.price}" ></br>            
                        img:   <input type="text"  name="product-image" value="${up.image}"></br>
                        size:   <input type="text"  name="product-size"></br>
                        <input type="submit" value="Update"/>
                    </form>

                </div>

                <div class="right-content">

                </div>
            </div>

            <div id="footer">


            </div>
        </div>
    </body>

</html>