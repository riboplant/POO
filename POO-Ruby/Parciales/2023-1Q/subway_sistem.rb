require_relative 'subway_line'
require_relative 'subway_station'
require 'sorted_set'
class SubwaySistem
  @name
  @system

  def initialize(name)
    @name = name
    @system = {}
  end

  def add_station(letter, station_name)
    line = SubwayLine.new letter
    @system[line] = SortedSet.new unless @system.key? line
    station = SubwayStation.new station_name
    @system[line].add station
  end

  def lines
    @system.keys
  end

  def stations(letter)
    line = SubwayLine.new(letter)
    @system[line]
  end

  def open_station(letter, station_name)
    s = SubwayStation.new station_name
    a = stations(letter)
    a.map { |e| e.open_station unless !e==s }
  end

  def close_station(letter, station_name)
    s = SubwayStation.new station_name
    a = stations(letter)
    a.map { |e| e.close_station unless !e==s }
  end

end
