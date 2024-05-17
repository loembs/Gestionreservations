package entities;

public class Patient {
    private String nomcomplet;
    private String tel;
    private String numero;
    private final int N = 5;
    private Rendezvous[] tabRendezvous = new Rendezvous[N];
    private static int counter = 0; 

    public Patient() {
        this.numero = generateNumero(); 
    }
    public Patient(String nomcomplet, String tel) {
        this.nomcomplet = nomcomplet;
        this.tel = tel;
        this.numero = generateNumero(); 
    }
    public String getNomcomplet() {
        return nomcomplet;
    }
    public void setNomcomplet(String nomcomplet) {
        this.nomcomplet = nomcomplet;
    }
    public String getTel() {
        return tel;
    }
    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    private static String  generateNumero() {
        counter++;
        return "FA" + String.format("%03d", counter); 
    }
    public Rendezvous[] getTabRendezvous() {
        return tabRendezvous;
    }

    public void setTabRendezvous(Rendezvous[] tabRendezvous) {
        this.tabRendezvous = tabRendezvous;
    }

    @Override
    public String toString() {
        return String.format("Patient [nomcomplet=%s, tel=%s, numero=%s]", nomcomplet, tel, numero);
    }
}
