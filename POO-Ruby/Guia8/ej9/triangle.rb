# frozen_string_literal: true

class Triangle < Figure

  def initialize(p1, p2, p3)
    @p1=p1
    @p2=p2
    @p3=p3
  end

  def perimeter
    segment1_2 + segment2_3 + segment3_1
  end

  def area
    semiperimiter = (segment1_2 + segment2_3 + segment3_1) / 2
    Math.sqrt(semiperimiter * (semiperimiter - segment1_2) * (semiperimiter - segment2_3) * (semiperimiter - segment3_1))
  end

  def to_s
    "Triángulo [ #{@p1} , #{@p2} , #{@p3} ]"
  end

  def ==(other)
    false unless other.is_a? Triangle
    @p1==other.p1 and @p2==p2 and @p3==p3
  end

  protected
  attr_reader :p1, :p2, :p3

  private
  def segment1_2
    @p1.distance @p2
  end
  def segment2_3
    @p2.distance @p3
  end
  def segment3_1
    @p3.distance @p1
  end
end
