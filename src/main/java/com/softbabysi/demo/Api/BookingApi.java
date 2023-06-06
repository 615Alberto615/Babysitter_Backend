package com.softbabysi.demo.Api;

import com.softbabysi.demo.Bl.BookingBl;
import com.softbabysi.demo.Bl.TutorBl;
import com.softbabysi.demo.Dto.BookingDto;
import com.softbabysi.demo.Dto.ResponseDto;
import com.softbabysi.demo.Dto.TutorDto;
import com.softbabysi.demo.entity.Booking;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/api/v1/booking")
public class BookingApi {
    @Autowired
    private BookingBl bookingBl;

    @PostMapping(path = "/")
    public ResponseEntity<ResponseDto<Booking>> createBooking(@RequestBody BookingDto bookingDto){
        bookingBl.createBooking(bookingDto);
        try {
            return ResponseEntity.ok(new ResponseDto<>(200, null, "Booking created"));
        }catch (Exception e){
            e.printStackTrace();
            return ResponseEntity.ok(new ResponseDto<>(500, null, "Error"));
        }
    }

    // Por id
    @GetMapping(path = "/{id}")
    public ResponseEntity<ResponseDto<Booking>> findBookingById(@PathVariable Integer id){
        return ResponseEntity.ok(new ResponseDto<>(200, bookingBl.findBooking(id), "Booking"));
    }

    // Por id de babysitter
    @GetMapping(path = "/babysitter/{id}")
    public ResponseEntity<ResponseDto<List<Booking>>> findBookingByBabysitterId(@PathVariable Integer id){
        try {
            return ResponseEntity.ok(new ResponseDto<>(200, bookingBl.findBookingByBabysitter(id), "Babysitter"));
        }catch (Exception e){
            e.printStackTrace();
            return ResponseEntity.ok(new ResponseDto<>(500, null, "Error"));
        }
    }

    // Por id de tutor
    @GetMapping(path = "/tutor/{id}")
    public ResponseEntity<ResponseDto<List<Booking>>> findBookingByTutorId(@PathVariable Integer id){
        try {
            return ResponseEntity.ok(new ResponseDto<>(200, bookingBl.findBookingByTutor(id), "Tutor"));
        }catch (Exception e){
            e.printStackTrace();
            return ResponseEntity.ok(new ResponseDto<>(500, null, "Error"));
        }
    }
}
