package Parciales.PrimerParcial.Q1_2023.ej3;

public enum Energy{

  A("A", 0),
  B("B", 0.1),
  C("C", 0.2);

  private String name;
  private double tax;

  public Energy(String name, double tax){
    this.name = name;
    this.tax = tax;
  }

  @Override
  public String toString(){
    return "with energy label " + name;
  }

  public double getTax(){
    return tax;
  }
}
