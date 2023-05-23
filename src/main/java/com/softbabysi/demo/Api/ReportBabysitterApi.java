package com.softbabysi.demo.Api;

import com.softbabysi.demo.Bl.ReportBabysitterBl;
import com.softbabysi.demo.Bl.ReportTutorBl;
import com.softbabysi.demo.Dto.BookingDto;
import com.softbabysi.demo.Dto.ReportBabysitterDto;
import com.softbabysi.demo.Dto.ReportTutorDto;
import com.softbabysi.demo.Dto.ResponseDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/reportbabysitter")
public class ReportBabysitterApi {
    @Autowired
    private ReportBabysitterBl reportBabysitterBl;

    @GetMapping("")
    public ResponseEntity<ResponseDto<List<ReportBabysitterDto>>> getAllReportBabysitter(){
        ResponseDto<List<ReportBabysitterDto>> responseDto = new ResponseDto<>();
        try {
            responseDto.setCode(0000);
            responseDto.setData(reportBabysitterBl.getAllReportBabysitter());
            responseDto.setMessage("ReportBabysitter retrieved successfully");
            return ResponseEntity.ok(responseDto);
        }catch (Exception e) {
            responseDto.setCode(500);
            responseDto.setMessage("error");
            return ResponseEntity.ok(responseDto);
        }

    }
}
