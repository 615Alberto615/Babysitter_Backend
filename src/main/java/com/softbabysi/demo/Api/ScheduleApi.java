package com.softbabysi.demo.Api;

import com.softbabysi.demo.Bl.ScheduleBl;
import com.softbabysi.demo.Dto.ResponseDto;
import com.softbabysi.demo.Dto.ScheduleDto;
import com.softbabysi.demo.Dto.ScheduleExceptionDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/schedule")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE})
public class ScheduleApi {
    @Autowired
    private ScheduleBl scheduleBl;

    @GetMapping("")
    public ResponseEntity<ResponseDto<List<ScheduleDto>>> getAllSchedule(){
        ResponseDto<List<ScheduleDto>> responseDto = new ResponseDto<>();
        try {
            responseDto.setCode(0000);
            responseDto.setData(scheduleBl.getAllSchedule());
            responseDto.setMessage("Schedule retrieved successfully");
            return ResponseEntity.ok(responseDto);
        }catch (Exception e) {
            responseDto.setCode(500);
            responseDto.setMessage("error");
            return ResponseEntity.ok(responseDto);
        }
    }
}
