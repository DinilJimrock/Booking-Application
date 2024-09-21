package com.Booking.Ticket_Booking.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {
    @Autowired
    private BookingService bookingService;

    public String initiatePayment(Long bookingId, Double amount) throws Exception {
        if(amount <= 0) {
            return "Invalid Amount";
        }
        boolean paymentSuccess = processPayment(bookingId, amount);
        if (paymentSuccess) {
            bookingService.updateBookingStatus(bookingId, "PAID");
            return "Payment of " + amount + " for booking ID " + bookingId + " has been successfully processed.";
        } else {
            bookingService.updateBookingStatus(bookingId, "FAILED");
            return "Payment of " + amount + " for booking ID " + bookingId + " has failed.";
        }
    }

    private boolean processPayment(Long bookingId, Double amount) {
        // Simulated payment processing
        return true;
    }
}
