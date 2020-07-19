<%-- 
    Document   : projekconsul
    Created on : Jul 16, 2020, 12:08:17 PM
    Author     : Bia
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
         <jsp:include page='layouts/head.jsp'>
            <jsp:param name= "title" value= "Consultation"/>
        </jsp:include>
        <link href="css/projekconsul.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <jsp:include page='layouts/navbar.jsp'></jsp:include>
        <!--scroll content 1-->
        <div id="content1">
            <img src="../public/assets/pink-consul.jpg" alt="">
            <div class="circle"></div>
            <div class="headertext">
                <h1>Consultation</h1>
            </div>
        </div>
        <div id="content2" style="background-image: url(../public/assets/cons-2.png);">
            <div>
                <h1>Why we need consultation?</h1>
                <p>Consultation will make you feel better! 
            By talking to psychologists who understand mental 
            health, surely they will give various kinds of advice 
            that make you feel calmer. Trust me, talking to other 
            people about your problem will make you feel not alone 
            especially you talk with psychologist that can be trusted.</p>
            </div>
        </div>
        <div id="content3" style="background-image: url(../public/assets/5.png);">
            <div>
                <h1 style="font-family: 'playfair'; color: #926a69;">
                    Consultation Package</h1>
                <div class="freepack">
                    <h2>FREE</h2> <br>
                    <ol style="list-style-type: decimal;">
                        <li>Free consultation (max. 1 hour)</li>
                        <li>Only online consultation</li>
                        <li>Maximum 2 session per week</li>
                    </ol>
                </div>
                <div class="paidpack">
                    <h2>PAID</h2>
                    <ol style="list-style-type: decimal;">
                        <li>15$ per month</li>
                        <li>Online and offline consultation</li>
                        <li>Meeting adapts to the psychologist</li>
                        <li>No limitation of session</li>
                        <li>Receive several promos</li>
                    </ol>
                </div>
            </div>
        </div>
        <div id="content4" style="background-image: url(../public/assets/7.png);">
            <div class="content4-header">
                <h1 style="color: #926a69;"><b>How to do consultation?</b></h1>
            </div>
            <div class="content4-list">
                <ol style="list-style-type: decimal;">
                    <li>Fill in you data in this <span><a href="formconsul.jsp">form</a></span></li>
                    <li>Our admin will send you an email as a confirmation </li>
                    <li>Explain your problem clearly and send it via email in response to our email</li>
                    <li>Our admin will accept the email and try to connect you with available psychologist</li>
                    <li>Our admin will send link of WhatsApp Messager to make you can chat with the psychologist</li>
                </ol>
            </div>
        </div>
        <jsp:include page='layouts/footer.jsp'></jsp:include>
        <jsp:include page='layouts/scripts.jsp'></jsp:include>
    </body>
</html>
