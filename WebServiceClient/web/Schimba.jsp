<%-- 
    Document   : Schimba
    Created on : May 12, 2013, 8:40:41 PM
    Author     : George
--%>

<%@page import="com.sun.org.apache.bcel.internal.generic.AALOAD"%>
<%@page import="java.util.StringTokenizer"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Modificare Comanda</title>
        <link rel="stylesheet" type="text/css" href="menu_assets/styles.css" />
    </head>
    <body>
        <div id="page-wrap">
        <span style="float:right">    
        <form action="Logout.jsp">
            <input type="submit" value="Logout">
        </form>
        </span>
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
    java.lang.String prenumeDestinatar = "";
    java.lang.String numeDestinatar = "";
    java.lang.String stradaDestinatar = "";
    java.lang.String numarDestinatar = "";
    java.lang.String blocDestinatar = "";
    java.lang.String scaraDestinatar = "";
    java.lang.String apartamentDestinatar = "";
    java.lang.String orasDestinatar = "";
    java.lang.String judetDestinatar = "";
    java.lang.String continut = "";
    java.lang.String sprioritate = "";
    int prioritate = 0;
    float volum = 0;
    int idpackage = 0;
    java.lang.String stare = "";
    try {
	client.ProiectWebService_Service service = new client.ProiectWebService_Service();
	client.ProiectWebService port = service.getProiectWebServicePort();
        numeClient = request.getParameter("numeclient");
        prenumeClient = request.getParameter("prenumeclient");
	java.lang.String resultClient = port.selectClient(numeClient, prenumeClient);
        StringTokenizer stringtokenizer = new StringTokenizer(resultClient, ";");
        int i = 0;
        java.lang.String[] parts = new String[9];
            while (stringtokenizer.hasMoreElements()) 
            {
                parts[i] = stringtokenizer.nextToken();
                i++;
            }
        stradaClient = parts[0];
        numarClient = parts[1];
        blocClient = parts[2];
        scaraClient = parts[3];
        apartamentClient = parts[4];
        orasClient = parts[5];
        judetClient = parts[6];
        email = parts[7];
        telefon = parts[8];
        numeDestinatar = request.getParameter("numedestinatar");
        prenumeDestinatar = request.getParameter("prenumedestinatar");
        java.lang.String resultDestinatar = port.selectDestinatar(numeDestinatar, prenumeDestinatar); 
        StringTokenizer stringtokenizer1 = new StringTokenizer(resultDestinatar, ";");
        java.lang.String[] p1 = new String[7];
        i = 0;
        while (stringtokenizer1.hasMoreElements()) 
            {
                p1[i] = stringtokenizer1.nextToken();
                i++;
            }
        stradaDestinatar = p1[0];
        numarDestinatar = p1[1];
        blocDestinatar = p1[2];
        scaraDestinatar = p1[3];
        apartamentDestinatar = p1[4];
        orasDestinatar = p1[5];
        judetDestinatar = p1[6];
        idpackage = Integer.parseInt(request.getParameter("idpackage"));
        stare = port.getStare(idpackage);
        java.lang.String resultPackage = port.selectPackage(idpackage);
        java.lang.String[] p2 = new String[3];
        StringTokenizer stringtokenizer2 = new StringTokenizer(resultPackage, ";");
        i = 0;
        while (stringtokenizer2.hasMoreElements()) 
            {
                p2[i] = stringtokenizer2.nextToken();
                i++;
            }
        continut = p2[0];
        prioritate = Integer.parseInt(p2[1]);
        if(prioritate == 1)
            sprioritate = "Mica";
        else if(prioritate == 2)
            sprioritate = "Medie";
        else if(prioritate == 3)
            sprioritate = "Mare";
        else if(prioritate == 4)
            sprioritate = "Foarte Mare";
        else if(prioritate == 5)
            sprioritate = "Urgenta";
        volum = Float.parseFloat(p2[2]); 
        session.setAttribute("numeclient", numeClient);
        session.setAttribute("prenumeclient", prenumeClient);
        session.setAttribute("numedestinatar", numeDestinatar);
        session.setAttribute("prenumedestinatar", prenumeDestinatar);
        session.setAttribute("idpackage", idpackage);
    } catch (Exception ex) {}
    %>
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
            <h2 id="art">Modificati</h2>
        <form action="Update.jsp" method="post">
            <table>
            <tr>
            <td><b>Date Client:</b></td>
            </tr>
            <tr>
                <td>Nume:</td><td><input type="text" name="numeclient" value="<%=numeClient%>"></td>
                <td>Prenume:</td><td><input type="text" name="prenumeclient" value="<%=prenumeClient%>"></td>
                <td>Strada:</td><td><input type="text" name="stradaclient" value="<%=stradaClient%>"></td>
                <td>Numar:</td><td><input type="text" name="numarclient" value="<%=numarClient%>"></td>
            </tr>
            <tr>
                <td>Bloc:</td><td><input type="text" name="blocclient" value="<%=blocClient%>"></td>
                <td>Scara:</td><td><input type="text" name="scaraclient" value="<%=scaraClient%>"></td>
                <td>Apartament:</td><td><input type="text" name="apartamentclient" value="<%=apartamentClient%>"></td>
                <td>Oras:</td><td><input type="text" name="orasclient" value="<%=orasClient%>"></td>
            </tr>
            <tr>
                <td>Judet:</td>
                <td><select name="judetclient">
                        <option value="<%=judetClient%>"><%=judetClient%></option>
                        <option value="Alba">Alba</option>
                        <option value="Arad">Arad</option>
                        <option value="Arges">Arges</option>
                        <option value="Bacau">Bacau</option>
                        <option value="Bihor">Bihor</option>
                        <option value="Bistrita Nasaud">Bistrita Nasaud</option>
                        <option value="Botosani">Botosani</option>
                        <option value="Brasov">Brasov</option>
                        <option value="Braila">Braila</option>
                        <option value="Bucuresti">Bucuresti</option>
                        <option value="Buzau">Buzau</option>
                        <option value="Caras Severin">Caras Severin</option>
                        <option value="Calarasi">Calarasi</option>
                        <option value="Cluj">Cluj</option>
                        <option value="Constanta">Constanta</option>
                        <option value="Covasna">Covasna</option>
                        <option value="Dambovita">Dambovita</option>
                        <option value="Dolj">Dolj</option>
                        <option value="Galati">Galati</option>
                        <option value="Giurgiu">Giurgiu</option>
                        <option value="Gorj">Gorj</option>
                        <option value="Harghita">Harghita</option>
                        <option value="Hunedoara">Hunedoara</option>
                        <option value="Ialomita">Ialomita</option>
                        <option value="Iasi">Iasi</option>
                        <option value="Ilfov">Ilfov</option>
                        <option value="Maramures">Maramures</option>
                        <option value="Mehedinti">Mehedinti</option>
                        <option value="Mures">Mures</option>
                        <option value="Neamt">Neamt</option>
                        <option value="Olt">Olt</option>
                        <option value="Prahova">Prahova</option>
                        <option value="Satu Mare">Satu Mare</option>
                        <option value="Salaj">Salaj</option>
                        <option value="Sibiu">Sibiu</option>
                        <option value="Suceava">Suceava</option>
                        <option value="Teleorman">Teleorman</option>
                        <option value="Timis">Timis</option>
                        <option value="Tulcea">Tulcea</option>
                        <option value="Vaslui">Vaslui</option>
                        <option value="Valcea">Valcea</option>
                        <option value="Vrancea">Vrancea</option>
                    </select>     
                </td>
                <td>Email:</td><td><input type="text" name="email" value="<%=email%>"></td>
                <td>Telefon:</td><td><input type="text" name="telefon" value="<%=telefon%>"></td>
            </tr>
            <tr>
            <td><b>Date Destinatar:</b></td>
            </tr>
            <tr>
                <td>Nume:</td><td><input type="text" name="numedestinatar" value="<%=numeDestinatar%>"></td>
                <td>Prenume:</td><td><input type="text" name="prenumedestinatar" value="<%=prenumeDestinatar%>"></td>
                <td>Strada:</td><td><input type="text" name="stradadestinatar" value="<%=stradaDestinatar%>"></td>
                <td>Numar:</td><td><input type="text" name="numardestinatar" value="<%=numarDestinatar%>"></td>
            </tr>
            <tr>
                <td>Bloc:</td><td><input type="text" name="blocdestinatar" value="<%=blocDestinatar%>"></td>
                <td>Scara:</td><td><input type="text" name="scaradestinatar" value="<%=scaraDestinatar%>"></td>
                <td>Apartament:</td><td><input type="text" name="apartamentdestinatar" value="<%=apartamentDestinatar%>"></td>
                <td>Oras:</td><td><input type="text" name="orasdestinatar" value="<%=orasDestinatar%>"></td>
            </tr>
            <tr>
                <td>Judet:</td>
                <td><select name="judetdestinatar">
                        <option value="<%=judetDestinatar%>"><%=judetDestinatar%></option>
                        <option value="Alba">Alba</option>
                        <option value="Arad">Arad</option>
                        <option value="Arges">Arges</option>
                        <option value="Bacau">Bacau</option>
                        <option value="Bihor">Bihor</option>
                        <option value="Bistrita Nasaud">Bistrita Nasaud</option>
                        <option value="Botosani">Botosani</option>
                        <option value="Brasov">Brasov</option>
                        <option value="Braila">Braila</option>
                        <option value="Bucuresti">Bucuresti</option>
                        <option value="Buzau">Buzau</option>
                        <option value="Caras Severin">Caras Severin</option>
                        <option value="Calarasi">Calarasi</option>
                        <option value="Cluj">Cluj</option>
                        <option value="Constanta">Constanta</option>
                        <option value="Covasna">Covasna</option>
                        <option value="Dambovita">Dambovita</option>
                        <option value="Dolj">Dolj</option>
                        <option value="Galati">Galati</option>
                        <option value="Giurgiu">Giurgiu</option>
                        <option value="Gorj">Gorj</option>
                        <option value="Harghita">Harghita</option>
                        <option value="Hunedoara">Hunedoara</option>
                        <option value="Ialomita">Ialomita</option>
                        <option value="Iasi">Iasi</option>
                        <option value="Ilfov">Ilfov</option>
                        <option value="Maramures">Maramures</option>
                        <option value="Mehedinti">Mehedinti</option>
                        <option value="Mures">Mures</option>
                        <option value="Neamt">Neamt</option>
                        <option value="Olt">Olt</option>
                        <option value="Prahova">Prahova</option>
                        <option value="Satu Mare">Satu Mare</option>
                        <option value="Salaj">Salaj</option>
                        <option value="Sibiu">Sibiu</option>
                        <option value="Suceava">Suceava</option>
                        <option value="Teleorman">Teleorman</option>
                        <option value="Timis">Timis</option>
                        <option value="Tulcea">Tulcea</option>
                        <option value="Vaslui">Vaslui</option>
                        <option value="Valcea">Valcea</option>
                        <option value="Vrancea">Vrancea</option>
                    </select>     
                </td>
            </tr>
            <tr>
            <td><b>Date Colet:</b></td>
            </tr>
             <tr>
                 <td>Continut:</td><td> <textarea name="continut" rows="4" cols="20"><%=continut%></textarea> </td>
                <td>Prioritate:</td>
                <td><select name="prioritate">
                        <option value="<%=prioritate%>"><%=sprioritate%></option>
                        <option value="1">Mica</option>
                        <option value="2">Medie</option>
                        <option value="3">Mare</option>
                        <option value="4">Foarte Mare</option>
                        <option value="5">Urgenta</option>
                    </select>
                </td>
                <td>Volum:</td><td><input type="text" name="volum" value="<%=volum%>"></td>
                <td>Stare:</td>
                <td><select name="stare">
                        <option value="<%=stare%>"><%=stare%></option>
                        <option value="comanda">Comanda</option>
                        <option value="stoc">In Stoc</option>
                        <option value="livrat">Livrat</option>
                        <option value="respins">Respins</option>
                    </select>
                </td>
            </tr>
            <tr>
                <td><input type="submit" value="Modifica"></td></form>
                        <td><form action="Modify.jsp"> <input type="submit" value="Inapoi"> </form></td>
            </tr>
            </table>
        </center>
        </div>
    </body>
</html>
