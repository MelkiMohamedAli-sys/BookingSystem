package com.booking.entity;
import java.time.LocalDate;

import jakarta.persistence.*;

import lombok.Data;

@Data
@Entity
public class Booking {
@Id

@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;

@ManyToOne
private User user;

@ManyToOne
private ServiceBooking service;

private LocalDate bookingDate;
private String status;
}
