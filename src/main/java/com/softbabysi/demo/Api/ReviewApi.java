package com.softbabysi.demo.Api;

import com.softbabysi.demo.Bl.ReviewBl;
import com.softbabysi.demo.Bl.UserBl;
import com.softbabysi.demo.Dto.ResponseDto;
import com.softbabysi.demo.Dto.ReviewDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/review")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE})
public class ReviewApi {
    @Autowired
    private ReviewBl reviewBl;

    @Autowired
    private UserBl userBl;

    @GetMapping("")
    public ResponseEntity<ResponseDto<List<ReviewDto>>> getAllReview(){
        ResponseDto<List<ReviewDto>> responseDto = new ResponseDto<>();
        try {
            responseDto.setCode(0000);
            responseDto.setData(reviewBl.getAllReview());
            responseDto.setMessage("Review retrieved successfully");
            return ResponseEntity.ok(responseDto);
        }catch (Exception e) {
            responseDto.setCode(500);
            responseDto.setMessage("error");
            return ResponseEntity.ok(responseDto);
        }

    }

    // obtener por id de niñera
    @GetMapping("/babysitter/{babysitterId}")
    public ResponseEntity<ResponseDto<List<ReviewDto>>> getReviewByBabysitterId(@PathVariable Integer babysitterId, @RequestHeader("Authorization") String token){
        ResponseDto<List<ReviewDto>> responseDto = new ResponseDto<>();
        try {
            if(!userBl.validateToken(token)){
                return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(new ResponseDto<>(401, null, "Unauthorized"));
            }
            System.out.println("token autorizado");
            responseDto.setCode(200);
            responseDto.setData(reviewBl.getReviewByBabysitterId(babysitterId));
            responseDto.setMessage("Review retrieved successfully");
            return ResponseEntity.ok(responseDto);
        }catch (Exception e) {
            responseDto.setCode(400);
            responseDto.setMessage("error");
            return ResponseEntity.ok(responseDto);
        }

    }

    // obtener promedio de calificaciones de niñera
    @GetMapping("/babysitter/{babysitterId}/average")
    public ResponseEntity<ResponseDto<Double>> getAverageReviewByBabysitterId(@PathVariable Integer babysitterId, @RequestHeader("Authorization") String token){
        ResponseDto<Double> responseDto = new ResponseDto<>();
        try {
            if(!userBl.validateToken(token)){
                return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(new ResponseDto<>(401, null, "Unauthorized"));
            }
            System.out.println("token autorizado");
            responseDto.setCode(200);
            responseDto.setData(reviewBl.getStarsByBabysitterId(babysitterId));
            responseDto.setMessage("Review retrieved successfully");
            return ResponseEntity.ok(responseDto);
        }catch (Exception e) {
            responseDto.setCode(400);
            responseDto.setMessage("error");
            return ResponseEntity.ok(responseDto);
        }
    }

    //crear una review
    @PostMapping("")
    public ResponseEntity<ResponseDto<ReviewDto>> createReview(@RequestBody ReviewDto reviewDto, @RequestHeader("Authorization") String token){
        ResponseDto<ReviewDto> responseDto = new ResponseDto<>();
        try {
            if(!userBl.validateToken(token)){
                return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(new ResponseDto<>(401, null, "Unauthorized"));
            }
            System.out.println("token autorizado");
            responseDto.setCode(200);
            responseDto.setData(reviewBl.createReview(reviewDto));
            responseDto.setMessage("Review created successfully");
            return ResponseEntity.ok(responseDto);
        }catch (Exception e) {
            responseDto.setCode(400);
            responseDto.setMessage("error");
            return ResponseEntity.ok(responseDto);
        }
    }
}
