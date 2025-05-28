# frozen_string_literal: true

class Team
  attr_reader :name

  @name

  def initialize(name)
    @name=name
  end



  def ==(o)
    return false unless o.is_a? Team
    @name==o.get_name
  end

  def hash
    [@name].hash
  end

  def to_s
    @name
  end

  alias_method :eql?, :==

end
