# frozen_string_literal: true

class Product
  attr_reader :name, :price
  def initialize(name, price)
    @name=name
    @price=price
  end

  def ==(other)
    return false unless other.is_a? Product
    @name==other.name and @price==other.price
  end

  def eql?(other)
    self.==(other)
  end

  def hash
    [@name, @price].hash
  end

  # alias_method :eql?, :==
end
