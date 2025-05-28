# frozen_string_literal: true

class Point
  attr_reader :x, :y

  def initialize(x,y)
    @x=x
    @y=y
  end

  def to_s
    "{#{@x}, #{@y}}"
  end

  def distance(point)
    Math.sqrt((point.x - @x)**2 + (point.y - @y)**2)
  end

end
