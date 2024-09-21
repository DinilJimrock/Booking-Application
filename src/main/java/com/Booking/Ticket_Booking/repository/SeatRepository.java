package com.Booking.Ticket_Booking.repository;

import com.Booking.Ticket_Booking.models.Seat;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SeatRepository extends JpaRepository<Seat, Long> {
    Optional<Seat> findById(Long id);
}
