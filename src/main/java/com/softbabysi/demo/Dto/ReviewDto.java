package com.softbabysi.demo.Dto;

public class ReviewDto {
    private Integer reviewId;
    private Integer tutorId;
    private Integer babysitterId;
    private String review;
    private Integer stars;

    public ReviewDto() {
    }

    public ReviewDto(Integer reviewId, Integer tutorId, Integer babysitterId, String review, Integer stars) {
        this.reviewId = reviewId;
        this.tutorId = tutorId;
        this.babysitterId = babysitterId;
        this.review = review;
        this.stars = stars;
    }

    public Integer getReviewId() {
        return reviewId;
    }

    public void setReviewId(Integer reviewId) {
        this.reviewId = reviewId;
    }

    public Integer getTutorId() {
        return tutorId;
    }

    public void setTutorId(Integer tutorId) {
        this.tutorId = tutorId;
    }

    public Integer getBabysitterId() {
        return babysitterId;
    }

    public void setBabysitterId(Integer babysitterId) {
        this.babysitterId = babysitterId;
    }

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }

    public Integer getStars() {
        return stars;
    }

    public void setStars(Integer stars) {
        this.stars = stars;
    }
}
