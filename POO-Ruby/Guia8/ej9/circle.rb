# frozen_string_literal: true

class Circle < Ellipse
  def initialize(p, r)
    super(p, r, r)
  end

  def to_s
    "Círculo [Centro: #{@p} , Radio: #{@r1 / 2}]"
  end

  def ==(other)
    false unless other.is_a? Ellipse
    @p==other.p and @r1==other.r1 and r2==other.r2
  end

  protected
  attr_reader :p, :r1, :r2

end
