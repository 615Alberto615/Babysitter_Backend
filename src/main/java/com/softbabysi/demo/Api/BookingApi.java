package com.softbabysi.demo.Api;

import com.softbabysi.demo.Bl.BookingBl;
import com.softbabysi.demo.Bl.TutorBl;
import com.softbabysi.demo.Bl.UserBl;
import com.softbabysi.demo.Dto.*;
import com.softbabysi.demo.entity.Booking;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
@RestController
@RequestMapping("/api/v1/booking")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE})
public class BookingApi {
    @Autowired
    private BookingBl bookingBl;

    @Autowired
    private UserBl userBl;

    //crear nueva reserva
    @PostMapping(path = "/")
    public ResponseEntity<ResponseDto<Booking>> createBooking(@RequestBody BookingDto bookingDto, @RequestHeader("Authorization") String token){
        bookingBl.createBooking(bookingDto);
        try {
            if(!userBl.validateToken(token)){
                return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(new ResponseDto<>(401, null, "Unauthorized"));
            }
            System.out.println("token autorizado");
            return ResponseEntity.ok(new ResponseDto<>(200, null, "Booking created"));
        }catch (Exception e){
            e.printStackTrace();
            return ResponseEntity.ok(new ResponseDto<>(500, null, "Error"));
        }
    }

    // Por id
    @GetMapping(path = "/{id}")
    public ResponseEntity<ResponseDto<Booking>> findBookingById(@PathVariable Integer id, @RequestHeader("Authorization") String token){
        if(!userBl.validateToken(token)){
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(new ResponseDto<>(401, null, "Unauthorized"));
        }
        System.out.println("token autorizado");
        return ResponseEntity.ok(new ResponseDto<>(200, bookingBl.findBooking(id), "Booking"));
    }

    // Por id de babysitter
    @GetMapping(path = "/babysitter/{id}")
    public ResponseEntity<ResponseDto<List<BookingDto>>> findBookingByBabysitterId(@PathVariable Integer id, @RequestHeader("Authorization") String token){
        List<BookingDto> bookings = bookingBl.findBookingByBabysitter(id);
        try {
            if(!userBl.validateToken(token)){
                return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(new ResponseDto<>(401, null, "Unauthorized"));
            }
            System.out.println("token autorizado");
            return ResponseEntity.ok(new ResponseDto<>(200, bookings, "Babysitter"));
        }catch (Exception e){
            e.printStackTrace();
            return ResponseEntity.ok(new ResponseDto<>(500, null, "Error"));
        }
    }

    // Por id de tutor
    @GetMapping(path = "/tutor/{id}")
    public ResponseEntity<ResponseDto<List<BookingDto>>> findBookingByTutorId(@PathVariable Integer id, @RequestHeader("Authorization") String token){
        List<BookingDto> bookings = bookingBl.findBookingByTutor(id);

        try {
            if(!userBl.validateToken(token)){
                return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(new ResponseDto<>(401, null, "Unauthorized"));
            }
            System.out.println("token autorizado");

            return ResponseEntity.ok(new ResponseDto<>(200, bookings, "Tutor"));
        }catch (Exception e){
            e.printStackTrace();
            return ResponseEntity.ok(new ResponseDto<>(500, null, "Error"));
        }
    }

    // Lista booking por id de tutor
    @GetMapping(path = "/tutor/{id}/")
    public ResponseEntity<ResponseDto<List<BookingListDto>>> findBookingByTutorIdList(@PathVariable Integer id, @RequestHeader("Authorization") String token){
        List<BookingListDto> bookings = bookingBl.findBookingListByTutorId(id);

        try {
            if(!userBl.validateToken(token)){
                return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(new ResponseDto<>(401, null, "Unauthorized"));
            }
            System.out.println("token autorizado");

            return ResponseEntity.ok(new ResponseDto<>(200, bookings, "Tutor"));
        }catch (Exception e){
            e.printStackTrace();
            return ResponseEntity.ok(new ResponseDto<>(500, null, "Error"));
        }
    }

    // Lista booking por id de babysitter
    @GetMapping(path = "/babysitter/{id}/")
    public ResponseEntity<ResponseDto<List<BookingListDto>>> findBookingByBabysitterIdList(@PathVariable Integer id, @RequestHeader("Authorization") String token){
        List<BookingListDto> bookings = bookingBl.findBookingListByBabysitterId(id);

        try {
            if(!userBl.validateToken(token)){
                return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(new ResponseDto<>(401, null, "Unauthorized"));
            }
            System.out.println("token autorizado");

            return ResponseEntity.ok(new ResponseDto<>(200, bookings, "Babysitter"));
        }catch (Exception e){
            e.printStackTrace();
            return ResponseEntity.ok(new ResponseDto<>(500, null, "Error"));
        }
    }

    // Actualizar reserva
    @PutMapping(path = "/{id}")
    public ResponseEntity<ResponseDto<Booking>> updateBooking(@RequestBody BookingDto bookingDto, @PathVariable Integer id, @RequestHeader("Authorization") String token){
        bookingBl.updateBooking(bookingDto, id);
        try {
            if(!userBl.validateToken(token)){
                return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(new ResponseDto<>(401, null, "Unauthorized"));
            }
            System.out.println("token autorizado");
            return ResponseEntity.ok(new ResponseDto<>(200, null, "Booking updated"));
        }catch (Exception e){
            e.printStackTrace();
            return ResponseEntity.ok(new ResponseDto<>(500, null, "Error"));
        }
    }

    // Modificar estado del booking en modo proceso(aceptado) = 2
    // Modificar estado del booking en modo proceso(rechazado) = 4
    // Modificar estado del booking en modo proceso(terminado) = 3, tiene que indicar el monto del pago por la reserva
    @PutMapping(path = "status/{id}")
    public ResponseEntity<ResponseDto<BookingStatusServiceDto>> updateBookingStatus(@RequestBody BookingStatusServiceDto bookingStatusServiceDto, @PathVariable Integer id, @RequestHeader("Authorization") String token){
        bookingBl.updateBookingStatus(id, bookingStatusServiceDto);
        try {
            if(!userBl.validateToken(token)){
                return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(new ResponseDto<>(401, null, "Unauthorized"));
            }
            System.out.println("token autorizado");
            return ResponseEntity.ok(new ResponseDto<>(200, null, "Booking updated"));
        }catch (Exception e){
            e.printStackTrace();
            return ResponseEntity.ok(new ResponseDto<>(500, null, "Error"));
        }
    }

}
