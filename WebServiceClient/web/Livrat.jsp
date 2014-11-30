<%-- 
    Document   : Chitanta
    Created on : May 6, 2013, 7:42:11 PM
    Author     : George
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Factura</title>
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
    <%
    int idcomanda = 0;
    java.lang.String numeClient = "";
    java.lang.String prenumeClient = "";
    java.lang.String numeDestinatar = "";
    java.lang.String prenumeDestinatar = "";
    java.lang.String continut = "";
    java.lang.Float suma = 0.f;
    try {
	client.ProiectWebService_Service service = new client.ProiectWebService_Service();
	client.ProiectWebService port = service.getProiectWebServicePort();
	int id = Integer.parseInt(request.getParameter("id"));
	idcomanda = port.idComanda(id);
        numeClient = port.numeClient(id);
        prenumeClient = port.prenumeClient(id);
        numeDestinatar = port.numeDestinatar(id);
        prenumeDestinatar = port.prenumeDestinatar(id);
        continut = port.continut(id);
        suma = port.suma(id);
    } catch (Exception ex) {}
    %>    
    <p id="art"></p>
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
    <h2 id="art">Factura comanda nr: <%=idcomanda %> </h2>
    <%
    try {
	client.ProiectWebService_Service service = new client.ProiectWebService_Service();
	client.ProiectWebService port = service.getProiectWebServicePort();
	int id = Integer.parseInt(request.getParameter("idpackage"));
	port.delivered(id);
    } catch (Exception ex) {}
    %>
    <table border="1">
        <tr>
        <th>Nr. Crt.</th>
        <th>Nume Client</th>
        <th>Prenume Client</th>
        <th>Nume Destinatar</th>
        <th>Prenume Destinatar</th>
        <th>Continut Comanda</th>
        <th>Valoare(RON)</th>
        <th>Total(RON)</th>
        </tr>
        <tr>
            <td>1</td>
            <td><%=numeClient%></td>
            <td><%=prenumeClient%></td>
            <td><%=numeDestinatar%></td>
            <td><%=prenumeDestinatar%></td>
            <td><%=continut%></td>
            <td><%=suma%></td>
            <td><%=suma%></td>
        </tr>
    </table>
        </center>
        </div>
    </body>
</html>
