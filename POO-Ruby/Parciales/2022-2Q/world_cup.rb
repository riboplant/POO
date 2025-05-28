# frozen_string_literal: true

class WorldCup
  def initialize
    @groups = {}
  end

  def add_team(group, team)
    @groups[group] = {} unless @groups.key?(group)
    @groups[group][team] = TeamPosition.new(team)
  end

  def play_match(group, teamA, teamB, goalsA, goalsB)
    raise WorldCupError "Missing Group" unless @groups.key? group
    raise WorldCupError "Missing Team" unless @groups[group].key?(teamA) && @groups[group].key?(teamB)
    @groups[group][teamA].update(goalsA, goalsB)
    @groups[group][teamB].update(goalsB, goalsA)
    @groups[group].sort
  end

  def to_s
    s = "World Cup\n"
    @groups.values.each do |key|
      s+= "#{key}\n"
      s+= "Team\tP\tGF\tGC\n"
      @groups[key].values.each { |e| s+=e.to_s }
    end
    s
  end

end

class WorldCupError < StandardError
  def initialize(msg)
    super
  end
end