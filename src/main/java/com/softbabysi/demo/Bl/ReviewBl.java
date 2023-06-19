package com.softbabysi.demo.Bl;

import com.softbabysi.demo.Dto.ReviewDto;
import com.softbabysi.demo.dao.ReviewDao;
import com.softbabysi.demo.dao.ReviewRepository;
import com.softbabysi.demo.entity.Booking;
import com.softbabysi.demo.entity.Review;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ReviewBl {
    @Autowired
    private ReviewDao reviewDao;

    @Autowired
    private ReviewRepository reviewRepository;

    public List<ReviewDto> getAllReview(){
        List<Review> reviews=reviewDao.getAllReview();

        List<ReviewDto> res= new ArrayList<>();
        reviews.forEach(review -> {
            res.add(new ReviewDto(review.getReviewId(),review.getBooking().getBookingId(),review.getReview(),review.getStars()));
        });
        return res;
    }

    // obtener las reviews por id de babysitter
    public List<ReviewDto> getReviewByBabysitterId(Integer babysitterId){
        List<Review> reviews=reviewRepository.getReviewByBabysitterId(babysitterId);

        List<ReviewDto> res= new ArrayList<>();
        reviews.forEach(review -> {
            res.add(new ReviewDto(review.getReviewId(),review.getBooking().getBookingId(),review.getReview(),review.getStars()));
        });
        return res;
    }

    //obtener promedio de estrellas por id de niñera
    public Double getStarsByBabysitterId(Integer babysitterId){
        List<Review> reviews=reviewRepository.getReviewByBabysitterId(babysitterId);
        Double sum=0.0;
        for (Review review:reviews) {
            sum+=review.getStars();
        }
        return sum/reviews.size();
    }

    // crear una review
    public ReviewDto createReview(ReviewDto reviewDto){
        Review review = new Review();
        Booking booking = new Booking();
        booking.setBookingId(reviewDto.getBookingId());
        review.setReview(reviewDto.getReview());
        review.setStars(reviewDto.getStars());
        review.setBooking(booking);
        reviewRepository.save(review);
        return reviewDto;
    }
}
