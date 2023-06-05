package com.softbabysi.demo.Dto;

public class TutorDto {
    private Integer tutorId;
    private Integer UserId;
    private boolean tutorStatus;

    public TutorDto() {
    }

    public TutorDto(Integer tutorId, Integer userId, boolean tutorStatus) {
        this.tutorId = tutorId;
        UserId = userId;
        this.tutorStatus = tutorStatus;
    }

    public Integer getTutorId() {
        return tutorId;
    }

    public void setTutorId(Integer tutorId) {
        this.tutorId = tutorId;
    }

    public Integer getUserId() {
        return UserId;
    }

    public void setUserId(Integer userId) {
        UserId = userId;
    }

    public boolean isTutorStatus() {
        return tutorStatus;
    }

    public void setTutorStatus(boolean tutorStatus) {
        this.tutorStatus = tutorStatus;
    }

    @Override
    public String toString() {
        return "TutorDto{" +
                "tutorId=" + tutorId +
                ", UserId=" + UserId +
                ", tutorStatus=" + tutorStatus +
                '}';
    }
}

