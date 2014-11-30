package software;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Order 
{
    private String state;

    public Order(String state) 
    {
        this.state = state;
    }

    public Order() 
    {
        state = "";
    }

    public void insert(String numeClient, String prenumeClient, String numeDestinatar, String prenumeDestinatar, String continut)
    {
        int idpackage = 0;
        try
	{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/proiect", "root", "someday");
            java.sql.Statement statement = conn.createStatement(); 
            ResultSet rs = statement.executeQuery( "SELECT idpackage FROM package WHERE numeclient='" + numeClient +"' AND "
                    + "prenumeclient='" + prenumeClient + "' AND numedestinatar='" + numeDestinatar + "' AND "
                    + "prenumedestinatar='" + prenumeDestinatar + "' AND continut='" + continut +"'");
            rs.next();
            idpackage = rs.getInt(1);
            rs.close(); 
            conn.close();
	}
	catch(Exception e){}
        try
	{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/proiect", "root", "someday"); 
            PreparedStatement ps=(PreparedStatement) conn.prepareStatement("INSERT INTO comanda (numeclient, prenumeclient, numedestinatar, prenumedestinatar, idpackage, stare) VALUES (?,?,?,?,?,?)");
            ps.setString(1, numeClient);
            ps.setString(2, prenumeClient);
            ps.setString(3, numeDestinatar);
            ps.setString(4, prenumeDestinatar);
            ps.setInt(5, idpackage);
            ps.setString(6, this.getState());
            ps.execute();
            conn.close();
	}
	catch(Exception e){}
    }
    
    public void update(String numeClient, String prenumeClient, String numeDestinatar,
            String prenumeDestinatar, int idpackage)
    {
        try
	{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/proiect", "root", "someday"); 
            PreparedStatement ps=(PreparedStatement) conn.prepareStatement("UPDATE comanda SET numeclient = ?, prenumeclient = ?,"
                    + " numedestinatar = ?, prenumedestinatar = ?, stare = ? WHERE idpackage = ?");
            ps.setString(1, numeClient);
            ps.setString(2, prenumeClient);
            ps.setString(3, numeDestinatar);
            ps.setString(4, prenumeDestinatar);
            ps.setInt(6, idpackage);
            ps.setString(5, this.getState());
            ps.execute();
            conn.close();
	}
	catch(Exception e){}
    }
    
    public String select(int id)
    {
        String result = "";
        try
	{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/proiect", "root", "someday");
            java.sql.Statement statement = conn.createStatement(); 
            ResultSet rs = statement.executeQuery( "SELECT stare FROM comanda WHERE idpackage='"+id+"'");
            rs.next();
            result = result + rs.getString(1);
            rs.close(); 
            conn.close();
	}
        catch(Exception e){}
        return result;
    }
    
    public void rejected(int id, String motiv)
    {
        try
	{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/proiect", "root", "someday"); 
            PreparedStatement ps=(PreparedStatement) conn.prepareStatement("UPDATE comanda SET motiv = ? , stare = ? WHERE idpackage = ?");
            ps.setString(1, motiv);
            ps.setString(2, "respins");
            ps.setInt(3, id);
            ps.execute();
            conn.close();
	}
	catch(Exception e){}
    }
    
    public void delivered(int id)
    {
        try
	{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/proiect", "root", "someday"); 
            PreparedStatement ps=(PreparedStatement) conn.prepareStatement("UPDATE comanda SET stare = ? WHERE idpackage = ?");
            ps.setString(1, "livrat");
            ps.setInt(2, id);
            ps.execute();
            conn.close();
	}
	catch(Exception e){}
    }
    
    public void modify(int id, String stare)
    {
        try
	{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/proiect", "root", "someday"); 
            PreparedStatement ps=(PreparedStatement) conn.prepareStatement("UPDATE comanda SET stare = ? WHERE idpackage = ?");
            ps.setString(1, stare);
            ps.setInt(2, id);
            ps.execute();
            conn.close();
	}
	catch(Exception e){}
    }
    
    public String getState() 
    {
        return state;
    }

    public void setState(String state) 
    {
        this.state = state;
    }

    @Override
    public String toString() 
    {
        return "Order{" + "state=" + state + '}';
    }
    
}
