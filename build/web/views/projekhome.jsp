<%-- 
    Document   : projekhome
    Created on : Jul 14, 2020, 1:41:29 PM
    Author     : Bia
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <jsp:include page='layouts/head.jsp'>
            <jsp:param name= "title" value= "Psychology Consultant Website"/>
        </jsp:include>
        <link href="public/assets/backend/css/projekhome.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <jsp:include page='layouts/navbar.jsp'></jsp:include>
        <!-- scroll content 1 -->
        <div id="content1">
                <div class="icon1">
                    <img class="yoga" src="public/assets/backend/img/Mental.png" alt="yoga-icon" width="420" height="420">
                </div>
                <div class="quotes1">
                    <h1>love your <br>
                        <span style="color: #6c2e2e;">mental health</span>,
                        <br>
                        love <span style="color: #6c2e2e;">yourself</span>
                    </h1>
                </div>
                <div class="chev">
                    <a href="#"><i class="fas fa-chevron-down"></i></a>
                </div>    
        </div>
        <!-- scroll content 2 -->
        <div id="content2" style="background-image: url(public/assets/backend/img/bgpage2.png);">
            <div class="quotes2">
                <h1>heal your stressful day <br>
                    by reading our articles <br>
                    and you can <span style="color: #6c2e2e;">talk to us</span>!
                </h1>
                <h3><a href="consultation">check out more!</a></h3>
            </div>
        </div>
        <!-- scroll content 3 -->
        <div id="content3">
            <img src="public/assets/backend/img/manyface.jpeg" alt="manyface" width="550" height="385">
            <div class="quotes3">
                <h1>check our articles for a lot of insightful 
                    information about mental health
                </h1>
                <h3><a href="article">go to articles 
                    <i class="fas fa-long-arrow-alt-right" style="font-size: 30px;"></i>
                    </a>
                </h3>
            </div>
        </div>
        <jsp:include page='layouts/footer.jsp'></jsp:include>
        <jsp:include page='layouts/scripts.jsp'></jsp:include>
    </body>
</html>