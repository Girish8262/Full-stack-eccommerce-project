package com.sarohi.ecommerce.productandreviewservice.service;

import com.sarohi.ecommerce.productandreviewservice.model.productModel;
import com.sarohi.ecommerce.productandreviewservice.repository.productRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class productService {
    @Autowired
    public productRepository productRepository;
    public List<productModel> getAllProducts() {
        return productRepository.findAll();
    }
    public Optional<productModel> getProductById(String id) {
        return productRepository.findById(id);
    }
    public void createProduct(productModel product) {
        productRepository.save(product);
    }
    public void updateProduct(productModel product) {
        productRepository.save( product);
    }
    public  void deleteProduct(  productModel product){
        productRepository.delete(product);
    }
}
