<%-- 
    Document   : about
    Created on : Jul 16, 2020, 12:00:50 PM
    Author     : Bia
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <jsp:include page='layouts/head.jsp'>
            <jsp:param name= "title" value= "About Us"/>
        </jsp:include>
        <link href="../public/assets/css/about.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
         <jsp:include page='layouts/navbar.jsp'></jsp:include>
        <!--content1-->
        <div id="content1">
            <img class="yoga" src="../public/assets/img/MentalYou-logo.png" alt="MentalYou-logo.png" width="420" height="420">
            <div class="quotes1">
                <h1>Mental condition are the emotional<br>
                    foundation that affect daily<br>
                    activities, including ways of<br>
                    thinking, communication, learning,<br>
                    psychological resilience and self-confidence...<br>
                </h1>
            </div>
        </div>
        <!--content2-->
        
        <div id="content2">
            <img src="../public/assets/img/7.png" alt="bg" width="1800" height="500">
            <div class="quotes2">
                <h1>
                    When a person experiences mental<br>
                    stress that is sodis turbing that<br>
                    it hinders activity, the condition<br>
                    be considered mental illness<br>
                    This website was formed to help people<br>
                    who cannot go to a psychiatrist. <br>
                    of cost constraints and others.</span>.
                </h1>
            </div>
        </div>
        <div class="gambar">
            <img src="../public/assets/img/selfterapi.jpeg" style="display: inline-block;" alt="girl" width="350" height="350">

        </div>
        <!--content3-->
        <div id="content3">
            <img class="yoga" src="../public/assets/img/MentalYou-logo.png" alt="MentalYou-logo.png" width="420" height="420">
            <div class="quotes3">
                <h1>Our website provides<br>
                Articles and Consultation.<br>
                All for free!!!<br>
                For a paid consultation<br>
                can check on the MentalYou website.<br></h1>

            </div>
        </div>
         <jsp:include page='layouts/footer.jsp'></jsp:include>
        <jsp:include page='layouts/scripts.jsp'></jsp:include>
    </body>
</html>
