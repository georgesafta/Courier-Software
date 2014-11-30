/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package software;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Destinatar 
{
    private String nume;
    private String prenume;
    private String strada;
    private String numar;
    private String bloc;
    private String scara;
    private String apartament;
    private String oras;
    private String judet;

    public Destinatar(String nume, String prenume, String strada, String numar, String bloc, String scara, String apartament, String oras, String judet) {
        this.nume = nume;
        this.prenume = prenume;
        this.strada = strada;
        this.numar = numar;
        this.bloc = bloc;
        this.scara = scara;
        this.apartament = apartament;
        this.oras = oras;
        this.judet = judet;
    }

    public void insert()
    {
        try
	{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/proiect", "root", "someday"); 
            PreparedStatement ps=(PreparedStatement) conn.prepareStatement("INSERT INTO destinatar VALUES (?,?,?,?,?,?,?,?,?)");
            ps.setString(1, this.getNume());
            ps.setString(2, this.getPrenume());
            ps.setString(3, this.getStrada());
            ps.setString(4, this.getNumar());
            ps.setString(5, this.getOras());
            ps.setString(6, this.getJudet());
            ps.setString(7, this.getBloc());
            ps.setString(8, this.getScara());
            ps.setString(9, this.getApartament());
            ps.execute();
            conn.close();
	}
	catch(Exception e){}
    }
    
    public void update(String nume, String prenume)
    {
        try
	{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/proiect", "root", "someday"); 
            PreparedStatement ps=(PreparedStatement) conn.prepareStatement("UPDATE destinatar SET nume = ?, prenume = ?, strada = ?,"
                    + "numar = ?, oras = ?, judet = ?, bloc = ?, scara = ?, apartament = ? WHERE nume = ? AND prenume = ?");
            ps.setString(1, this.getNume());
            ps.setString(2, this.getPrenume());
            ps.setString(3, this.getStrada());
            ps.setString(4, this.getNumar());
            ps.setString(5, this.getOras());
            ps.setString(6, this.getJudet());
            ps.setString(7, this.getBloc());
            ps.setString(8, this.getScara());
            ps.setString(9, this.getApartament());
            ps.setString(10, nume);
            ps.setString(11, prenume);
            ps.execute();
            conn.close();
	}
	catch(Exception e){}
    }
    
    public String select(String numeDestinatar, String prenumeDestinatar)
    {
        String strada, numar, oras, judet, bloc, scara, apartament;
        String result = "";
        try
	{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/proiect", "root", "someday");
            java.sql.Statement statement = conn.createStatement(); 
            ResultSet rs = statement.executeQuery("SELECT * FROM destinatar WHERE nume='"+numeDestinatar+"' AND prenume='"+prenumeDestinatar+"'");
            rs.next();
            strada = rs.getString(3);
            numar = rs.getString(4);
            oras = rs.getString(5);
            judet = rs.getString(6);
            bloc = rs.getString(7);
            scara = rs.getString(8);
            apartament = rs.getString(9);
            if(strada.equals(""))
                strada = null;
            if(numar.equals(""))
                numar = null;
            if(oras.equals(""))
                oras = null;
            if(judet.equals(""))
                judet = null;
            if(bloc.equals(""))
                bloc = null;
            if(scara.equals(""))
                scara = null;
            if(apartament.equals(""))
                apartament = null;
            result = result + strada + ";" + numar + ";" + bloc + ";" + scara + ";" + apartament + ";" + oras + ";" + judet;
            rs.close(); 
            conn.close();
	}
        catch(Exception e){}
        return result;
    }
    
    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public String getStrada() {
        return strada;
    }

    public void setStrada(String strada) {
        this.strada = strada;
    }

    public String getNumar() {
        return numar;
    }

    public void setNumar(String numar) {
        this.numar = numar;
    }

    public String getBloc() {
        return bloc;
    }

    public void setBloc(String bloc) {
        this.bloc = bloc;
    }

    public String getScara() {
        return scara;
    }

    public void setScara(String scara) {
        this.scara = scara;
    }

    public String getApartament() {
        return apartament;
    }

    public void setApartament(String apartament) {
        this.apartament = apartament;
    }

    public String getOras() {
        return oras;
    }

    public void setOras(String oras) {
        this.oras = oras;
    }

    public String getJudet() {
        return judet;
    }

    public void setJudet(String judet) {
        this.judet = judet;
    }

    @Override
    public String toString() {
        return "Destinatar{" + "nume=" + nume + ", prenume=" + prenume + 
                ", strada=" + strada + ", numar=" + numar + ", bloc=" + bloc + 
                ", scara=" + scara + ", apartament=" + apartament + ", oras=" + 
                oras + ", judet=" + judet + '}';
    }
    
}
