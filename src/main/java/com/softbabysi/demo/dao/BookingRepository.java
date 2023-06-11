package com.softbabysi.demo.dao;

import com.softbabysi.demo.Dto.BookingListDto;
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

    //Lista de bookings por id de tutor
    @Query("SELECT new com.softbabysi.demo.Dto.BookingListDto(b.bookingId, u.userName, u.userLastname, b.babysitter.babysitterId, b.tutor.tutorId, b.bookingChild, b.bookingEstimatedTime, b.bookingTimeStart, b.bookingTimeEnd, b.bookingDate, b.bookingStatus, b.bookingCompleted, b.bookingPaid, b.bookingAmount) FROM Booking b JOIN Babysitter t JOIN User u JOIN Tutor tu WHERE u.userId = t.user.userId AND t.babysitterId = b.babysitter.babysitterId AND tu.tutorId = ?1")
    public List<BookingListDto> findBookingListByTutorId(Integer id);

    @Query("SELECT new com.softbabysi.demo.Dto.BookingListDto(b.bookingId, u.userName, u.userLastname, b.babysitter.babysitterId, b.tutor.tutorId, b.bookingChild, b.bookingEstimatedTime, b.bookingTimeStart, b.bookingTimeEnd, b.bookingDate, b.bookingStatus, b.bookingCompleted, b.bookingPaid, b.bookingAmount) FROM Booking b JOIN Babysitter t JOIN User u JOIN Tutor tu WHERE u.userId = tu.user.userId AND t.babysitterId = b.babysitter.babysitterId AND tu.tutorId = ?1")
    public List<BookingListDto> findBookingListByBabysitterId(Integer id);
}
