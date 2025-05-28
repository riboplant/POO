class SubwayCentral
  attr_reader :ride_cost
  def initialize(ride_cost)
    @ride_cost=ride_cost
  end

  def to_s
    "Subway Central [$#{@ride_cost}]"
  end

  def ride_cost=(amount)
    @ride_cost = amount
  end

end
