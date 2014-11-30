package software;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Driver 
{
    private String nume;
    private String prenume;

    public Driver(String nume, String prenume) 
    {
        this.nume = nume;
        this.prenume = prenume;
    }
    
    public void insert()
    {
        try
	{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/proiect", "root", "someday"); 
            PreparedStatement ps=(PreparedStatement) conn.prepareStatement("INSERT INTO sofer VALUES (?,?,?)");
            ps.setString(1, this.getNume());
            ps.setString(2, this.getPrenume());
            ps.setString(3, "disponibil");
            ps.execute();
            conn.close();
	}
	catch(Exception e){}
    }

    public void delete(String nume, String prenume)
    {
        try
	{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/proiect", "root", "someday"); 
            PreparedStatement ps=(PreparedStatement) conn.prepareStatement("DELETE FROM sofer WHERE nume = ? AND prenume = ?");
            ps.setString(1, nume);
            ps.setString(2, prenume);
            ps.execute();
            conn.close();
	}
	catch(Exception e){}
    }
    
    public void modify(String nume, String prenume, String stare, String numenou, String prenumenou, String starenoua)
    {
        try
	{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/proiect", "root", "someday"); 
            PreparedStatement ps=(PreparedStatement) conn.prepareStatement("UPDATE sofer SET nume = ?, prenume = ?, stare = ? WHERE nume = ? AND prenume = ?");
            ps.setString(1, numenou);
            ps.setString(2, prenumenou);
            ps.setString(3, starenoua);
            ps.setString(4, nume);
            ps.setString(5, prenume);
            ps.execute();
            conn.close();
	}
	catch(Exception e){}
    }
    
    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    
    public String getNume() 
    {
        return nume;
    }

    public void setNume(String nume) 
    {
        this.nume = nume;
    }

    @Override
    public String toString() 
    {
        return "Driver{" + "nume=" + nume + ",prenume=" + prenume + '}';
    }
    
}
