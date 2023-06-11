package com.softbabysi.demo.Bl;

import com.softbabysi.demo.Dto.BabysitterDto;
import com.softbabysi.demo.Dto.BookingDto;
import com.softbabysi.demo.Dto.BookingListDto;
import com.softbabysi.demo.Dto.BookingStatusServiceDto;
import com.softbabysi.demo.dao.BookingDao;
import com.softbabysi.demo.dao.BookingRepository;
import com.softbabysi.demo.entity.Babysitter;
import com.softbabysi.demo.entity.Booking;
import com.softbabysi.demo.entity.Tutor;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

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
    public List<BookingDto> findBookingByBabysitter(Integer id){
        List<Booking> booking = bookingRepository.findBookingByBabysitterId(id);
        List<BookingDto> bookingDto = new ArrayList<>();
        for (Booking booking1: booking) {
            BookingDto bookingDto1 = new BookingDto();
            bookingDto1.setBookingId(booking1.getBookingId());
            bookingDto1.setTutorId(booking1.getTutor().getTutorId());
            bookingDto1.setBabysitterId(booking1.getBabysitter().getBabysitterId());
            bookingDto1.setBookingChild(booking1.getBookingChild());
            bookingDto1.setBookingEstimatedTime(booking1.getBookingEstimatedTime());
            bookingDto1.setBookingTimeStart(booking1.getBookingTimeStart());
            bookingDto1.setBookingTimeEnd(booking1.getBookingTimeEnd());
            bookingDto1.setBookingDate(booking1.getBookingDate());
            bookingDto1.setBookingStatus(booking1.getBookingStatus());
            bookingDto1.setBookingCompleted(booking1.getBookingCompleted());
            bookingDto1.setBookingPaid(booking1.getBookingPaid());
            bookingDto1.setBookingAmount(booking1.getBookingAmount());
            bookingDto.add(bookingDto1);
        }
        return bookingDto;
    }

    //Actualizar reserva
    public void updateBooking(BookingDto bookingDto, Integer id){
        Booking booking = bookingRepository.findByBookingId(id);
        Tutor tutor = new Tutor();
        Babysitter babysitter = new Babysitter();
        booking.setBookingId(bookingDto.getBookingId());
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

    /*public void findBookingByBabysitter(Integer id){
        List<Booking> booking = bookingRepository.findBookingByBabysitterId(id);
        System.out.println("booking: " + booking);
    }*/

    //Obtener booking por tutor
    public List<BookingDto> findBookingByTutor(Integer id){
        List<Booking> booking = bookingRepository.findBookingByTutorId(id);
        List<BookingDto> bookingDto = new ArrayList<>();
        for (Booking booking1: booking) {
            BookingDto bookingDto1 = new BookingDto();
            bookingDto1.setBookingId(booking1.getBookingId());
            bookingDto1.setTutorId(booking1.getTutor().getTutorId());
            bookingDto1.setBabysitterId(booking1.getBabysitter().getBabysitterId());
            bookingDto1.setBookingChild(booking1.getBookingChild());
            bookingDto1.setBookingEstimatedTime(booking1.getBookingEstimatedTime());
            bookingDto1.setBookingTimeStart(booking1.getBookingTimeStart());
            bookingDto1.setBookingTimeEnd(booking1.getBookingTimeEnd());
            bookingDto1.setBookingDate(booking1.getBookingDate());
            bookingDto1.setBookingStatus(booking1.getBookingStatus());
            bookingDto1.setBookingCompleted(booking1.getBookingCompleted());
            bookingDto1.setBookingPaid(booking1.getBookingPaid());
            bookingDto1.setBookingAmount(booking1.getBookingAmount());
            bookingDto.add(bookingDto1);
        }
        System.out.println("booking: " + booking);
        return bookingDto;
    }

    // obtener Lista Booking por tutor
    public List<BookingListDto> findBookingListByTutorId(Integer id){
        List<BookingListDto> bookingListDto = bookingRepository.findBookingListByTutorId(id);
        return bookingListDto;
    }

    // obtener Lista Booking por babysitter
    public List<BookingListDto> findBookingListByBabysitterId(Integer id){
        List<BookingListDto> bookingListDto = bookingRepository.findBookingListByBabysitterId(id);
        return bookingListDto;
    }


    /*public void findBookingByTutor(Integer id){
        List<Booking> booking = bookingRepository.findBookingByTutorId(id);
        System.out.println("booking: " + booking);
    }*/

    //Modificar el estatus del booking
    public void updateBookingStatus(Integer id, BookingStatusServiceDto status){
        Booking booking = bookingRepository.findByBookingId(id);
        if(status.getBookingCompleted() == 3){
            booking.setBookingCompleted(3);
            booking.setBookingPaid(true);
            booking.setBookingAmount(status.getBookingAmount());
            bookingRepository.save(booking);
        }else {
            booking.setBookingCompleted(status.getBookingCompleted());
            bookingRepository.save(booking);
        }
    }
}
