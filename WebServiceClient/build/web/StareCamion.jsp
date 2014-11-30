<%-- 
    Document   : StareCamion
    Created on : May 11, 2013, 4:06:52 PM
    Author     : George
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
    <%-- start web service invocation --%><hr/>
    <%
    try {
	client.ProiectWebService_Service service = new client.ProiectWebService_Service();
	client.ProiectWebService port = service.getProiectWebServicePort();
        java.lang.String sessionid = session.getAttribute("id")+"";
	java.lang.String id = request.getParameter("id");
        Float volum = Float.parseFloat(request.getParameter("volum"));
	java.lang.String stare = request.getParameter("stare");
	port.modifyCamion(sessionid, id, volum, stare);
        session.removeAttribute("id");
        session.removeAttribute("volum");
        session.removeAttribute("stare");
        session.setAttribute("mesaj","Datele camionului au fost modificate cu succes");
        response.sendRedirect("Home.jsp");
    } catch (Exception ex) {}
    %>
    <%-- end web service invocation --%><hr/>
    </body>
</html>
