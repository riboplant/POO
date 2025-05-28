class Item
  attr_reader :product, :amount
  def initialize(product, amount)
    @product=product
    @amount=amount
  end

  def add(amount)
    @amount+=amount
  end

  def to_s
    format("%s    %d    $%.2f\n", @product.name, @amount, @product.price)
  end

end