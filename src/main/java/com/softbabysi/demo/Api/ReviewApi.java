package com.softbabysi.demo.Api;

import com.softbabysi.demo.Bl.ReviewBl;
import com.softbabysi.demo.Dto.ResponseDto;
import com.softbabysi.demo.Dto.ReviewDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/review")
public class ReviewApi {
    @Autowired
    private ReviewBl reviewBl;

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
}
