public class StockInventory implements Iterable <StockProduct> {

  private StockProduct[] array = new StockProduct[0];
  private int dim;
  private Predicate<Integer> predicate = new Predicate<>{
    @Override
    public boolean test(Integer stock){
      return stock <= 1;
    }
  }
  
  public StockInventory add(String name, int stock){
    StockProduct newProduct = new StockProduct(name, stock);
    resize();
    array[dim++] = newProduct;
    return this;
  }

  private void resize(){
    array = Arrays.copyOf(array, dim + 1);
  }

  private StockProduct find(String name){
    int cmp;
    for(int i=0; i < dim; i++){
      cmp = name.compareTo(array[i].getProduct());
      if(cmp == 0)
        return array[i];
    }
    return null;
  }

  public StockInventory reducestock(String name){
    StockProduct item = find(name);
    if (item == null)
      throw new IllegalArgumentException("No product find with name " + name)
    item.reduceStock();
    return this;
  }

  public Iterator <StockResult> iterator(){
    return new Iterator
  }

  public StockInventory setMinimumStock(Predicate<Integer> condition){
    this.predicate = condition;
    return this;
  }

  private class StockResultIterator implements Iterator<StockResult> {
    private int current;
    private finale Predicate<Integer> stockAlert = predicate;
    @Override
    public boolean hasNext(){
      return current < dim;
    }
    @Override
    public StockResult next(){
      if(!hasNext())
        throw new NoSuchElementException();
      String aux = array[current].getProduct();
      return new StockResult(array[current], stockAlert(array[current++].getStock()))
    }
  }
}
