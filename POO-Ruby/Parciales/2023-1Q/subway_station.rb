# frozen_string_literal: true

class SubwayStation
  include Comparable
  def initialize(name)
    @name = name
    @status = 'open'
  end


  def to_s
    "Subway Station #{name} is #{status}"
  end

  def open_station
    @status = 'open'
  end

  def close_station
    @status = 'closed'
  end

  def <=> (o)
    return nil unless o.is_a? SubwayStation
    @name <=> o.name
  end

  attr_reader :name
end
