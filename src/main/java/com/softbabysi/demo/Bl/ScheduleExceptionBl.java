package com.softbabysi.demo.Bl;


import com.softbabysi.demo.Dto.ScheduleExceptionDto;
import com.softbabysi.demo.dao.ScheduleExceptionDao;
import com.softbabysi.demo.entity.ScheduleException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ScheduleExceptionBl {
    @Autowired
    private ScheduleExceptionDao scheduleExceptionDao;

    public List<ScheduleExceptionDto> getAllScheduleException(){
        List<ScheduleException> scheduleExceptions=scheduleExceptionDao.getAllScheduleException();

        List<ScheduleExceptionDto> res= new ArrayList<>();
        scheduleExceptions.forEach(scheduleException -> {
            res.add(new ScheduleExceptionDto(scheduleException.getExceptionId(),scheduleException.getSchedule().getScheduleId(),scheduleException.getExceptionDay(),scheduleException.getExceptionStartTime(),scheduleException.getExceptionEndTime(),scheduleException.getExceptionDate()));
        });

        return res;
    }
}
