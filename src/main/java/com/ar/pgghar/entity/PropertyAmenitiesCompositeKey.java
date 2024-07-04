package com.ar.pgghar.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Id;

@Embeddable
public class PropertyAmenitiesCompositeKey {
    @Column(name="property_id")
    private int propertyId;

    @Column(name="amenity_id")
    private int amenityId;

    public PropertyAmenitiesCompositeKey() {
    }

    public PropertyAmenitiesCompositeKey(int propertyId, int amenityId) {
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
