<%-- 
    Document   : StareSofer
    Created on : May 11, 2013, 4:25:28 PM
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
        java.lang.String sessionnume = session.getAttribute("nume")+"";
	java.lang.String sessionprenume = session.getAttribute("prenume")+"";
	java.lang.String sessionstare = session.getAttribute("stare")+"";
	java.lang.String nume = request.getParameter("nume");
	java.lang.String prenume = request.getParameter("prenume");
	java.lang.String stare = request.getParameter("stare");
	port.modifySofer(sessionnume, sessionprenume, sessionstare, nume, prenume, stare);
        session.removeAttribute("nume");
        session.removeAttribute("prenume");
        session.removeAttribute("stare");
        session.setAttribute("mesaj","Datele soferului modificate cu succes");
        response.sendRedirect("Home.jsp");
    } catch (Exception ex) {}
    %>
    <%-- end web service invocation --%><hr/>
    </body>
</html>
