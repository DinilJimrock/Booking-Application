package com.Booking.Ticket_Booking.controller;

import com.Booking.Ticket_Booking.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/payments")
public class PaymentController {
    @Autowired
    private PaymentService paymentService;

    @PostMapping("/pay")
    public ResponseEntity<?> payForBooking(@RequestParam Long bookingID, @RequestParam Double amount) {
        if(bookingID == null || amount == null || amount <= 0 ) {
            return ResponseEntity.badRequest().body("Invalid Booking ID");
        }
        try {
            String paymentResponse = paymentService.initiatePayment(bookingID, amount);
            return ResponseEntity.ok(paymentResponse);
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }
}
