package Esercizio3;

public class Articolo {
    private String codiceArticolo;
    private String descrizione;
    private int prezzo;
    private int numeroPezziDisponibili;

    public Articolo(String codiceArticolo, String descrizione, int prezzo) {
        this.codiceArticolo = codiceArticolo;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        this.numeroPezziDisponibili = 0;
    }


}
