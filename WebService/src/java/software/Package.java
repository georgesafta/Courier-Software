package software;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Package 
{
    private String goods;
    private int priority;
    private float volume;

    public Package(String goods, int priority, float volume) 
    {
        this.goods = goods;
        this.priority = priority;
        this.volume = volume;
    }

    public void insert(String numeClient, String prenumeClient, String numeDestinatar, String prenumeDestinatar)
    {
        try
	{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/proiect", "root", "someday"); 
            PreparedStatement ps=(PreparedStatement) conn.prepareStatement("INSERT INTO package (continut, prioritate, volum, numeclient, prenumeclient, numedestinatar, prenumedestinatar) VALUES (?,?,?,?,?,?,?)");
            ps.setString(1, this.getGoods());
            ps.setInt(2, this.getPriority());
            ps.setFloat(3, this.getVolume());
            ps.setString(4, numeClient);
            ps.setString(5, prenumeClient);
            ps.setString(6, numeDestinatar);
            ps.setString(7, prenumeDestinatar);
            ps.execute();
            conn.close();
	}
	catch(Exception e){}
    }
    
    public void update(String numeClient, String prenumeClient, String numeDestinatar, String prenumeDestinatar, int idpackage)
    {
        try
	{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/proiect", "root", "someday"); 
            PreparedStatement ps=(PreparedStatement) conn.prepareStatement("UPDATE package SET continut = ?, prioritate = ?,"
                    + " volum = ?, numeclient = ?, prenumeclient = ?, numedestinatar = ?, prenumedestinatar = ? WHERE idpackage = ?");
            ps.setString(1, this.getGoods());
            ps.setInt(2, this.getPriority());
            ps.setFloat(3, this.getVolume());
            ps.setString(4, numeClient);
            ps.setString(5, prenumeClient);
            ps.setString(6, numeDestinatar);
            ps.setString(7, prenumeDestinatar);
            ps.setInt(8, idpackage);
            ps.execute();
            conn.close();
	}
	catch(Exception e){}
    }
    
    public String select(int id)
    {
        String continut;
        int  prioritate;
        Float volum;
        String result = "";
        try
	{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/proiect", "root", "someday");
            java.sql.Statement statement = conn.createStatement(); 
            ResultSet rs = statement.executeQuery( "SELECT * FROM package WHERE idpackage='"+id+"'");
            rs.next();
            continut = rs.getString(2);
            prioritate = rs.getInt(3);
            volum = rs.getFloat(4);
            if(continut.equals(""))
                continut = null;
            result = result + continut + ";" + prioritate + ";" + volum;
            rs.close(); 
            conn.close();
	}
        catch(Exception e){}
        return result;
    }
    
    public String getGoods() 
    {
        return goods;
    }

    public void setGoods(String goods) 
    {
        this.goods = goods;
    }

    public int getPriority() 
    {
        return priority;
    }

    public void setPriority(int priority) 
    {
        this.priority = priority;
    }

    public float getVolume() 
    {
        return volume;
    }

    public void setVolume(float volume) 
    {
        this.volume = volume;
    }

    @Override
    public String toString() 
    {
        return "Package{" + " goods=" + goods + ", priority=" + priority + 
               ", volume=" + volume + '}';
    }
    
}
