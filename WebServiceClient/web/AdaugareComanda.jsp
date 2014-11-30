<%-- 
    Document   : AdaugareComanda
    Created on : Jun 23, 2013, 1:42:22 PM
    Author     : George
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
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
            <h2 id="art">Introduceti datele comenzii</h2>
        <form action="Insert.jsp" method="post">
            <table>
            <tr>
            <td><b>Date Client:</b></td>
            </tr>
            <tr>
                <td>Nume:</td><td><input type="text" name="numeclient"></td>
                <td>Prenume:</td><td><input type="text" name="prenumeclient"></td>
                <td>Strada:</td><td><input type="text" name="stradaclient"></td>
                <td>Numar:</td><td><input type="text" name="numarclient"></td>
            </tr>
            <tr>
                <td>Bloc:</td><td><input type="text" name="blocclient"></td>
                <td>Scara:</td><td><input type="text" name="scaraclient"></td>
                <td>Apartament:</td><td><input type="text" name="apartamentclient"></td>
                <td>Oras:</td><td><input type="text" name="orasclient"></td>
            </tr>
            <tr>
                <td>Judet:</td>
                <td><select name="judetclient">
                        <option value="0">Alege Judet</option>
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
                <td>Email:</td><td><input type="text" name="email"></td>
                <td>Telefon:</td><td><input type="text" name="telefon"></td>
            </tr>
            <tr>
            <td><b>Date Destinatar:</b></td>
            </tr>
            <tr>
                <td>Nume:</td><td><input type="text" name="numedestinatar"></td>
                <td>Prenume:</td><td><input type="text" name="prenumedestinatar"></td>
                <td>Strada:</td><td><input type="text" name="stradadestinatar"></td>
                <td>Numar:</td><td><input type="text" name="numardestinatar"></td>
            </tr>
            <tr>
                <td>Bloc:</td><td><input type="text" name="blocdestinatar"></td>
                <td>Scara:</td><td><input type="text" name="scaradestinatar"></td>
                <td>Apartament:</td><td><input type="text" name="apartamentdestinatar"></td>
                <td>Oras:</td><td><input type="text" name="orasdestinatar"></td>
            </tr>
            <tr>
                <td>Judet:</td>
                <td><select name="judetdestinatar">
                        <option value="0">Alege Judet</option>
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
                 <td>Continut:</td><td> <textarea name="continut" rows="4" cols="20"></textarea> </td>
                <td>Prioritate:</td>
                <td><select name="prioritate">
                        <option value="1">Mica</option>
                        <option value="2">Medie</option>
                        <option value="3">Mare</option>
                        <option value="4">Foarte Mare</option>
                        <option value="5">Urgenta</option>
                    </select>
                </td>
                <td>Volum:</td><td><input type="text" name="volum"></td>
                <td>Stare:</td>
                <td><select name="stare">
                        <option value="comanda">Comanda</option>
                        <option value="stoc">In Stoc</option>
                        <option value="livrat">Livrat</option>
                        <option value="respins">Respins</option>
                    </select>
                </td>
            </tr>
            <tr>
                <td><input type="submit" value="Adauga"></td>
            </tr>
            </table>
        </form>
        </center>
    </body>
</html>
