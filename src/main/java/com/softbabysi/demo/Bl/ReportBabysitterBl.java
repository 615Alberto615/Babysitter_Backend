package com.softbabysi.demo.Bl;

import com.softbabysi.demo.Dto.ReportBabysitterDto;
import com.softbabysi.demo.dao.ReportBabysitterDao;
import com.softbabysi.demo.dao.ReportBabysitterRepository;
import com.softbabysi.demo.entity.Babysitter;
import com.softbabysi.demo.entity.ReportBabysitter;
import com.softbabysi.demo.entity.Tutor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ReportBabysitterBl {
    @Autowired
    private ReportBabysitterDao reportBabysitterDao;
    @Autowired
    private ReportBabysitterRepository reportBabysitterRepository;

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

    // obtener por id de tutor
    public List<ReportBabysitterDto> getReportBabysitterByTutorId(Integer tutorId){
        List<ReportBabysitter> reportBabysitters=reportBabysitterRepository.getReportBabysitterByTutorId(tutorId);

        List<ReportBabysitterDto> res= new ArrayList<>();
        reportBabysitters.forEach(reportBabysitter -> {
            res.add(new ReportBabysitterDto(reportBabysitter.getReportBabysitterId(),reportBabysitter.getTutor().getTutorId(),
                    reportBabysitter.getBabysitter().getBabysitterId(),reportBabysitter.getReportBabysitterDeclaration(),
                    reportBabysitter.getReportBabysitterDate()));
        });
        return res;
    }

    // crear un reporte
    public ReportBabysitterDto createReportBabysitter(ReportBabysitterDto reportBabysitterDto){
        ReportBabysitter reportBabysitter = new ReportBabysitter();
        Tutor tutor = new Tutor();
        tutor.setTutorId(reportBabysitterDto.getTutorId());
        Babysitter babysitter = new Babysitter();
        babysitter.setBabysitterId(reportBabysitterDto.getBabysitterId());
        reportBabysitter.setReportBabysitterDeclaration(reportBabysitterDto.getReportBabysitterDeclaration());
        reportBabysitter.setReportBabysitterDate(reportBabysitterDto.getReportBabysitterDate());
        reportBabysitter.setTutor(tutor);
        reportBabysitter.setBabysitter(babysitter);
        reportBabysitterRepository.save(reportBabysitter);
        return reportBabysitterDto;
    }
}
