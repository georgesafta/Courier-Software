package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Afisare_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Afisare Traseu</title>\n");
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
      out.write("        ");

        java.lang.String mesaj = "";
            if (session.getAttribute("mesaj") != null)
            { 
                mesaj = session.getAttribute("mesaj") + "";
                session.removeAttribute("mesaj");
            }
        
      out.write("\n");
      out.write("        <p id=\"art\" style=\"color: red; font-size: 16px\">");
      out.print(mesaj);
      out.write("</p>\n");
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
      out.write("                       <li><a href='ColetRespins.jsp'><span>Respins</span></a></li>\n");
      out.write("                       <li><a href='ColetLivrat.jsp'><span>Livrat</span></a></li>\n");
      out.write("                       <li><a href='ColetPierdut.jsp'><span>Pierdut</span></a></li>\n");
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
      out.write("            <h2 id=\"art\">Selectati camionul pe care doriti sa-l folositi</h2>\n");
      out.write("            <table>\n");
      out.write("                <tr>\n");
      out.write("                    <td>\n");
      out.write("        ");

        try {
            client.ProiectWebService_Service service = new client.ProiectWebService_Service();
            client.ProiectWebService port = service.getProiectWebServicePort();
            java.lang.String result = port.selectCamioane();
            out.println(result);
        } catch (Exception ex) {}
        
      out.write("\n");
      out.write("                    </td>\n");
      out.write("                    <td>\n");
      out.write("                        <table border=\"1\">\n");
      out.write("                            <tr>\n");
      out.write("                                <th>Judet</th><th>Volum colete</th><th>Numar colete</th>\n");
      out.write("                            </tr>\n");
      out.write("                        ");

                        try {
                            client.ProiectWebService_Service service = new client.ProiectWebService_Service();
                            client.ProiectWebService port = service.getProiectWebServicePort();
                            java.lang.String [] judet = {"Alba",
                                                        "Arad",
                                                        "Arges",
                                                        "Bacau",
                                                        "Bihor",
                                                        "Bistrita Nasaud",
                                                        "Botosani",
                                                        "Brasov",
                                                        "Braila",
                                                        "Bucuresti",
                                                        "Buzau",
                                                        "Caras Severin",
                                                        "Calarasi",
                                                        "Cluj",
                                                        "Constanta",
                                                        "Covasna",
                                                        "Dambovita",
                                                        "Dolj",
                                                        "Galati",
                                                        "Giurgiu",
                                                        "Gorj",
                                                        "Harghita",
                                                        "Hunedoara",
                                                        "Ialomita",
                                                        "Iasi",
                                                        "Ilfov",
                                                        "Maramures",
                                                        "Mehedinti",
                                                        "Mures",
                                                        "Neamt",
                                                        "Olt",
                                                        "Prahova",
                                                        "Satu Mare",
                                                        "Salaj",
                                                        "Sibiu",
                                                        "Suceava",
                                                        "Teleorman",
                                                        "Timis",
                                                        "Tulcea",
                                                        "Vaslui",
                                                        "Valcea",
                                                        "Vrancea"};
                            for(int i = 0; i < 42; i++)
                            {
                                java.lang.String result = port.lista(judet[i]);
                                out.println(result);
                            }
                        } catch (Exception ex) {}
                        
      out.write("\n");
      out.write("                        </table>\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("         </center>\n");
      out.write("        </div>\n");
      out.write("    \n");
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
