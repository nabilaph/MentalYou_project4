<%-- 
    Document   : login
    Created on : Jul 17, 2020, 8:19:34 PM
    Author     : Acer
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
         <jsp:include page="layouts/head.jsp">
            <jsp:param name="title" value="Log In"></jsp:param>
        </jsp:include>
        <link href="public/assets/backend/css/login.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
         <!--content1-->
        <div id="content1">
            <div class="logo">
                <img src="public/assets/backend/img/MentalYou-logo.png" alt="logo" width="300" height="300">
            </div>
            <% if(request.getAttribute("alert") != null) { %>
                <div id="alert"
                    style="
                        position: absolute;
                        border: #926a69 solid 2px !important; 
                        height: 30px; 
                        width : 350px; 
                        padding: 5px 0; 
                        text-align: center ; 
                        margin-top: 250px;
                        left: 40%;">
                    <% out.println(request.getAttribute("alert")); %>
            </div>
            <% } %>
            
            <form id="login" class="form-group" method="POST" action="login">
                
                <h1>LOGIN</h1>
                <div class="username">
                    <label>Username</label>
                    <input class="control-name" type="text"
                           name="username" required/>
                </div>
                <div class="pass">
                    <label>Password</label>
                    <input class="control-pass" type="password"
                           name="password" required/>
                </div>
                <div class="btn">
                    <button type="submit" class="submit-btn">LOGIN</button>
                    <a href="signup">Click Here To Create An Account</a>
                </div>
             </form>
        </div>
        <!-- footer -->
         <jsp:include page="layouts/footer.jsp"></jsp:include>
         <jsp:include page="layouts/scripts.jsp"></jsp:include>
<!--        <script>
            function getParameterByName(name, url) {
                if (!url)
                    url = window.location.href;
                name = name.replace(/[\[\]]/g, '\\$&');
                var regex = new RegExp('[?&]' + name + '(=([^&#]*)|&|#|$)'),
                        results = regex.exec(url);
                if (!results)
                    return null;
                if (!results[2])
                    return '';
                return decodeURIComponent(results[2].replace(/\+/g, ' '));
            }
            var al = document.getElementById('alert');
            if (getParameterByName("status") === "wrong") {
                al.style.display = "block";
            } else {
                al.style.display = "none";
            }
        </script>-->
               
    </body>
</html>
