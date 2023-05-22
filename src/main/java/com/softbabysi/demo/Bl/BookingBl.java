package com.softbabysi.demo.Bl;

import com.softbabysi.demo.Dto.BabysitterDto;
import com.softbabysi.demo.Dto.BookingDto;
import com.softbabysi.demo.dao.BookingDao;
import com.softbabysi.demo.entity.Babysitter;
import com.softbabysi.demo.entity.Booking;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookingBl {
    @Autowired
    private BookingDao bookingDao;

    public List<BookingDto> getAllBooking(){
        List<Booking> bookings=bookingDao.getAllBooking();

        List<BookingDto> res= new ArrayList<>();
        bookings.forEach(booking -> {
            res.add(new BookingDto(booking.getBookingId(),booking.getBabysitter().getBabysitterId(),
                    booking.getTutor().getTutorId(),booking.getBookingChild(),booking.getBookingEstimatedTime(),
                    booking.getBookingTimeStart(),booking.getBookingTimeEnd(),booking.getBookingDate(),
                    booking.getBookingStatus(),booking.getBookingCompleted(),booking.getBookingPaid()));
        });
        return res;
    }
}
