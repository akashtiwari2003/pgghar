package com.ar.pgghar.entity;

import com.ar.pgghar.enums.Status;
import com.ar.pgghar.enums.VisitMode;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name = "scheduled_visits")
public class ScheduledVisits {

    @Id
    @Column(name = "visit_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int visitId;

    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "user_id")
    @JsonIgnore
    private Users user;

    @Column(name = "property_id")
    private int propertyId;

    @Column(name = "visit_date")
    private LocalDate visitDate;

    @Column(name = "visit_time")
    private LocalTime visitTime;

    @Column(name = "visit_mode")
    private VisitMode visitMode;

    @Column(name = "status")
    private Status status;
}
