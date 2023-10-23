package com.sarohi.ecommerce.productandreviewservice.controller;

import com.sarohi.ecommerce.productandreviewservice.service.reviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class reviewController {
    @Autowired
    private reviewService revService;
    public reviewController (reviewService reviewService) {
        this.revService = reviewService;
    }


}
