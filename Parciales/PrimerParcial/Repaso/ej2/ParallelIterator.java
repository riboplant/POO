package Parciales.PrimerParcial.Repaso.ej2;
import java.util.Iterator;

public class ParallelIterator<T> implements Iterator<ParallelIterator.Pair<T>> {

  private final T[] array1, array2;
  private int current;

  public ParallelIterator<T>(T[] array1, T[] array2){
    if(array1 == null)
      throw new RuntimeException("First collection missing");
    if(array2 == null)
      throw new RuntimeException("Second collection missing");

    this.array1 = array1;
    this.array2 = array2;
  }

  @Override
  public boolean hasNext(){
    return (array1.length > current) && (array2.length > current);
  }

  @Override
  public T[] next(){
    if(!hasNext())
      throw new NoSuchElementException();
    Pair<T> toReturn = new Pair<>(array1[current], array2[current++]);
    return toReturn;
  }

  public static class Pair<E>{

    private final E elem1, elem2;

    public Pair<E>(E elem1, elem2){
      this.elem1 = elem1;
      this.elem2 = elem2;
    }

    @Override
    public String toString(){
      return "{" + elem1 + "," + elem2 + "}";
    }

  }

}
