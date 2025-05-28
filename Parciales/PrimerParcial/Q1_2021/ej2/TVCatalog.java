package Parciales.PrimerParcial.Q1_2021.ej2;

public interface TVCatalog extends Iterable<TVResponse>{

   TVCatalog addTVShow(String name, double rating);

   void setRatingRange(double min, double max);

}


