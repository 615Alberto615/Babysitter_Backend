package com.softbabysi.demo.dao;

import com.softbabysi.demo.entity.Review;
import com.softbabysi.demo.entity.Tutor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReviewRepository extends JpaRepository<Review, Long> {
}
