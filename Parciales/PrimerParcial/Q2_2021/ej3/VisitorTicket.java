oublic class VisitorTicket extends Ticket{

  public VisitorTicket(int id, boolean isVisitor, int rides){
    super(id, isVisitor, rides);
  }
  
  @Override
  protected boolean canRide(Ride chair){
    return chair.vAllowed;
  }

  @Override
  public String toString(){
    return "Visitor " + super.toString();
  }

}
