<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8" %>
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
                    <li><a href="admin-product">PRODUCT</a></li>
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
                <!--Begin: Box-User -->
                <div class="box-customer">
                    <i class="box-user-icon ti-user"></i>
                    <h2 class="number">${sumA}</h2>
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
                    <h2 class="number">${sumP}</h2>
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
                            <a class="insert" href="insert.jsp">Thêm sản phẩm</a>
                        </div>
                    </div>
                    <!--Infomation All Product-->
                    <c:forEach items="${ListP}" var="o">
                        <div class="info-product-shoes">
                            <div class="info-product">
                                <p class="id" name="product_id">ID: ${o.id}</p>
                                <p class="name" name="product_name">NAME: ${o.name}</p>
                                <p class="price">PRICE: ${o.price}</p>
                                <p class="Amount">AMOUNT: 0</p>
                            </div>
                            <div class="image">
                                <img src="${o.image}" />
                            </div>
                            <!--Nút xóa , chỉnh sữa san pham -->
                            <div class="buttom">
                                <a class="update" href="update?pid=${o.id}">
                                    <i class="buttom-pencil ti-pencil"></i>
                                </a>
                                <a class="delete" href="delete?pid=${o.id}">
                                    <i class="buttom-trash ti-trash"></i>
                                </a>
                            </div>
                        </div>

                    </c:forEach>
                    <!--<nav aria-label="Page navigation example">-->
                    <ul class="paging">
                        <li class="page">
                            <a class="page-button" href="#">Previous</a>
                        </li>
                        <c:forEach begin="1" end="3">
                            <li class="page"><a class="page-number" href="#">1</a></li>
                            </c:forEach>                        
                        <li class="page">
                            <a class="page-button" href="#">Next</a>
                        </li>
                    </ul>
                    <!--</nav>-->

                </div>
                <div class="right-content">
                    <div class="user-top">
                        <h1 class="user-name">User</h1>
                    </div>
                    <c:forEach items="${ListA}" var="a">
                        <p class="user-name-all">${a.username}</p>
                    </c:forEach>
                </div>
            </div>

            <div id="footer">


            </div>
        </div>
    </body>

</html>