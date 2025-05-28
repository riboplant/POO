public class Person implements Comparable <Person> {

  private final String name;
  private final int age;

  public Person(String name, int age) {
       this.name = name;
       this.age = age;
  }

  public String getName(){
    return name;
  }

  public int getAge(){
    return age;
  }

  public compareTo(Person person){
    return name.compareTo(person.getName);
  }

}


