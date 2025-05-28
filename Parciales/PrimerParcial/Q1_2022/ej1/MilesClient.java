package Parciales.PrimerParcial.Q1_2022.ej1;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class MilesClient implements Iterable<String>{

  private MilesPlan mp;
  private String name;
  private int months;

  public MilesClient(String name, int months, MilesPlan mp){
    this.name = name;
    this.months = months;
    this.mp = mp;
  }

  @Override
  public Iterator<String> iterator(){
    return new Iterator<String>(){
      private String nname = name;
      private int current;
      private final int miles = mp.getMiles();
      private final int extraMiles = mp.getExtraMiles();
      private final double cost = mp.getCost();
      private final int monthLimit = months;

      private final int monthProm = mp.getMonthProm();

      private int totalMiles(int month){
        return miles + ((month < monthProm)? extraMiles : 0);
      }

      @Override
      public boolean hasNext(){
        return current < monthLimit;
      }

      @Override
      public String next(){
        if(!hasNext()){
          throw new NoSuchElementException();
        }
        return "Client " + nname + ": Month " + (current+1) + " earned " + totalMiles(current++) + " miles for $" + cost;
      }

    };

  }

}
