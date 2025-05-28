# frozen_string_literal: true

class Product
  attr_reader :name, :price
  def initialize(name, price)
    @name=name
    @price=price
  end

  def ==(other)
    false unless other.is_a? Item
    @name==other.name and @price==other.price
  end
end
