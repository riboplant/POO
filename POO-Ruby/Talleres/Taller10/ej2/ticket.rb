require_relative 'item'
class Ticket
  @@index = 1000
  def initialize
    @items = []
    @number = @@index
    @@index+=1
  end

  def add(product, amount)
    v = false
    i = 0
    @items.each do |e|
      v = true unless e.product==product
      i+=1 unless v
    end

    i = @items.size unless v

    @items<< Item.new(product, 0) unless v
    @items[i].add(amount)
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
