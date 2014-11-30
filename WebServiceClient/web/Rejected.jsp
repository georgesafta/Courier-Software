<%-- 
    Document   : Rejected
    Created on : Apr 28, 2013, 6:25:18 PM
    Author     : George
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Comanda Respinsa</title>
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
    try {
	client.ProiectWebService_Service service = new client.ProiectWebService_Service();
	client.ProiectWebService port = service.getProiectWebServicePort();
	int id = Integer.parseInt(request.getParameter("id"));
	java.lang.String motiv = request.getParameter("motiv");
	port.rejected(id, motiv);
        idcomanda = port.idComanda(id);
        numeClient = port.numeClient(id);
        prenumeClient = port.prenumeClient(id);
        numeDestinatar = port.numeDestinatar(id);
        prenumeDestinatar = port.prenumeDestinatar(id);
        continut = port.continut(id);
    } catch (Exception ex) {}
    %>
    <h1>Comanda nr. <%=idcomanda%> a fost Respinsa</h1>
    <br/><br/>
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
    <table border="1">
        <tr>
            <td>Nume Client</td><td><%=numeClient%></td>
        </tr>
        <tr>
            <td>Prenume Client</td><td><%=prenumeClient%></td>
        </tr>
        <tr>
            <td>Nume Destinatar</td><td><%=numeDestinatar%></td>
        </tr>
        <tr>
            <td>Prenume Destinatar</td><td><%=prenumeDestinatar%></td>
        </tr>
        <tr>
            <td>Continut</td><td><%=continut%></td>
        </tr>
        <tr>
            <td>Motiv</td><td><%=request.getParameter("motiv")%></td>
        </tr>
    </table>
        </center>
        </div>
    </body>
</html>
