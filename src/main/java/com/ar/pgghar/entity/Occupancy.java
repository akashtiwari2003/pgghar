package com.ar.pgghar.entity;

import com.ar.pgghar.enums.OccupancyType;
import jakarta.persistence.*;

@Entity
@Table(name = "occupancy")
public class Occupancy {
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

    public Occupancy() {
    }

    public Occupancy(int occupancyId, int propertyId, OccupancyType occupancyType, double price, int totalCapacity, int availableCapacity) {
        this.occupancyId = occupancyId;
        this.propertyId = propertyId;
        this.occupancyType = occupancyType;
        this.price = price;
        this.totalCapacity = totalCapacity;
        this.availableCapacity = availableCapacity;
    }

    public int getOccupancyId() {
        return occupancyId;
    }

    public void setOccupancyId(int occupancyId) {
        this.occupancyId = occupancyId;
    }

    public int getPropertyId() {
        return propertyId;
    }

    public void setPropertyId(int propertyId) {
        this.propertyId = propertyId;
    }

    public OccupancyType getOccupancyType() {
        return occupancyType;
    }

    public void setOccupancyType(OccupancyType occupancyType) {
        this.occupancyType = occupancyType;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getTotalCapacity() {
        return totalCapacity;
    }

    public void setTotalCapacity(int totalCapacity) {
        this.totalCapacity = totalCapacity;
    }

    public int getAvailableCapacity() {
        return availableCapacity;
    }

    public void setAvailableCapacity(int availableCapacity) {
        this.availableCapacity = availableCapacity;
    }
}
