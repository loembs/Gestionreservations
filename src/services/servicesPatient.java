package services;
import java.util.List;
import java.util.Scanner;
import entities.Patient;

public class servicesPatient {

    private static final int N=5;
    private  static  Patient  tabPatient[]=new Patient[N];
    private  int  n;

    public void addPatient(Patient pa){
        if (n<N) {
            tabPatient[n++]=pa;
            System.out.println("patient ajouté avec succès");
        } else {
              System.out.println("Le Tableau est plein");
        }
    }

    public  void  listerPatient(){
      for (int index = 0; index < n; index++) {
         System.out.println(tabPatient[index].toString());
      }
  }
 
  
    



  
}
