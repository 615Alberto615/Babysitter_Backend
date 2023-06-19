package com.softbabysi.demo.Api;

import com.softbabysi.demo.Bl.ReportBabysitterBl;
import com.softbabysi.demo.Bl.ReportTutorBl;
import com.softbabysi.demo.Bl.UserBl;
import com.softbabysi.demo.Dto.BookingDto;
import com.softbabysi.demo.Dto.ReportBabysitterDto;
import com.softbabysi.demo.Dto.ReportTutorDto;
import com.softbabysi.demo.Dto.ResponseDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/reportbabysitter")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE})
public class ReportBabysitterApi {
    @Autowired
    private ReportBabysitterBl reportBabysitterBl;

    @Autowired
    private UserBl userBl;

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

    //Agregar un nuevo reporte
    @PostMapping("")
    public ResponseEntity<ResponseDto<ReportBabysitterDto>> addReportBabysitter(@RequestBody ReportBabysitterDto reportBabysitterDto, @RequestHeader("Authorization") String token){
        ResponseDto<ReportBabysitterDto> responseDto = new ResponseDto<>();
        try {
            if(!userBl.validateToken(token)){
                return ResponseEntity.status(401).body(new ResponseDto<>(401, null, "Unauthorized"));
            }
            responseDto.setCode(200);
            responseDto.setData(reportBabysitterBl.createReportBabysitter(reportBabysitterDto));
            responseDto.setMessage("ReportBabysitter added successfully");
            return ResponseEntity.ok(responseDto);
        }catch (Exception e) {
            responseDto.setCode(400);
            responseDto.setMessage("error");
            return ResponseEntity.ok(responseDto);
        }

    }

    //obtener por id de tutor
    @GetMapping("/tutor/{tutorId}")
    public ResponseEntity<ResponseDto<List<ReportBabysitterDto>>> getReportBabysitterByTutorId(@PathVariable Integer tutorId, @RequestHeader("Authorization") String token){
        ResponseDto<List<ReportBabysitterDto>> responseDto = new ResponseDto<>();
        try {
            if(!userBl.validateToken(token)){
                return ResponseEntity.status(401).body(new ResponseDto<>(401, null, "Unauthorized"));
            }
            responseDto.setCode(200);
            responseDto.setData(reportBabysitterBl.getReportBabysitterByTutorId(tutorId));
            responseDto.setMessage("ReportBabysitter retrieved successfully");
            return ResponseEntity.ok(responseDto);
        }catch (Exception e) {
            responseDto.setCode(400);
            responseDto.setMessage("error");
            return ResponseEntity.ok(responseDto);
        }
    }

}
