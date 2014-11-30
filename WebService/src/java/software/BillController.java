/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package software;

public class BillController 
{
    public String numeClient(int id)
    {
        Bill b = new Bill(id, null);
        return b.selectNumeClient();
    }
    public String prenumeClient(int id)
    {
        Bill b = new Bill(id, null);
        return b.selectPrenumeClient();
    }
    public String numeDestinatar(int id)
    {
        Bill b = new Bill(id, null);
        return b.selectNumeDestinatar();
    }
    public String prenumeDestinatar(int id)
    {
        Bill b = new Bill(id, null);
        return b.selectPrenumeDestinatar();
    }
    public String continut(int id)
    {
        Bill b = new Bill(id, null);
        return b.selectContinut();
    }
    public Float getSum(int id)
    {
        Bill b = new Bill(id, null);
        b.calculateSum();
        return b.getSum();
    }
    public int idComanda(int id)
    {
        Bill b = new Bill(id, null);
        return b.selectIdComanda();
    }
}
