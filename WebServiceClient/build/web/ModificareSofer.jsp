<%-- 
    Document   : ModificareSofer
    Created on : Jun 23, 2013, 5:33:24 PM
    Author     : George
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Modificare Sofer</title>
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
            <h2 id="art">Modificare date sofer:</h2>
            <%
                java.lang.String nume = "";
                java.lang.String prenume = "";
                java.lang.String stare = "";
            try
            {
                nume = request.getParameter("nume");
                prenume = request.getParameter("prenume");
                stare = request.getParameter("stare");
                session.setAttribute("nume", nume);
                session.setAttribute("prenume", prenume);
                session.setAttribute("stare", stare);
            }catch(Exception ex){}
            %>
        <form action="StareSofer.jsp">
            <table>
            <tr>
                <td>Nume:</td><td><input type="text" name="nume" value="<%=nume%>"></td>
            </tr>
            <tr>
                <td>Prenume:</td><td><input type="text" name="prenume" value="<%=prenume%>"></td>
            </tr>
            <tr><td>Stare:</td>
                <% if(stare.equals("disponibil"))
                {
                out.print("<td><select name='stare'>"+
                        "<option value='disponibil'>Disponibil</option>"+
                        "<option value='indisponibil'>Indisponibil</option>"+
                    "</select>"+
                "</td></tr>");
                }         
                else
                {
                out.print("<td><select name='stare'>"+
                        "<option value='indisponibil'>Indisponibil</option>"+
                        "<option value='disponibil'>Disponibil</option>"+
                    "</select>"+
                "</td></tr>");
                }
                %>
            </table>
            <input type="submit" value="Modifica">
        </form>
        </center>
        </div>
    </body>
</html>
