package com.softbabysi.demo.dao;

import com.softbabysi.demo.entity.Babysitter;
import com.softbabysi.demo.entity.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface BookingRepository extends JpaRepository<Booking, Long> {
    //Por id
    Booking findByBookingId(Integer bookingId);

    // Por id de babysitter
    @Query("SELECT i FROM Booking i WHERE i.babysitter.babysitterId = ?1")
    public List<Booking> findBookingByBabysitterId(Integer id);

    // Por id de tutor
    @Query("SELECT i FROM Booking i WHERE i.tutor.tutorId = ?1")
    public List<Booking> findBookingByTutorId(Integer id);
}
