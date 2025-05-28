require_relative 'subway_card'
class FixedSubwayCard < SubwayCard

  def initialize(central, rides)
    create central
    @rides=rides
  end

  private def ride?
    @rides >= 1
  end

  def ride
    raise 'Not more rides available' unless ride?
    @rides-= 1
  end

  def to_s
    "Fixed #{super} [Rides: #{@rides}]"
  end

end
