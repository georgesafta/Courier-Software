package software;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.servlet.http.HttpSession;

public class Truck 
{
    private String ID;
    private float capacity;

    public Truck(String ID, float capacity) 
    {
        this.ID = ID;
        this.capacity = capacity;
    }

    public void insert()
    {
        try
	{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/proiect", "root", "someday"); 
            PreparedStatement ps=(PreparedStatement) conn.prepareStatement("INSERT INTO camion (idcamion, volum, stare) VALUES (?,?,?)");
            ps.setString(1, this.getID());
            ps.setFloat(2, this.getCapacity());
            ps.setString(3, "disponibil");
            ps.execute();
            conn.close();
	}
	catch(Exception e){}
    }
    
    public void delete(String id)
    {
        try
	{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/proiect", "root", "someday"); 
            PreparedStatement ps=(PreparedStatement) conn.prepareStatement("DELETE FROM camion WHERE idcamion = ?");
            ps.setString(1, id);
            ps.execute();
            conn.close();
	}
	catch(Exception e){}
    }
    
    public void modify(String id, String stare)
    {
        try
	{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/proiect", "root", "someday"); 
            PreparedStatement ps=(PreparedStatement) conn.prepareStatement("UPDATE camion SET stare = ? WHERE idcamion = ?");
            ps.setString(1, stare);
            ps.setString(2, id);
            ps.execute();
            conn.close();
	}
	catch(Exception e){}
    }
    
    public void modify(String id, String idnou, Float volumnou, String starenoua)
    {
        try
	{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/proiect", "root", "someday"); 
            PreparedStatement ps=(PreparedStatement) conn.prepareStatement("UPDATE camion SET idcamion = ?, volum = ?, stare = ? WHERE idcamion = ?");
            ps.setString(1, idnou);
            ps.setFloat(2, volumnou);
            ps.setString(3, starenoua);
            ps.setString(4, id);
            ps.execute();
            conn.close();
	}
	catch(Exception e){}
    }
    
    public String traseu(String idcamion, String judet)
    {
        Float volum = 0.f, volump = 0.f;
        String adresaClient = "";
        String adresaDestinatar = "";
        int idpackage = 0;
        String numeClient = "", prenumeClient = "";
        String numeDestinatar = "", prenumeDestinatar = "";
        String continut = "";
        String destinatii = "";
        String email = "", telefon = ""; 
        String result = "<form action='Harta.jsp' method='post'>"
                + "<table border='1'>"
                + "<tr><th>Id Package</th>"
                + "<th>Nume Client</th>"
                + "<th>Prenume Client</th>"
                + "<th>Nume Destinatar</th>"
                + "<th>Prenume Destinatar</th>"
                + "<th>Continut</th>"
                + "<th>Volum</th>"
                + "<th>Adresa Client</th>"
                + "<th>Email Client</th>"
                + "<th>Telefon Client</th>"
                + "<th>Adresa Destinatar</th>"
                + "</tr>";
        try
	{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/proiect", "root", "someday");
            java.sql.Statement statement = conn.createStatement(); 
            ResultSet rs = statement.executeQuery( "SELECT * FROM camion WHERE idcamion = '"+idcamion+"'");
            rs.next();
            volum = rs.getFloat(4);
            this.modify(idcamion, "indisponibil");
            rs.close(); 
            conn.close();
	}
        catch(Exception e){}
        try
	{
            for(int i = 5;i>=1;i--)
            {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/proiect", "root", "someday");
            java.sql.Statement statement = conn.createStatement(); 
            ResultSet rs = statement.executeQuery( "SELECT p.idpackage, p.numeclient, p.prenumeclient, p.numedestinatar, p.prenumedestinatar, "
                    + "continut, volum, cl.strada, cl.numar, cl.bloc, cl.scara, cl.apartament, cl.oras, "
                    + "cl.judet, email, telefon, d.strada, d.numar, d.bloc, d.scara, "
                    + "d.apartament, d.oras, d.judet "
                    + "FROM package p, comanda co, client cl, destinatar d WHERE p.idpackage = co.idpackage AND "
                    + "cl.nume = p.numeclient AND cl.prenume = p.prenumeclient "
                    + "AND d.nume = p.numedestinatar AND d.prenume = p.prenumedestinatar "
                    + "AND stare = 'stoc' AND prioritate = '"+i+"' AND d.judet = '"+judet+"'");
            try{
            while(rs.next())
            {
                idpackage = rs.getInt(1);
                numeClient = rs.getString(2);
                prenumeClient = rs.getString(3);
                numeDestinatar = rs.getString(4);
                prenumeDestinatar = rs.getString(5);
                continut = rs.getString(6);
                volump = rs.getFloat(7);
                adresaClient = "Str. "+rs.getString(8)+", nr. "+rs.getString(9)+", bloc "+rs.getString(10)+
                        ", sc. "+rs.getString(11)+", ap. "+rs.getString(12)+", Oras "+rs.getString(13)+
                        ", judet "+rs.getString(14);
                email = rs.getString(15);
                telefon = rs.getString(16);
                adresaDestinatar = "Str. "+rs.getString(17)+", nr. "+rs.getString(18)+", bloc "+rs.getString(19)+
                        ", sc. "+rs.getString(20)+", ap. "+rs.getString(21)+", Oras "+rs.getString(22)+
                        ", judet "+rs.getString(23);
                if(volum - volump >= 0)
                {
                    volum = volum - volump;
                    result = result + "<tr><td>"+idpackage+"</td>"
                            + "<td>"+numeClient+"</td>"
                            + "<td>"+prenumeClient+"</td>"
                            + "<td>"+numeDestinatar+"</td>"
                            + "<td>"+prenumeDestinatar+"</td>"
                            + "<td>"+continut+"</td>"
                            + "<td>"+volump+"</td>"
                            + "<td>"+adresaClient+"</td>"
                            + "<td>"+email+"</td>"
                            + "<td>"+telefon+"</td>"
                            + "<td>"+adresaDestinatar+"</td></tr>";
                    destinatii = destinatii + "Strada "+rs.getString(17)+", nr. "+rs.getString(18)+", " +
                            rs.getString(22)+ " ,Romania;";
                    OrderController oc = new OrderController();
                    oc.modify(idpackage, "comanda");
                }
            }
            }catch(Exception e){}
            rs.close(); 
            conn.close();
            }
	}
        catch(Exception e){}
        return result + "<input type='hidden' name='destinatii' value='" + destinatii + "'>"
                + "</table>" + "<input type='submit' value='Afisare Traseu'>";
    }
    
    public String destinatii(String idcamion, String judet)
    {
        Float volum = 0.f, volump = 0.f;
        String adresaDestinatar = "";
        String destinatii = "";
        String result = "";
        try
	{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/proiect", "root", "someday");
            java.sql.Statement statement = conn.createStatement(); 
            ResultSet rs = statement.executeQuery( "SELECT * FROM camion WHERE idcamion = '"+idcamion+"'");
            rs.next();
            volum = rs.getFloat(4);
            rs.close(); 
            conn.close();
	}
        catch(Exception e){}
        try
	{
            for(int i = 5;i>=1;i--)
            {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/proiect", "root", "someday");
            java.sql.Statement statement = conn.createStatement(); 
            ResultSet rs = statement.executeQuery( "SELECT p.idpackage, p.numeclient, p.prenumeclient, p.numedestinatar, p.prenumedestinatar, "
                    + "continut, volum, cl.strada, cl.numar, cl.bloc, cl.scara, cl.apartament, cl.oras, "
                    + "cl.judet, email, telefon, d.strada, d.numar, d.bloc, d.scara, "
                    + "d.apartament, d.oras, d.judet "
                    + "FROM package p, comanda co, client cl, destinatar d WHERE p.idpackage = co.idpackage AND "
                    + "cl.nume = p.numeclient AND cl.prenume = p.prenumeclient "
                    + "AND d.nume = p.numedestinatar AND d.prenume = p.prenumedestinatar "
                    + "AND stare = 'stoc' AND prioritate = '"+i+"' AND d.judet = '"+judet+"'");
            try{
            while(rs.next())
            {
                adresaDestinatar = "Strada "+rs.getString(17)+", nr. "+rs.getString(18)+", "+rs.getString(22)+
                        " ,Romania";
                if(volum - volump >= 0)
                {
                    volum = volum - volump;
                    destinatii = destinatii + adresaDestinatar + ";";
                }
            }
            }catch(Exception e){}
            rs.close(); 
            conn.close();
            }
	}
        catch(Exception e){}
        return result + destinatii;
    }
    
    public String getID() 
    {
        return ID;
    }

    public void setID(String ID) 
    {
        this.ID = ID;
    }

    public float getCapacity() 
    {
        return capacity;
    }

    public void setCapacity(float capacity) 
    {
        this.capacity = capacity;
    }

    @Override
    public String toString() 
    {
        return "Truck{" + "ID=" + ID + ", capacity=" + capacity + '}';
    }
    
}
