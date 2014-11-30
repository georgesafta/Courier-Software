package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Traseu_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Traseu</title>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"menu_assets/styles.css\" />\n");
      out.write("        <script src=\"https://maps.googleapis.com/maps/api/js?v=3.12&key=AIzaSyC4ZVRs__CN0D2MexfrYS7prz2jtwx2WXA&sensor=false&language=ro\"></script>\n");
      out.write("         ");

            java.lang.String result = "";
            java.lang.String destinatii = "";
            try {
                client.ProiectWebService_Service service = new client.ProiectWebService_Service();
                client.ProiectWebService port = service.getProiectWebServicePort();
                 // TODO initialize WS operation arguments here
                java.lang.String idcamion = request.getParameter("idcamion");
                java.lang.String judet = request.getParameter("judetdestinatar");
                result = port.traseu(idcamion, judet);
                destinatii = port.destinatii(idcamion, judet);
            } catch (Exception ex) {}
        
      out.write("\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("        var map;\n");
      out.write("        var geocoder;\n");
      out.write("        var bounds = new google.maps.LatLngBounds();\n");
      out.write("        var markersArray = [];\n");
      out.write("        google.maps.visualRefresh = true;\n");
      out.write("\n");
      out.write("        var origin = 'Strada Milcov , nr. 11, ap.2, sector 1, Bucuresti, Romania';\n");
      out.write("        var destinat = ['Strada Lainici, nr. 4, Bucuresti, Romania', 'Strada Aeromodelului, Bucuresti, Romania'];\n");
      out.write("\n");
      out.write("        var destinationIcon = 'https://chart.googleapis.com/chart?chst=d_map_pin_letter&chld=D|FF0000|000000';\n");
      out.write("        var originIcon = 'https://chart.googleapis.com/chart?chst=d_map_pin_letter&chld=O|FFFF00|000000';\n");
      out.write("\n");
      out.write("        function initialize() {\n");
      out.write("          var opts = {\n");
      out.write("            center: new google.maps.LatLng(55.53, 9.4),\n");
      out.write("            zoom: 14,\n");
      out.write("            mapTypeId: google.maps.MapTypeId.ROADMAP\n");
      out.write("          };\n");
      out.write("          map = new google.maps.Map(document.getElementById('map-canvas'), opts);\n");
      out.write("          geocoder = new google.maps.Geocoder();\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        function calculateDistances() {\n");
      out.write("          var service = new google.maps.DistanceMatrixService();\n");
      out.write("          service.getDistanceMatrix(\n");
      out.write("            {\n");
      out.write("              origins: [origin],\n");
      out.write("              destinations: destinat,\n");
      out.write("              travelMode: google.maps.TravelMode.DRIVING,\n");
      out.write("              unitSystem: google.maps.UnitSystem.METRIC,\n");
      out.write("              avoidHighways: false,\n");
      out.write("              avoidTolls: false\n");
      out.write("            }, callback);\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        function callback(response, status) {\n");
      out.write("          if (status != google.maps.DistanceMatrixStatus.OK) {\n");
      out.write("            alert('Error was: ' + status);\n");
      out.write("          } else {\n");
      out.write("            var origins = response.originAddresses;\n");
      out.write("            var destinations = response.destinationAddresses;\n");
      out.write("            var outputDiv = document.getElementById('outputDiv');\n");
      out.write("            outputDiv.innerHTML = '';\n");
      out.write("            deleteOverlays();\n");
      out.write("\n");
      out.write("            for (var i = 0; i < origins.length; i++) {\n");
      out.write("              var results = response.rows[i].elements;\n");
      out.write("              addMarker(origins[i], false);\n");
      out.write("              for (var j = 0; j < results.length; j++) {\n");
      out.write("                addMarker(destinations[j], true);\n");
      out.write("                outputDiv.innerHTML += 'De la ' + origins[i] + ' la ' + destinations[j]\n");
      out.write("                    + ': ' + results[j].distance.text + ' in '\n");
      out.write("                    + results[j].duration.text + '<br>';\n");
      out.write("              }\n");
      out.write("            }\n");
      out.write("          }\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        function addMarker(location, isDestination) {\n");
      out.write("          var icon;\n");
      out.write("          if (isDestination) {\n");
      out.write("            icon = destinationIcon;\n");
      out.write("          } else {\n");
      out.write("            icon = originIcon;\n");
      out.write("          }\n");
      out.write("          geocoder.geocode({'address': location}, function(results, status) {\n");
      out.write("            if (status == google.maps.GeocoderStatus.OK) {\n");
      out.write("              bounds.extend(results[0].geometry.location);\n");
      out.write("              map.fitBounds(bounds);\n");
      out.write("              var marker = new google.maps.Marker({\n");
      out.write("                map: map,\n");
      out.write("                position: results[0].geometry.location,\n");
      out.write("                icon: icon\n");
      out.write("              });\n");
      out.write("              markersArray.push(marker);\n");
      out.write("            } else {\n");
      out.write("              alert('Geocode was not successful for the following reason: '\n");
      out.write("                + status);\n");
      out.write("            }\n");
      out.write("          });\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        function deleteOverlays() {\n");
      out.write("          for (var i = 0; i < markersArray.length; i++) {\n");
      out.write("            markersArray[i].setMap(null);\n");
      out.write("          }\n");
      out.write("          markersArray = [];\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        google.maps.event.addDomListener(window, 'load', initialize);\n");
      out.write("\n");
      out.write("        </script>       \n");
      out.write("    </head>\n");
      out.write("    <body onload=\"calculateDistances();\">\n");
      out.write("        <div id=\"page-wrap\">\n");
      out.write("        <span style=\"float:right\">    \n");
      out.write("        <form action=\"Logout.jsp\">\n");
      out.write("            <input type=\"submit\" value=\"Logout\">\n");
      out.write("        </form>\n");
      out.write("        </span>\n");
      out.write("        <center>\n");
      out.write("            <p id=\"art\"></p>\n");
      out.write("        <div id=\"cssmenu\">\n");
      out.write("            <ul>\n");
      out.write("                <li><a href='Home.jsp'><span>Home</span></a></li>\n");
      out.write("                <li class='has-sub '><a href='#'><span>Comanda</span></a>\n");
      out.write("                   <ul>\n");
      out.write("                      <li><a href='AdaugareComanda.jsp'><span>Adaugare</span></a></li>\n");
      out.write("                      <li><a href='Modify.jsp'><span>Modificare</span></a></li>\n");
      out.write("                   </ul>\n");
      out.write("                </li>\n");
      out.write("                <li class='has-sub '><a href='#'><span>Colet</span></a>\n");
      out.write("                    <ul>\n");
      out.write("                       <li><a href='#'><span>Respins</span></a></li>\n");
      out.write("                       <li><a href='#'><span>Livrat</span></a></li>\n");
      out.write("                       <li><a href='#'><span>Pierdut</span></a></li>\n");
      out.write("                    </ul>\n");
      out.write("                 </li>\n");
      out.write("                <li class='has-sub'><a href='#'><span>Soferi</span></a>\n");
      out.write("                             <ul>\n");
      out.write("                                     <li><a href='AdaugareSofer.jsp'><span>Adaugare</span></a></li>\n");
      out.write("                                     <li><a href='ElimSofer.jsp'><span>Eliminare</span></a></li>\n");
      out.write("                                     <li><a href='ModifySofer.jsp'><span>Modificare Stare</span></a></li>\n");
      out.write("                             </ul>\n");
      out.write("                </li>\n");
      out.write("                <li class='has-sub'><a href='#'><span>Camion</span></a>\n");
      out.write("                             <ul>\n");
      out.write("                                     <li><a href='AdaugareCamion.jsp'><span>Adaugare</span></a></li>\n");
      out.write("                                     <li><a href='ElimCamion.jsp'><span>Eliminare</span></a></li>\n");
      out.write("                                     <li><a href='ModifyCamion.jsp'><span>Modificare</span></a></li>\n");
      out.write("                             </ul>\n");
      out.write("                </li>\n");
      out.write("                <li><a href='Afisare.jsp'><span>Incarcare Camion</span></a></li>\n");
      out.write("             </ul>\n");
      out.write("        </div>\n");
      out.write("        <h2 id=\"art\">Camionul cu numarul de inmatriculare ");
      out.print(request.getParameter("idcamion"));
      out.write(" contine:</h2>\n");
      out.write("        \n");
      out.write("    ");

    try {
	out.println(result);
        out.println(destinatii);
    } catch (Exception ex) {}
    
      out.write("\n");
      out.write("    <div id=\"content-pane\">\n");
      out.write("     <div id=\"outputDiv\"></div>\n");
      out.write("    </div>\n");
      out.write("   <div id=\"map-canvas\"></div>\n");
      out.write("    </center>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
