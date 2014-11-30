package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.StringTokenizer;

public final class Harta_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Traseu</title>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"menu_assets/styles.css\" />\n");
      out.write("        <script src=\"https://maps.googleapis.com/maps/api/js?v=3.12&key=AIzaSyC4ZVRs__CN0D2MexfrYS7prz2jtwx2WXA&sensor=false&language=ro\"></script>\n");
      out.write("        ");

            java.lang.String adresa = "";
            java.lang.String destinatii = "";
            try {
                adresa = request.getParameter("adresa");
                destinatii = request.getParameter("destinatii");
                StringTokenizer stringtokenizer = new StringTokenizer(destinatii, ";");
                StringBuffer values = new StringBuffer();
                while (stringtokenizer.hasMoreElements()) 
                {
                    Object adr = stringtokenizer.nextElement();
                    if (values.length() > 0 && !(adr.equals(""))) 
                    {
                        values.append(',');
                    }
                    if(!(adr.equals("")) && !(adr.equals(adresa)))
                    {
                        values.append('"').append(adresa).append('"');
                    }
                }
            } catch (Exception ex) {}
        
      out.write("\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("        var directionsDisplay;\n");
      out.write("        var directionsService = new google.maps.DirectionsService();\n");
      out.write("        google.maps.visualRefresh = true;\n");
      out.write("\n");
      out.write("        function initialize() {\n");
      out.write("            directionsDisplay = new google.maps.DirectionsRenderer();\n");
      out.write("            var mapOptions = {\n");
      out.write("                zoom: 8,\n");
      out.write("                mapTypeId: google.maps.MapTypeId.ROADMAP,\n");
      out.write("                center: new google.maps.LatLng(44.4333, 26.1000)\n");
      out.write("            };\n");
      out.write("            var map = new google.maps.Map(document.getElementById('map-canvas'),\n");
      out.write("                    mapOptions);\n");
      out.write("            directionsDisplay.setMap(map);\n");
      out.write("            directionsDisplay.setPanel(document.getElementById('directions-panel'));\n");
      out.write("\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        function calcRoute() {\n");
      out.write("            var start = 'Strada Milcov, nr. 11, Bucuresti, Romania';\n");
      out.write("            var end = 'Strada Franceza, nr. 14, Bucuresti, Romania';\n");
      out.write("            var waypts = [];\n");
      out.write("                waypts.push({\n");
      out.write("                location: 'Strada Aeromodelului, nr.51, Bucuresti, Romania',\n");
      out.write("                stopover:true\n");
      out.write("            });\n");
      out.write("                waypts.push({\n");
      out.write("                location:'Strada Clabucet, nr. 5, Bucuresti, Romania',\n");
      out.write("                stopover:true\n");
      out.write("            });\n");
      out.write("            var request = {\n");
      out.write("                origin: start,\n");
      out.write("                destination: end,\n");
      out.write("                        waypoints: waypts,\n");
      out.write("                        unitSystem: google.maps.UnitSystem.METRIC,\n");
      out.write("                        provideRouteAlternatives: true,\n");
      out.write("                        durationInTraffic: true,\n");
      out.write("                        optimizeWaypoints: true,\n");
      out.write("                travelMode: google.maps.TravelMode.DRIVING\n");
      out.write("            };\n");
      out.write("            directionsService.route(request, function(response, status) {\n");
      out.write("                if (status == google.maps.DirectionsStatus.OK) {\n");
      out.write("                    directionsDisplay.setDirections(response);\n");
      out.write("                }\n");
      out.write("            });\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        google.maps.event.addDomListener(window, 'load', initialize);\n");
      out.write("\n");
      out.write("       </script>\n");
      out.write("    </head>\n");
      out.write("    <body onload=\"calcRoute();\">\n");
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
      out.write("            <h2 id=\"art\">Traseul camionului este:</h2>\n");
      out.write("   <div id=\"map-canvas\"></div>\n");
      out.write("   <div id=\"directions-panel\"></div>\n");
      out.write("    </center>\n");
      out.write("    </body>\n");
      out.write("</html>");
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
