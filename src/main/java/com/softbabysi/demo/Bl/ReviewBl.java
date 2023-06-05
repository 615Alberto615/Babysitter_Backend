package com.softbabysi.demo.Bl;

import com.softbabysi.demo.Dto.ReviewDto;
import com.softbabysi.demo.dao.ReviewDao;
import com.softbabysi.demo.entity.Review;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ReviewBl {
    @Autowired
    private ReviewDao reviewDao;

    public List<ReviewDto> getAllReview(){
        List<Review> reviews=reviewDao.getAllReview();

        List<ReviewDto> res= new ArrayList<>();
        reviews.forEach(review -> {
            res.add(new ReviewDto(review.getReviewId(),review.getBooking().getBookingId(),review.getReview(),review.getStars()));
        });
        return res;
    }
}
