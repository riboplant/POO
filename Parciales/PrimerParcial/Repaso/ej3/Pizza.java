package Parciales.PrimerParcial.Repaso.ej3;

public class Pizza {
  private Coccion coccion;
  private Toppings[] toppings;

  public Pizza(Coccion coccion, Toppings toppings){
    this.coccion = coccion;
    this.toppings = new Toppings[1];
    this.toppings[0] = toppings;
  }

  public Pizza(Coccion coccion, Toppings toppings1, Toppings toppings2){
  this.coccion = coccion;
  this.toppings = new Toppings[2];
  this.toppings[0] = toppings1;
  this.toppings[1] = toppings2;
  }

  public Pizza(Coccion coccion, Toppings toppings1, Toppings toppings2, Toppings toppings3){
    this.coccion = coccion;
    this.toppings = new Toppings[3];
    this.toppings[0] = toppings1;
    this.toppings[1] = toppings2;
    this.toppings[2] = toppings3;
  }

  private double getToppingsPrice(){
    double sum = 0.0;
    for(int i=0; i<toppings.length; i++){
      sum += toppings[i].getPrice();
    }
    return sum;
  }

  public double price(){
    return coccion.getPrice() + getToppingsPrice();
  }

  @Override
  public String toString(){
    String toppingsList = "";
    for(int i=0; i<toppings.length; i++){
      toppingsList += " con " + toppings[i];
    }
    return coccion + toppingsList + ": $" + price();
  }

}
