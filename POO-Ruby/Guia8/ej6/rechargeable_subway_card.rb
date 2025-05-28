require_relative 'subway_card'
class RechargeableSubwayCard < SubwayCard
  def initialize(central)
    create(central)
    @balance=0
  end

  def recharge(amount)
    raise 'Invalid amount' unless amount > 0
    @balance += amount
  end
  def cost
    @central.ride_cost
  end

  def ride
    raise 'Not enough funds' unless ride?
    @balance -= cost
  end

  private def ride?
    @balance >= cost
  end

  def to_s
    "Rechargeable #{super} [Balance: $#{@balance}]"
  end

end
