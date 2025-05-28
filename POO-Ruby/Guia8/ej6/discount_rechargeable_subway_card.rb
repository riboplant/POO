require_relative 'rechargeable_subway_card'
class DiscountRechargeableSubwayCard < RechargeableSubwayCard
  def initialize(central, discount)
    super central
    @discount = discount
  end

  def cost
    super*(1-@discount)
  end


end