# frozen_string_literal: true

class Ellipse < Figure

  def initialize(p, r1, r2)
    @p=p
    @r1=r1
    @r2=r2
  end

  def area
    Math::PI / 2 * @r1 * @r2
  end

  def perimeter
    Math::PI / 2 * (@r1 + @r2)
  end

  def to_s
    "Elipse [Centro: #{@p}, DMayor: #{@r1}, DMenor: #{@r2}]"
  end

end
