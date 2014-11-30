package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Rejected_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Comanda Respinsa</title>\n");
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
      out.write("    ");

    int idcomanda = 0;
    java.lang.String numeClient = "";
    java.lang.String prenumeClient = "";
    java.lang.String numeDestinatar = "";
    java.lang.String prenumeDestinatar = "";
    java.lang.String continut = "";
    try {
	client.ProiectWebService_Service service = new client.ProiectWebService_Service();
	client.ProiectWebService port = service.getProiectWebServicePort();
	int id = Integer.parseInt(request.getParameter("id"));
	java.lang.String motiv = request.getParameter("motiv");
	port.rejected(id, motiv);
        idcomanda = port.idComanda(id);
        numeClient = port.numeClient(id);
        prenumeClient = port.prenumeClient(id);
        numeDestinatar = port.numeDestinatar(id);
        prenumeDestinatar = port.prenumeDestinatar(id);
        continut = port.continut(id);
    } catch (Exception ex) {}
    
      out.write("\n");
      out.write("    <h1>Comanda nr. ");
      out.print(idcomanda);
      out.write(" a fost Respinsa</h1>\n");
      out.write("    <br/><br/>\n");
      out.write("    <div id=\"cssmenu\">\n");
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
      out.write("    <table border=\"1\">\n");
      out.write("        <tr>\n");
      out.write("            <td>Nume Client</td><td>");
      out.print(numeClient);
      out.write("</td>\n");
      out.write("        </tr>\n");
      out.write("        <tr>\n");
      out.write("            <td>Prenume Client</td><td>");
      out.print(prenumeClient);
      out.write("</td>\n");
      out.write("        </tr>\n");
      out.write("        <tr>\n");
      out.write("            <td>Nume Destinatar</td><td>");
      out.print(numeDestinatar);
      out.write("</td>\n");
      out.write("        </tr>\n");
      out.write("        <tr>\n");
      out.write("            <td>Prenume Destinatar</td><td>");
      out.print(prenumeDestinatar);
      out.write("</td>\n");
      out.write("        </tr>\n");
      out.write("        <tr>\n");
      out.write("            <td>Continut</td><td>");
      out.print(continut);
      out.write("</td>\n");
      out.write("        </tr>\n");
      out.write("        <tr>\n");
      out.write("            <td>Motiv</td><td>");
      out.print(request.getParameter("motiv"));
      out.write("</td>\n");
      out.write("        </tr>\n");
      out.write("    </table>\n");
      out.write("        <br/><br/><hr/>\n");
      out.write("        <form action=\"Home.jsp\"><input type=\"submit\" value=\"Inapoi\"></form>\n");
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
