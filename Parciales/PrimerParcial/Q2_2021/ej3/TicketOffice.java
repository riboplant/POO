public class TicketOffice{
  private static final in INIT_ID = 1000;
  private static int id = INIT_ID;

  public Ticket buySkiTicket(int amount){
    return new SkiTicket(++id, false, amount);
  }

  public Ticket buyVisitorTicket(int amount){
    return new VisitorTicket(++id, true, amount)
  }

  public void ride(Ticket ticket, Ride ride){
    ticket.ride(ride);
  }
}
