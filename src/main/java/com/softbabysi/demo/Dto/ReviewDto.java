package com.softbabysi.demo.Dto;

public class ReviewDto {
    private Integer reviewId;
    private Integer bookingId;
    private String review;
    private Integer stars;

    public ReviewDto() {
    }

    public ReviewDto(Integer reviewId, Integer bookingId, String review, Integer stars) {
        this.reviewId = reviewId;
        this.bookingId = bookingId;
        this.review = review;
        this.stars = stars;
    }

    public Integer getReviewId() {
        return reviewId;
    }

    public void setReviewId(Integer reviewId) {
        this.reviewId = reviewId;
    }

    public Integer getBookingId() {
        return bookingId;
    }

    public void setBookingId(Integer bookingId) {
        this.bookingId = bookingId;
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

    @Override
    public String toString() {
        return "ReviewDto{" +
                "reviewId=" + reviewId +
                ", bookingId=" + bookingId +
                ", review='" + review + '\'' +
                ", stars=" + stars +
                '}';
    }
}
