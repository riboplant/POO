package Parciales.PrimerParcial.Q1_2022.ej2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Predicate;
import java.util.Comparator;


public class Dictionary<T extends Comparable<? super T>>{
  private static final int INIT_DIM = 5;
  private DictionaryEntry<T>[] elems = new DictionaryEntry[INIT_DIM];
  private int dim;

  public Dictionary<T> addEntry(T word, String description){
    if(dim == elems.length){
      resize();

    }
    elems[dim++] = new DictionaryEntry(word, description);
    return this;
  }

  private void resize(){
    elems = Arrays.copyOf(elems, dim + 1);
  }

  public DictionaryEntry[] getCopy(
  Comparator<T> cmp){
    DictionaryEntry<? super T>[] copy = Arrays.copyOf(elems, dim);
    //Arrays.sort(copy, cmp);
    return copy;
  }

  public DictionaryEntry[] getNaturalOrderCopy(){
    return getCopy(Comparator.naturalOrder());
  }

  public DictionaryEntry[] getReverseOrderCopy(){
    return getCopy(Comparator.reverseOrder());
  }

  public DictionaryEntry<T> getfirstMatch(Predicate<T> predicate){
    for(int i=0; i<dim; i++){
      if(predicate.test(elems[i].getWord())){
        return elems[i];
      }
    }
    throw new IllegalArgumentException();
  }

}
