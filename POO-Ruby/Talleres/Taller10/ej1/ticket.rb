require_relative 'item'
class Ticket
  @@index = 1000
  def initialize
    @items = []
    @number = @@index
    @@index+=1
  end

  def add(item, amount)
    @items<< Item.new(item, amount)
  end

  def total
    total=0
    @items.each { |e| total += e.product.price * e.amount }
    total
  end

  def to_s
    ticket = format("#   TICKET   N    %d\n##################\n", @number)
    @items.each do |e|
      ticket += format("%s   %d   $%.2f\n",e.product.name, e.amount, e.product.price )
    end
    ticket += format("####################\n#   TOTAL   $%.2f\n", total)
  end

end
