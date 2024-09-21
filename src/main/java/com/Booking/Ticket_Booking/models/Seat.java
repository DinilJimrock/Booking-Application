package com.Booking.Ticket_Booking.models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Data
@Getter
@Setter
public class Seat {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String seatNumber;
    private Boolean isAvailable = true;

    @ManyToOne
    @JoinColumn(name = "showtime_id")
    private ShowTime showTime;

}
