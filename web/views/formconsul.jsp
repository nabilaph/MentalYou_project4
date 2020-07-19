<%-- 
    Document   : formconsul
    Created on : Jul 17, 2020, 9:32:00 AM
    Author     : Bia
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <jsp:include page='layouts/head.jsp'>
            <jsp:param name= "title" value= "Consultation Form"/>
        </jsp:include>
        <link href="css/formconsul.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <jsp:include page='layouts/navbar.jsp'></jsp:include>
        
        <!-- scroll content 1 -->
        <div id="content1" style="background-image: url(../public/assets/3ed.png);">
            <div class="headertext">
                <h1>Consultation Form</h1>
                <p>Fill in your data so we can contact you for further information!</p>
            </div>
            <div class="chev">
                <a href="#"><i class="fas fa-chevron-down"></i></a>
            </div> 
        </div>

        <!-- scroll content 2 -->
        <div id="content2" style="background-image: url(../public/assets/bgfull.jpeg);">
            <form name="Form1"  action="#" method="get">

                <label for="fullname">Full Name</label><br>
                <input class="fullname" name="fullname" type="text" ><br><br><br>
               
                <label for="nickname">Nickname</label><br>
                <input class="nickname" name="nickname" type="text"><br><br><br>

                <label for="email">E-mail Address</label><br>
                <input class="email" name="email" type="text"><br><br><br>
                
                <label for="bday">Birthday</label><br>
                <input type="date" id="birthday" name="birthday"><br><br><br>
                
                <label for="phonenum">Phone Number</label><br>
                <input class="phonenum" name="phonenum" type="text"><br><br><br>

                <label for="package">Package You Choose</label><br>
                <select class="package" name="package">
                    <option value="free">Free</option>
                    <option value="paid">Paid</option>
                </select><br><br><br>

                <input type="submit" name="submit" id="submit" value="submit" class="button" />
               
               </form>
        </div>
        
        <jsp:include page='layouts/footer.jsp'></jsp:include>
        <jsp:include page='layouts/scripts.jsp'></jsp:include>
    </body>
</html>
