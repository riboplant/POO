public enum Ride{

AMANCAY( "Amancay", false ),
HORSETOOTH( "Horsetooth", true ),
SIXFOLD( "Sixfold", false );


  private String name;
  private boolean visitorAllowed;

  public Ride(String name, boolean visitorAllowed){
    this.name = name;
    this,visitorAllowed = visitorAllowed;
  }

  public boolean vAllowed(){
    return visitorAllowed;
  }

}
