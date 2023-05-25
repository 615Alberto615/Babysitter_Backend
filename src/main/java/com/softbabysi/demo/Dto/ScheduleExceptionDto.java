package com.softbabysi.demo.Dto;

import java.util.Date;

public class ScheduleExceptionDto {
    private Integer exceptionId;
    private Integer scheduleId;
    private String exceptionDay;
    private Date exceptionStartTime;
    private Date exceptionEndTime;
    private Date exceptionDate;

    public ScheduleExceptionDto() {
    }

    public ScheduleExceptionDto(Integer exceptionId, Integer scheduleId, String exceptionDay, Date exceptionStartTime, Date exceptionEndTime, Date exceptionDate) {
        this.exceptionId = exceptionId;
        this.scheduleId = scheduleId;
        this.exceptionDay = exceptionDay;
        this.exceptionStartTime = exceptionStartTime;
        this.exceptionEndTime = exceptionEndTime;
        this.exceptionDate = exceptionDate;
    }

    public Integer getExceptionId() {
        return exceptionId;
    }

    public void setExceptionId(Integer exceptionId) {
        this.exceptionId = exceptionId;
    }

    public Integer getScheduleId() {
        return scheduleId;
    }

    public void setScheduleId(Integer scheduleId) {
        this.scheduleId = scheduleId;
    }

    public String getExceptionDay() {
        return exceptionDay;
    }

    public void setExceptionDay(String exceptionDay) {
        this.exceptionDay = exceptionDay;
    }

    public Date getExceptionStartTime() {
        return exceptionStartTime;
    }

    public void setExceptionStartTime(Date exceptionStartTime) {
        this.exceptionStartTime = exceptionStartTime;
    }

    public Date getExceptionEndTime() {
        return exceptionEndTime;
    }

    public void setExceptionEndTime(Date exceptionEndTime) {
        this.exceptionEndTime = exceptionEndTime;
    }

    public Date getExceptionDate() {
        return exceptionDate;
    }

    public void setExceptionDate(Date exceptionDate) {
        this.exceptionDate = exceptionDate;
    }
}
