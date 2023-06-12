package com.softbabysi.demo.Dto;

import java.util.Date;

public class ReportTutorNewDto {
    private Integer tutorId;
    private Integer babysitterId;
    private String reportTutorDeclaration;
    private Date reportTutorDate;

    public ReportTutorNewDto() {
    }

    public ReportTutorNewDto(Integer tutorId, Integer babysitterId, String reportTutorDeclaration, Date reportTutorDate) {
        this.tutorId = tutorId;
        this.babysitterId = babysitterId;
        this.reportTutorDeclaration = reportTutorDeclaration;
        this.reportTutorDate = reportTutorDate;
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
        return "ReportTutorNewDto{" +
                "tutorId=" + tutorId +
                ", babysitterId=" + babysitterId +
                ", reportTutorDeclaration='" + reportTutorDeclaration + '\'' +
                ", reportTutorDate=" + reportTutorDate +
                '}';
    }
}
