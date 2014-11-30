<%-- 
    Document   : Home
    Created on : Apr 28, 2013, 2:13:47 PM
    Author     : George
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home</title>
        <link rel="stylesheet" href="nivo-slider3.2/nivo-slider/nivo-slider.css" type="text/css" media="screen" />
        <link rel="stylesheet" href="nivo-slider3.2/nivo-slider/themes/default/default.css" type="text/css" media="screen" />
        <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.7.1/jquery.min.js" type="text/javascript"></script>
        <script src="nivo-slider3.2/nivo-slider/jquery.nivo.slider.pack.js" type="text/javascript"></script>
        <link rel="stylesheet" type="text/css" href="menu_assets/styles.css" />
    </head>
    <body>
        <div id="page-wrap">
        <span style="float:right">    
        <form action="Logout.jsp">
            <input type="submit" value="Logout">
        </form>
        </span>
        <center>
        <%
        java.lang.String mesaj = "";
            if (session.getAttribute("mesaj") != null)
            { 
                mesaj = session.getAttribute("mesaj") + "";
                session.removeAttribute("mesaj");
            }
        %>
        <p id="art" style="color: red; font-size: 16px"><%=mesaj%></p>
        <div class="slider-wrapper theme-default">
            <div id="slider" class="nivoSlider">
                <img src="nivo-slider3.2/nivo-slider/demo/images/1.jpg" alt="" />
                <img src="nivo-slider3.2/nivo-slider/demo/images/2.jpg" alt="" />
                <img src="nivo-slider3.2/nivo-slider/demo/images/3.jpg" alt="" />
                <img src="nivo-slider3.2/nivo-slider/demo/images/4.jpg" alt="" />
                <img src="nivo-slider3.2/nivo-slider/demo/images/5.jpg" alt="" />
                <img src="nivo-slider3.2/nivo-slider/demo/images/6.jpg" alt="" />
            </div>
        </div>
                <script type="text/javascript">
                $(window).load(function() {
                        $('#slider').nivoSlider();
                });
                </script>
        <div id="cssmenu">
            <ul>
                <li><a href='Home.jsp'><span>Home</span></a></li>
                <li class='has-sub '><a href='#'><span>Comanda</span></a>
                   <ul>
                      <li><a href='AdaugareComanda.jsp'><span>Adaugare</span></a></li>
                      <li><a href='Modify.jsp'><span>Modificare</span></a></li>
                   </ul>
                </li>
                <li class='has-sub '><a href='#'><span>Colet</span></a>
                    <ul>
                       <li><a href='ColetRespins.jsp'><span>Respins</span></a></li>
                       <li><a href='ColetLivrat.jsp'><span>Livrat</span></a></li>
                       <li><a href='ColetPierdut.jsp'><span>Pierdut</span></a></li>
                    </ul>
                 </li>
                <li class='has-sub'><a href='#'><span>Soferi</span></a>
                             <ul>
                                     <li><a href='AdaugareSofer.jsp'><span>Adaugare</span></a></li>
                                     <li><a href='ElimSofer.jsp'><span>Eliminare</span></a></li>
                                     <li><a href='ModifySofer.jsp'><span>Modificare Stare</span></a></li>
                             </ul>
                </li>
                <li class='has-sub'><a href='#'><span>Camion</span></a>
                             <ul>
                                     <li><a href='AdaugareCamion.jsp'><span>Adaugare</span></a></li>
                                     <li><a href='ElimCamion.jsp'><span>Eliminare</span></a></li>
                                     <li><a href='ModifyCamion.jsp'><span>Modificare</span></a></li>
                             </ul>
                </li>
                <li><a href='Afisare.jsp'><span>Incarcare Camion</span></a></li>
             </ul>
        </div>
        </center>
        </div>
    </body>
</html>
