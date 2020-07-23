<%-- 
    Document   : profile
    Created on : Jul 21, 2020, 11:45:48 AM
    Author     : Bia
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
         <jsp:include page='layouts/head.jsp'>
            <jsp:param name= "title" value= "Your Profile"/>
        </jsp:include>
        <link href="public/assets/backend/css/profile.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <jsp:include page='layouts/navbar.jsp'></jsp:include>
        <!-- scroll content 1 -->
        <!--<div style="background-color: #fef3d1"><br><br><br></div>-->
         <div id="content1">
            <img src="public/assets/backend/img/profile.jpg" alt="bg" width="100%" height="1000">
            <div class="quotes1">
                <div class="headertext"></div>
                <table border = "0">
                    <input type="hidden"  name="id"/>
                <tr>
                    <td>
                       <h1><span style="color: #db5980;">Full Name :</span></h1></td>
                    <td><h1><span style="color: rgb(106, 59, 192);">${ user.fullname }</h1> </td>
                </tr>
                <tr>
                    <td>
                        <h1><span style="color: rgb(152, 93, 207);">Nickname    : </span></h1></td>
                    <td><h1><span style="color: rgb(106, 59, 192);">${ user.nickname }</h1>  </td>
                </tr>
               
                <tr>
                    <td>
                        <h1><span style="color: rgb(192, 59, 148);">Phone   : </span></h1></td>
                    <td><h1><span style="color: rgb(106, 59, 192);">${ user.phoneNum }</h1>  </td>
                </tr>
                <tr>
                    <td> 
                        <h1><span style="color: rgb(226, 43, 150);">Email    : </span></h1></td>
                    <td><h1><span style="color: rgb(106, 59, 192);">${ user.email }</h1>  </td>
                </tr>
                <tr>
                    <td> 
                    <h1><span style="color: rgb(220, 43, 226);">Birthday : </span></h1></td>
                    <td><h1><span style="color: rgb(106, 59, 192);">${ user.bday }</h1>  </td>
                    <td class="btnedit">
                        <a href="editprofile.jsp">
                            Edit Profile</a>
                    </td>
                </tr>
                
            </table>
                
               
                
               
            </div>
        </div>
        <div class="gambar">
            <img src="public/assets/backend/img/hijab2.jpg" style="display: inline-block;" alt="girl" width="320" height="325">

        </div>
         <!--content2-->
         <div id="content2">
            
            <div class="quotes2">
                
                <div class="circle"></div>
                <div class="headertext">
                    <h3><span style="color: #db5980;">Consultation Details</span><br></h3><br>
                </div>
                    
               

            </div>
        </div>
         <!--content3-->
            
            <div class="quotes3">
                <div class="date" style="width: 200px; float:left; height:100px; margin:-7px; font-size: 12px;">
                    <table border = "0">
                        <tr>
                            <td>
                                <h3><span style="color: rgb(128, 54, 197);">Consultation Date</span><br></h3><br>
                            </td>
                        </tr>
                        <tr>
                            <td>
                                <h2><span style="color: rgb(192, 59, 148);">${user.consul_date}</span></h2> 
                            </td>
                        </tr>
                        
                    </table>
                    
                </div>   
                    <div class="hours"style="width: 200px; float:left; height:100px; margin:115px; font-size: 12px;">
                        <table border = "0">
                            <tr>
                                <td>
                                    <h3><span style="color: rgb(128, 54, 197);">Consultation Hours</span><br></h3><br>
                                </td>
                            </tr>
                            <tr>
                                <td>
                                    <h1><span style="color: rgb(192, 59, 148);">${user.consul_time}</span></h1>
                                </td>
                            </tr>
                        </table>
                            
                    </div>
                    <div class="doctor" style="width: 200px; float:left; height:100px; margin:325px; font-size: 12px;">
                        <table border = "0">
                            <tr>
                                <td>
                                    <h3><span style="color: rgb(128, 54, 197);">Doctor's Name</span><br></h3><br>
                                </td>
                            </tr>
                            <tr>
                                <td>
                                    <h1><span style="color: rgb(192, 59, 148);">${user.consul_doctor}</span></h1> 
                                </td>
                            </tr>
                        </table>

                    </div>
               
               
                    
        </div>
         <!--content4-->
         <div id="content4">
            <div class="via" style="width: 100px; float:left; height:100px; margin:-7px; font-size: 12px;">
                <table border = "0">
                    <tr>
                        <td>
                            <h3><span style="color: rgb(128, 54, 197);">VIA</span><br></h3><br>
                        </td>
                    </tr>
                    <tr>
                        <td> 
                            <h1><span style="color: rgb(192, 59, 148);">${user.consul_via}</span></h1> 
                        </td>
                    </tr>
                </table>
                
            </div>   
            <div class="payment" style="width: 100px; float:left; height:100px; margin:-100px; font-size: 12px;">
                <table border = "0">
                    <tr>
                        <td>
                            <h3><span style="color: rgb(128, 54, 197);">Payment</span><br></h3><br>
                        </td>
                    </tr>
                    <tr>
                      <td>
                          <h1><span style="color: rgb(192, 59, 148);">${user.payment}</span></h1> 
                      </td>
                    </tr>
                    
                </table>
            </div>
                        
        </div>
        <div id="btndelete">
            <a href="#">Delete Consultation Detail</a>
        </div>
         <jsp:include page='layouts/footer.jsp'></jsp:include>
        <jsp:include page='layouts/scripts.jsp'></jsp:include>
    </body>
</html>
