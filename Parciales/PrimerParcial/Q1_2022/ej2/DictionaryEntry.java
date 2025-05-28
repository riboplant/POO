package Parciales.PrimerParcial.Q1_2022.ej2;

public class DictionaryEntry <T extends Comparable<? super T>>{
  private final T word;
  private final String description;

  public DictionaryEntry(T word, String description){
    this.word = word;
    this.description = description;
  }


  public int copareTo(DictionaryEntry<T> o){
    int cmp = word.compareTo(o.word);
    if(cmp == 0){
      cmp = description.compareTo(o.description);
    }
    return cmp;
  }

  public T getWord(){
    return word;
  }

  @Override
  public String toString(){
    return "{ " + word + " <> " + description + " }";
  }
}
