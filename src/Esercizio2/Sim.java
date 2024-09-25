package Esercizio2;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Sim {
    private String numero;
    private double credito;
    private Chiamata[] listaChiamate;

    public Sim(String numero) {
        this.numero = numero;
        this.credito = 0;
        this.listaChiamate = new Chiamata[5];
    }

    public void aggiungiCredito(double nuovoCredito) {
        this.credito += nuovoCredito;
    }

    public void setlistaChiamate(Chiamata[] listaChiamate) {
        this.listaChiamate = listaChiamate;
    }

    public void stampaDati(){
        System.out.println("La tua Sim é: " + this.numero);
        System.out.println("Il tuo credito disponibnile é: " + this.credito);
        System.out.println("Questa é la tua lista delle chiamate: " + Arrays.toString(listaChiamate));
        if(listaChiamate[0] != null) {
            System.out.println("- La chiamata 1: " + listaChiamate[0].getNumeroChiamato() + " ha una durata in minuti di: " + listaChiamate[0].getDurata());
        }

        if(listaChiamate[1] != null) {
            System.out.println("- La chiamata 2: " + listaChiamate[1].getNumeroChiamato() + " ha una durata in minuti di: " + listaChiamate[1].getDurata());
        }

        if(listaChiamate[2] != null) {
            System.out.println("- La chiamata 3: " + listaChiamate[2].getNumeroChiamato() + " ha una durata in minuti di: " + listaChiamate[2].getDurata());
        }

        if(listaChiamate[3] != null) {
            System.out.println("- La chiamata 4: " + listaChiamate[3].getNumeroChiamato() + " ha una durata in minuti di: " + listaChiamate[3].getDurata());
        }

        if(listaChiamate[4] != null) {
            System.out.println("- La chiamata 5: " + listaChiamate[4].getNumeroChiamato() + " ha una durata in minuti di: " + listaChiamate[4].getDurata());
        }
    }
}
