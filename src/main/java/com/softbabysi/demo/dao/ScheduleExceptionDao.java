package com.softbabysi.demo.dao;

import com.softbabysi.demo.entity.ScheduleException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ScheduleExceptionDao {
    @Autowired
    private ScheduleExceptionRepository exceptionRepository;

    public List<ScheduleException> getAllScheduleException(){
        return exceptionRepository.findAll();
    }
}
