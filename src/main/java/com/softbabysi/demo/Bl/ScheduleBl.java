package com.softbabysi.demo.Bl;

import com.softbabysi.demo.Dto.ScheduleDto;
import com.softbabysi.demo.dao.ScheduleDao;
import com.softbabysi.demo.entity.Schedule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ScheduleBl {
    @Autowired
    private ScheduleDao scheduleDao;

    public List<ScheduleDto> getAllSchedule(){
        List<Schedule> schedules=scheduleDao.getAllSchedule();

        List<ScheduleDto> res= new java.util.ArrayList<>();
        schedules.forEach(schedule -> {
            res.add(new ScheduleDto(schedule.getScheduleId(),schedule.getBabysitter().getBabysitterId(),
                    schedule.getScheduleDayWeek(),schedule.getScheduleStartTime(),schedule.getScheduleEndTime(),schedule.getScheduleStartDate(),schedule.getScheduleEndDate()));
        });

        return res;

    }
}
