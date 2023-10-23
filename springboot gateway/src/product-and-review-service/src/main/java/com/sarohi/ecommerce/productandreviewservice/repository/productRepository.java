package com.sarohi.ecommerce.productandreviewservice.repository;

import com.sarohi.ecommerce.productandreviewservice.model.productModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface productRepository extends JpaRepository<productModel, String> {


}
