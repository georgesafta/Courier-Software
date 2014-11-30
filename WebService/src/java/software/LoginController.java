/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package software;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LoginController 
{
    public boolean verifyData(String username, String password)
    {
        try
	{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/proiect", "root", "someday");
            java.sql.Statement statement = conn.createStatement(); 
            ResultSet rs = statement.executeQuery( "SELECT * FROM login");
            boolean vf = false;
            while(rs.next())
            {
                if(rs.getString("username").equals(username) && rs.getString("password").equals(password))
                    vf = true;
            }
            rs.close(); 
            conn.close();
            return vf;
	}
	catch(Exception e)
	{
            return false;
	}			
    }
    public boolean verifyData(String username)
    {
        try
	{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/proiect", "root", "someday");
            java.sql.Statement statement = conn.createStatement(); 
            ResultSet rs = statement.executeQuery( "SELECT * FROM login");
            boolean vf = false;
            while(rs.next())
            {
                if(rs.getString("username").equals(username))
                    vf = true;
            }
            rs.close(); 
            conn.close();
            return vf;
	}
	catch(Exception e)
	{
            return false;
	}			
    }
    public boolean register(String username, String password)
    {
        boolean vf = false;
        if(verifyData(username) == false)
        {
            try
		{
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/proiect", "root", "someday"); 
		PreparedStatement ps=(PreparedStatement) conn.prepareStatement("INSERT INTO login VALUES (?,?)");
		ps.setString(1, username);
		ps.setString(2, password);
		ps.execute();
		conn.close();
                vf = true;
		}
		catch(Exception e){}
        }
            return vf;
    }
}
