package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.sun.org.apache.bcel.internal.generic.AALOAD;
import java.util.StringTokenizer;

public final class Schimba_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Modificare Comanda</title>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"menu_assets/styles.css\" />\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div id=\"page-wrap\">\n");
      out.write("        <span style=\"float:right\">    \n");
      out.write("        <form action=\"Logout.jsp\">\n");
      out.write("            <input type=\"submit\" value=\"Logout\">\n");
      out.write("        </form>\n");
      out.write("        </span>\n");
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
    java.lang.String prenumeDestinatar = "";
    java.lang.String numeDestinatar = "";
    java.lang.String stradaDestinatar = "";
    java.lang.String numarDestinatar = "";
    java.lang.String blocDestinatar = "";
    java.lang.String scaraDestinatar = "";
    java.lang.String apartamentDestinatar = "";
    java.lang.String orasDestinatar = "";
    java.lang.String judetDestinatar = "";
    java.lang.String continut = "";
    java.lang.String sprioritate = "";
    int prioritate = 0;
    float volum = 0;
    int idpackage = 0;
    java.lang.String stare = "";
    try {
	client.ProiectWebService_Service service = new client.ProiectWebService_Service();
	client.ProiectWebService port = service.getProiectWebServicePort();
        numeClient = request.getParameter("numeclient");
        prenumeClient = request.getParameter("prenumeclient");
	java.lang.String resultClient = port.selectClient(numeClient, prenumeClient);
        StringTokenizer stringtokenizer = new StringTokenizer(resultClient, ";");
        int i = 0;
        java.lang.String[] parts = new String[9];
            while (stringtokenizer.hasMoreElements()) 
            {
                parts[i] = stringtokenizer.nextToken();
                i++;
            }
        stradaClient = parts[0];
        numarClient = parts[1];
        blocClient = parts[2];
        scaraClient = parts[3];
        apartamentClient = parts[4];
        orasClient = parts[5];
        judetClient = parts[6];
        email = parts[7];
        telefon = parts[8];
        numeDestinatar = request.getParameter("numedestinatar");
        prenumeDestinatar = request.getParameter("prenumedestinatar");
        java.lang.String resultDestinatar = port.selectDestinatar(numeDestinatar, prenumeDestinatar); 
        StringTokenizer stringtokenizer1 = new StringTokenizer(resultDestinatar, ";");
        java.lang.String[] p1 = new String[7];
        i = 0;
        while (stringtokenizer1.hasMoreElements()) 
            {
                p1[i] = stringtokenizer1.nextToken();
                i++;
            }
        stradaDestinatar = p1[0];
        numarDestinatar = p1[1];
        blocDestinatar = p1[2];
        scaraDestinatar = p1[3];
        apartamentDestinatar = p1[4];
        orasDestinatar = p1[5];
        judetDestinatar = p1[6];
        idpackage = Integer.parseInt(request.getParameter("idpackage"));
        stare = port.getStare(idpackage);
        java.lang.String resultPackage = port.selectPackage(idpackage);
        java.lang.String[] p2 = new String[3];
        StringTokenizer stringtokenizer2 = new StringTokenizer(resultPackage, ";");
        i = 0;
        while (stringtokenizer2.hasMoreElements()) 
            {
                p2[i] = stringtokenizer2.nextToken();
                i++;
            }
        continut = p2[0];
        prioritate = Integer.parseInt(p2[1]);
        if(prioritate == 1)
            sprioritate = "Mica";
        else if(prioritate == 2)
            sprioritate = "Medie";
        else if(prioritate == 3)
            sprioritate = "Mare";
        else if(prioritate == 4)
            sprioritate = "Foarte Mare";
        else if(prioritate == 5)
            sprioritate = "Urgenta";
        volum = Float.parseFloat(p2[2]); 
        session.setAttribute("numeclient", numeClient);
        session.setAttribute("prenumeclient", prenumeClient);
        session.setAttribute("numedestinatar", numeDestinatar);
        session.setAttribute("prenumedestinatar", prenumeDestinatar);
        session.setAttribute("idpackage", idpackage);
    } catch (Exception ex) {}
    
      out.write("\n");
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
      out.write("            <h2 id=\"art\">Modificati</h2>\n");
      out.write("        <form action=\"Update.jsp\" method=\"post\">\n");
      out.write("            <table>\n");
      out.write("            <tr>\n");
      out.write("            <td><b>Date Client:</b></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>Nume:</td><td><input type=\"text\" name=\"numeclient\" value=\"");
      out.print(numeClient);
      out.write("\"></td>\n");
      out.write("                <td>Prenume:</td><td><input type=\"text\" name=\"prenumeclient\" value=\"");
      out.print(prenumeClient);
      out.write("\"></td>\n");
      out.write("                <td>Strada:</td><td><input type=\"text\" name=\"stradaclient\" value=\"");
      out.print(stradaClient);
      out.write("\"></td>\n");
      out.write("                <td>Numar:</td><td><input type=\"text\" name=\"numarclient\" value=\"");
      out.print(numarClient);
      out.write("\"></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>Bloc:</td><td><input type=\"text\" name=\"blocclient\" value=\"");
      out.print(blocClient);
      out.write("\"></td>\n");
      out.write("                <td>Scara:</td><td><input type=\"text\" name=\"scaraclient\" value=\"");
      out.print(scaraClient);
      out.write("\"></td>\n");
      out.write("                <td>Apartament:</td><td><input type=\"text\" name=\"apartamentclient\" value=\"");
      out.print(apartamentClient);
      out.write("\"></td>\n");
      out.write("                <td>Oras:</td><td><input type=\"text\" name=\"orasclient\" value=\"");
      out.print(orasClient);
      out.write("\"></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>Judet:</td>\n");
      out.write("                <td><select name=\"judetclient\">\n");
      out.write("                        <option value=\"");
      out.print(judetClient);
      out.write('"');
      out.write('>');
      out.print(judetClient);
      out.write("</option>\n");
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
      out.write("                <td>Email:</td><td><input type=\"text\" name=\"email\" value=\"");
      out.print(email);
      out.write("\"></td>\n");
      out.write("                <td>Telefon:</td><td><input type=\"text\" name=\"telefon\" value=\"");
      out.print(telefon);
      out.write("\"></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("            <td><b>Date Destinatar:</b></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>Nume:</td><td><input type=\"text\" name=\"numedestinatar\" value=\"");
      out.print(numeDestinatar);
      out.write("\"></td>\n");
      out.write("                <td>Prenume:</td><td><input type=\"text\" name=\"prenumedestinatar\" value=\"");
      out.print(prenumeDestinatar);
      out.write("\"></td>\n");
      out.write("                <td>Strada:</td><td><input type=\"text\" name=\"stradadestinatar\" value=\"");
      out.print(stradaDestinatar);
      out.write("\"></td>\n");
      out.write("                <td>Numar:</td><td><input type=\"text\" name=\"numardestinatar\" value=\"");
      out.print(numarDestinatar);
      out.write("\"></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>Bloc:</td><td><input type=\"text\" name=\"blocdestinatar\" value=\"");
      out.print(blocDestinatar);
      out.write("\"></td>\n");
      out.write("                <td>Scara:</td><td><input type=\"text\" name=\"scaradestinatar\" value=\"");
      out.print(scaraDestinatar);
      out.write("\"></td>\n");
      out.write("                <td>Apartament:</td><td><input type=\"text\" name=\"apartamentdestinatar\" value=\"");
      out.print(apartamentDestinatar);
      out.write("\"></td>\n");
      out.write("                <td>Oras:</td><td><input type=\"text\" name=\"orasdestinatar\" value=\"");
      out.print(orasDestinatar);
      out.write("\"></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>Judet:</td>\n");
      out.write("                <td><select name=\"judetdestinatar\">\n");
      out.write("                        <option value=\"");
      out.print(judetDestinatar);
      out.write('"');
      out.write('>');
      out.print(judetDestinatar);
      out.write("</option>\n");
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
      out.write("                 <td>Continut:</td><td> <textarea name=\"continut\" rows=\"4\" cols=\"20\">");
      out.print(continut);
      out.write("</textarea> </td>\n");
      out.write("                <td>Prioritate:</td>\n");
      out.write("                <td><select name=\"prioritate\">\n");
      out.write("                        <option value=\"");
      out.print(prioritate);
      out.write('"');
      out.write('>');
      out.print(sprioritate);
      out.write("</option>\n");
      out.write("                        <option value=\"1\">Mica</option>\n");
      out.write("                        <option value=\"2\">Medie</option>\n");
      out.write("                        <option value=\"3\">Mare</option>\n");
      out.write("                        <option value=\"4\">Foarte Mare</option>\n");
      out.write("                        <option value=\"5\">Urgenta</option>\n");
      out.write("                    </select>\n");
      out.write("                </td>\n");
      out.write("                <td>Volum:</td><td><input type=\"text\" name=\"volum\" value=\"");
      out.print(volum);
      out.write("\"></td>\n");
      out.write("                <td>Stare:</td>\n");
      out.write("                <td><select name=\"stare\">\n");
      out.write("                        <option value=\"");
      out.print(stare);
      out.write('"');
      out.write('>');
      out.print(stare);
      out.write("</option>\n");
      out.write("                        <option value=\"comanda\">Comanda</option>\n");
      out.write("                        <option value=\"stoc\">In Stoc</option>\n");
      out.write("                        <option value=\"livrat\">Livrat</option>\n");
      out.write("                        <option value=\"respins\">Respins</option>\n");
      out.write("                    </select>\n");
      out.write("                </td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td><input type=\"submit\" value=\"Modifica\"></td></form>\n");
      out.write("                        <td><form action=\"Modify.jsp\"> <input type=\"submit\" value=\"Inapoi\"> </form></td>\n");
      out.write("            </tr>\n");
      out.write("            </table>\n");
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
