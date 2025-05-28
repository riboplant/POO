package Parciales.PrimerParcial.Q1_2023.ej3;

public class Device extends Product{
  private final Energy e;
  
  public Device(String name, Brand brand, double price, Energy e){
    super(name, brand, price);
    this.e = e;
  }

  @Override
  public double getFinalPrice(){
    return brand.applyDiscount(price) * (1 + e.getTax());
  }

  @Override double getFinalPrice(Warranty w){
    return w.getSum(getFinalPrice());
  }

  @Override
  public String toString(){
    return "[Device] " + super() + " with Energy label " + e.toString();
  }
}
