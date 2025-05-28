class Item
  attr_accessor :units

  def initialize(product, units)
    @product = product
    @units = units
  end



  def total = @product.unit_price * @units

  def <=>(o)
    return nil unless o.is_a?(Item)
    [@product.unit_price, @product.description] <=> [o.product.unit_price, o.product.description]
  end

  def to_s
    "#{format('%-15s', @product.description)}\t#{@units}\t$#{format('%.2f', @product.unit_price)}"
  end

  def ==(other)
    return false unless other.is_a?(Item)
    @product == other.product
  end

  protected

  attr_reader :product
end
