package com.softbabysi.demo.Bl;

import com.softbabysi.demo.Dto.ReportBabysitterDto;
import com.softbabysi.demo.dao.ReportBabysitterDao;
import com.softbabysi.demo.entity.ReportBabysitter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ReportBabysitterBl {
    @Autowired
    private ReportBabysitterDao reportBabysitterDao;

    public List<ReportBabysitterDto> getAllReportBabysitter(){
        List<ReportBabysitter> reportBabysitters=reportBabysitterDao.getAllReportBabysitter();

        List<ReportBabysitterDto> res= new ArrayList<>();
        reportBabysitters.forEach(reportBabysitter -> {
            res.add(new ReportBabysitterDto(reportBabysitter.getReportBabysitterId(),reportBabysitter.getTutor().getTutorId(),
                    reportBabysitter.getBabysitter().getBabysitterId(),reportBabysitter.getReportBabysitterDeclaration(),
                    reportBabysitter.getReportBabysitterDate()));
        });
        return res;
    }
}
