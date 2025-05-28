require_relative 'item'
require 'set'
class Ticket
  @@index = 1000
  def initialize
    @items = Set.new
    @number = @@index
    @@index+=1
  end

  def add(product, amount)
    @items.add(Item.new(product, amount))
  end

  def total
    total=0
    @items.each { |e| total += e.product.price * e.amount }
    total
  end

  def to_s
    ticket = format("#   TICKET   N    %d\n##################\n", @number)
    @items.each do |e|
      ticket += e.to_s
    end
    ticket += format("####################\n#   TOTAL   $%.2f\n", total)
  end

end
