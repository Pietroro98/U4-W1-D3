package Esercizio2;

public class Main2 {
    public static void main(String[] args) {

        Sim sim1 = new Sim("+39 3271112299");
        sim1.aggiungiCredito(20);

        Chiamata[] listaChiamate = new Chiamata[5];
        listaChiamate[0] = new Chiamata("+39 3491112233", 10);
        listaChiamate[1] = new Chiamata("+39 3491113344", 5);
        listaChiamate[2] = new Chiamata("+39 3491114455",15);
        listaChiamate[3] = new Chiamata("+39 3491115566", 3);
        listaChiamate[4] = new Chiamata("+39 3491116677", 2);
        sim1.setlistaChiamate(listaChiamate);
        sim1.stampaDati();


    }
}
