package Esercizio1;

public class Rettangolo {
    public double altezza;
    public double larghezza;


    public Rettangolo(double altezza, double larghezza) {
        this.altezza = altezza;
        this.larghezza = larghezza;
    }

    public double area() {
        return altezza * larghezza;
    }

    public double perimetro() {
        return (altezza + larghezza) * 2;
    }

}
