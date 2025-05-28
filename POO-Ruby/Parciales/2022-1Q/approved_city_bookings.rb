require_relative 'booking'
require_relative 'booking_exception'
require_relative 'fixed_city_bookings'
class ApprovedCityBookings < FixedCityBookings
  @approved

  def initialize(city, max, approved)
    super(city, max)
    @approved = approved
  end

  def book(attraction, day)
    raise BookingException, 'Attraction not approved' unless @approved.include?attraction
    super(attraction,day)
  end

end
