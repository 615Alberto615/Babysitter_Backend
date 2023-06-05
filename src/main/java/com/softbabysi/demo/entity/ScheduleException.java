package com.softbabysi.demo.entity;

import jakarta.persistence.*;

import java.util.Date;
@Entity
@Table(name = "EXCEPTION")
public class ScheduleException {

    @Id
    @Column(name = "EXCEPTION_ID", nullable = false)
    private Integer exceptionId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "SCHEDULE_ID", nullable = false)
    private Schedule schedule;

    @Column(name = "EXCEPTION_DAY", nullable = false)
    private String exceptionDay;

    @Column(name = "EXCEPTION_START_TIME", nullable = false)
    private Date exceptionStartTime;

    @Column(name = "EXCEPTION_END_TIME", nullable = false)
    private Date exceptionEndTime;

    @Column(name = "EXCEPTION_DATE", nullable = false)
    private Date exceptionDate;

    // Getters and setters...

    // Otros métodos...

    public ScheduleException() {
    }

    public ScheduleException(Integer exceptionId, Schedule schedule, String exceptionDay, Date exceptionStartTime, Date exceptionEndTime, Date exceptionDate) {
        this.exceptionId = exceptionId;
        this.schedule = schedule;
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

    public Schedule getSchedule() {
        return schedule;
    }

    public void setSchedule(Schedule schedule) {
        this.schedule = schedule;
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

    @Override
    public String toString() {
        return "ScheduleException{" +
                "exceptionId=" + exceptionId +
                ", schedule=" + schedule +
                ", exceptionDay='" + exceptionDay + '\'' +
                ", exceptionStartTime=" + exceptionStartTime +
                ", exceptionEndTime=" + exceptionEndTime +
                ", exceptionDate=" + exceptionDate +
                '}';
    }
}


