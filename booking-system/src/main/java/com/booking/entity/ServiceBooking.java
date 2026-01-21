package com.booking.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class ServiceBooking {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;

private String title;
private double price;
private boolean available;
}
