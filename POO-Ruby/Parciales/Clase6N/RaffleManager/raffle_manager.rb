require_relative 'participant'
require_relative 'raffle'

class RaffleManager

  def initialize
    @participants_by_raffle = Hash.new { [] }
  end

  def enter_raffle(raffle, participant)
    raise ArgumentError ,'Participant already in raffle' if @participants_by_raffle[raffle].include? participant
    @participants_by_raffle[raffle] = @participants_by_raffle[raffle] << participant
  end


  def raffles
    return 'Raffle Manager is empty' if @participants_by_raffle.keys.empty?
    s = "Raffle Manager\n"
    @participants_by_raffle.keys.sort.each do |raffle|
      s += "#{raffle}:\n"
      @participants_by_raffle[raffle].each do |participant|
        s += "+ #{participant}\n"
      end
    end
    s
  end

  def exit_raffle(raffle, participant)
    raise ArgumentError, "Raffle #{raffle.name} not exists" unless @participants_by_raffle.key?(raffle)
    @participants_by_raffle[raffle].delete(participant)
  end

end





