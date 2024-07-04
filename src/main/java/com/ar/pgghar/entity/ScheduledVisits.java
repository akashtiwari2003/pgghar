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

    public ScheduledVisits() {
    }

    public ScheduledVisits(int visitId, Users user, int propertyId, LocalDate visitDate, LocalTime visitTime, VisitMode visitMode, Status status) {
        this.visitId = visitId;
        this.user = user;
        this.propertyId = propertyId;
        this.visitDate = visitDate;
        this.visitTime = visitTime;
        this.visitMode = visitMode;
        this.status = status;
    }

    public int getVisitId() {
        return visitId;
    }

    public void setVisitId(int visitId) {
        this.visitId = visitId;
    }

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }

    public int getPropertyId() {
        return propertyId;
    }

    public void setPropertyId(int propertyId) {
        this.propertyId = propertyId;
    }

    public LocalDate getVisitDate() {
        return visitDate;
    }

    public void setVisitDate(LocalDate visitDate) {
        this.visitDate = visitDate;
    }

    public LocalTime getVisitTime() {
        return visitTime;
    }

    public void setVisitTime(LocalTime visitTime) {
        this.visitTime = visitTime;
    }

    public VisitMode getVisitMode() {
        return visitMode;
    }

    public void setVisitMode(VisitMode visitMode) {
        this.visitMode = visitMode;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
