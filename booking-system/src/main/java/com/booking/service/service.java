package com.booking.service;

import com.booking.entity.Booking;
import com.booking.repository.BookingRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class service {

    private BookingRepository repository = null;

    public service(BookingRepository repository) {
        this.repository = repository;
    }

    public Booking save(Booking booking) {
        return repository.save(booking);
    }

    public List<Booking> findAll() {
        return repository.findAll();
    }
}
