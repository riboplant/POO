require 'sorted_set'

class CityBookings
  def initialize(city)
    @city = city
    @bookings = SortedSet.new
  end

  def book(attraction, day)
    @bookings << Booking.new(attraction, day)
  end

  attr_reader :city, :bookings
end
