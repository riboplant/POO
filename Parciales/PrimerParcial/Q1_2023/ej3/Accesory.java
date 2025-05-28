package Parciales.PrimerParcial.Q1_2023.ej3;

public class Accesory extends Product{
  private final String description;  

  public Accesory(String name, Brand brand, double proce, String description){
    super(name, brand, price);
    this.description = description;
  }

  @Override
  public double getFinalPrice(){
    return brand.applyDiscount(price);
  }

  @Override
  public double getFinalPrice(Warranty w){
    return w.getSum(getFinalPrice())
  }

  @Override
  public String toString(){
    return "[Accesory] " + super() + " with " + description;
  }





}
