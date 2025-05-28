# frozen_string_literal: true

class Gear
  def initialize(a,b,c,d)
    @chainring=a
    @cog=b
    @rim=c
    @tyre=d
  end

  def ratio
    @chainring/@cog.to_f
  end

  def diameter
    @rim + 2* @tyre
  end

  def gear_inches
    ratio*diameter
  end

end
