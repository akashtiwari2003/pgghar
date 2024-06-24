package com.ar.pgghar.entity;

import com.ar.pgghar.enums.OccupancyType;
import jakarta.persistence.*;

@Entity
@Table(name = "properties")
public class Properties {
    @Id
    @Column(name="ocupancy_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int occupancyId;

    @Column(name="property_id")
    private int propertyId;

    @Column(name="occupancy_type")
    private OccupancyType occupancyType;

    @Column(name="price")
    private double price;

    @Column(name="total_capacity")
    private int totalCapacity;

    @Column(name="available_capacity")
    private int availableCapacity;
}
