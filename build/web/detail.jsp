<!-- <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%> -->
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
                <li><a href="/home">HOME</a></li>
                
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
                <div class="">

                    <i class="user-icon ti-user"></i>

                </div>
            </a>
            <!--End: User-Button -->

        </div>
        <div id="content">
            <div id="detail-product">
                <div class="left-detail">
                    <p>Air Jordan</p>
                    <p>
                        <strong>${de.name}</strong>
                    </p>
                    <div>
                        <p class="size">Chose your size</p>
                        <i class="angle-size ti-angle-down"></i>
                    </div>
                    
                </div>
                <div class="right-detail">
                    <img class="detail-img" src="${de.image}" />

                </div>

            </div>
        </div>

        <div id="footer">
            <div class="icon-footer">
                <i class="ti-facebook"></i>
            </div>

        </div>
    </div>
</body>

</html>