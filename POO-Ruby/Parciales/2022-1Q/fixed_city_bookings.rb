require_relative 'booking'
require_relative 'booking_exception'
require_relative 'city_bookings'
class FixedCityBookings < CityBookings
  @current
  @max
  def initialize(city, max)
    super(city)
    @max=max
    @current=0
  end

  def book(attraction, day)
    raise BookingException, 'Reached Max' unless @current <= @max
    super(attraction,day)
    @current += 1
  end

end


