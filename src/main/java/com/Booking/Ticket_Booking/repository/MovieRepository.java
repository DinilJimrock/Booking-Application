package com.Booking.Ticket_Booking.repository;

import com.Booking.Ticket_Booking.models.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie, Long> {
}
