package com.ar.pgghar.serviceImpl;

import com.ar.pgghar.repository.PropertiesRepository;
import com.ar.pgghar.services.PropertiesService;
import org.springframework.beans.factory.annotation.Autowired;

public class PropertiesServiceImpl implements PropertiesService {
    @Autowired
    PropertiesRepository propertiesRepository;
}
