package com.Booking.Ticket_Booking.service;

import com.Booking.Ticket_Booking.models.Booking;
import com.Booking.Ticket_Booking.models.Seat;
import com.Booking.Ticket_Booking.repository.BookingRepository;
import com.Booking.Ticket_Booking.repository.SeatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BookingService {
    @Autowired
    private SeatRepository seatRepository;


    @Autowired
    private BookingRepository bookingRepository;


    public Booking bookSeat(Long seatId, Long user) throws Exception {
        Optional<Seat> optionalSeat = seatRepository.findById(seatId);
        if(optionalSeat.isPresent()) {
            Seat seat = optionalSeat.get();

            if(seat.getIsAvailable()) {
                Booking booking = new Booking();
                booking.setSeat(seat);
                booking.setUser(user);
                return booking;
            } else {
                throw new Exception("Seat already Booked");
            }
        } else {
            throw new Exception("Seat not found");
        }
    }

    public void updateBookingStatus(Long bookingId, String failed) {
    }
}
