<%-- 
    Document   : StareColet
    Created on : May 11, 2013, 4:25:41 PM
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
	int id = Integer.parseInt(request.getParameter("idpackage"));
	java.lang.String stare = "Pierdut";
	port.stareColet(id, stare);
        session.setAttribute("mesaj","Starea coletului modificata cu succes");
        response.sendRedirect("Home.jsp");
    } catch (Exception ex) {}
    %>
    <%-- end web service invocation --%><hr/>
    </body>
</html>
