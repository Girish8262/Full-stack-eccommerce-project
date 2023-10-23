package com.sarohi.ecommerce.productandreviewservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
public class ProductAndReviewServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductAndReviewServiceApplication.class, args);
	}

}
