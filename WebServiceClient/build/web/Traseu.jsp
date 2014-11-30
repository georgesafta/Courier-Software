<%-- 
    Document   : Traseu
    Created on : May 13, 2013, 5:15:37 AM
    Author     : George
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="java.util.StringTokenizer"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
            float result1 = 0.f;
            java.lang.String judet = "";
            float volumcamion = 0.f;
            try {
                client.ProiectWebService_Service service = new client.ProiectWebService_Service();
                client.ProiectWebService port = service.getProiectWebServicePort();
                 // TODO initialize WS operation arguments here
                volumcamion = Float.parseFloat(request.getParameter("volum"));
                judet = request.getParameter("judetdestinatar");
                result1 = port.volum(judet);
            } catch (Exception ex) {}
            if (volumcamion - result1 > result1)
            {
                session.setAttribute("mesaj", "Camionul nu contine cel putin 50% din capacitate");
                response.sendRedirect("Afisare.jsp");
            }
            else
            {
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Traseu</title>
        <link rel="stylesheet" type="text/css" href="menu_assets/styles.css" />
        <script src="https://maps.googleapis.com/maps/api/js?v=3.12&key=AIzaSyC4ZVRs__CN0D2MexfrYS7prz2jtwx2WXA&sensor=false&language=ro"></script>
         <%
            java.lang.String result = "";
            java.lang.String destinatii = "";
            java.lang.String idcamion = "";
            try {
                client.ProiectWebService_Service service = new client.ProiectWebService_Service();
                client.ProiectWebService port = service.getProiectWebServicePort();
                 // TODO initialize WS operation arguments here
                idcamion = request.getParameter("idcamion");
                judet = request.getParameter("judetdestinatar");
                destinatii = port.destinatii(idcamion, judet);
                result = port.traseu(idcamion, judet);
            } catch (Exception ex) {}
        %>
        <%
        StringTokenizer stringtokenizer = new StringTokenizer(destinatii, ";");
        StringBuffer values = new StringBuffer();
        while (stringtokenizer.hasMoreElements()) 
        {
            Object adresa = stringtokenizer.nextElement();
            if (values.length() > 0 && !(adresa.equals(""))) 
            {
                values.append(',');
            }
            if(!(adresa.equals("")))
            {
                values.append('"').append(adresa).append('"');
            }
        }
        %>
        <script type="text/javascript">
        var map;
        var geocoder;
        var bounds = new google.maps.LatLngBounds();
        var markersArray = [];
        google.maps.visualRefresh = true;

        var adr;
        var dist = 0;

        var origin = 'Strada Milcov , nr. 11, ap.2, sector 1, Bucuresti, Romania';
        var destinat = [ <%= values.toString() %> ];
        
        var destinationIcon = 'https://chart.googleapis.com/chart?chst=d_map_pin_letter&chld=D|FF0000|000000';
        var originIcon = 'https://chart.googleapis.com/chart?chst=d_map_pin_letter&chld=O|FFFF00|000000';

        function initialize() {
          var opts = {
            center: new google.maps.LatLng(55.53, 9.4),
            zoom: 14,
            mapTypeId: google.maps.MapTypeId.ROADMAP
          };
          map = new google.maps.Map(document.getElementById('map-canvas'), opts);
          geocoder = new google.maps.Geocoder();
        }

        function calculateDistances() {
          var service = new google.maps.DistanceMatrixService();
          service.getDistanceMatrix(
            {
              origins: [origin],
              destinations: destinat,
              travelMode: google.maps.TravelMode.DRIVING,
              unitSystem: google.maps.UnitSystem.METRIC,
              avoidHighways: false,
              avoidTolls: false
            }, callback);
        }

        function callback(response, status) {
          if (status != google.maps.DistanceMatrixStatus.OK) {
            alert('Error was: ' + status);
          } else {
            var origins = response.originAddresses;
            var destinations = response.destinationAddresses;
            var outputDiv = document.getElementById('outputDiv');
            outputDiv.innerHTML = '';
            deleteOverlays();

            for (var i = 0; i < origins.length; i++) {
              var results = response.rows[i].elements;
              addMarker(origins[i], false);
              for (var j = 0; j < results.length; j++) {
                if(results[j].distance.value > dist)
                    {
                        dist = results[j].distance.value;
                        adr = destinat[j];
                    }
                addMarker(destinations[j], true);
                outputDiv.innerHTML += 'De la ' + origins[i] + ' la ' + destinations[j]
                    + ': ' + results[j].distance.text + ' in '
                    + results[j].duration.text + '<br>';
              }
            }
            outputDiv.innerHTML += 'Distanta maxima : <input type = \'hidden\' name = \'distanta\' value = \'' + dist + '\'>' + dist   + 
                'm Adresa : <input type = \'hidden\' name = \'adresa\' value = \'' + adr + '\'>' + adr ;
          }
        }

        function addMarker(location, isDestination) {
          var icon;
          if (isDestination) {
            icon = destinationIcon;
          } else {
            icon = originIcon;
          }
          geocoder.geocode({'address': location}, function(results, status) {
            if (status == google.maps.GeocoderStatus.OK) {
              bounds.extend(results[0].geometry.location);
              map.fitBounds(bounds);
              var marker = new google.maps.Marker({
                map: map,
                position: results[0].geometry.location,
                icon: icon
              });
              markersArray.push(marker);
            } else {
              alert('Geocode was not successful for the following reason: '
                + status);
            }
          });
        }

        function deleteOverlays() {
          for (var i = 0; i < markersArray.length; i++) {
            markersArray[i].setMap(null);
          }
          markersArray = [];
        }
        
        google.maps.event.addDomListener(window, 'load', initialize);

        </script>       
    </head>
    <body onload="calculateDistances();">
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
        <h2 id="art">Camionul cu numarul de inmatriculare <%=request.getParameter("idcamion")%> contine:</h2>
        
    <%
    try {
	out.println(result);
    } catch (Exception ex) {}        
            }
    %>
    <br/>
    <div id="content-pane">
     <div id="outputDiv"></div>
    </div>
   <div id="map-canvas"></div>
        </form>
        </center>
    </body>
</html>
