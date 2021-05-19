<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
    <head>
        <!-- Required meta tags -->
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <link href="https://fonts.googleapis.com/css?family=Roboto:300,400&display=swap" rel="stylesheet">

        <link rel="stylesheet" href="./assets/font/icomoon/style.css">

        <link rel="stylesheet" href="./assets/css/owl.carousel.min.css">

        <!-- Bootstrap CSS -->
        <link rel="stylesheet" href="./assets/css/bootstrap.min.css">

        <!-- Style -->
        <link rel="stylesheet" href="./assets/css/style-login.css">

        <title>Login</title>
    </head>
    <body>



        <div class="content">
            <div class="container">
                <div class="row justify-content-center">
                    <!-- <div class="col-md-6 order-md-2">
                      <img src="images/undraw_file_sync_ot38.svg" alt="Image" class="img-fluid">
                    </div> -->
                    <div class="col-md-6 contents">
                        <div class="row justify-content-center">
                            <div class="col-md-12">
                                <div class="form-block">
                                    <div class="mb-4">
                                        <h3>Log In</h3>
                                    </div>
                                    <form action="/Demo/login" method="post">
                                        <div class="form-group first">
                                            <label for="username">Username</label>
                                            <input type="text" class="form-control" id="username" name="user">

                                        </div>
                                        <div class="form-group last mb-4">
                                            <label for="password">Password</label>
                                            <input type="password" class="form-control" id="password" name="pass">

                                        </div>

                                        <div class="d-flex mb-5 align-items-center">
                                            <label class="control control--checkbox mb-0"><span class="caption">Remember me</span>
                                                <input type="checkbox" checked="checked"/>
                                                <div class="control__indicator"></div>
                                            </label>
                                            <span class="ml-auto"><a href="#" class="forgot-pass">Forgot Password</a></span> 
                                        </div>

                                        <input  type="submit" value="Log In" class="btn btn-pill text-white btn-block btn-primary">

                                        <span class="d-block text-center my-4 text-muted"> or sign in with</span>

                                        <div class="social-login text-center">
                                            <a href="#" class="facebook">
                                                <span class="icon-facebook mr-3"></span> 
                                            </a>
                                            <a href="#" class="twitter">
                                                <span class="icon-twitter mr-3"></span> 
                                            </a>
                                            <a href="#" class="google">
                                                <span class="icon-google mr-3"></span> 
                                            </a>
                                        </div>
                                    </form>
                                </div>
                            </div>
                        </div>

                    </div>

                </div>
            </div>
        </div>


        <script src="./assets/js/jquery-3.3.1.min.js"></script>
        <script src="./assets/js/popper.min.js"></script>
        <script src="./assets/js/bootstrap.min.js"></script>
        <script src="./assets/js/main.js"></script>
    </body>
</html>