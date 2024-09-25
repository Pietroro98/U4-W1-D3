package Esercizio3;

public class Carrello {
    private Cliente cliente;
    private Articolo[] elencoArticoli;

    public Carrello(Cliente c1) {
        this.cliente = c1;
        this.elencoArticoli = new Articolo[0];
    }
}
