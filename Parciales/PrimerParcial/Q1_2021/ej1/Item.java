package Parciales.PrimerParcial.Q1_2021.ej1;

public class Item implements Comparable<Item>{

   private final String name;
   private final double price;

   public Item(String name, double price) {
       this.name = name;
       this.price = price;
   }

  public double getPrice(){
    return price;
  }

  public String getName(){
    return name;
  }

  @Override
  public int compareTo(Item o){
    int cmp = Double.compare(price, o.getPrice());
    if(cmp == 0){
      cmp = name.compareTo(o.getName());
    }
    return cmp;
  }

}


