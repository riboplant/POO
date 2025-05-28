package Parciales.PrimerParcial.Repaso.ej3;

public enum Toppings {

  EXTRAQUESO("extra queso", 20.0),
  TOMATE("tomate", 30.0),
  CEBOLLA("cebolla", 10.0);

  private String name;
  private double price;

  Toppings(String name, double price){
    this.name = name;
    this.price = price;
  }

  public double getPrice(){
    return price;
  }

  @Override
  public String toString(){
    return name;
  }
}
