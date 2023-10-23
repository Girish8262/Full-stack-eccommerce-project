package com.sarohi.ecommerce.productandreviewservice.controller;

import com.sarohi.ecommerce.productandreviewservice.model.productModel;
import com.sarohi.ecommerce.productandreviewservice.service.productService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:4200")
public class productController {
    @Autowired
    private productService productService;
    public productController(productService productService) {
        this.productService = productService;
    }
    @GetMapping("/gateway")
    public ResponseEntity<String> getAnonymous() {
        return ResponseEntity.ok("sarohi product service from spring cloud");
    }
    @GetMapping("/products")
public List<productModel> getAllProducts() {
    return productService.getAllProducts();
}
    @GetMapping("/product/{id}")
    public Optional<productModel> getProductById(@PathVariable String id) {
        return productService.getProductById(id);
    }
    @PostMapping("/product")
    public void createProduct(@RequestBody productModel product){
        productService.createProduct(product);
    }
    @PutMapping("/product/{id}")
    public void updateProduct(@RequestBody productModel product) {
        productService.updateProduct(product);
    }
    @DeleteMapping("/product/{id}")
    public void deleteProduct( @RequestBody productModel product){
        productService.deleteProduct( product);
    }
}
