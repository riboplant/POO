package Parciales.PrimerParcial.Q1_2023.ej3;

public abstract class Product{
  private final Brand brand;
  private final String name;
  private final double price;

  public Product(String name, Brand brand, double price){
    this.name = name;
    this.brand = brand;
    this.price = price;
  }

  public double getFinalPrice();

  public double getFinalPrice(Warrant w);

  @Override
  public String toString(){
    return name + " from " + brand.toString() + " with price " + price;
  }
}
