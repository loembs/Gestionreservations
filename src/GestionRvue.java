import java.util.Scanner;
import entities.Patient;
import entities.Rendezvous;
import enums.Etat;
import enums.specialite;
import services.servicesPatient;
import services.servicesRv;

public class GestionRvue {
  public static Patient[] tabPatient;
    private static  Scanner scanner=new Scanner(System.in);
    public static Patient saisie(){
        Patient pa =new Patient();
            System.out.println("Entrer votre nomcomplet ");
            pa.setNomcomplet(scanner.nextLine());
            scanner.nextLine();
            System.out.println("Entrer le téléphone ");
            pa.setTel(scanner.nextLine());
  
        return pa;
     }
     public static Rendezvous saisierv(){
        Rendezvous rv =new Rendezvous();
            System.out.println("Entrer la date ");
            rv.setDate(scanner.nextLine());
            scanner.nextLine();
            System.out.println("Entrer l'heure ");
            rv.setHeure(scanner.nextLine());
            scanner.nextLine();
            System.out.println("Entrer le Motif");
            rv.setMotif(scanner.nextLine());
            rv.setPatient(getPatientByNumero(tabPatient));
            rv.setEtat(getTypeRvEtat());
            rv.setSpe(getTypeRvsSpecialite());


          return rv;
     }

     public static Etat getTypeRvEtat(){
         int posRv;
             do {
               System.out.println("1-VALIDER");
               System.out.println("2-ANNULER");
               posRv=scanner.nextInt();
             } while (posRv!=1 &&posRv!=2);
            return Etat.values()[posRv-1];
     }

     public static specialite getTypeRvsSpecialite(){
        int posTrans;
            do {
              System.out.println("1-CARDIOLOGIE");
              System.out.println("2-OPHTALMOLOGIE");
              System.out.println("3-UROLOGIE");
              posTrans=scanner.nextInt();
            } while (posTrans!=1 && posTrans!=3);
           return specialite.values()[posTrans-1];
    }
    public static String getnumeroRecherche(){
        String  num;
        System.out.println("Entrer le numéro du patient");
        num=scanner.nextLine();
        return num;
       
    }

    public static Patient getPatientByNumero(Patient[] tabPatient) {
          String numeroRecherche=getnumeroRecherche();
            for (Patient patient : tabPatient) {
                if ( patient.getNumero().equals( numeroRecherche)) {
                    return  patient; 
                }
            }
            return null; 
        }

     public static int showMenu(){
         System.out.println("1-Ajouter Patient");
         System.out.println("2-Lister  tous les patients");
         System.out.println("3-Enregistrer un RV pour un patient ");
         System.out.println("4-Lister tous les RV par Etat");
         System.out.println("5- Lister tous les RV par Spécialité");
         System.out.println("6-Quitter");
         return scanner.nextInt();
     }
    
}
