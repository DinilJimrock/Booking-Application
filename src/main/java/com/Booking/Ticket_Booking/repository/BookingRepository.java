package com.Booking.Ticket_Booking.repository;

import com.Booking.Ticket_Booking.models.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository extends JpaRepository<Booking, Long> {
}
