package com.softbabysi.demo.entity;
import jakarta.persistence.*;

@Entity
@Table(name = "REVIEW")
public class Review {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "REVIEW_ID", nullable = false)
    private Integer reviewId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "TUTOR_ID", nullable = false)
    private Tutor tutor;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "BABYSITTER_ID", nullable = false)
    private Babysitter babysitter;

    @Column(name = "REVIEW", nullable = false, length = 4000)
    private String review;

    @Column(name = "STARS", nullable = false)
    private Integer stars;

    // Constructor vacío
    public Review() {
    }

    // Constructor con todos los parámetros
    public Review(Integer reviewId, Tutor tutor, Babysitter babysitter, String review, Integer stars) {
        this.reviewId = reviewId;
        this.tutor = tutor;
        this.babysitter = babysitter;
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

    public Tutor getTutor() {
        return tutor;
    }

    public void setTutor(Tutor tutor) {
        this.tutor = tutor;
    }

    public Babysitter getBabysitter() {
        return babysitter;
    }

    public void setBabysitter(Babysitter babysitter) {
        this.babysitter = babysitter;
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
