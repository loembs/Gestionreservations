package entities;
import enums.Etat;
import enums.specialite;

public class Rendezvous {
    private String date;
	private String heure;
	private String motif;
    private Patient patient;
    private Etat etat;
    private specialite spe;

    public Rendezvous(String date, String heure , String motif) {
        
        this.date= date;
        this.heure= heure;
        this.motif = motif;
    }
    public  Rendezvous() {
       
    }
    public Patient getPatient() {
        return patient;
    }
    public void setPatient(Patient patient) {
        this.patient = patient;
    }
   
    public String getDate() {
        return date;
    }
    public Etat getEtat() {
        return etat;
    }
    public void setEtat(Etat etat) {
        this.etat = etat;
    }
    public void setDate(String date) {
        this.date = date;
    }
    public String getHeure() {
        return heure;
    }
    public void setHeure(String heure) {
        this.heure = heure;
    }
    public String getMotif() {
        return motif;
    }
    public void setMotif(String motif) {
        this.motif = motif;
    }
    @Override
    public String toString() {
        return "Rendezvous [date=" + date + ", heure=" + heure + ", motif=" + motif + "]";
    }
    public specialite getSpe() {
        return spe;
    }
    public void setSpe(specialite spe) {
        this.spe = spe;
    }

    
}
