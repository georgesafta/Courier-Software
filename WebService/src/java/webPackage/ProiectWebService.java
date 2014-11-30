/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package webPackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import javax.jws.Oneway;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import software.BillController;
import software.ClientController;
import software.DestinatarController;
import software.DriverConroller;
import software.LoginController;
import software.OrderController;
import software.PackageController;
import software.TruckController;

/**
 *
 * @author George
 */
@WebService(serviceName = "ProiectWebService")
public class ProiectWebService 
{

    /**
     * Web service operation
     */
    @WebMethod(operationName = "login")
    public String login(@WebParam(name = "username") String username, @WebParam(name = "password") String password) 
    {
        LoginController lc = new LoginController();
        boolean vf = lc.verifyData(username, password);
        if(vf == true)
            return "true";
        else
            return "false";
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "register")
    public String register(@WebParam(name = "username") String username, @WebParam(name = "password") String password) 
    {
        LoginController lc = new LoginController();
        boolean vf = lc.register(username, password);
        if(vf == true)
            return "true";
        else
            return "false";
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "adaugareComanda")
    public void adaugareComanda(@WebParam(name = "numeClient") String numeClient, 
    @WebParam(name = "prenumeClient") String prenumeClient, @WebParam(name = "stradaClient") String stradaClient, 
    @WebParam(name = "numarClient") String numarClient, @WebParam(name = "blocClient") String blocClient, 
    @WebParam(name = "scaraClient") String scaraClient, @WebParam(name = "apartamentClient") String apartamentClient, 
    @WebParam(name = "orasClient") String orasClient, @WebParam(name = "judetClient") String judetClient, 
    @WebParam(name = "email") String email, @WebParam(name = "telefon") String telefon, 
    @WebParam(name = "numeDestinatar") String numeDestinatar, 
    @WebParam(name = "prenumeDestinatar") String prenumeDestinatar, 
    @WebParam(name = "stradaDestinatar") String stradaDestinatar, 
    @WebParam(name = "numarDestinatar") String numarDestinatar, 
    @WebParam(name = "blocDestinatar") String blocDestinatar, @WebParam(name = "scaraDestinatar") String scaraDestinatar, 
    @WebParam(name = "apartamentDestinatar") String apartamentDestinatar, 
    @WebParam(name = "orasDestinatar") String orasDestinatar, @WebParam(name = "judetDestinatar") String judetDestinatar, 
    @WebParam(name = "continut") String continut, @WebParam(name = "prioritate") int prioritate, 
    @WebParam(name = "volum") float volum, @WebParam(name = "stare") String stare) 
    {
        ClientController cc = new ClientController();
        cc.insert(numeClient, prenumeClient, stradaClient, numarClient, blocClient, scaraClient,
                apartamentClient, orasClient, judetClient, email, telefon);
        DestinatarController dc = new DestinatarController();
        dc.insert(numeDestinatar, prenumeDestinatar, stradaDestinatar, numarDestinatar, 
                blocDestinatar, scaraDestinatar, apartamentDestinatar, orasDestinatar, judetDestinatar);
        PackageController pc = new PackageController();
        pc.insert(continut, prioritate, volum, numeClient, prenumeClient, numeDestinatar, prenumeDestinatar);
        OrderController oc = new OrderController();
        oc.insert(numeClient, prenumeClient, numeDestinatar, prenumeDestinatar, continut, stare);
    }

    @WebMethod(operationName = "rejected")
    public void rejected(@WebParam(name = "id") int id, @WebParam(name = "motiv") String motiv) 
    {
        OrderController oc = new OrderController();
        oc.rejected(id, motiv);
    }

    @WebMethod(operationName = "delivered")
    public void delivered(@WebParam(name = "id") int id) 
    {
        OrderController oc = new OrderController();
        oc.delivered(id);
    }

    @WebMethod(operationName = "stareColet")
    public void stareColet(@WebParam(name = "id") int id, @WebParam(name = "stare") String stare) 
    {
        OrderController oc = new OrderController();
        oc.modify(id, stare);
    }

    @WebMethod(operationName = "insertSofer")
    public void insertSofer(@WebParam(name = "nume") String nume, @WebParam(name = "prenume") String prenume) 
    {
        DriverConroller dc = new DriverConroller();
        dc.insert(nume, prenume);
    }

    @WebMethod(operationName = "deleteSofer")
    public void deleteSofer(@WebParam(name = "nume") String nume, @WebParam(name = "prenume") String prenume) 
    {
        DriverConroller dc = new DriverConroller();
        dc.delete(nume, prenume);
    }

    @WebMethod(operationName = "modifySofer")
    public void modifySofer(@WebParam(name = "nume") String nume, @WebParam(name = "prenume") String prenume,
    @WebParam(name = "stare") String stare, @WebParam(name = "numenou") String numenou, @WebParam(name = "prenumenou") String prenumenou,
    @WebParam(name = "starenoua") String starenoua) 
    {
        DriverConroller dc = new DriverConroller();
        dc.modify(nume, prenume, stare, numenou, prenumenou, starenoua);
    }
    
    @WebMethod(operationName = "insertCamion")
    public void insertCamion(@WebParam(name = "id") String id, @WebParam(name = "volum") float volum) 
    {
        TruckController tc = new TruckController();
        tc.insert(id, volum);
    }

    @WebMethod(operationName = "deleteCamion")
    public void deleteCamion(@WebParam(name = "id") String id) 
    {
        TruckController tc = new TruckController();
        tc.delete(id);
    }

    @WebMethod(operationName = "modifyCamion")
    public void modifyCamion(@WebParam(name = "id") String id,
                            @WebParam(name = "idnou") String idnou, @WebParam(name = "volumnou") Float volumnou, @WebParam(name = "starenoua") String starenoua) 
    {
        TruckController tc = new TruckController();
        tc.modify(id, idnou, volumnou, starenoua);
    }

    @WebMethod(operationName = "numeClient")
    public String numeClient(@WebParam(name = "id") int id) 
    {
        BillController bc = new BillController();
        return bc.numeClient(id);
    }

    @WebMethod(operationName = "numeDestinatar")
    public String numeDestinatar(@WebParam(name = "id") int id) 
    {
        BillController bc = new BillController();
        return bc.numeDestinatar(id);
    }

    @WebMethod(operationName = "prenumeClient")
    public String prenumeClient(@WebParam(name = "id") int id) 
    {
        BillController bc = new BillController();
        return bc.prenumeClient(id);
    }

    @WebMethod(operationName = "prenumeDestinatar")
    public String prenumeDestinatar(@WebParam(name = "id") int id) 
    {
        BillController bc = new BillController(); 
        return bc.prenumeDestinatar(id);
    }

    @WebMethod(operationName = "suma")
    public Float suma(@WebParam(name = "id") int id) 
    {
        BillController bc = new BillController();
        return bc.getSum(id);
    }

    @WebMethod(operationName = "idComanda")
    public int idComanda(@WebParam(name = "id") int id) 
    {
        BillController bc = new BillController();
        return bc.idComanda(id);
    }

    @WebMethod(operationName = "continut")
    public String continut(@WebParam(name = "id") int id) 
    {
        BillController bc = new BillController();
        return bc.continut(id);
    }

    @WebMethod(operationName = "select")
    public String select() 
    {
        int idcomanda;
        String numeClient;
        String prenumeClient;
        String numeDestinatar;
        String prenumeDestinatar;
        int idpackage;
        String stare;
        int i = 0;
        String result = "<table border='1'><tr><th>Id Comanda</th>"
                + "<th>Nume Client</th><th>Prenume Client</th>"
                + "<th>Nume Destinatar</th><th>Prenume Destinatar</th>"
                + "<th>Id Colet</th><th>Stare</th></tr>";
        String s;
        try
	{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/proiect", "root", "someday");
            java.sql.Statement statement = conn.createStatement(); 
            ResultSet rs = statement.executeQuery( "SELECT * FROM comanda");
            while(rs.next())
            {
                s = "";
                idcomanda = rs.getInt(1);
                numeClient = rs.getString(2);
                prenumeClient = rs.getString(3);
                numeDestinatar = rs.getString(4);
                prenumeDestinatar = rs.getString(5);
                idpackage = rs.getInt(6);
                stare = rs.getString(7);
                i++;
                s = "<form action='Schimba.jsp'><tr><td>"+idcomanda+"</td><td>"+numeClient+"</td>"
                        +"<input type='hidden' name='numeclient' value='"+numeClient+"'>"
                        + "<td>"+prenumeClient+"<input type='hidden' name='prenumeclient' value='"+prenumeClient+"'>"
                        +"</td><td>"+numeDestinatar+"</td>"+"<input type='hidden' name='numedestinatar' value='"+numeDestinatar+"'>"
                        + "<td>"+prenumeDestinatar+"<input type='hidden' name='prenumedestinatar' value='"+prenumeDestinatar+"'>"
                        +"</td><td>"+idpackage+"</td>"+"<input type='hidden' name='idpackage' value='"+idpackage+"'>"
                        + "<td>"+stare+"</td><td><input type='submit' value='Modifica'></td></form></tr>";
                result = result + s;
            }
            rs.close(); 
            conn.close();
	}
        catch(Exception e){}
        return result + "</table>";
    }

    @WebMethod(operationName = "selectClient")
    public String selectClient(@WebParam(name = "nume") String nume, @WebParam(name = "prenume") String prenume) 
    {
        ClientController cc = new ClientController();
        return cc.select(nume, prenume);
    }

    @WebMethod(operationName = "selectDestinatar")
    public String selectDestinatar(@WebParam(name = "nume") String nume, @WebParam(name = "prenume") String prenume) 
    {
        DestinatarController dc = new DestinatarController();
        return dc.select(nume, prenume);
    }

    @WebMethod(operationName = "getStare")
    public String getStare(@WebParam(name = "id") int id) 
    {
        OrderController oc = new OrderController();
        return oc.select(id);
    }
    
    @WebMethod(operationName = "updateComanda")
    public void updateComanda(@WebParam(name = "sessionNumeClient") String sessionNumeClient,
    @WebParam(name = "sessionPrenumeClient") String sessionPrenumeClient,
    @WebParam(name = "sessionNumeDestinatar") String sessionNumeDestinatar,
    @WebParam(name = "sessionPrenumeDestinatar") String sessionPrenumeDestinatar,
    @WebParam(name = "sessionId") int sessionId,@WebParam(name = "numeClient") String numeClient, 
    @WebParam(name = "prenumeClient") String prenumeClient, @WebParam(name = "stradaClient") String stradaClient, 
    @WebParam(name = "numarClient") String numarClient, @WebParam(name = "blocClient") String blocClient, 
    @WebParam(name = "scaraClient") String scaraClient, @WebParam(name = "apartamentClient") String apartamentClient, 
    @WebParam(name = "orasClient") String orasClient, @WebParam(name = "judetClient") String judetClient, 
    @WebParam(name = "email") String email, @WebParam(name = "telefon") String telefon, 
    @WebParam(name = "numeDestinatar") String numeDestinatar, 
    @WebParam(name = "prenumeDestinatar") String prenumeDestinatar, 
    @WebParam(name = "stradaDestinatar") String stradaDestinatar, 
    @WebParam(name = "numarDestinatar") String numarDestinatar, 
    @WebParam(name = "blocDestinatar") String blocDestinatar, @WebParam(name = "scaraDestinatar") String scaraDestinatar, 
    @WebParam(name = "apartamentDestinatar") String apartamentDestinatar, 
    @WebParam(name = "orasDestinatar") String orasDestinatar, @WebParam(name = "judetDestinatar") String judetDestinatar, 
    @WebParam(name = "continut") String continut, @WebParam(name = "prioritate") int prioritate, 
    @WebParam(name = "volum") float volum, @WebParam(name = "stare") String stare) 
    {
        ClientController cc = new ClientController();
        cc.update(sessionNumeClient, sessionPrenumeClient, numeClient, prenumeClient, stradaClient, numarClient,
                blocClient, scaraClient, apartamentClient, orasClient, judetClient, email, telefon);
        DestinatarController dc = new DestinatarController();
        dc.update(sessionNumeDestinatar, sessionPrenumeDestinatar, numeDestinatar, prenumeDestinatar, stradaDestinatar, numarDestinatar, 
                blocDestinatar, scaraDestinatar, apartamentDestinatar, orasDestinatar, judetDestinatar);
        PackageController pc = new PackageController();
        pc.update(continut, prioritate, volum, numeClient, prenumeClient, numeDestinatar, prenumeDestinatar, sessionId);
        OrderController oc = new OrderController();
        oc.update(numeClient, prenumeClient, numeDestinatar, prenumeDestinatar, sessionId, stare);
    }

    @WebMethod(operationName = "selectPackage")
    public String selectPackage(@WebParam(name = "id") int id) 
    {
        PackageController pc = new PackageController();
        return pc.select(id);
    }
    
    @WebMethod(operationName = "selectCamioane")
    public String selectCamioane() 
    {
        String idcamion;
        String numeSofer;
        String prenumeSofer;
        float volum;
        String stare;
        String judete = "<select name=\"judetdestinatar\">" +
                        "<option value=\"0\">Alege Judet</option>" +
                        "<option value=\"Alba\">Alba</option>" +
                        "<option value=\"Arad\">Arad</option>" +
                        "<option value=\"Arges\">Arges</option>" +
                        "<option value=\"Bacau\">Bacau</option>" +
                        "<option value=\"Bihor\">Bihor</option>" +
                        "<option value=\"Bistrita Nasaud\">Bistrita Nasaud</option>" +
                        "<option value=\"Botosani\">Botosani</option>" +
                        "<option value=\"Brasov\">Brasov</option>" +
                        "<option value=\"Braila\">Braila</option>" +
                        "<option value=\"Bucuresti\">Bucuresti</option>" +
                        "<option value=\"Buzau\">Buzau</option>" +
                        "<option value=\"Caras Severin\">Caras Severin</option>" +
                        "<option value=\"Calarasi\">Calarasi</option>" +
                        "<option value=\"Cluj\">Cluj</option>" +
                        "<option value=\"Constanta\">Constanta</option>" +
                        "<option value=\"Covasna\">Covasna</option>" +
                        "<option value=\"Dambovita\">Dambovita</option>" +
                        "<option value=\"Dolj\">Dolj</option>" +
                        "<option value=\"Galati\">Galati</option>" +
                        "<option value=\"Giurgiu\">Giurgiu</option>" +
                        "<option value=\"Gorj\">Gorj</option>" +
                        "<option value=\"Harghita\">Harghita</option>" +
                        "<option value=\"Hunedoara\">Hunedoara</option>" +
                        "<option value=\"Ialomita\">Ialomita</option>" +
                        "<option value=\"Iasi\">Iasi</option>" +
                        "<option value=\"Ilfov\">Ilfov</option>" +
                        "<option value=\"Maramures\">Maramures</option>" +
                        "<option value=\"Mehedinti\">Mehedinti</option>" +
                        "<option value=\"Mures\">Mures</option>" +
                        "<option value=\"Neamt\">Neamt</option>" +
                        "<option value=\"Olt\">Olt</option>" +
                        "<option value=\"Prahova\">Prahova</option>" +
                        "<option value=\"Satu Mare\">Satu Mare</option>" +
                        "<option value=\"Salaj\">Salaj</option>" +
                        "<option value=\"Sibiu\">Sibiu</option>" +
                        "<option value=\"Suceava\">Suceava</option>" +
                        "<option value=\"Teleorman\">Teleorman</option>" +
                        "<option value=\"Timis\">Timis</option>" +
                        "<option value=\"Tulcea\">Tulcea</option>" +
                        "<option value=\"Vaslui\">Vaslui</option>" +
                        "<option value=\"Valcea\">Valcea</option>" +
                        "<option value=\"Vrancea\">Vrancea</option>" +
                        "</select>";
        int i = 0;
        String result = "<table border='1'><tr><th>Nr. Inmatriculare Camion</th>"
                + "<th>Nume Sofer</th>" + "<th>Judetul Destinatiei</th>"
                + "<th>Volum</th><th>Stare</th></tr>";
        String s;
        String soferi = "<select name='sofer'>";
        try
	{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/proiect", "root", "someday");
            java.sql.Statement statement = conn.createStatement(); 
            ResultSet rs = statement.executeQuery( "SELECT * FROM sofer WHERE stare = 'disponibil'");
            while(rs.next())
            {
                numeSofer = rs.getString(1);
                prenumeSofer = rs.getString(2);
                String nume = numeSofer + "," + prenumeSofer;
                soferi = soferi + "<option value='"+nume+"'>"+nume+"</option>" ;
            }
            rs.close(); 
            conn.close();
	}
        catch(Exception e){}
        soferi = soferi + "</select>";
        try
	{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/proiect", "root", "someday");
            java.sql.Statement statement = conn.createStatement(); 
            ResultSet rs = statement.executeQuery( "SELECT * FROM camion WHERE stare = 'disponibil'");
            while(rs.next())
            {
                s = "";
                idcamion = rs.getString(1);
                volum = rs.getFloat(4);
                stare = rs.getString(5);
                i++;
                s = "<form action='Traseu.jsp'><tr><td>"+idcamion+"</td>"
                        +"<input type='hidden' name='idcamion' value='"+idcamion+"'>"
                        + "<td>"+soferi+"</td>"
                        +"<td>"+judete+"</td>"
                        +"<td>"+volum+"</td>"+"<input type='hidden' name='volum' value='"+volum+"'>"
                        + "<td>"+stare+"</td><td><input type='submit' value='Incarcare'></td></form></tr>";
                result = result + s;
            }
            rs.close(); 
            conn.close();
	}
        catch(Exception e){}
        return result + "</table>";
    }

    @WebMethod(operationName = "traseu")
    public String traseu(@WebParam(name = "idcamion") String idcamion, @WebParam(name = "judet") String judet) 
    {
        TruckController tc = new TruckController();
        return tc.traseu(idcamion, judet);
    }

    @WebMethod(operationName = "destinatii")
    public String destinatii(@WebParam(name = "idcamion") String idcamion, @WebParam(name = "judet") String judet) 
    {
        TruckController tc = new TruckController();
        return tc.destinatii(idcamion, judet);
    }
    
    @WebMethod(operationName = "selectSoferi")
    public String selectSoferi(@WebParam(name = "tip") String tip) {
        String numeSofer;
        String prenumeSofer;
        String stare;
        String result = "<table border='1'><tr><th>Nume Sofer</th>"
                + "<th>Prenume Sofer</th>" + "<th>Stare</th>"
                + "</tr>";
        try
	{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/proiect", "root", "someday");
            java.sql.Statement statement = conn.createStatement(); 
            ResultSet rs = statement.executeQuery( "SELECT * FROM sofer");
            while(rs.next())
            {
                numeSofer = rs.getString(1);
                prenumeSofer = rs.getString(2);
                stare = rs.getString(3);
                result += "<form action='" + tip + "Sofer.jsp'>"
                        +"<tr><td>" + numeSofer + "</td>"+"<input type='hidden' name='nume' value='"+numeSofer+"'>"
                        + "<td>" + prenumeSofer + "</td>"+"<input type='hidden' name='prenume' value='"+prenumeSofer+"'>"
                        + "<td>" + stare + "</td>"+"<input type='hidden' name='stare' value='"+stare+"'>"
                        + "<td><input type='submit' value='"+tip+"'></td></form></tr>";
            }
            rs.close(); 
            conn.close();
	}
        catch(Exception e){}
        return result + "</table>";
    }
    
    @WebMethod(operationName = "selectCamion")
    public String selectCamion(@WebParam(name = "tip") String tip) {
        String idcamion;
        float volum;
        String stare;
        String result = "<table border='1'><tr><th>Id Camion</th>"
                + "<th>Volum</th>" + "<th>Stare</th>"
                + "</tr>";
        try
	{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/proiect", "root", "someday");
            java.sql.Statement statement = conn.createStatement(); 
            ResultSet rs = statement.executeQuery( "SELECT * FROM camion");
            while(rs.next())
            {
                idcamion = rs.getString(1);
                volum = rs.getFloat(4);
                stare = rs.getString(5);
                result += "<form action='"+tip+"Camion.jsp'><tr><td>"+idcamion+"</td>"
                        +"<input type='hidden' name='idcamion' value='"+idcamion+"'>"
                        +"<td>"+volum+"</td>"+"<input type='hidden' name='volum' value='"+volum+"'>"
                        + "<td>"+stare+"</td>"+"<input type='hidden' name='stare' value='"+stare+"'>"
                        + "<td><input type='submit' value='"+tip+"'></td></form></tr>";
            }
            rs.close(); 
            conn.close();
	}
        catch(Exception e){}
        return result + "</table>";
    }
    
    @WebMethod(operationName = "selectPack")
    public String selectPack(@WebParam(name = "tip") String tip) {
        int idpackage, prioritate;
        float volum;
        String continut, numeclient, prenumeclient, numedestinatar, prenumedestinatar;
        String result = "<table border='1'><tr><th>Id Package</th>"
                + "<th>Continut</th>" + "<th>Prioritate</th>"
                + "<th>Volum</th>" + "<th>Nume Client</th>"
                + "<th>Prenume Client</th>" + "<th>Nume Destinatar</th>"
                + "<th>Prenume Destinatar</th>"
                + "</tr>";
        try
	{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/proiect", "root", "someday");
            java.sql.Statement statement = conn.createStatement(); 
            ResultSet rs = statement.executeQuery( "SELECT * FROM package");
            while(rs.next())
            {
                idpackage = rs.getInt(1);
                continut = rs.getString(2);
                prioritate = rs.getInt(3);
                String pri = null;
                if(prioritate == 1)
                    pri = "Mica";
                if(prioritate == 2)
                    pri = "Medie";
                if(prioritate == 3)
                    pri = "Mare";
                if(prioritate == 4)
                    pri = "Foarte Mare";
                if(prioritate == 5)
                    pri = "Urgenta";
                volum = rs.getFloat(4);
                numeclient = rs.getString(5);
                prenumeclient = rs.getString(6);
                numedestinatar = rs.getString(7);
                prenumedestinatar = rs.getString(8);
                result += "<form action='"+tip+".jsp'><tr><td>"+idpackage+"</td>"
                        +"<input type='hidden' name='idpackage' value='"+idpackage+"'>"
                        +"<td>"+continut+"</td>" + "<td>"+pri+"</td>"
                        + "<td>"+volum+"</td>" + "<td>"+numeclient+"</td>"
                        + "<td>"+prenumeclient+"</td>" + "<td>"+numedestinatar+"</td>"
                        + "<td>"+prenumedestinatar+"</td>"
                        + "<td><input type='submit' value='"+tip+"'></td></form></tr>";
            }
            rs.close(); 
            conn.close();
	}
        catch(Exception e){}
        return result + "</table>";
    }
    
    @WebMethod(operationName = "lista")
    public String lista(@WebParam(name = "judet") String judet) {
        int i = 0;
        float volum = 0.f;
        String result = "";
        try
	{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/proiect", "root", "someday");
            java.sql.Statement statement = conn.createStatement(); 
            ResultSet rs = statement.executeQuery( "SELECT volum FROM package,destinatar,comanda WHERE package.numedestinatar = nume AND package.prenumedestinatar = prenume "
                    + "AND package.idpackage = comanda.idpackage AND stare = 'stoc' AND judet = '" + judet + "'");
            while(rs.next())
            {
                float v = rs.getFloat(1);
                volum = volum + v;
                i++;
            }
            if(i != 0)
                result += "<tr><td>"+judet+"</td><td>"+volum+"</td><td>"+i+"</td></tr>";
            rs.close(); 
            conn.close();
	}
        catch(Exception e){}
        return result;
    }
    
    @WebMethod(operationName = "volum")
    public float volum(@WebParam(name = "judet") String judet) {
        float volum = 0.f;
        try
	{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/proiect", "root", "someday");
            java.sql.Statement statement = conn.createStatement(); 
            ResultSet rs = statement.executeQuery( "SELECT volum FROM package,destinatar,comanda WHERE package.numedestinatar = nume AND package.prenumedestinatar = prenume "
                    + "AND package.idpackage = comanda.idpackage AND stare = 'stoc' AND judet = '" + judet + "'");
            while(rs.next())
            {
                float v = rs.getFloat(1);
                volum = volum + v;
            }
            rs.close(); 
            conn.close();
	}
        catch(Exception e){}
        return volum;
    }
}
