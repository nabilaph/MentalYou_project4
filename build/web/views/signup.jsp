<%-- 
    Document   : signup
    Created on : Jul 20, 2020, 6:50:30 AM
    Author     : Acer
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
         <jsp:include page="layouts/head.jsp">
            <jsp:param name="title" value="Register"></jsp:param>
        </jsp:include>
        <link href="public/assets/backend/css/signup.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
         <!--content1-->
        <div id="content1">
            <div class="logo">
                <img src="public/assets/backend/img/MentalYou-logo.png" alt="logo" width="300" height="300">
            </div>
            <form id="signup" class="form-group" action="signup" method="POST">
                <h1>REGISTER</h1>
                <div class="username">
                    <label>Username</label>
                    <input class="control-name" type="text"
                           name="username" required/>
                </div>
                <div class="email">
                    <label>Email</label>
                    <input class="control-email" type="text"
                           name="email" required/>
                </div>
                <div class="pass">
                    <label>Password</label>
                    <input id="password" type="password"
                           name="password" required/>
                </div>
                <div class="pass-repeat">
                    <label>Repeat Password</label>
                    <input id="confirm_password" type="password"
                           name="pass-repeat" required/>
                </div>
                <div class="btn">
                    <button type="submit" class="submit-btn">SIGNUP</button>
                    <a href="login">Already Have An Account? <br> Login Now! </a>
                </div>
            </form>
        </div>
        <!-- footer -->
         <jsp:include page="layouts/footer.jsp"></jsp:include>
         <jsp:include page="layouts/scripts.jsp"></jsp:include>
         <script>
             var password = document.getElementById("password")
            , confirm_password = document.getElementById("confirm_password");

          function validatePassword(){
            if(password.value != confirm_password.value) {
              confirm_password.setCustomValidity("Passwords Don't Match");
            } else {
              confirm_password.setCustomValidity('');
            }
          }

          password.onchange = validatePassword;
          confirm_password.onkeyup = validatePassword;
         </script>
    </body>
</html>
