public class Directory {
  private final int dim;
  private Person[] array;

  public Directory(int dim){
    this.dim = dim;
  }

  public Directory addPerson(Person person){
    if(array.length >= dim)
      throw new ReachedLimitException;
    Person[dim + 1] newArray;
    System.arraycopy(array, 0, newArray, 0, dim);
    newArray[dim] = person;
    array = newArray;
    return this;
  }
  
  public Person[] persons(Comparator<Person> cmp){
    Person[] newArray = Arrays.copyOf(array, dim);
    Arrays.sort(newArray, cmp);
    return newArray;
  }

  public Person[] persons(){
    return persons(Comparator.naturalOrder());
  }

}
