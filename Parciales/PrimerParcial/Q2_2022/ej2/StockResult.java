public class StockResult{
  private static final String ok = " <> Stock OK";
  private static final String alert = " <> Low Stock!";

  private final StockProduct product;
  private boolean check;

  public StockResult(StockProduct product, boolean check){
    this.product = product;
    this.check = check;
  }

  @Override
  public String toString(){
    return (check) ? ( product + alert) : ( product + ok);
  }
}
