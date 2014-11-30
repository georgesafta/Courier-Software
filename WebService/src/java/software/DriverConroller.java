/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package software;

/**
 *
 * @author George
 */
public class DriverConroller 
{
    public void insert(String nume, String prenume)
    {
        Driver d = new Driver(nume, prenume);
        d.insert();
    }
    public void delete(String nume, String prenume)
    {
        Driver d = new Driver(nume, prenume);
        d.delete(nume, prenume);
    }
    public void modify(String nume, String prenume, String stare, String numenou, String prenumenou, String starenoua)
    {
        Driver d = new Driver(nume, prenume);
        d.modify(nume, prenume, stare, numenou, prenumenou, starenoua);
    }
}
