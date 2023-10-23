package com.sarohi.ecommerce.productandreviewservice.model;

import jakarta.persistence.*;

@Entity
public class reviewModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int reviewId;
    private int rating;
    private String comments;
    @ManyToOne
    private productModel productModel;
    public reviewModel(com.sarohi.ecommerce.productandreviewservice.model.productModel productModel) {
        this.productModel = productModel;
    }
    public com.sarohi.ecommerce.productandreviewservice.model.productModel getProductModel() {
        return productModel;
    }
    public void setProductModel(com.sarohi.ecommerce.productandreviewservice.model.productModel productModel) {
        this.productModel = productModel;
    }
    reviewModel(){
        //No-argument constructor
    }
    public reviewModel(int reviewId, int rating, String comments) {
        this.reviewId = reviewId;
        this.rating = rating;
        this.comments = comments;
    }
    public int getReviewId() {
        return reviewId;
    }
    public void setReviewId(int reviewId) {
        this.reviewId = reviewId;
    }
    public int getRating() {
        return rating;
    }
    public void setRating(int rating) {
        this.rating = rating;
    }
    public String getComments() {
        return comments;
    }
    public void setComments(String comments) {
        this.comments = comments;
    }
}
