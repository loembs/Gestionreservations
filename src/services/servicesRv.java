package services;

import entities.Rendezvous;
import enums.Etat;
import enums.specialite;

public class servicesRv {
    private final int N = 5;
    private Rendezvous tabRendezvous[] = new Rendezvous[N];
    private int n;

    public void enregistrerv(Rendezvous rv) {
        if (n < N) {
            tabRendezvous[n++] = rv;
        }
    }

    public void listerrv(Etat type) {
        for (int index = 0; index < tabRendezvous.length; index++) {
            if (tabRendezvous[index] == null) return;
            if (tabRendezvous[index].getEtat() == type) {
                System.out.println(tabRendezvous[index].toString());
            }
        }
    }

    public void listerrv(specialite type) {
        for (Rendezvous rv : tabRendezvous) {
            if (rv == null) return;
            if (rv.getSpe() == type) {
                System.out.println(rv.toString());
            }
        }
    }
}
