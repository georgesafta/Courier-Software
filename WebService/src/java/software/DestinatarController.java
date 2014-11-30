/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package software;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


public class DestinatarController 
{
    public void insert(String nume, String prenume, String strada, String numar,
            String bloc, String scara, String apartament, String oras, 
            String judet)
    {
        Destinatar d = new Destinatar(nume, prenume, strada, numar, bloc, scara, apartament, oras, judet);
        d.insert();
    }
    public String select(String nume, String prenume)
    {
        Destinatar d = new Destinatar(nume, prenume, null, null, null, null, null, null, null);
        return d.select(nume, prenume);
    }
    public void update(String numeDestinatar, String prenumeDestinatar, 
            String nume, String prenume, String strada, String numar,
            String bloc, String scara, String apartament, String oras, String judet)
    {
        Destinatar d = new Destinatar(nume, prenume, strada, numar, bloc, scara, apartament, oras, judet);
        d.update(numeDestinatar, prenumeDestinatar);
    }
}
