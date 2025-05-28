# frozen_string_literal: true

class Booking
  include Comparable
  @attraction
  @day
  attr_reader :attraction, :day

  def initialize(attraction, day)
    @attraction=attraction
    @day=day
  end

  def inspect
    "Booking for #{@attraction} on the day #{@day}"
  end

  def <=>(o)
    return nil unless o.is_a?Booking
    [@attraction,@day]<=>[o.attraction,o.day]
  end

end
