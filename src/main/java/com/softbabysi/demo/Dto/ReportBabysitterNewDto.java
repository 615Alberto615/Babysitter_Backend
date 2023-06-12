package com.softbabysi.demo.Dto;

import java.util.Date;

public class ReportBabysitterNewDto {
    private Integer tutorId;
    private Integer babysitterId;
    private String reportBabysitterDeclaration;
    private Date reportBabysitterDate;

    public ReportBabysitterNewDto() {
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
        return "ReportBabysitterNewDto{" +
                "tutorId=" + tutorId +
                ", babysitterId=" + babysitterId +
                ", reportBabysitterDeclaration='" + reportBabysitterDeclaration + '\'' +
                ", reportBabysitterDate=" + reportBabysitterDate +
                '}';
    }
}
