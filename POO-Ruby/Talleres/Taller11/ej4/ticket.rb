require_relative 'item'
class Ticket
  NUMERATION_START = 1000
  @@numeration = NUMERATION_START - 1

  def initialize
    @id = Ticket.increment_and_get
    @items = Hash.new
  end

  def self.increment_and_get
    @@numeration += 1
  end

  def add(product, units)
    @items[product.description] = Item.new(product, 0) unless @items.key? product.description
    @items[product.description].units += units
  end


  def to_s
    s = "TICKET Nº #{@id}\n"
    s += "####################\n"
    @items.values.each { |item| s += "#{item}\n" }
    s += "####################\n"
    s + "TOTAL $#{format('%.2f', total)}"
  end

  def total
    ans = 0
    @items.values.each { |item| ans += item.total }
    ans
  end

end