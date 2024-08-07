package com.ar.pgghar.entity;

import com.ar.pgghar.enums.OccupancyType;
import jakarta.persistence.*;

@Entity
@Table(name = "property_amenities")
@IdClass(PropertyAmenitiesCompositeKey.class)
public class PropertyAmenities {
    @Id
    @Column(name="property_id")
    private int propertyId;

    @Id
    @Column(name="amenity_id")
    private int amenityId;

    public PropertyAmenities() {
    }

    public PropertyAmenities(int propertyId, int amenityId) {
        this.propertyId = propertyId;
        this.amenityId = amenityId;
    }

    public int getPropertyId() {
        return propertyId;
    }

    public void setPropertyId(int propertyId) {
        this.propertyId = propertyId;
    }

    public int getAmenityId() {
        return amenityId;
    }

    public void setAmenityId(int amenityId) {
        this.amenityId = amenityId;
    }
}
