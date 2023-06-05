package com.softbabysi.demo.entity;
import jakarta.persistence.*;

@Entity
@Table(name = "REVIEW")
public class Review {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "REVIEW_ID", nullable = false)
    private Integer reviewId;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "BOOKING_ID", nullable = false)
    private Booking booking;

    @Column(name = "REVIEW", nullable = false, length = 4000)
    private String review;

    @Column(name = "STARS", nullable = false)
    private Integer stars;

    // Constructor vacío
    public Review() {
    }

    // Constructor con todos los parámetros

    public Review(Integer reviewId, Booking booking, String review, Integer stars) {
        this.reviewId = reviewId;
        this.booking = booking;
        this.review = review;
        this.stars = stars;
    }

    // Getters y setters


    public Integer getReviewId() {
        return reviewId;
    }

    public void setReviewId(Integer reviewId) {
        this.reviewId = reviewId;
    }

    public Booking getBooking() {
        return booking;
    }

    public void setBooking(Booking booking) {
        this.booking = booking;
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
        return "Review{" +
                "reviewId=" + reviewId +
                ", booking=" + booking +
                ", review='" + review + '\'' +
                ", stars=" + stars +
                '}';
    }
}
