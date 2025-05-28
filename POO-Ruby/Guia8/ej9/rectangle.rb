
class Rectangle < Figure

  def initialize(p1, p2)
    @p1=p1
    @p2=p2
  end

  def base
    (@p1.x - @p2.x).abs
  end

  def height
    (@p1.y - @p2.y).abs
  end

  def perimeter
    2*base + 2*height
  end

  def area
    base * height
  end

  def to_s
    "Rectángulo [ #{@p1} , #{@p2} ]"
  end

  def ==(other)
    return false unless other.is_a? Rectangle
    @p1 == other.p1 && @p2 == other.p2
  end

  protected
  attr_reader :p1, :p2

end
