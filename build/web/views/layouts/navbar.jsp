<!-- menu navigator atas (header)-->
        <div id="menu">
            <div class="logo">
                <a href="/MentalYou/"><img src="public/assets/backend/img/MentalYou-logo.png" alt="MentalYou-logo" width="120" height="120"></a>
                
            </div>
            <div class="nav">
                <nav>
                     <ul>
                        <li><a href="home">home</a></li>
                        <li><a href="about">about us</a></li>
                        <li><a href="article">articles</a></li>
                         <li><a href="consultation">consultation</a></li>   
                    </ul>
                </nav>
            </div>
            <% if ( session.getAttribute("username") != null) { %>
                <div class="profile">
                    <a href="login"><i class="fas fa-user-circle"></i></a>  
                </div>
            <% } else {%>
                <div class="profile">
                    <a href="profile"><i class="fas fa-user-circle"></i></a>  
                </div>
            <% } %>
        </div>
