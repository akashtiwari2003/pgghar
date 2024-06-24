package com.ar.pgghar.entity;

import com.ar.pgghar.enums.AvailabilityStatus;
import com.ar.pgghar.enums.OccupancyType;
import com.ar.pgghar.enums.PropertyType;
import jakarta.persistence.*;

@Entity
@Table(name = "properties")
public class Properties {
    @Id
    @Column(name="property_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int propertyId;

    @Column(name="property_type")
    private PropertyType propertyType;

    @Column(name="title")
    private String title;

    @Column(name="description")
    private String price;

    @Column(name="address")
    private String address;

    @Column(name="city")
    private String city;

    @Column(name="state")
    private String state;

    @Column(name="zip_code")
    private String zip_code;

    @Column(name="latitude")
    private double latitude;

    @Column(name="longitude")
    private double longitude;

    @Column(name="owner_id")
    private int ownerId;

    @Column(name="availability_status")
    private AvailabilityStatus availabilityStatus;

    @Column(name="deposit")
    private double deposit;

}
