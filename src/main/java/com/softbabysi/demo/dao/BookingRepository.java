package com.softbabysi.demo.dao;

import com.softbabysi.demo.entity.Babysitter;
import com.softbabysi.demo.entity.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository extends JpaRepository<Booking, Long> {
}
