package com.softbabysi.demo.Api;

import com.softbabysi.demo.Bl.BookingBl;
import com.softbabysi.demo.Bl.TutorBl;
import com.softbabysi.demo.Dto.BookingDto;
import com.softbabysi.demo.Dto.ResponseDto;
import com.softbabysi.demo.Dto.TutorDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping("/api/v1/booking")
public class BookingApi {
    @Autowired
    private BookingBl bookingBl;
    @GetMapping("")
    public ResponseEntity<ResponseDto<List<BookingDto>>> getAllBooking(){
        ResponseDto<List<BookingDto>> responseDto = new ResponseDto<>();
        try {
            responseDto.setCode(0000);
            responseDto.setData(bookingBl.getAllBooking());
            responseDto.setMessage("Booking retrieved successfully");
            return ResponseEntity.ok(responseDto);
        }catch (Exception e) {
            responseDto.setCode(500);
            responseDto.setMessage("error");
            return ResponseEntity.ok(responseDto);
        }

    }
}
