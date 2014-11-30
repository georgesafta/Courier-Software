package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Insert_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Adaugare Comanda</title>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"menu_assets/styles.css\" />\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div id=\"page-wrap\">\n");
      out.write("        <span style=\"float:right\">    \n");
      out.write("        <form action=\"Logout.jsp\">\n");
      out.write("            <input type=\"submit\" value=\"Logout\">\n");
      out.write("        </form>\n");
      out.write("        </span>\n");
      out.write("        <center>\n");
      out.write("        <h1>Comanda adaugata cu succes</h1>\n");
      out.write("        <div id=\"cssmenu\">\n");
      out.write("            <ul>\n");
      out.write("                <li><a href='home.html'><span>Home</span></a></li>\n");
      out.write("                <li class='has-sub '><a href='#'><span>Comanda</span></a>\n");
      out.write("                   <ul>\n");
      out.write("                      <li><a href='#'><span>Adaugare</span></a></li>\n");
      out.write("                      <li><a href='#'><span>Modificare</span></a></li>\n");
      out.write("                   </ul>\n");
      out.write("                </li>\n");
      out.write("                <li class='has-sub '><a href='#'><span>Colet</span></a>\n");
      out.write("                    <ul>\n");
      out.write("                       <li><a href='#'><span>Respins</span></a></li>\n");
      out.write("                       <li><a href='#'><span>Livrat</span></a></li>\n");
      out.write("                               <li><a href='#'><span>Pierdut</span></a></li>\n");
      out.write("                    </ul>\n");
      out.write("                 </li>\n");
      out.write("                <li class='has-sub'><a href='#'><span>Soferi</span></a>\n");
      out.write("                             <ul>\n");
      out.write("                                     <li><a href='#'><span>Adaugare</span></a></li>\n");
      out.write("                                     <li><a href='#'><span>Eliminare</span></a></li>\n");
      out.write("                                     <li><a href='#'><span>Modificare Stare</span></a></li>\n");
      out.write("                             </ul>\n");
      out.write("                </li>\n");
      out.write("                <li class='has-sub'><a href='#'><span>Camion</span></a>\n");
      out.write("                             <ul>\n");
      out.write("                                     <li><a href='#'><span>Adaugare</span></a></li>\n");
      out.write("                                     <li><a href='#'><span>Eliminare</span></a></li>\n");
      out.write("                                     <li><a href='#'><span>Modificare</span></a></li>\n");
      out.write("                             </ul>\n");
      out.write("                </li>\n");
      out.write("                <li><a href='#'><span>Afisare Ruta</span></a></li>\n");
      out.write("             </ul>\n");
      out.write("        </div>\n");
      out.write("        <p>Datele adaugate sunt:</p>\n");
      out.write("    ");
      out.write("\n");
      out.write("    ");

        java.lang.String numeClient = "";
	java.lang.String prenumeClient = "";
	java.lang.String stradaClient = "";
	java.lang.String numarClient = "";
	java.lang.String blocClient = "";
	java.lang.String scaraClient = "";
	java.lang.String apartamentClient = "";
	java.lang.String orasClient = "";
	java.lang.String judetClient = "";
	java.lang.String email = "";
	java.lang.String telefon = "";
	java.lang.String numeDestinatar = "";
	java.lang.String prenumeDestinatar = "";
	java.lang.String stradaDestinatar = "";
	java.lang.String numarDestinatar = "";
	java.lang.String blocDestinatar = "";
	java.lang.String scaraDestinatar = "";
	java.lang.String apartamentDestinatar = "";
	java.lang.String orasDestinatar = "";
	java.lang.String judetDestinatar = "";
	java.lang.String continut = "";
	int prioritate = 0;
	float volum = 0;
	java.lang.String stare = "";
    try {
	client.ProiectWebService_Service service = new client.ProiectWebService_Service();
	client.ProiectWebService port = service.getProiectWebServicePort();
	 // TODO initialize WS operation arguments here
	numeClient = request.getParameter("numeclient");
	prenumeClient = request.getParameter("prenumeclient");
	stradaClient = request.getParameter("stradaclient");
        numarClient = request.getParameter("numarclient");
	blocClient = request.getParameter("blocclient");
	scaraClient = request.getParameter("scaraclient");
	apartamentClient = request.getParameter("apartamentclient");
	orasClient = request.getParameter("orasclient");
	judetClient = request.getParameter("judetclient");
	email = request.getParameter("email");
	telefon = request.getParameter("telefon");
	numeDestinatar = request.getParameter("numedestinatar");
	prenumeDestinatar = request.getParameter("prenumedestinatar");
	stradaDestinatar = request.getParameter("stradadestinatar");
	numarDestinatar = request.getParameter("numardestinatar");
	blocDestinatar = request.getParameter("blocdestinatar");
	scaraDestinatar = request.getParameter("scaradestinatar");
	apartamentDestinatar = request.getParameter("apartamentdestinatar");
	orasDestinatar = request.getParameter("orasdestinatar");
	judetDestinatar = request.getParameter("judetdestinatar");
	continut = request.getParameter("continut");
	prioritate = Integer.parseInt(request.getParameter("prioritate"));
	volum = Float.parseFloat(request.getParameter("volum"));
	stare = request.getParameter("stare");
	port.adaugareComanda(numeClient, prenumeClient, stradaClient, numarClient, blocClient, scaraClient, apartamentClient, orasClient, judetClient, email, telefon, numeDestinatar, prenumeDestinatar, stradaDestinatar, numarDestinatar, blocDestinatar, scaraDestinatar, apartamentDestinatar, orasDestinatar, judetDestinatar, continut, prioritate, volum, stare);
    } catch (Exception ex) {out.println("N-a mers");}
    
      out.write("\n");
      out.write("    ");
      out.write("\n");
      out.write("    <h4>Date Client:</h4>\n");
      out.write("    <table border=\"1\">\n");
      out.write("        <tr>\n");
      out.write("            <th>Nume</th>\n");
      out.write("            <th>Prenume</th>\n");
      out.write("            <th>Strada</th>\n");
      out.write("            <th>Numar</th>\n");
      out.write("            <th>Bloc</th>\n");
      out.write("            <th>Scara</th>\n");
      out.write("            <th>Apartament</th>\n");
      out.write("            <th>Oras</th>\n");
      out.write("            <th>Judet</th>\n");
      out.write("            <th>Email</th>\n");
      out.write("            <th>Telefon</th>\n");
      out.write("        </tr>\n");
      out.write("        <tr>\n");
      out.write("            <td>");
      out.print(numeClient);
      out.write("</td>\n");
      out.write("            <td>");
      out.print(prenumeClient);
      out.write("</td>\n");
      out.write("            <td>");
      out.print(stradaClient);
      out.write("</td>\n");
      out.write("            <td>");
      out.print(numarClient);
      out.write("</td>\n");
      out.write("            <td>");
      out.print(blocClient);
      out.write("</td>\n");
      out.write("            <td>");
      out.print(scaraClient);
      out.write("</td>\n");
      out.write("            <td>");
      out.print(apartamentClient);
      out.write("</td>\n");
      out.write("            <td>");
      out.print(orasClient);
      out.write("</td>\n");
      out.write("            <td>");
      out.print(judetClient);
      out.write("</td>\n");
      out.write("            <td>");
      out.print(email);
      out.write("</td>\n");
      out.write("            <td>");
      out.print(telefon);
      out.write("</td>\n");
      out.write("        </tr>\n");
      out.write("    </table>\n");
      out.write("    <h4>Date Destinatar:</h4>\n");
      out.write("    <table border=\"1\">\n");
      out.write("        <tr>\n");
      out.write("            <th>Nume</th>\n");
      out.write("            <th>Prenume</th>\n");
      out.write("            <th>Strada</th>\n");
      out.write("            <th>Numar</th>\n");
      out.write("            <th>Bloc</th>\n");
      out.write("            <th>Scara</th>\n");
      out.write("            <th>Apartament</th>\n");
      out.write("            <th>Oras</th>\n");
      out.write("            <th>Judet</th>\n");
      out.write("        </tr>\n");
      out.write("        <tr>\n");
      out.write("            <td>");
      out.print(numeDestinatar);
      out.write("</td>\n");
      out.write("            <td>");
      out.print(prenumeDestinatar);
      out.write("</td>\n");
      out.write("            <td>");
      out.print(stradaDestinatar);
      out.write("</td>\n");
      out.write("            <td>");
      out.print(numarDestinatar);
      out.write("</td>\n");
      out.write("            <td>");
      out.print(blocDestinatar);
      out.write("</td>\n");
      out.write("            <td>");
      out.print(scaraDestinatar);
      out.write("</td>\n");
      out.write("            <td>");
      out.print(apartamentDestinatar);
      out.write("</td>\n");
      out.write("            <td>");
      out.print(orasDestinatar);
      out.write("</td>\n");
      out.write("            <td>");
      out.print(judetDestinatar);
      out.write("</td>\n");
      out.write("        </tr>\n");
      out.write("    </table>\n");
      out.write("    <h4>Date Colet:</h4>\n");
      out.write("    <table border=\"1\">\n");
      out.write("        <tr>\n");
      out.write("            <th>Continut</th>\n");
      out.write("            <th>Prioritate</th>\n");
      out.write("            <th>Volum</th>\n");
      out.write("            <th>Stare</th>\n");
      out.write("        </tr>\n");
      out.write("        <tr>\n");
      out.write("            <td>");
      out.print(continut);
      out.write("</td>\n");
      out.write("            <td>");
      out.print(prioritate);
      out.write("</td>\n");
      out.write("            <td>");
      out.print(volum);
      out.write("</td>\n");
      out.write("            <td>");
      out.print(stare);
      out.write("</td>\n");
      out.write("        </tr>\n");
      out.write("    </table>\n");
      out.write("        </center>\n");
      out.write("        </div>\n");
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
