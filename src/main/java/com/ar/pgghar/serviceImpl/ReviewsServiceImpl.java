package com.ar.pgghar.serviceImpl;

import com.ar.pgghar.repository.ReviewsRepository;
import com.ar.pgghar.services.ReviewsService;
import org.springframework.beans.factory.annotation.Autowired;

public class ReviewsServiceImpl implements ReviewsService {
    @Autowired
    ReviewsRepository reviewsRepository;
}
