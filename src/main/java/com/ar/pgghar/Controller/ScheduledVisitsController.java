package com.ar.pgghar.Controller;

import com.ar.pgghar.entity.ScheduledVisits;
import com.ar.pgghar.services.ScheduledVisitsService;
import org.springframework.beans.factory.annotation.Autowired;

public class ScheduledVisitsController {
    @Autowired
    ScheduledVisitsService scheduledVisitsService;
}
