<%-- 
    Document   : Afisare
    Created on : Apr 28, 2013, 5:54:39 PM
    Author     : George
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Afisare Traseu</title>
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
        java.lang.String mesaj = "";
            if (session.getAttribute("mesaj") != null)
            { 
                mesaj = session.getAttribute("mesaj") + "";
                session.removeAttribute("mesaj");
            }
        %>
        <p id="art" style="color: red; font-size: 16px"><%=mesaj%></p>
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
            <h2 id="art">Selectati camionul pe care doriti sa-l folositi</h2>
            <table>
                <tr>
                    <td>
        <%
        try {
            client.ProiectWebService_Service service = new client.ProiectWebService_Service();
            client.ProiectWebService port = service.getProiectWebServicePort();
            java.lang.String result = port.selectCamioane();
            out.println(result);
        } catch (Exception ex) {}
        %>
                    </td>
                    <td>
                        <table border="1">
                            <tr>
                                <th>Judet</th><th>Volum colete</th><th>Numar colete</th>
                            </tr>
                        <%
                        try {
                            client.ProiectWebService_Service service = new client.ProiectWebService_Service();
                            client.ProiectWebService port = service.getProiectWebServicePort();
                            java.lang.String [] judet = {"Alba",
                                                        "Arad",
                                                        "Arges",
                                                        "Bacau",
                                                        "Bihor",
                                                        "Bistrita Nasaud",
                                                        "Botosani",
                                                        "Brasov",
                                                        "Braila",
                                                        "Bucuresti",
                                                        "Buzau",
                                                        "Caras Severin",
                                                        "Calarasi",
                                                        "Cluj",
                                                        "Constanta",
                                                        "Covasna",
                                                        "Dambovita",
                                                        "Dolj",
                                                        "Galati",
                                                        "Giurgiu",
                                                        "Gorj",
                                                        "Harghita",
                                                        "Hunedoara",
                                                        "Ialomita",
                                                        "Iasi",
                                                        "Ilfov",
                                                        "Maramures",
                                                        "Mehedinti",
                                                        "Mures",
                                                        "Neamt",
                                                        "Olt",
                                                        "Prahova",
                                                        "Satu Mare",
                                                        "Salaj",
                                                        "Sibiu",
                                                        "Suceava",
                                                        "Teleorman",
                                                        "Timis",
                                                        "Tulcea",
                                                        "Vaslui",
                                                        "Valcea",
                                                        "Vrancea"};
                            for(int i = 0; i < 42; i++)
                            {
                                java.lang.String result = port.lista(judet[i]);
                                out.println(result);
                            }
                        } catch (Exception ex) {}
                        %>
                        </table>
                    </td>
                </tr>
            </table>
         </center>
        </div>
    
    </body>
</html>
