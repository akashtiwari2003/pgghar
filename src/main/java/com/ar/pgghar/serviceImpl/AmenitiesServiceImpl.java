package com.ar.pgghar.serviceImpl;

import com.ar.pgghar.repository.AmenitiesRepository;
import com.ar.pgghar.services.AmenitiesService;
import org.springframework.stereotype.Service;

@Service
public class AmenitiesServiceImpl implements AmenitiesService {
    AmenitiesRepository amenitiesRepository;
}
