/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package software;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class ClientController 
{
    public void insert(String nume, String prenume, String strada, String numar,
            String bloc, String scara, String apartament, String oras, 
            String judet, String email, String telefon)
    {
        Client c = new Client(nume, prenume, strada, numar, bloc, scara, apartament, oras, judet, email, telefon);
        c.insert();
    }
    public String select(String nume, String prenume)
    {
        Client c = new Client(nume, prenume, null, null, null, null, null, null, null, null, null);
        return c.select(nume, prenume);
    }
    public void update(String numeClient, String prenumeClient,
            String nume, String prenume, String strada, String numar, 
            String bloc, String scara, String apartament, String oras, 
            String judet, String email, String telefon)
    {
        Client c = new Client(nume, prenume, strada, numar, bloc, scara, apartament, oras, judet, email, telefon);
        c.update(numeClient, prenumeClient);
    }
}
