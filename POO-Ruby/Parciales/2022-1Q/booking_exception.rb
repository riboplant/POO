# frozen_string_literal: true

class BookingException< StandardError
  def initialize(msg)
    super(msg)
  end
end
