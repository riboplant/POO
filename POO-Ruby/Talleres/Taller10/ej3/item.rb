require_relative 'product'
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

  def ==(other)
    return false unless other.is_a? Item
    @product==other.product
  end

  def eql?(other)
    self.==(other)
  end

  def hash
    [@product].hash
  end

  # alias_method :eql?, :==

end