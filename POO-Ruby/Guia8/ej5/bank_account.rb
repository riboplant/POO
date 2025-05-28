# frozen_string_literal: true

class BankAccount

  def create(id)
    @id = id
    @balance=0
  end
  def initialize
    raise 'BankAccount is an abstract class'
  end

  def deposit(amount)
    @balance+= amount
  end

  def extract(amount)
    @balance -= amount unless extract? amount
  end

  def extract?(amount)
    raise'Undefined method extract?'
  end

  def to_s
    "Cuenta #{@id} con saldo #{@balance}"
  end

  private :create, :extract?

end
