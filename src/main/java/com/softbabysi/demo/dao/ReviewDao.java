package com.softbabysi.demo.dao;

import com.softbabysi.demo.entity.Review;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReviewDao {
    @Autowired
    private ReviewRepository reviewRepository;

    public List<Review> getAllReview(){
        return reviewRepository.findAll();
    }
}
