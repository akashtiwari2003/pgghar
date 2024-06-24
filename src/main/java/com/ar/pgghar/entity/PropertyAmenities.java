package com.ar.pgghar.entity;

import com.ar.pgghar.enums.OccupancyType;
import jakarta.persistence.*;

@Entity
@Table(name = "property_amenities")
public class PropertyAmenities {
    @Id
    @Column(name="property_id")
    private int propertyId;

    @Id
    @Column(name="amenity_id")
    private int amenityId;

}
