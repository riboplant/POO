require_relative 'subway_central'
class SubwayCard
  def initialize
    raise 'Subway Card is an abstract class'
  end

  def create(central)
    @central=central
  end

  def ride
    raise 'Undefined method ride'
  end

  def ride?
    raise 'Undefined method ride?'
  end

  def to_s
    "Subway Card [Central: #{@central}]"
  end

  private :ride?, :create

end
