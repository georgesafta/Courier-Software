/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package software;

/**
 *
 * @author George
 */
public class TruckController 
{
    public void insert(String ID, float capacity)
    {
        Truck t = new Truck(ID, capacity);
        t.insert();
    }
    public void delete(String ID)
    {
        Truck t = new Truck(ID, 0);
        t.delete(ID);
    }
    public void modify(String ID, String idnou, Float volumnou, String starenoua)
    {
        Truck t = new Truck(ID, 0);
        t.modify(ID, idnou, volumnou, starenoua);
    }
    public String traseu(String idcamion, String judet)
    {
       Truck t = new Truck("", 0);
       return t.traseu(idcamion, judet); 
    }
    public String destinatii(String idcamion, String judet)
    {
       Truck t = new Truck("", 0);
       return t.destinatii(idcamion, judet); 
    }
}
