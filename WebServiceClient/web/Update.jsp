<%-- 
    Document   : Update
    Created on : May 12, 2013, 8:54:27 PM
    Author     : George
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Update</title>
    </head>
    <body>
        
    <%
    try {
	client.ProiectWebService_Service service = new client.ProiectWebService_Service();
	client.ProiectWebService port = service.getProiectWebServicePort();
	java.lang.String sessionNumeClient = session.getAttribute("numeclient")+"";
	java.lang.String sessionPrenumeClient = session.getAttribute("prenumeclient")+"";
	java.lang.String sessionNumeDestinatar = session.getAttribute("numedestinatar")+"";
	java.lang.String sessionPrenumeDestinatar = session.getAttribute("prenumedestinatar")+"";
	int sessionId = Integer.parseInt(session.getAttribute("idpackage")+"");
	java.lang.String numeClient = request.getParameter("numeclient");
	java.lang.String prenumeClient = request.getParameter("prenumeclient");
	java.lang.String stradaClient = request.getParameter("stradaclient");
	java.lang.String numarClient = request.getParameter("numarclient");
	java.lang.String blocClient = request.getParameter("blocclient");
	java.lang.String scaraClient = request.getParameter("scaraclient");
	java.lang.String apartamentClient = request.getParameter("apartamentclient");
	java.lang.String orasClient = request.getParameter("orasclient");
	java.lang.String judetClient = request.getParameter("judetclient");
	java.lang.String email = request.getParameter("email");
	java.lang.String telefon = request.getParameter("telefon");
	java.lang.String numeDestinatar = request.getParameter("numedestinatar");
	java.lang.String prenumeDestinatar = request.getParameter("prenumedestinatar");
	java.lang.String stradaDestinatar = request.getParameter("stradadestinatar");
	java.lang.String numarDestinatar = request.getParameter("numardestinatar");
	java.lang.String blocDestinatar = request.getParameter("blocdestinatar");
	java.lang.String scaraDestinatar = request.getParameter("scaradestinatar");
	java.lang.String apartamentDestinatar = request.getParameter("apartamentdestinatar");
	java.lang.String orasDestinatar = request.getParameter("orasdestinatar");
	java.lang.String judetDestinatar = request.getParameter("judetdestinatar");
	java.lang.String continut = request.getParameter("continut");
	int prioritate = Integer.parseInt(request.getParameter("prioritate"));
	float volum = Float.parseFloat(request.getParameter("volum"));
	java.lang.String stare = request.getParameter("stare");
	port.updateComanda(sessionNumeClient, sessionPrenumeClient, sessionNumeDestinatar, sessionPrenumeDestinatar, sessionId, numeClient, prenumeClient, stradaClient, numarClient, blocClient, scaraClient, apartamentClient, orasClient, judetClient, email, telefon, numeDestinatar, prenumeDestinatar, stradaDestinatar, numarDestinatar, blocDestinatar, scaraDestinatar, apartamentDestinatar, orasDestinatar, judetDestinatar, continut, prioritate, volum, stare);
        session.removeAttribute("numeclient");
        session.removeAttribute("prenumeclient");
        session.removeAttribute("numedestinatar");
        session.removeAttribute("prenumedestinatar");
        session.removeAttribute("idpackage");
        session.setAttribute("mesaj","Comanda a fost modificata cu succes");
        response.sendRedirect("Home.jsp");
    } catch (Exception ex) {}
    %>
    </body>
</html>
