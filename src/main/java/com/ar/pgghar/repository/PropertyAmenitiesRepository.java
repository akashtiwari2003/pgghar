package com.ar.pgghar.repository;

import com.ar.pgghar.entity.PropertyAmenities;
import com.ar.pgghar.entity.PropertyAmenitiesCompositeKey;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PropertyAmenitiesRepository extends JpaRepository<PropertyAmenities, PropertyAmenitiesCompositeKey> {
}
