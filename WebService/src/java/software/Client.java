/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package software;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author George
 */
public class Client 
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
    private String email;
    private String telefon;

    public Client(String nume, String prenume, String strada, String numar, 
            String bloc, String scara, String apartament, String oras, 
            String judet, String email, String telefon) {
        this.nume = nume;
        this.prenume = prenume;
        this.strada = strada;
        this.numar = numar;
        this.bloc = bloc;
        this.scara = scara;
        this.apartament = apartament;
        this.oras = oras;
        this.judet = judet;
        this.email = email;
        this.telefon = telefon;
    }

    public void insert()
    {
        try
	{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/proiect", "root", "someday"); 
            PreparedStatement ps=(PreparedStatement) conn.prepareStatement("INSERT INTO client VALUES (?,?,?,?,?,?,?,?,?,?,?)");
            ps.setString(1, this.getNume());
            ps.setString(2, this.getPrenume());
            ps.setString(3, this.getStrada());
            ps.setString(4, this.getNumar());
            ps.setString(5, this.getBloc());
            ps.setString(6, this.getScara());
            ps.setString(7, this.getApartament());
            ps.setString(8, this.getOras());
            ps.setString(9, this.getJudet());
            ps.setString(10, this.getEmail());
            ps.setString(11, this.getTelefon());
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
            PreparedStatement ps=(PreparedStatement) conn.prepareStatement("UPDATE client SET nume = ?, prenume = ?, strada = ?,"
                    + "numar = ?, bloc = ?, scara = ?, apartament = ?, oras = ?, judet = ?, email = ?, telefon = ? WHERE "
                    + "nume = ? AND prenume = ?");
            ps.setString(1, this.getNume());
            ps.setString(2, this.getPrenume());
            ps.setString(3, this.getStrada());
            ps.setString(4, this.getNumar());
            ps.setString(5, this.getBloc());
            ps.setString(6, this.getScara());
            ps.setString(7, this.getApartament());
            ps.setString(8, this.getOras());
            ps.setString(9, this.getJudet());
            ps.setString(10, this.getEmail());
            ps.setString(11, this.getTelefon());
            ps.setString(12, nume);
            ps.setString(13, prenume);
            ps.execute();
            conn.close();
	}
	catch(Exception e){}
    }
    
    public String select(String numeClient, String prenumeClient)
    {
        String strada, numar, oras, judet, bloc, scara, apartament, email, telefon;
        String result = "";
        try
	{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/proiect", "root", "someday");
            java.sql.Statement statement = conn.createStatement(); 
            ResultSet rs = statement.executeQuery( "SELECT * FROM client WHERE nume='"+numeClient+"' AND prenume='"+prenumeClient+"'");
            rs.next();
            strada = rs.getString(3);
            numar = rs.getString(4);
            oras = rs.getString(5);
            judet = rs.getString(6);
            bloc = rs.getString(7);
            scara = rs.getString(8);
            apartament = rs.getString(9);
            email = rs.getString(10);
            telefon = rs.getString(11);
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
            if(email.equals(""))
                email = null;
            if(telefon.equals(""))
                telefon = null;
            result = result + strada + ";" + numar + ";" + oras + ";" + judet + ";" + bloc + ";" + scara + ";" + apartament + ";" + email + ";" + telefon;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    @Override
    public String toString() {
        return "Client{" + "nume=" + nume + ", prenume=" + prenume + ", "
                + "strada=" + strada + ", numar=" + numar + ", bloc=" + bloc + 
                ", scara=" + scara + ", apartament=" + apartament + ", oras="
                + oras + ", judet=" + judet + ", email=" + email + ", telefon=" + telefon + '}';
    }
    
}
