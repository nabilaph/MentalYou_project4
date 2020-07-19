<%-- 
    Document   : article
    Created on : Jul 16, 2020, 11:55:43 AM
    Author     : Bia
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <jsp:include page='layouts/head.jsp'>
            <jsp:param name= "title" value= "Articles"/>
        </jsp:include>
        <link href="css/article.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <jsp:include page='layouts/navbar.jsp'></jsp:include>
        <!-- scroll content 1 -->
        <div id="content1">
            <div class="icon2">
                <img src="../public/assets/pinkbg.png" alt="pink-bg" width="700" height="100">
            </div>
            <div class="icon3">
                <img src="../public/assets/brainimg.jpg" alt="brain-img" width="400" height="400">
                </div>
            <div class="quotes1">
                <h1>Get To Know You</h1>
                <p>First, lets start with getting to know what type of mental health issues 
                   that you feel 
                    this whole time</p>
                <h3><a href="mental.jsp">Click Here!</a></h3>
                
            </div>
        </div>
        <!--content 2-->
        <div id="content2">
            <div class="heading1">
                <h1>Self<br>The <br> rapy</h1>
            </div>
            
            <div class="quotes2">
                <p>If you ever feel stress and need something to make you relax <br>
                 we have some tips for you!</p>
                    <h3><a href="projekterapy.jsp">Useful Tips!</a></h3>
            </div>
        </div>
        <!--content 3-->
        <div id="content3">
            <div class="book1">
                <img src="../public/assets/book1.png" alt="book1" width="100" height="120">
            </div>
            <div class="book2">
                <img src="../public/assets/book2.jpg" alt="book-2" width="100" height="120">
            </div>
            <div class="book3">
                <img src="../public/assets/book3.jpg" alt="book-3" width="100" height="120">
            </div>
            <div class="bg1">
                <img src="../public/assets/pinkbg.png" alt="pink1" width="1200" height="10">
            </div>
            <div class="bg2">
                <img src="../public/assets/pinkbg.png" alt="pink2" width="800" height="10">
            </div>
            <div class="quotes3">
                <p><i class="fas fa-quote-left"></i> Reading gives us <br> someplace to go <br>
                    when we have to stay <br> where we are <i class="fas fa-quote-right"></i> </p>
                    <h4>-Mason Cooley</h4>
            </div>
            <div class="heading2">
                <h1>Books <br> Recommendation</h1>
                <h3><a href="books.jsp">Books Details</a></h3>
            </div>
        </div>
        
        <jsp:include page='layouts/footer.jsp'></jsp:include>
        <jsp:include page='layouts/scripts.jsp'></jsp:include>
    </body>
</html>

