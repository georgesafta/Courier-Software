<%-- 
    Document   : Insert
    Created on : Apr 28, 2013, 5:53:25 PM
    Author     : George
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Adaugare Comanda</title>
        <link rel="stylesheet" type="text/css" href="menu_assets/styles.css" />
    </head>
    <body>
        <div id="page-wrap">
        <span style="float:right">    
        <form action="Logout.jsp">
            <input type="submit" value="Logout">
        </form>
        </span>
        <center>
        <h1>Comanda adaugata cu succes</h1>
        <div id="cssmenu">
            <ul>
                <li><a href='Home.jsp'><span>Home</span></a></li>
                <li class='has-sub '><a href='#'><span>Comanda</span></a>
                   <ul>
                      <li><a href='AdaugareComanda.jsp'><span>Adaugare</span></a></li>
                      <li><a href='Modify.jsp'><span>Modificare</span></a></li>
                   </ul>
                </li>
                <li class='has-sub '><a href='#'><span>Colet</span></a>
                    <ul>
                       <li><a href='ColetRespins.jsp'><span>Respins</span></a></li>
                       <li><a href='ColetLivrat.jsp'><span>Livrat</span></a></li>
                       <li><a href='ColetPierdut.jsp'><span>Pierdut</span></a></li>
                    </ul>
                 </li>
                <li class='has-sub'><a href='#'><span>Soferi</span></a>
                             <ul>
                                     <li><a href='AdaugareSofer.jsp'><span>Adaugare</span></a></li>
                                     <li><a href='ElimSofer.jsp'><span>Eliminare</span></a></li>
                                     <li><a href='ModifySofer.jsp'><span>Modificare Stare</span></a></li>
                             </ul>
                </li>
                <li class='has-sub'><a href='#'><span>Camion</span></a>
                             <ul>
                                     <li><a href='AdaugareCamion.jsp'><span>Adaugare</span></a></li>
                                     <li><a href='ElimCamion.jsp'><span>Eliminare</span></a></li>
                                     <li><a href='ModifyCamion.jsp'><span>Modificare</span></a></li>
                             </ul>
                </li>
                <li><a href='Afisare.jsp'><span>Incarcare Camion</span></a></li>
             </ul>
        </div>
        <p>Datele adaugate sunt:</p>
    <%-- start web service invocation --%>
    <%
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
	java.lang.String numeDestinatar = "";
	java.lang.String prenumeDestinatar = "";
	java.lang.String stradaDestinatar = "";
	java.lang.String numarDestinatar = "";
	java.lang.String blocDestinatar = "";
	java.lang.String scaraDestinatar = "";
	java.lang.String apartamentDestinatar = "";
	java.lang.String orasDestinatar = "";
	java.lang.String judetDestinatar = "";
	java.lang.String continut = "";
	int prioritate = 0;
	float volum = 0;
	java.lang.String stare = "";
    try {
	client.ProiectWebService_Service service = new client.ProiectWebService_Service();
	client.ProiectWebService port = service.getProiectWebServicePort();
	 // TODO initialize WS operation arguments here
	numeClient = request.getParameter("numeclient");
	prenumeClient = request.getParameter("prenumeclient");
	stradaClient = request.getParameter("stradaclient");
        numarClient = request.getParameter("numarclient");
	blocClient = request.getParameter("blocclient");
	scaraClient = request.getParameter("scaraclient");
	apartamentClient = request.getParameter("apartamentclient");
	orasClient = request.getParameter("orasclient");
	judetClient = request.getParameter("judetclient");
	email = request.getParameter("email");
	telefon = request.getParameter("telefon");
	numeDestinatar = request.getParameter("numedestinatar");
	prenumeDestinatar = request.getParameter("prenumedestinatar");
	stradaDestinatar = request.getParameter("stradadestinatar");
	numarDestinatar = request.getParameter("numardestinatar");
	blocDestinatar = request.getParameter("blocdestinatar");
	scaraDestinatar = request.getParameter("scaradestinatar");
	apartamentDestinatar = request.getParameter("apartamentdestinatar");
	orasDestinatar = request.getParameter("orasdestinatar");
	judetDestinatar = request.getParameter("judetdestinatar");
	continut = request.getParameter("continut");
	prioritate = Integer.parseInt(request.getParameter("prioritate"));
	volum = Float.parseFloat(request.getParameter("volum"));
	stare = request.getParameter("stare");
	port.adaugareComanda(numeClient, prenumeClient, stradaClient, numarClient, blocClient, scaraClient, apartamentClient, orasClient, judetClient, email, telefon, numeDestinatar, prenumeDestinatar, stradaDestinatar, numarDestinatar, blocDestinatar, scaraDestinatar, apartamentDestinatar, orasDestinatar, judetDestinatar, continut, prioritate, volum, stare);
    } catch (Exception ex) {out.println("N-a mers");}
    %>
    <%-- end web service invocation --%>
    <h4>Date Client:</h4>
    <table border="1">
        <tr>
            <th>Nume</th>
            <th>Prenume</th>
            <th>Strada</th>
            <th>Numar</th>
            <th>Bloc</th>
            <th>Scara</th>
            <th>Apartament</th>
            <th>Oras</th>
            <th>Judet</th>
            <th>Email</th>
            <th>Telefon</th>
        </tr>
        <tr>
            <td><%=numeClient%></td>
            <td><%=prenumeClient%></td>
            <td><%=stradaClient%></td>
            <td><%=numarClient%></td>
            <td><%=blocClient%></td>
            <td><%=scaraClient%></td>
            <td><%=apartamentClient%></td>
            <td><%=orasClient%></td>
            <td><%=judetClient%></td>
            <td><%=email%></td>
            <td><%=telefon%></td>
        </tr>
    </table>
    <h4>Date Destinatar:</h4>
    <table border="1">
        <tr>
            <th>Nume</th>
            <th>Prenume</th>
            <th>Strada</th>
            <th>Numar</th>
            <th>Bloc</th>
            <th>Scara</th>
            <th>Apartament</th>
            <th>Oras</th>
            <th>Judet</th>
        </tr>
        <tr>
            <td><%=numeDestinatar%></td>
            <td><%=prenumeDestinatar%></td>
            <td><%=stradaDestinatar%></td>
            <td><%=numarDestinatar%></td>
            <td><%=blocDestinatar%></td>
            <td><%=scaraDestinatar%></td>
            <td><%=apartamentDestinatar%></td>
            <td><%=orasDestinatar%></td>
            <td><%=judetDestinatar%></td>
        </tr>
    </table>
    <h4>Date Colet:</h4>
    <table border="1">
        <tr>
            <th>Continut</th>
            <th>Prioritate</th>
            <th>Volum</th>
            <th>Stare</th>
        </tr>
        <tr>
            <td><%=continut%></td>
            <td><%=prioritate%></td>
            <td><%=volum%></td>
            <td><%=stare%></td>
        </tr>
    </table>
        </center>
        </div>
    </body>
</html>
