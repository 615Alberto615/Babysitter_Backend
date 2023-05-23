package com.softbabysi.demo.dao;

import com.softbabysi.demo.entity.ReportTutor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReportTutorDao {
    @Autowired
    private ReportTutorRepository reportTutorRepository;

    public List<ReportTutor> getAllReportTutor(){
        return reportTutorRepository.findAll();
    }
}
