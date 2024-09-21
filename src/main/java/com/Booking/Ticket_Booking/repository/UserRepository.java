package com.Booking.Ticket_Booking.repository;

import com.Booking.Ticket_Booking.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {


}
