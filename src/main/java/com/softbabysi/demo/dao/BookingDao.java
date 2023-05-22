package com.softbabysi.demo.dao;
import com.softbabysi.demo.entity.Booking;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookingDao {
    @Autowired
    private BookingRepository bookingRepository;
    public List<Booking> getAllBooking(){
        return bookingRepository.findAll();
    }
}
