/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package software;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class OrderController 
{
    public void insert(String numeClient, String prenumeClient, String numeDestinatar, String prenumeDestinatar, String continut,String state)
    {
        Order o = new Order(state);
        o.insert(numeClient, prenumeClient, numeDestinatar, prenumeDestinatar, continut);
    }
    public void rejected(int id, String motiv)
    {
        Order o = new Order();
        o.rejected(id, motiv);
    }
    public void delivered(int id)
    {
        Order o = new Order();
        o.delivered(id);
    }
    public void modify(int id, String stare)
    {
        Order o = new Order();
        o.modify(id, stare);
    }
    public String select(int id)
    {
        Order o = new Order();
        return o.select(id);
    }
    public void update(String numeClient, String prenumeClient, String numeDestinatar,
            String prenumeDestinatar, int idpackage, String stare)
    {
        Order o = new Order(stare);
        o.update(numeClient, prenumeClient, numeDestinatar, prenumeDestinatar, idpackage);
    }
}
