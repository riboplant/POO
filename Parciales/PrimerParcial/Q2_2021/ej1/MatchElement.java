public class MatchElement <T> {

  private final T element;
  boolean final value;

  public MatchElement(T element, boolean value){
    this.element = element;
    this.value = value;
  }

  public boolean matches(){
    return value;
  }

  @Override 
  public String toString(){
    return (value == true)? (element.toString() + " : Match\n") : (element.toString() + " : No Match\n");
  }

}
