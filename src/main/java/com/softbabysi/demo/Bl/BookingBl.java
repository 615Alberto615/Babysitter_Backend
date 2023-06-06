package com.softbabysi.demo.Bl;

import com.softbabysi.demo.Dto.BabysitterDto;
import com.softbabysi.demo.Dto.BookingDto;
import com.softbabysi.demo.dao.BookingDao;
import com.softbabysi.demo.dao.BookingRepository;
import com.softbabysi.demo.entity.Babysitter;
import com.softbabysi.demo.entity.Booking;
import com.softbabysi.demo.entity.Tutor;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookingBl {
    @Autowired
    private BookingRepository bookingRepository;

    @Transactional
    public void createBooking(BookingDto bookingDto){
        Booking booking = new Booking();
        Tutor tutor = new Tutor();
        Babysitter babysitter = new Babysitter();
        tutor.setTutorId(bookingDto.getTutorId());
        babysitter.setBabysitterId(bookingDto.getBabysitterId());
        booking.setBabysitter(babysitter);
        booking.setTutor(tutor);
        booking.setBookingChild(bookingDto.getBookingChild());
        booking.setBookingEstimatedTime(bookingDto.getBookingEstimatedTime());
        booking.setBookingTimeStart(bookingDto.getBookingTimeStart());
        booking.setBookingTimeEnd(bookingDto.getBookingTimeEnd());
        booking.setBookingDate(bookingDto.getBookingDate());
        booking.setBookingStatus(bookingDto.getBookingStatus());
        booking.setBookingCompleted(bookingDto.getBookingCompleted());
        booking.setBookingPaid(bookingDto.getBookingPaid());
        booking.setBookingAmount(bookingDto.getBookingAmount());
        bookingRepository.save(booking);
    }

    // Obtener booking por id
    public Booking findBooking(Integer id){
        Booking booking = bookingRepository.findByBookingId(id);
        return booking;
    }

    //Obtener booking por babysitter
    public List<Booking> findBookingByBabysitter(Integer id){
        List<Booking> booking = bookingRepository.findBookingByBabysitterId(id);
        return booking;
    }


    /*public void findBookingByBabysitter(Integer id){
        List<Booking> booking = bookingRepository.findBookingByBabysitterId(id);
        System.out.println("booking: " + booking);
    }*/

    //Obtener booking por tutor
    public List<Booking> findBookingByTutor(Integer id){
        List<Booking> booking = bookingRepository.findBookingByTutorId(id);
        return booking;
    }
    /*public void findBookingByTutor(Integer id){
        List<Booking> booking = bookingRepository.findBookingByTutorId(id);
        System.out.println("booking: " + booking);
    }*/
}
