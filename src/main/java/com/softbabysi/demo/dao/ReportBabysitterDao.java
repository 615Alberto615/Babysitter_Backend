package com.softbabysi.demo.dao;
import com.softbabysi.demo.entity.ReportBabysitter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReportBabysitterDao {
    @Autowired
    private ReportBabysitterRepository reportBabysitterRepository;

    public List<ReportBabysitter> getAllReportBabysitter(){
        return reportBabysitterRepository.findAll();
    }
}
