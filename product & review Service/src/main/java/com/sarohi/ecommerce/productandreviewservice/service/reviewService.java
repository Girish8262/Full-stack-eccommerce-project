package com.sarohi.ecommerce.productandreviewservice.service;

import com.sarohi.ecommerce.productandreviewservice.repository.reviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class reviewService {
    @Autowired
    public reviewRepository reviewRepo;

}
