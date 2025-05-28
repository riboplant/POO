package Parciales.PrimerParcial.Q1_2021.ej1;

import java.util.Arrays;
import java.util.Comparator;

public class Inventory{

  private Item[] items;
  
  public Inventory(Item[] items){
    this.items = items;
  }

  private Item[] getItemsCopy(){
    return Arrays.copyOf(items, items.length);
  }

  public Item[] getItems(){
    Item[] set = getItemsCopy();
    Arrays.sort(set, Comparator.naturalOrder());
    return set;
  }

  public Item[] getItems(Comparator<Item> cmp){
    Item[] set = getItemsCopy();
    Arrays.sort(set, cmp);
    return set;
  }
}
