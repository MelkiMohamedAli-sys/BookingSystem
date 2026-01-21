package com.booking.controller;

import com.booking.entity.Booking;
import com.booking.service.service;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/api/bookings")
public class BookingController {

    private final service service;

    public BookingController(service service) {
        this.service = service;
    }

    @PostMapping
    public Booking createBooking() {
        Booking booking = new Booking();
        booking.setBookingDate(LocalDate.now());
        booking.setStatus("CONFIRMED");
        return service.save(booking);
    }

    @GetMapping
    public List<Booking> getAllBookings() {
        return service.findAll();
    }
}
