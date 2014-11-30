<%-- 
    Document   : Harta
    Created on : Jun 23, 2013, 12:37:17 PM
    Author     : George
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="java.util.StringTokenizer"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Traseu</title>
        <link rel="stylesheet" type="text/css" href="menu_assets/styles.css" />
        <script src="https://maps.googleapis.com/maps/api/js?v=3.12&key=AIzaSyC4ZVRs__CN0D2MexfrYS7prz2jtwx2WXA&sensor=false&language=ro"></script>
        <%
            java.lang.String adresa = "";
            java.lang.String destinatii = "";
            StringBuffer values = new StringBuffer();
            int i = 0; 
            try {
                adresa = request.getParameter("adresa");
                destinatii = request.getParameter("destinatii");
                StringTokenizer stringtokenizer = new StringTokenizer(destinatii, ";");             
                while (stringtokenizer.hasMoreElements()) 
                {
                    Object adr = stringtokenizer.nextElement();
                    if (values.length() > 0 && !(adr.equals(""))) 
                    {
                        values.append(',');
                    }
                    if(!(adr.equals("")) && !(adr.equals(adresa)))
                    {
                        values.append("'").append(adr).append("'");
                        i++;
                    }
                }
            } catch (Exception ex) {}
        %>
        <script type="text/javascript">
        var directionsDisplay;
        var dest = [ <%=values.toString()%> ];
        var directionsService = new google.maps.DirectionsService();
        google.maps.visualRefresh = true;

        function initialize() {
            directionsDisplay = new google.maps.DirectionsRenderer();
            var mapOptions = {
                zoom: 8,
                mapTypeId: google.maps.MapTypeId.ROADMAP,
                center: new google.maps.LatLng(44.4333, 26.1000)
            };
            var map = new google.maps.Map(document.getElementById('map-canvas'),
                    mapOptions);
            directionsDisplay.setMap(map);
            directionsDisplay.setPanel(document.getElementById('directions-panel'));

        }

        function calcRoute() {
            var start = 'Strada Milcov, nr. 11, Bucuresti, Romania';
            var end = '<%=adresa%>';
            var waypts = [];
            for(var i = 0; i < dest.length; i++)
            {
                waypts.push({
                location: dest[i],
                stopover:true
            });
            }
            var request = {
                origin: start,
                destination: end,
                        waypoints: waypts,
                        unitSystem: google.maps.UnitSystem.METRIC,
                        provideRouteAlternatives: true,
                        durationInTraffic: true,
                        optimizeWaypoints: true,
                travelMode: google.maps.TravelMode.DRIVING
            };
            directionsService.route(request, function(response, status) {
                if (status == google.maps.DirectionsStatus.OK) {
                    directionsDisplay.setDirections(response);
                }
            });
        }

        google.maps.event.addDomListener(window, 'load', initialize);

       </script>
    </head>
    <body onload="calcRoute();">
        <div id="page-wrap">
        <span style="float:right">    
        <form action="Logout.jsp">
            <input type="submit" value="Logout">
        </form>
        </span>
        <center>
            <p id="art"></p>
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
            <h2 id="art">Traseul camionului este:</h2>
   <div id="map-canvas"></div>
   <div id="directions-panel"></div>
    </center>
    </body>
</html>