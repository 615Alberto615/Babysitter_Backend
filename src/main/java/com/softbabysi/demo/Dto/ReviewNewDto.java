package com.softbabysi.demo.Dto;

public class ReviewNewDto {
    private Integer bookingId;
    private String review;
    private Integer stars;

    public ReviewNewDto() {
    }

    public ReviewNewDto(Integer bookingId, String review, Integer stars) {
        this.bookingId = bookingId;
        this.review = review;
        this.stars = stars;
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
        return "ReviewNewDto{" +
                "bookingId=" + bookingId +
                ", review='" + review + '\'' +
                ", stars=" + stars +
                '}';
    }
}
