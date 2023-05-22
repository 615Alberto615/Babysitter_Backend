package com.softbabysi.demo.Api;

import com.softbabysi.demo.Bl.BabysitterBl;
import com.softbabysi.demo.Bl.TutorBl;
import com.softbabysi.demo.Dto.BabysitterDto;
import com.softbabysi.demo.Dto.ResponseDto;
import com.softbabysi.demo.Dto.TutorDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/tutor")
public class TutorApi {
    @Autowired
    private TutorBl tutorBl;
    @GetMapping("")
    public ResponseEntity<ResponseDto<List<TutorDto>>> getAllTutor(){
        ResponseDto<List<TutorDto>> responseDto = new ResponseDto<>();
        try {
            responseDto.setCode(0000);
            responseDto.setData(tutorBl.getAllTutor());
            responseDto.setMessage("Tutor retrieved successfully");
            return ResponseEntity.ok(responseDto);
        }catch (Exception e) {
            responseDto.setCode(500);
            responseDto.setMessage("error");
            return ResponseEntity.ok(responseDto);
        }

    }

}
