# frozen_string_literal: true

class Circle < Ellipse
  def initialize(p, r)
    super(p, r, r)
  end

  def to_s
    "Círculo [Centro: #{@p} , Radio: #{@r1 / 2}]"
  end

end
