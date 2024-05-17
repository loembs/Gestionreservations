import java.util.Scanner;
import entities.Patient;
import services.servicesPatient;
import services.servicesRv;
import entities.Rendezvous;
import enums.Etat;
import enums.specialite;


public class App {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int choix;
        servicesPatient servicesPatient = new servicesPatient();
        servicesRv servicesRv = new servicesRv();

        do {
            choix = GestionRvue.showMenu();
            switch (choix) {
                case 1:
                    servicesPatient.addPatient(GestionRvue.saisie());
                    break;
                case 2:
                    servicesPatient.listerPatient();
                    break;
                case 3:
                    servicesRv.enregistrerv(GestionRvue.saisierv());
                    break;
                case 4:
                    servicesRv.listerrv(GestionRvue.getTypeRvEtat());
                    break;
                case 5:
                    servicesRv.listerrv(GestionRvue.getTypeRvsSpecialite());
                    break;
                case 6:
                    break;
                default:
                    
            }
        } while (choix != 6);

        scanner.close();
    }
}
