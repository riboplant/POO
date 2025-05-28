# frozen_string_literal: true

class ComplexNumber
  attr_reader :real, :imaginary

  def initialize (a, b)
    @real=a
    @im=b
  end

  def real
    @real
  end

  def imaginary
    @im
  end

  def +(other)
    ComplexNumber.new(@im + other.real, @im + other.imaginary)
  end

  def to_s
    "#{@real} #{@imaginary.positive? ? '+' : '-'} #{@imaginary.abs}i"
  end
end