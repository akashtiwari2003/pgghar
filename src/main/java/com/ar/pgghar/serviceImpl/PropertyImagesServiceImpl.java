package com.ar.pgghar.serviceImpl;

import com.ar.pgghar.repository.PropertyImagesRepository;
import com.ar.pgghar.services.PropertyImagesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PropertyImagesServiceImpl implements PropertyImagesService {
    @Autowired
    PropertyImagesRepository propertyImagesRepository;
}
