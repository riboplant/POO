require_relative '../ej3/point'

class Figure
  def initialize
    raise 'Figure is an abstract class'
  end

  def perimeter
    raise 'Undefined method perimeter'
  end

  def area
    raise 'Undefined method area'
  end

end
