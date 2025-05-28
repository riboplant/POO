public class AscendingAgeDirectory extends Directory {

  public AscendingAgeDirectory(int dim){
    super(dim);
  }

  @Override
  public Person[] persons(){
    return persons((o1, o2) -> {
      int dif = Integer.compare(o1.getAge(), o2.getAge());
      if(dif == 0)
        return o1.getname().compareTo(o2.getName());
      return dif;
    });

  }
}
