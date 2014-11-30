package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class AdaugareComanda_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>JSP Page</title>\n");
      out.write("   <link rel=\"stylesheet\" type=\"text/css\" href=\"menu_assets/styles.css\" />\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
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
      out.write("            <h2 id=\"art\">Introduceti datele comenzii</h2>\n");
      out.write("        <form action=\"Insert.jsp\" method=\"post\">\n");
      out.write("            <table>\n");
      out.write("            <tr>\n");
      out.write("            <td><b>Date Client:</b></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>Nume:</td><td><input type=\"text\" name=\"numeclient\"></td>\n");
      out.write("                <td>Prenume:</td><td><input type=\"text\" name=\"prenumeclient\"></td>\n");
      out.write("                <td>Strada:</td><td><input type=\"text\" name=\"stradaclient\"></td>\n");
      out.write("                <td>Numar:</td><td><input type=\"text\" name=\"numarclient\"></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>Bloc:</td><td><input type=\"text\" name=\"blocclient\"></td>\n");
      out.write("                <td>Scara:</td><td><input type=\"text\" name=\"scaraclient\"></td>\n");
      out.write("                <td>Apartament:</td><td><input type=\"text\" name=\"apartamentclient\"></td>\n");
      out.write("                <td>Oras:</td><td><input type=\"text\" name=\"orasclient\"></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>Judet:</td>\n");
      out.write("                <td><select name=\"judetclient\">\n");
      out.write("                        <option value=\"0\">Alege Judet</option>\n");
      out.write("                        <option value=\"Alba\">Alba</option>\n");
      out.write("                        <option value=\"Arad\">Arad</option>\n");
      out.write("                        <option value=\"Arges\">Arges</option>\n");
      out.write("                        <option value=\"Bacau\">Bacau</option>\n");
      out.write("                        <option value=\"Bihor\">Bihor</option>\n");
      out.write("                        <option value=\"Bistrita Nasaud\">Bistrita Nasaud</option>\n");
      out.write("                        <option value=\"Botosani\">Botosani</option>\n");
      out.write("                        <option value=\"Brasov\">Brasov</option>\n");
      out.write("                        <option value=\"Braila\">Braila</option>\n");
      out.write("                        <option value=\"Bucuresti\">Bucuresti</option>\n");
      out.write("                        <option value=\"Buzau\">Buzau</option>\n");
      out.write("                        <option value=\"Caras Severin\">Caras Severin</option>\n");
      out.write("                        <option value=\"Calarasi\">Calarasi</option>\n");
      out.write("                        <option value=\"Cluj\">Cluj</option>\n");
      out.write("                        <option value=\"Constanta\">Constanta</option>\n");
      out.write("                        <option value=\"Covasna\">Covasna</option>\n");
      out.write("                        <option value=\"Dambovita\">Dambovita</option>\n");
      out.write("                        <option value=\"Dolj\">Dolj</option>\n");
      out.write("                        <option value=\"Galati\">Galati</option>\n");
      out.write("                        <option value=\"Giurgiu\">Giurgiu</option>\n");
      out.write("                        <option value=\"Gorj\">Gorj</option>\n");
      out.write("                        <option value=\"Harghita\">Harghita</option>\n");
      out.write("                        <option value=\"Hunedoara\">Hunedoara</option>\n");
      out.write("                        <option value=\"Ialomita\">Ialomita</option>\n");
      out.write("                        <option value=\"Iasi\">Iasi</option>\n");
      out.write("                        <option value=\"Ilfov\">Ilfov</option>\n");
      out.write("                        <option value=\"Maramures\">Maramures</option>\n");
      out.write("                        <option value=\"Mehedinti\">Mehedinti</option>\n");
      out.write("                        <option value=\"Mures\">Mures</option>\n");
      out.write("                        <option value=\"Neamt\">Neamt</option>\n");
      out.write("                        <option value=\"Olt\">Olt</option>\n");
      out.write("                        <option value=\"Prahova\">Prahova</option>\n");
      out.write("                        <option value=\"Satu Mare\">Satu Mare</option>\n");
      out.write("                        <option value=\"Salaj\">Salaj</option>\n");
      out.write("                        <option value=\"Sibiu\">Sibiu</option>\n");
      out.write("                        <option value=\"Suceava\">Suceava</option>\n");
      out.write("                        <option value=\"Teleorman\">Teleorman</option>\n");
      out.write("                        <option value=\"Timis\">Timis</option>\n");
      out.write("                        <option value=\"Tulcea\">Tulcea</option>\n");
      out.write("                        <option value=\"Vaslui\">Vaslui</option>\n");
      out.write("                        <option value=\"Valcea\">Valcea</option>\n");
      out.write("                        <option value=\"Vrancea\">Vrancea</option>\n");
      out.write("                    </select>     \n");
      out.write("                </td>\n");
      out.write("                <td>Email:</td><td><input type=\"text\" name=\"email\"></td>\n");
      out.write("                <td>Telefon:</td><td><input type=\"text\" name=\"telefon\"></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("            <td><b>Date Destinatar:</b></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>Nume:</td><td><input type=\"text\" name=\"numedestinatar\"></td>\n");
      out.write("                <td>Prenume:</td><td><input type=\"text\" name=\"prenumedestinatar\"></td>\n");
      out.write("                <td>Strada:</td><td><input type=\"text\" name=\"stradadestinatar\"></td>\n");
      out.write("                <td>Numar:</td><td><input type=\"text\" name=\"numardestinatar\"></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>Bloc:</td><td><input type=\"text\" name=\"blocdestinatar\"></td>\n");
      out.write("                <td>Scara:</td><td><input type=\"text\" name=\"scaradestinatar\"></td>\n");
      out.write("                <td>Apartament:</td><td><input type=\"text\" name=\"apartamentdestinatar\"></td>\n");
      out.write("                <td>Oras:</td><td><input type=\"text\" name=\"orasdestinatar\"></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>Judet:</td>\n");
      out.write("                <td><select name=\"judetdestinatar\">\n");
      out.write("                        <option value=\"0\">Alege Judet</option>\n");
      out.write("                        <option value=\"Alba\">Alba</option>\n");
      out.write("                        <option value=\"Arad\">Arad</option>\n");
      out.write("                        <option value=\"Arges\">Arges</option>\n");
      out.write("                        <option value=\"Bacau\">Bacau</option>\n");
      out.write("                        <option value=\"Bihor\">Bihor</option>\n");
      out.write("                        <option value=\"Bistrita Nasaud\">Bistrita Nasaud</option>\n");
      out.write("                        <option value=\"Botosani\">Botosani</option>\n");
      out.write("                        <option value=\"Brasov\">Brasov</option>\n");
      out.write("                        <option value=\"Braila\">Braila</option>\n");
      out.write("                        <option value=\"Bucuresti\">Bucuresti</option>\n");
      out.write("                        <option value=\"Buzau\">Buzau</option>\n");
      out.write("                        <option value=\"Caras Severin\">Caras Severin</option>\n");
      out.write("                        <option value=\"Calarasi\">Calarasi</option>\n");
      out.write("                        <option value=\"Cluj\">Cluj</option>\n");
      out.write("                        <option value=\"Constanta\">Constanta</option>\n");
      out.write("                        <option value=\"Covasna\">Covasna</option>\n");
      out.write("                        <option value=\"Dambovita\">Dambovita</option>\n");
      out.write("                        <option value=\"Dolj\">Dolj</option>\n");
      out.write("                        <option value=\"Galati\">Galati</option>\n");
      out.write("                        <option value=\"Giurgiu\">Giurgiu</option>\n");
      out.write("                        <option value=\"Gorj\">Gorj</option>\n");
      out.write("                        <option value=\"Harghita\">Harghita</option>\n");
      out.write("                        <option value=\"Hunedoara\">Hunedoara</option>\n");
      out.write("                        <option value=\"Ialomita\">Ialomita</option>\n");
      out.write("                        <option value=\"Iasi\">Iasi</option>\n");
      out.write("                        <option value=\"Ilfov\">Ilfov</option>\n");
      out.write("                        <option value=\"Maramures\">Maramures</option>\n");
      out.write("                        <option value=\"Mehedinti\">Mehedinti</option>\n");
      out.write("                        <option value=\"Mures\">Mures</option>\n");
      out.write("                        <option value=\"Neamt\">Neamt</option>\n");
      out.write("                        <option value=\"Olt\">Olt</option>\n");
      out.write("                        <option value=\"Prahova\">Prahova</option>\n");
      out.write("                        <option value=\"Satu Mare\">Satu Mare</option>\n");
      out.write("                        <option value=\"Salaj\">Salaj</option>\n");
      out.write("                        <option value=\"Sibiu\">Sibiu</option>\n");
      out.write("                        <option value=\"Suceava\">Suceava</option>\n");
      out.write("                        <option value=\"Teleorman\">Teleorman</option>\n");
      out.write("                        <option value=\"Timis\">Timis</option>\n");
      out.write("                        <option value=\"Tulcea\">Tulcea</option>\n");
      out.write("                        <option value=\"Vaslui\">Vaslui</option>\n");
      out.write("                        <option value=\"Valcea\">Valcea</option>\n");
      out.write("                        <option value=\"Vrancea\">Vrancea</option>\n");
      out.write("                    </select>     \n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("            <td><b>Date Colet:</b></td>\n");
      out.write("            </tr>\n");
      out.write("             <tr>\n");
      out.write("                 <td>Continut:</td><td> <textarea name=\"continut\" rows=\"4\" cols=\"20\"></textarea> </td>\n");
      out.write("                <td>Prioritate:</td>\n");
      out.write("                <td><select name=\"prioritate\">\n");
      out.write("                        <option value=\"1\">Mica</option>\n");
      out.write("                        <option value=\"2\">Medie</option>\n");
      out.write("                        <option value=\"3\">Mare</option>\n");
      out.write("                        <option value=\"4\">Foarte Mare</option>\n");
      out.write("                        <option value=\"5\">Urgenta</option>\n");
      out.write("                    </select>\n");
      out.write("                </td>\n");
      out.write("                <td>Volum:</td><td><input type=\"text\" name=\"volum\"></td>\n");
      out.write("                <td>Stare:</td>\n");
      out.write("                <td><select name=\"stare\">\n");
      out.write("                        <option value=\"comanda\">Comanda</option>\n");
      out.write("                        <option value=\"stoc\">In Stoc</option>\n");
      out.write("                        <option value=\"livrat\">Livrat</option>\n");
      out.write("                        <option value=\"respins\">Respins</option>\n");
      out.write("                    </select>\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td><input type=\"submit\" value=\"Adauga\"></td>\n");
      out.write("            </tr>\n");
      out.write("            </table>\n");
      out.write("        </form>\n");
      out.write("        </center>\n");
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