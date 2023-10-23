package com.sarohi.ecommerce.productandreviewservice.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class productModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int productId;
    private String name;
    private double price;
    private String productDescription;
    @OneToMany (mappedBy = "productModel")
    private List<reviewModel> review;
    public productModel(List<reviewModel> review) {
        this.review = review;
    }
    public List<reviewModel> getReview() {
        return review;
    }
    public void setReview(List<reviewModel> review) {
        this.review = review;
    }
    productModel(){
        //No-argument constructor
    }
    public productModel(int productId, String name, double price, String productDescription) {
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.productDescription = productDescription;
    }
    public int getProductId() {
        return productId;
    }
    public void setProductId(int productId) {
        this.productId = productId;
    }
    public String getName() {
        return name;
    }
    public void setName(String Name) {
        this.name = Name;
    }
    public String getProductDescription() {
        return productDescription;
    }
    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
}
