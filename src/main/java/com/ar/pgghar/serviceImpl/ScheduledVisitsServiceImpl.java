package com.ar.pgghar.serviceImpl;

import com.ar.pgghar.repository.ScheduledVisitsRepository;
import com.ar.pgghar.services.ScheduledVisitsService;
import org.springframework.beans.factory.annotation.Autowired;

public class ScheduledVisitsServiceImpl implements ScheduledVisitsService {
    @Autowired
    ScheduledVisitsRepository scheduledVisitsRepository;
}
