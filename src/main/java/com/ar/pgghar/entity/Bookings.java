package com.ar.pgghar.entity;

import com.ar.pgghar.enums.Status;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "bookings")
public class Bookings {
    @Id
    @Column(name = "booking_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int bookingId;

    @Column(name="user_id")
    private int userId;

    @Column(name="property_id")
    private int propertyId;

    @Column(name="booking_date")
    private LocalDate bookingDate;

    @Column(name="start_date")
    private LocalDate startDate;

    @Column(name="end_date")
    private LocalDate endDate;

    @Column(name="status")
    private Status status;
}
