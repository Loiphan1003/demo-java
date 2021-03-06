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
            <!--PC-->
            <ul id="nav">
                <li><a href="/Demo/home">HOME</a></li>
                <!-- <li><a href="">BAND</a></li> -->
                <c:if test="${sessionScope.acc.isAdmin == 1}">
                    <li><a href="admin">PRODUCT</a></li>
                </c:if>
            </ul>
            <!--Mobile-->
            <label for="nav-mobile-input" id="nav-mobile-buttom">
                <i class="nav-mobile-view ti-view-list"></i>
            </label>

            <input type="checkbox" class="nav-input" id="nav-mobile-input">
            <label for="nav-mobile-input" class="nav-overplay"></label>
            <nav class="nav-mobile">
                <label for="nav-mobile-input" class="nav-close ti-close"></label>
                
            </nav>
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

                        <img class="card-image" src="${o.image}" />

                        <h4 class="card-name ">${o.name}</h4>
                        <p class=" card-price">${o.price}</p>
                    </div>
                </a>                
            </div>
            </c:forEach>
        </div>

        <div id="footer">
            <div class="footer-end">
                <div class="service">
                    <p>Service</p>
                </div>
                <div class="contact">
                    <p>Contact</p>
                </div>
                <div class="follow">
                    <p>Folllow Us</p>
                    <div class="icon-follow">
                        <i class="ti-facebook"></i></br>
                        <i class="ti-instagram"></i></br>
                        <i class="ti-youtube"></i>
                    </div>
                </div>
            </div>
        </div>
    </div>
</body>

</html>