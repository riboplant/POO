public class MatchIterator <T> implements Iterator <MatchElement<T>>{
  private T[] element;
  private Predicate<t> predicate;
  private int currentIndex;

  public MatchIterator(T[] element, Predicate<T> predicate){
    this.element = element;
    this.predicate = predicate;
  }

  @Override
  public boolean hasNext(){
    return !(currentIndex >= element.lenght());
  }

  @Override
  public MatchElement next(){
    if(!hasNext())
      throw new NoSuchElementException();
   MatchElement toReturn = new MatchElement<T>(Element[currentIndex], predicate.test(Element[currentIndex]));
   currentIndex++;
   return toReturn;
  }

}
