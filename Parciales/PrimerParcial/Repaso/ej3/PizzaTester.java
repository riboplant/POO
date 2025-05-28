package Parciales.PrimerParcial.Repaso.ej3;

public class PizzaTester {
    public static void main(String[] args) {
        // Pizza a la parrilla con Tomate
        Pizza pizza1 = new Pizza(Coccion.PARRILLA, Toppings.TOMATE);
        // Pizza a la parrilla con Tomate con Cebolla con Extra queso
        Pizza pizza2 = new Pizza(Coccion.PARRILLA, Toppings.TOMATE, Toppings.CEBOLLA, Toppings.EXTRAQUESO);
        // Pizza al horno con Cebolla con Extra queso
        Pizza pizza3 = new Pizza(Coccion.HORNO, Toppings.TOMATE, Toppings.EXTRAQUESO);
        System.out.println(pizza1);
        System.out.println(pizza2);
        System.out.println(pizza3);
    }
}
