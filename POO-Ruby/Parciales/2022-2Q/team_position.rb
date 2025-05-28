# frozen_string_literal: true

class TeamPosition
  include Comparable

  protected attr_reader :points, :goals_by_team, :goals_on_team, :team

  @team
  @points
  @goals_by_team
  @goals_on_team

  def initialize(team)
    @team=team
    @points=0
    @goals_by_team=0
    @goals_on_team=0
  end

  def update(goals_by, goals_on)
    @goals_by_team += goals_by
    @goals_on_team += goals_on
    @points += 3 if goals_by > goals_on
    @points +=1 if goals_by == goals_on
  end

  def <=>(o)
    return nil unless o.is_a?TeamPosition
    c = @points <=> o.points
    c = @goals_by_team <=> o.goals_by_team if c.zero?
    c = o.goals_on_team <=> @goals_on_team if c.zero?
    c = @team.name <=> o.team.name if c.zero?
    c
  end

  def to_s
    "#{@team.name}\t#{@points}\t#{@goals_by_team}\t#{@goals_on_team}\n"
  end

end
