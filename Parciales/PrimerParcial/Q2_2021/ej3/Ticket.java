public abstract class Ticket{

  private final int id;
  private final boolean isVisitor;
  private int rides;

  public Ticket(int id, boolean isVisitor, int rides){
    if(amount <= 0)
      throw new IllegalArgumentException();
    this.id = id;
    this.isVisitor = isVisitor;
    this.rides = rides;
  }

  public boolean isVisitor(){
    return isVisitor;
  }

  protected boolean canRide(Ride chair){}

  private boolean hasRidesLeft(){
    return rides > 0;
  }

  public void ride(Ride chair){
    if(!hasRidesLeft())
      throw new RuntimeException("No more rides for ticket");
    if(!canRide(chair))
      throw new RuntimeException("Invalid chairlift for ticket");
    rides--;
  }
  @Override
  public String toString(){
    return "Ticket " + id + " has " + rides + " rides left\n";
  }

}
