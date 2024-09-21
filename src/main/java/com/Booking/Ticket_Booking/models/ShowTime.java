package com.Booking.Ticket_Booking.models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.sql.Time;

@Entity
@Data
@Getter
@Setter
public class ShowTime {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "movie-name")
    private Movie movie;

    @ManyToOne
    @JoinColumn(name = "theater-id")
    private Theater theater;

    private Time showTime;
}
