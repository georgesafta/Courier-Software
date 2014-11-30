package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Login</title>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"menu_assets/styles.css\" />\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <body>\n");
      out.write("        <div id=\"page-wrap\">\n");
      out.write("        <center>\n");
      out.write("        <h1>Login</h1>\n");
      out.write("        <form action=\"LoginCheck.jsp\" method=\"post\"> \n");
      out.write("            <table> \n");
      out.write("            <tr>\n");
      out.write("                <td>Username :</td>\n");
      out.write("                ");
 java.lang.String username = "";
                   if(session.getAttribute("username")!=null)
                       username = session.getAttribute("username") + "";
                   java.lang.String password = "";
                   if(session.getAttribute("password")!=null)
                       password = session.getAttribute("password") + "";
                
      out.write("\n");
      out.write("                <td><input name=\"username\" value=\"");
      out.print(username);
      out.write("\" size=\"20\" type=\"text\"></td> \n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>Password :</td>\n");
      out.write("                <td><input name=\"password\" value=\"");
      out.print(password);
      out.write("\" size=\"20\" type=\"password\"></td>\n");
      out.write("            </tr>\n");
      out.write("            <tr><td></td><td></td></tr>\n");
      out.write("            <tr>\n");
      out.write("                <td><input value=\"Login\" type=\"submit\"></form></td>\n");
      out.write("                <td><form action=\"Register.jsp\"><input value=\"Register\" type=\"submit\"> </form></td>\n");
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
