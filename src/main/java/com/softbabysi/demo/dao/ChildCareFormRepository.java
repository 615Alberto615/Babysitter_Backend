package com.softbabysi.demo.dao;

import com.softbabysi.demo.entity.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChildCareFormRepository extends JpaRepository<Booking, Long> {
}
