package com.ar.pgghar.serviceImpl;

import com.ar.pgghar.repository.OccupancyRepository;
import com.ar.pgghar.services.OccupancyService;
import org.springframework.beans.factory.annotation.Autowired;

public class OccupancyServiceImpl implements OccupancyService {
    @Autowired
    OccupancyRepository occupancyRepository;
}
