package com.softbabysi.demo.Api;

import com.softbabysi.demo.Bl.ScheduleExceptionBl;
import com.softbabysi.demo.Dto.ResponseDto;
import com.softbabysi.demo.Dto.ScheduleExceptionDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/scheduleException")
public class ScheduleExceptionApi {
    @Autowired
    private ScheduleExceptionBl scheduleExceptionBl;

    @GetMapping("")
    public ResponseEntity<ResponseDto<List<ScheduleExceptionDto>>> getAllScheduleException(){
        ResponseDto<List<ScheduleExceptionDto>> responseDto = new ResponseDto<>();
        try {
            responseDto.setCode(0000);
            responseDto.setData(scheduleExceptionBl.getAllScheduleException());
            responseDto.setMessage("ScheduleException retrieved successfully");
            return ResponseEntity.ok(responseDto);
        }catch (Exception e) {
            responseDto.setCode(500);
            responseDto.setMessage("error");
            return ResponseEntity.ok(responseDto);
        }

    }
}
