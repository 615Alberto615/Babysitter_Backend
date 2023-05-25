package com.softbabysi.demo.dao;

import com.softbabysi.demo.entity.Schedule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ScheduleDao {
    @Autowired
    private ScheduleRepository scheduleRepository;

    public List<Schedule> getAllSchedule(){
        return scheduleRepository.findAll();
    }
}
