# frozen_string_literal: true

class Participant
  attr_reader :name, :dni
  def initialize(name, dni)
    @name = name
    @dni = dni
  end

  def ==(o)
    return false unless o.is_a?(Participant)
    (@dni == o.dni) && (@name == o.name)
  end

  def hash
    [@name, @dni].hash
  end

  alias_method :eql?, :==
end
