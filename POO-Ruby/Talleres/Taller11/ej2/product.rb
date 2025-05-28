# frozen_string_literal: true
class Product
  attr_reader :description, :unit_price

  def initialize(description, unit_price)
    @description = description
    @unit_price = unit_price
  end

  def ==(other)
    return false unless other.is_a?(Product)
    @description == other.description && @unit_price == other.unit_price
  end
end