package dal;
// Generated 3-dec-2014 14:02:54 by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * TblModule generated by hbm2java
 */
public class Module  implements java.io.Serializable {


     private Integer id;
     private String naam;
     private String omschrijving;
     private int aantalUren;
     private Date startdatum;

    public Module() {
    }

    public Module(String naam, String omschrijving, int aantalUren, Date startdatum) {
       this.naam = naam;
       this.omschrijving = omschrijving;
       this.aantalUren = aantalUren;
       this.startdatum = startdatum;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public String getNaam() {
        return this.naam;
    }
    
    public void setNaam(String naam) {
        this.naam = naam;
    }
    public String getOmschrijving() {
        return this.omschrijving;
    }
    
    public void setOmschrijving(String omschrijving) {
        this.omschrijving = omschrijving;
    }
    public int getAantalUren() {
        return this.aantalUren;
    }
    
    public void setAantalUren(int aantalUren) {
        this.aantalUren = aantalUren;
    }
    public Date getStartdatum() {
        return this.startdatum;
    }
    
    public void setStartdatum(Date startdatum) {
        this.startdatum = startdatum;
    }




}


