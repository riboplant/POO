package Parciales.PrimerParcial.Q1_2021.ej2;

public class TVResponse{

  private final TVShow show;
  private final double rating;
  private final boolean check;
  private static final String CUMPLE = " In Range";
  private static final String NOCUMPLE = " Out of Range";

  public TVResponse(TVShow show, double rating, boolean check){
    this.show = show;
    this.rating = rating;
    this.check = check;
  }

  @Override
  public String toString(){
    return show + ((check) ? CUMPLE : NOCUMPLE);
  }

}
