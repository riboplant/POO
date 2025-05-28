public class DescendingNameDirectory extends Directory{

  public DescendingNameDirectory(int dim){
    super(dim);
  }

  @Override
  public Person[] persons(){
    return persons(Comparator.reverseOrder());
  }
}
