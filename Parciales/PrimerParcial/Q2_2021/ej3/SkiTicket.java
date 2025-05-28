public class SkiTicket extends Ticket{

  public SkiTicket(int id, boolean isVisitor, int rides){
    super(id, isVisitor, rides);
  }

  @Override
  protected boolean canRide(Ride chair){
    return true;
  }

  @Override
  public String toString(){
    return "Ski " + super.toString();
  }
}
