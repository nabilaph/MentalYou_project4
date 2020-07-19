<%-- 
    Document   : mental
    Created on : Jul 16, 2020, 12:16:51 PM
    Author     : Bia
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <jsp:include page='layouts/head.jsp'>
            <jsp:param name= "title" value= "Mental Health Article"/>
        </jsp:include>
        <link href="css/mentalhealth.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <jsp:include page='layouts/navbar.jsp'></jsp:include>
       <!--content1-->
        <div id="content1">
           <div class="img"><img src="../public/assets/pink.jpeg" alt="bg"></div>
            <div class="quotes1">
                <div class="ijo"><img src="../public/assets/ijo.jpeg" alt="ijo" width="300" height="300"></div>
                <h1><span style="color: #6c2e2e;">What is mental health?</span> <br>
                Mental health is the ability to adjust to yourself,<br>
                 with others and the community and <br>
                  environment in which it lives.<br>
                </h1>
            </div>
        </div>
    
        <!--content2-->
        
        <div id="content2">
            <div class="image"><img src="../public/assets/tumblr.jpg" alt="bg" width="100%" height="500"></div>
            <div class="quotes2">
                <h1>
                    <span style="color: #6c2e2e;">Type of mental health :</span> <br>
                    depression, bipolar disorder, anxiety,<br>
                    posttraumatic stress disorder (PTSD),<br>
                    obsessive compulsive disorder (OCD), and psychosis. <br>
                    Some mental illnesses only occur in certain <br>
                    of sufferers, such as postpartum depression <br>
                    attacks the mother after giving birth<br>
                </h1>
            </div>
        </div>
        <!--content3-->
        <div id="content3">
            <div class="background"> <img src="../public/assets/pinkbg.png" alt="pink" width="1350" height="500"></div>
            <div class="ungu"> <img src="../public/assets/ungu.jpeg" alt="ungu" width="300" height="300"> </div>
            <div class="quotes3">
                <h1><span style="color: #6c2e2e;">Mental Health Medicine</span><br>
                1. Psychotherapy<br>
                2. Drugs<br>
                3. Inpatient<br>
                4. Support group<br>
                5. Brain stimulation<br>
                6. Treatment of substance abuse<br>
                </h1>
                
            </div>
        </div>
        
        <jsp:include page='layouts/footer.jsp'></jsp:include>
        <jsp:include page='layouts/scripts.jsp'></jsp:include>
    </body>
</html>
