package Parciales.PrimerParcial.Q1_2023.ej3;

public enum Warranty{

  BASICA(){
    @Override
    public double getSum(double pPrice){
      return 120.0;
    }
  },

  PREMIUM(){
    @Override
    public double getSum(double pPrice){
      return pPrice * 0.2;
    }
  };


  
  public double getSum(double pPrice);

}
