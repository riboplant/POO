class Raffle
  include Comparable
  attr_reader :name, :prize
  def initialize(name, prize)
    @name=name
    @prize=prize
  end

  def ==(other)
    return false unless other.is_a?(Raffle)
    @name == other.name
  end

  def eql?(other)
    self.==(other)
  end

  def hash
    [@name, @prize].hash
  end

  def <=>(other)
    return nil unless other.is_a?(Raffle)
    cmp = other.prize <=> @prize
    cmp = @name <=> other.name if cmp.zero?
    cmp
  end

end