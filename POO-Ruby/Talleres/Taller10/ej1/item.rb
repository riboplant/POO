class Item
  attr_reader :product, :amount
  def initialize(product, amount)
    @product=product
    @amount=amount
  end

  # def add(amount)
  #   @amount+=amount
  # end

end