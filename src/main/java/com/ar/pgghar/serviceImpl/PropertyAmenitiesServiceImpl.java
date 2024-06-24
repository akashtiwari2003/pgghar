package com.ar.pgghar.serviceImpl;

import com.ar.pgghar.entity.PropertyAmenities;
import com.ar.pgghar.repository.PropertyAmenitiesRepository;
import com.ar.pgghar.services.PropertyAmenitiesService;
import org.springframework.beans.factory.annotation.Autowired;

public class PropertyAmenitiesServiceImpl implements PropertyAmenitiesService {
    @Autowired
    PropertyAmenitiesRepository propertyAmenitiesRepository;
}
