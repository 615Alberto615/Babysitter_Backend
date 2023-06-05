package com.softbabysi.demo.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "SCHEDULE")
public class Schedule {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "SCHEDULE_ID", nullable = false)
    private Integer scheduleId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "BABYSITTER_ID", nullable = false)
    private Babysitter babysitter;

    @Column(name = "SCHEDULE_DAY_WEEK", nullable = false)
    private String scheduleDayWeek;

    @Column(name = "SCHEDULE_START_TIME", nullable = false)
    private Date scheduleStartTime;

    @Column(name = "SCHEDULE_END_TIME", nullable = false)
    private Date scheduleEndTime;

    @Column(name = "SCHEDULE_START_DATE", nullable = false)
    private Date scheduleStartDate;

    @Column(name = "SCHEDULE_END_DATE", nullable = false)
    private Date scheduleEndDate;

    // Getters and setters...

    // Otros métodos...


    public Schedule() {
    }

    public Schedule(Integer scheduleId, Babysitter babysitter, String scheduleDayWeek, Date scheduleStartTime, Date scheduleEndTime, Date scheduleStartDate, Date scheduleEndDate) {
        this.scheduleId = scheduleId;
        this.babysitter = babysitter;
        this.scheduleDayWeek = scheduleDayWeek;
        this.scheduleStartTime = scheduleStartTime;
        this.scheduleEndTime = scheduleEndTime;
        this.scheduleStartDate = scheduleStartDate;
        this.scheduleEndDate = scheduleEndDate;
    }

    public Integer getScheduleId() {
        return scheduleId;
    }

    public void setScheduleId(Integer scheduleId) {
        this.scheduleId = scheduleId;
    }

    public Babysitter getBabysitter() {
        return babysitter;
    }

    public void setBabysitter(Babysitter babysitter) {
        this.babysitter = babysitter;
    }

    public String getScheduleDayWeek() {
        return scheduleDayWeek;
    }

    public void setScheduleDayWeek(String scheduleDayWeek) {
        this.scheduleDayWeek = scheduleDayWeek;
    }

    public Date getScheduleStartTime() {
        return scheduleStartTime;
    }

    public void setScheduleStartTime(Date scheduleStartTime) {
        this.scheduleStartTime = scheduleStartTime;
    }

    public Date getScheduleEndTime() {
        return scheduleEndTime;
    }

    public void setScheduleEndTime(Date scheduleEndTime) {
        this.scheduleEndTime = scheduleEndTime;
    }

    public Date getScheduleStartDate() {
        return scheduleStartDate;
    }

    public void setScheduleStartDate(Date scheduleStartDate) {
        this.scheduleStartDate = scheduleStartDate;
    }

    public Date getScheduleEndDate() {
        return scheduleEndDate;
    }

    public void setScheduleEndDate(Date scheduleEndDate) {
        this.scheduleEndDate = scheduleEndDate;
    }

    @Override
    public String toString() {
        return "Schedule{" +
                "scheduleId=" + scheduleId +
                ", babysitter=" + babysitter +
                ", scheduleDayWeek='" + scheduleDayWeek + '\'' +
                ", scheduleStartTime=" + scheduleStartTime +
                ", scheduleEndTime=" + scheduleEndTime +
                ", scheduleStartDate=" + scheduleStartDate +
                ", scheduleEndDate=" + scheduleEndDate +
                '}';
    }
}
