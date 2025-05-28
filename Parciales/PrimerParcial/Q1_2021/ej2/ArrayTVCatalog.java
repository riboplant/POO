package Parciales.PrimerParcial.Q1_2021.ej2;

import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class ArrayTVCatalog implements TVCatalog {

  private static final int INIT_DIM = 5;
  private TVShow[] array = new TVShow[INIT_DIM];
  private int dim;
  private double min = 0.0;
  private double max = 10.0;

  public ArrayTVCatalog addTVShow(String name, double rating){
    TVShow element = new TVShow(name, rating);
    if(dim == array.length){
      resize();
    }
    array[dim++] = element;
    return this;
  }

  private void resize(){
    array = Arrays.copyOf(array, dim + 1);
  }

  @Override
  public void setRatingRange(double min, double max){
    this.min = min;
    this.max = max;
  }
  
  @Override
  public Iterator<TVResponse> iterator(){
    return new Iterator<>(){
      double nmin = min;
      double mnax = max;
      int current;
      @Override 
      public boolean hasNext(){
        return current < dim;
      }

      @Override
      public TVResponse next(){
        if(!hasNext()){
          throw new NoSuchElementException();
        }
        TVShow elem = array[current++];
        double r = elem.getRating();
        return new TVResponse(elem, r, ((r >= nmin) && (elem.getRating() <= mnax)));
      }
    };
  }

}
