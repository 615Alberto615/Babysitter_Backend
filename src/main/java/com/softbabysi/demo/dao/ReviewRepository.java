package com.softbabysi.demo.dao;

import com.softbabysi.demo.entity.Review;
import com.softbabysi.demo.entity.Tutor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ReviewRepository extends JpaRepository<Review, Long> {

    // obtener por id de niñera
    @Query(value = "SELECT * FROM review WHERE booking_id IN (SELECT booking_id FROM booking WHERE babysitter_id = ?1)", nativeQuery = true)
    List<Review> getReviewByBabysitterId(Integer babysitterId);
}
