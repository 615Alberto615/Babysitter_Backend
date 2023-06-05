package com.softbabysi.demo.Dto;

import java.util.Date;

public class ReportTutorDto {
    private Integer reportTutorId;
    private Integer tutorId;
    private Integer babysitterId;
    private String reportTutorDeclaration;
    private Date reportTutorDate;

    public ReportTutorDto() {
    }

    public ReportTutorDto(Integer reportTutorId, Integer tutorId, Integer babysitterId, String reportTutorDeclaration, Date reportTutorDate) {
        this.reportTutorId = reportTutorId;
        this.tutorId = tutorId;
        this.babysitterId = babysitterId;
        this.reportTutorDeclaration = reportTutorDeclaration;
        this.reportTutorDate = reportTutorDate;
    }

    public Integer getReportTutorId() {
        return reportTutorId;
    }

    public void setReportTutorId(Integer reportTutorId) {
        this.reportTutorId = reportTutorId;
    }

    public Integer getTutorId() {
        return tutorId;
    }

    public void setTutorId(Integer tutorId) {
        this.tutorId = tutorId;
    }

    public Integer getBabysitterId() {
        return babysitterId;
    }

    public void setBabysitterId(Integer babysitterId) {
        this.babysitterId = babysitterId;
    }

    public String getReportTutorDeclaration() {
        return reportTutorDeclaration;
    }

    public void setReportTutorDeclaration(String reportTutorDeclaration) {
        this.reportTutorDeclaration = reportTutorDeclaration;
    }

    public Date getReportTutorDate() {
        return reportTutorDate;
    }

    public void setReportTutorDate(Date reportTutorDate) {
        this.reportTutorDate = reportTutorDate;
    }

    @Override
    public String toString() {
        return "ReportTutorDto{" +
                "reportTutorId=" + reportTutorId +
                ", tutorId=" + tutorId +
                ", babysitterId=" + babysitterId +
                ", reportTutorDeclaration='" + reportTutorDeclaration + '\'' +
                ", reportTutorDate=" + reportTutorDate +
                '}';
    }
}
