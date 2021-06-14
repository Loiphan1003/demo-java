<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page language="java" contentType="text/html" pageEncoding="UTF-8" %>

<!DOCTYPE html>
<html lang="en">

    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Learn_Fontend</title>
        <link rel="stylesheet" href="./assets/css/style.css">
        <link rel="stylesheet" href="./assets/font/themify-icons/themify-icons.css">
    </head>

    <body>
        <div id="main">
            <div id="header">
                <ul id="nav">
                    <li><a href="">HOME</a></li>
                    <li><a href="">BAND</a></li>
                        <c:if test="${sessionScope.acc.isAdmin == 1}">
                        <li><a href="admin">PRODUCT</a></li>
                        </c:if> 
                    <!--                        <li><a href="">CONTACT</a></li>
                    
                                            <li>-->
                    <!--                            <a href="">
                                                    MORE
                                                    <i class="nav-icon-down ti-angle-down"></i>
                                                </a>
                                                <ul class="subnav">
                                                    <li><a href="">Merchandise</a></li>
                                                    <li><a href="">Extras</a></li>
                                                    <li><a href="">Media</a></li>
                                                </ul>
                                            </li>-->
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
                <a class="user-button" href="login.jsp">
                    <div class="">

                        <i class="user-icon ti-user"></i>
                        <!-- <ul class="subnav-user">
                    <li><a href="">Đăng nhập</a></li>
                    <li>Đăng xuất </li>
                </ul> -->

                    </div>
                </a>
                <!--End: User-Button -->

            </div>

            <div id="slider">
                <div class="slider-img"
                     style="background-image: url(https://glab.vn/storage/uploads/advert/6066ad800c62c.jpg);">
                </div>
            </div>

            <div id="content">
                <c:forEach items="${ListP}" var="o">
                    <div class="product-form">
                        <a class="product-detailt" href="detail?pid=${o.id}">
                            <div class="card">
                                <div class="card-image" style="background-image: url(${o.image});">
                                </div>
                                <h4 class="card-name">${o.name}</h4>
                                <p class="card-price">${o.price} VND</p>
                            </div>
                        </a>
                    </div>
                </c:forEach>
            </div>

            <div id="footer">
                <div class="icon-footer">
                    <i class="ti-facebook"></i>
                </div>

            </div>
        </div>
    </body>

</html>