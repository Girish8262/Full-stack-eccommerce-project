package com.sarohi.ecommerce.productandreviewservice.repository;

import com.sarohi.ecommerce.productandreviewservice.model.reviewModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface reviewRepository extends JpaRepository<reviewModel, String> {



}
