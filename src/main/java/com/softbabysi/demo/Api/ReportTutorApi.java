package com.softbabysi.demo.Api;

import com.softbabysi.demo.Bl.ReportTutorBl;
import com.softbabysi.demo.Dto.BookingDto;
import com.softbabysi.demo.Dto.ReportTutorDto;
import com.softbabysi.demo.Dto.ResponseDto;
import com.softbabysi.demo.entity.ReportTutor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/reporttutor")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE})
public class ReportTutorApi {
    @Autowired
    private ReportTutorBl reportTutorBl;

    @GetMapping("")
    public ResponseEntity<ResponseDto<List<ReportTutorDto>>> getAllReportTutor(){
        ResponseDto<List<ReportTutorDto>> responseDto = new ResponseDto<>();
        try {
            responseDto.setCode(0000);
            responseDto.setData(reportTutorBl.getAllReportTutor());
            responseDto.setMessage("ReportTutor retrieved successfully");
            return ResponseEntity.ok(responseDto);
        }catch (Exception e) {
            responseDto.setCode(500);
            responseDto.setMessage("error");
            return ResponseEntity.ok(responseDto);
        }

    }

}
