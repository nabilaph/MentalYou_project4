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
        <link href="public/assets/backend/css/formconsul.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <jsp:include page='layouts/navbar.jsp'></jsp:include>
        

        <!-- scroll content 2 -->
        <div id="content2" style="background-image: url(public/assets/backend/img/bgfull.jpeg);">
            <form name="Form1"  action="consultationform" method="POST">

                <label for="fullname">Full Name</label><br>
                <input class="fullname" name="fullname" type="text" value="${user.fullname}" required ><br><br><br>
               
                <label for="nickname">Nickname</label><br>
                <input class="nickname" name="nickname" type="text" required><br><br><br>

                <label for="email">E-mail Address</label><br>
                <input class="email" name="email" type="text" required><br><br><br>
                
                <label for="bday">Birthday</label><br>
                <input type="date" id="birthday" name="birthday" required><br><br><br>
                
                <label for="phonenum">Phone Number</label><br>
                <input class="phonenum" name="phonenum" type="text" required><br><br><br>

                <label for="package">Package You Choose</label><br>
                <select class="package" name="package" required>
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
