<%-- 
    Document   : ElimCamion
    Created on : May 6, 2013, 7:37:53 PM
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
	java.lang.String id = request.getParameter("idcamion");
	port.deleteCamion(id);
        session.setAttribute("mesaj","Camionul a fost eliminat cu succes");
        response.sendRedirect("Home.jsp");
    } catch (Exception ex) {}
    %>
    <%-- end web service invocation --%><hr/>
    </body>
</html>
