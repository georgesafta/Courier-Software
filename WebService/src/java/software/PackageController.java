/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package software;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class PackageController 
{
    public void insert(String goods, int priority, float volume, String numeClient, String prenumeClient, String numeDestinatar, String prenumeDestinatar)
    {
        Package p = new Package(goods, priority, volume);
        p.insert(numeClient, prenumeClient, numeDestinatar, prenumeDestinatar);
    }
    public String select(int id)
    {
        Package p = new Package(null, 0, 0.f);
        return p.select(id);
    }
    public void update(String goods, int priority, float volume, String numeClient, 
            String prenumeClient, String numeDestinatar, String prenumeDestinatar,
            int idpackage)
    {
        Package p = new Package(goods, priority, volume);
        p.update(numeClient, prenumeClient, numeDestinatar, prenumeDestinatar, idpackage);
    }
}
