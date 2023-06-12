package com.softbabysi.demo.Dto;

public class ScheduleNewDto {
    private Integer babysitterId;
    private String scheduleDayWeek;
    private String scheduleStartTime;
    private String scheduleEndTime;
    private String scheduleStartDate;
    private String scheduleEndDate;

    public ScheduleNewDto() {
    }

    public ScheduleNewDto(Integer babysitterId, String scheduleDayWeek, String scheduleStartTime, String scheduleEndTime, String scheduleStartDate, String scheduleEndDate) {
        this.babysitterId = babysitterId;
        this.scheduleDayWeek = scheduleDayWeek;
        this.scheduleStartTime = scheduleStartTime;
        this.scheduleEndTime = scheduleEndTime;
        this.scheduleStartDate = scheduleStartDate;
        this.scheduleEndDate = scheduleEndDate;
    }


    public Integer getBabysitterId() {
        return babysitterId;
    }

    public void setBabysitterId(Integer babysitterId) {
        this.babysitterId = babysitterId;
    }

    public String getScheduleDayWeek() {
        return scheduleDayWeek;
    }

    public void setScheduleDayWeek(String scheduleDayWeek) {
        this.scheduleDayWeek = scheduleDayWeek;
    }

    public String getScheduleStartTime() {
        return scheduleStartTime;
    }

    public void setScheduleStartTime(String scheduleStartTime) {
        this.scheduleStartTime = scheduleStartTime;
    }

    public String getScheduleEndTime() {
        return scheduleEndTime;
    }

    public void setScheduleEndTime(String scheduleEndTime) {
        this.scheduleEndTime = scheduleEndTime;
    }

    public String getScheduleStartDate() {
        return scheduleStartDate;
    }

    public void setScheduleStartDate(String scheduleStartDate) {
        this.scheduleStartDate = scheduleStartDate;
    }

    public String getScheduleEndDate() {
        return scheduleEndDate;
    }

    public void setScheduleEndDate(String scheduleEndDate) {
        this.scheduleEndDate = scheduleEndDate;
    }

    @Override
    public String toString() {
        return "ScheduleNewDto{" +
                "babysitterId=" + babysitterId +
                ", scheduleDayWeek='" + scheduleDayWeek + '\'' +
                ", scheduleStartTime='" + scheduleStartTime + '\'' +
                ", scheduleEndTime='" + scheduleEndTime + '\'' +
                ", scheduleStartDate='" + scheduleStartDate + '\'' +
                ", scheduleEndDate='" + scheduleEndDate + '\'' +
                '}';
    }
}
