package Parciales.PrimerParcial.Repaso.ej3;

public enum Coccion {

    PARRILLA("Pizza a la parrilla", 150.0),
    HORNO("Pizza al horno", 100.0);

    private final String name;
    private final double price;

    Coccion(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return name;
    }
}