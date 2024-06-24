package com.ar.pgghar.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "amenities")
public class Amenities {

    @Id
    @Column(name = "amenity_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int amenityId;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;


    public Amenities() {
    }

    public Amenities(int amenityId, String name, String description) {
        this.amenityId = amenityId;
        this.name = name;
        this.description = description;
    }

    public int getAmenityId() {
        return amenityId;
    }

    public void setAmenityId(int amenityId) {
        this.amenityId = amenityId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
