package software;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Bill 
{
    private int number;
    private float sum;
    private String date;

    public Bill(int number, String date) 
    {
        this.number = number;
        this.date = date;
    }

    public void calculateSum()
    {
         try
	{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/proiect", "root", "someday");
            java.sql.Statement statement = conn.createStatement(); 
            ResultSet rs = statement.executeQuery( "SELECT volum FROM package WHERE idpackage = '" + number + "'");
            rs.next();
            Float volume = rs.getFloat("volum");
            sum = (float) (volume * 1.5);
            rs.close(); 
            conn.close();
	}
	catch(Exception e)
	{sum = 0;}
    }
    
    public int selectIdComanda()
    {
         try
	{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/proiect", "root", "someday");
            java.sql.Statement statement = conn.createStatement(); 
            ResultSet rs = statement.executeQuery( "SELECT idcomanda FROM comanda WHERE idpackage = '" + number + "'");
            rs.next();
            int id = rs.getInt("idcomanda");
            rs.close(); 
            conn.close();
            return id;
	}
	catch(Exception e)
	{
            return 0;
	}
    }
    
    public String selectNumeClient()
    {
         try
	{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/proiect", "root", "someday");
            java.sql.Statement statement = conn.createStatement(); 
            ResultSet rs = statement.executeQuery( "SELECT numeclient FROM comanda WHERE idpackage = '" + number + "'");
            rs.next();
            String numeClient = rs.getString("numeclient");
            rs.close(); 
            conn.close();
            return numeClient;
	}
	catch(Exception e)
	{
            return "";
	}
    }
    
    public String selectPrenumeClient()
    {
         try
	{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/proiect", "root", "someday");
            java.sql.Statement statement = conn.createStatement(); 
            ResultSet rs = statement.executeQuery( "SELECT prenumeclient FROM comanda WHERE idpackage = '" + number + "'");
            rs.next();
            String prenumeClient = rs.getString("prenumeclient");
            rs.close(); 
            conn.close();
            return prenumeClient;
	}
	catch(Exception e)
	{
            return "";
	}
    }
    
    public String selectNumeDestinatar()
    {
         try
	{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/proiect", "root", "someday");
            java.sql.Statement statement = conn.createStatement(); 
            ResultSet rs = statement.executeQuery( "SELECT numedestinatar FROM comanda WHERE idpackage = '" + number + "'");
            rs.next();
            String numeDestinatar = rs.getString("numedestinatar");
            rs.close(); 
            conn.close();
            return numeDestinatar;
	}
	catch(Exception e)
	{
            return "";
	}
    }
    
    public String selectPrenumeDestinatar()
    {
         try
	{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/proiect", "root", "someday");
            java.sql.Statement statement = conn.createStatement(); 
            ResultSet rs = statement.executeQuery( "SELECT prenumedestinatar FROM comanda WHERE idpackage = '" + number + "'");
            rs.next();
            String prenumeDestinatar = rs.getString("prenumedestinatar");
            rs.close(); 
            conn.close();
            return prenumeDestinatar;
	}
	catch(Exception e)
	{
            return "";
	}
    }
    
    public String selectContinut()
    {
         try
	{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/proiect", "root", "someday");
            java.sql.Statement statement = conn.createStatement(); 
            ResultSet rs = statement.executeQuery( "SELECT continut FROM package WHERE idpackage = '" + number + "'");
            rs.next();
            String continut = rs.getString("continut");
            rs.close(); 
            conn.close();
            return continut;
	}
	catch(Exception e)
	{
            return "";
	}
    }
    
    public int getNumber() 
    {
        return number;
    }

    public void setNumber(int number) 
    {
        this.number = number;
    }

    public float getSum() 
    {
        return sum;
    }

    public String getDate() 
    {
        return date;
    }

    public void setDate(String date) 
    {
        this.date = date;
    }

    @Override
    public String toString() 
    {
        return "Bill{" + "number=" + number + ", sum=" + sum + ", date=" + date + '}';
    }
    
}
