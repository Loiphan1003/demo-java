<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@page contentType="text/html" pageEncoding="UTF-8" %>


        <!DOCTYPE html>
        <html lang="en">

        <head>
            <meta charset="UTF-8">
            <meta name="viewport" content="width=device-width, initial-scale=1.0">
            <meta http-equiv="X-UA-Compatible" content="ie=edge">
            <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet"
                id="bootstrap-css">

            <link rel="stylesheet" href="./assets/css/login.css">
            <title>Login</title>
        </head>

        <body>
            <div id="logreg-forms">
                <form class="form-signin" action="login" method="post">
                    <h1 class="h3 mb-3 font-weight-normal" style="text-align: center"> Sign in</h1>
                    <p class="text-danger">${mess}</p>

                    <input type="username" id="inputEmail" class="form-control" placeholder="Username" required=""
                        autofocus="" name="user">
                    <input type="password" id="inputPassword" class="form-control" placeholder="Password" required=""
                        name="pass">

                    <button class="btn btn-success btn-block" type="submit"><i class="fas fa-sign-in-alt"></i> Sign
                        in</button>
                    <a href="#" id="forgot_pswd">Forgot password?</a>
                    <hr>
                    <!-- <p>Don't have an account!</p>  -->
                    <a href="register.jsp">
                        <button class="btn btn-primary btn-block" type="button" id="btn-signup"><i
                                class="fas fa-user-plus"></i>
                            Sign up New Account</button></a>
                </form>

                <form action="/reset/password/" class="form-reset">
                    <input type="email" id="resetEmail" class="form-control" placeholder="Email address" required=""
                        autofocus="">
                    <button class="btn btn-primary btn-block" type="submit">Reset Password</button>
                    <a href="#" id="cancel_reset"><i class="fas fa-angle-left"></i> Back</a>
                </form>


                <br>

            </div>

        </body>

        </html>