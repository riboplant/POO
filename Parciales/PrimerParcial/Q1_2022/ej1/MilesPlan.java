package Parciales.PrimerParcial.Q1_2022.ej1;

public enum MilesPlan{

  CLUB1000(1000, 950.0, 0, 0),
  CLUB2000(2000, 1750.0, 1000, 2),
  CLUB5000(5000, 4400, 2500, 5),
  CLUB10000(10000, 14400, 10000, 6);

  private int miles, extraMiles, monthProm;
  private double cost;

  MilesPlan(int miles, double cost, int extraMiles, int monthProm){
    this.miles = miles;
    this.cost = cost;
    this.extraMiles = extraMiles;
    this.monthProm = monthProm;
  }

  public double getCost(){
    return cost;
  }

  public int getMiles(){
    return miles;
  }

  public int getExtraMiles(){
    return extraMiles;
  }

  public int getMonthProm(){
    return monthProm;
  }

}
