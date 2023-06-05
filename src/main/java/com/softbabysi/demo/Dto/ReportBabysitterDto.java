package com.softbabysi.demo.Dto;

import java.util.Date;

public class ReportBabysitterDto {
    private Integer reportBabysitterId;
    private Integer tutorId;
    private Integer babysitterId;
    private String reportBabysitterDeclaration;
    private Date reportBabysitterDate;

    public ReportBabysitterDto() {
    }

    public ReportBabysitterDto(Integer reportBabysitterId, Integer tutorId, Integer babysitterId, String reportBabysitterDeclaration, Date reportBabysitterDate) {
        this.reportBabysitterId = reportBabysitterId;
        this.tutorId = tutorId;
        this.babysitterId = babysitterId;
        this.reportBabysitterDeclaration = reportBabysitterDeclaration;
        this.reportBabysitterDate = reportBabysitterDate;
    }

    public Integer getReportBabysitterId() {
        return reportBabysitterId;
    }

    public void setReportBabysitterId(Integer reportBabysitterId) {
        this.reportBabysitterId = reportBabysitterId;
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

    public String getReportBabysitterDeclaration() {
        return reportBabysitterDeclaration;
    }

    public void setReportBabysitterDeclaration(String reportBabysitterDeclaration) {
        this.reportBabysitterDeclaration = reportBabysitterDeclaration;
    }

    public Date getReportBabysitterDate() {
        return reportBabysitterDate;
    }

    public void setReportBabysitterDate(Date reportBabysitterDate) {
        this.reportBabysitterDate = reportBabysitterDate;
    }

    @Override
    public String toString() {
        return "ReportBabysitterDto{" +
                "reportBabysitterId=" + reportBabysitterId +
                ", tutorId=" + tutorId +
                ", babysitterId=" + babysitterId +
                ", reportBabysitterDeclaration='" + reportBabysitterDeclaration + '\'' +
                ", reportBabysitterDate=" + reportBabysitterDate +
                '}';
    }
}
