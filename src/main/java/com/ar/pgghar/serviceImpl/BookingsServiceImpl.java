package com.ar.pgghar.serviceImpl;

import com.ar.pgghar.repository.BookingsRepository;
import com.ar.pgghar.services.BookingsService;
import org.springframework.stereotype.Service;

@Service
public class BookingsServiceImpl implements BookingsService {
    BookingsRepository bookingsRepository;
}
