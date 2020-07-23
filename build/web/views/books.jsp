<%-- 
    Document   : books
    Created on : Jul 16, 2020, 12:16:58 PM
    Author     : Bia
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
         <jsp:include page='layouts/head.jsp'>
            <jsp:param name= "title" value= "Book Recommendation Article"/>
        </jsp:include>
        <link href="public/assets/backend/css/books.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <jsp:include page='layouts/navbar.jsp'></jsp:include>
        <!--content1-->
        <div id="content1">
            <h1> <span style="color: #6c2e2e;">This Week Books</span> </h1>
            <div class="iconbk">
                <img src="public/assets/backend/img/pinkbg.png" alt="pinkbg" width="720" height="400">
            </div>
            <div class="iconbk2">
                <img src="public/assets/backend/img/line.png" alt="lineimg" width="350" height="350">
            </div>
            <div class="iconbk3"> 
                <img src="public/assets/backend/img/book2.jpg" alt="book2" width="300" height="380">
            </div>
            <div class="quotes1">
                <h2>How Your Mind Can Heal Your Body</h2>
                <p>Author Dr. David Hamilton has shared <br> some radical explanations of what <br> happens to our body at the cellular level <br>
                     when we have 
                    poor mental health. <br> The book covers an A to Z list of how we can <br> use imagery as a healing mechanism for <br> 
                    chronic pain and other 
                    physical conditions.</p>
                    <h3><a href="https://storelafr7.firebaseapp.com/aa053/how-your-mind-can-heal-your-body-by-david-r-hamilton-1401921485.pdf">
                         Download PDF Here</a></h3>
            </div>
        </div>
        <!--content2-->
        <div id="content2">
            <div class="image">
                <div class="iconbk4">
                    <img src="public/assets/backend/img/pinkbg.png" alt="pinkbg" width="500" height="300">    
                    <div class="iconbk5">
                        <img src="public/assets/backend/img/flowerimg.png" alt="flowerimg" width="350" height="400">     
                    </div>
                    <div class="iconbk6">
                        <img src="public/assets/backend/img/book3.jpg" alt="book3" width="300" height="380">
                    </div>
                </div>
            </div>
            <div class="quotes2">
                <h2>The Mind-Gut Connection</h2>
                <p>It discusses the underlying causes of some <br> regular phenomena, such as, why we feel <br> nauseated when we are nervous, 
                    or why some <br> people feel bloated during times of distress.</p>
                    <h3><a href="https://www.researchgate.net/publication/305680906_The_Mind-Gut_Connection">Download PDF Here</a></h3>    
            </div>
        </div>
        <!--content3-->
        <div id="content3">
            <div class="image2">
                <div class="iconbk7">
                    <img src="public/assets/backend/img/pinkbg.png" alt="pinkbg" width="900" height="400">
                </div>
                <div class="iconbk8">
                    <img src="public/assets/backend/img/line.png" alt="line" width="500" height="350">
                </div>
                <div class="iconbk9">
                    <img src="public/assets/backend/img/book1.png" alt="book3" width="300" height="380">
                </div>
            </div>
            <div class="quotes3">
                <h2>(Don't) Call Me Crazy</h2>
                <p>Don't Call Me Crazy talks about the social <br> aspects that make mental illness worse than <br> it is. How we look at others
                     with mental illness <br> can impact their wellbeing to a large extent.</p>
                     <h3><a href="http://sidithofaghi.over-blog.com/2019/12/book-downloading-pdf-don-t-call-me-crazy-33.html">Download PDF Here</a></h3>
            </div>
        </div>
        <jsp:include page='layouts/footer.jsp'></jsp:include>
        <jsp:include page='layouts/scripts.jsp'></jsp:include>
    </body>
</html>

