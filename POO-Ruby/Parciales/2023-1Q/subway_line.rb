# frozen_string_literal: true

class SubwayLine
  def initialize(letter)
    @letter = letter
  end


  def to_s
    "Subway Line #{letter}"
  end

  def ==other
    return false unless other is_a? SubwayLine
    other.letter == @letter
  end

  def hash
    [@letter].hash
  end

  def <=>(o)
    return nil unless o.is_a? SubwayLine
    @letter <=> o.letter
  end

  attr_reader :letter
  alias_method :eql?, :==
end
