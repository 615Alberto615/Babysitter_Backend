package com.softbabysi.demo.Bl;

import com.softbabysi.demo.Dto.BookingDto;
import com.softbabysi.demo.Dto.ReportTutorDto;
import com.softbabysi.demo.Dto.ResponseDto;
import com.softbabysi.demo.dao.ReportTutorDao;
import com.softbabysi.demo.entity.Booking;
import com.softbabysi.demo.entity.ReportTutor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ReportTutorBl {
    @Autowired
    private ReportTutorDao reportTutorDao;

    public List<ReportTutorDto> getAllReportTutor(){
        List<ReportTutor> reportTutors=reportTutorDao.getAllReportTutor();

        List<ReportTutorDto> res= new ArrayList<>();
        reportTutors.forEach(reportTutor -> {
            res.add(new ReportTutorDto(reportTutor.getReportTutorId(),reportTutor.getTutor().getTutorId(),
                    reportTutor.getBabysitter().getBabysitterId(),reportTutor.getReportTutorDeclaration(),
                    reportTutor.getReportTutorDate()));
        });
        return res;
    }

}
