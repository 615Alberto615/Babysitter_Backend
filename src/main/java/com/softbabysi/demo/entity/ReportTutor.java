package com.softbabysi.demo.entity;
import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "REPORT_TUTOR")
public class ReportTutor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "REPORT_TUTOR_ID", nullable = false)
    private Integer reportTutorId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "TUTOR_ID", nullable = false)
    private Tutor tutor;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "BABYSITTER_ID", nullable = false)
    private Babysitter babysitter;

    @Column(name = "REPORT_TUTOR_DECLARATION", nullable = false)
    private String reportTutorDeclaration;

    @Column(name = "REPORT_TUTOR_DATE", nullable = false)
    private Date reportTutorDate;

    // Getters and setters...

    public ReportTutor() {
    }

    public ReportTutor(Integer reportTutorId, Tutor tutor, Babysitter babysitter, String reportTutorDeclaration, Date reportTutorDate) {
        this.reportTutorId = reportTutorId;
        this.tutor = tutor;
        this.babysitter = babysitter;
        this.reportTutorDeclaration = reportTutorDeclaration;
        this.reportTutorDate = reportTutorDate;
    }

    public Integer getReportTutorId() {
        return reportTutorId;
    }

    public void setReportTutorId(Integer reportTutorId) {
        this.reportTutorId = reportTutorId;
    }

    public Tutor getTutor() {
        return tutor;
    }

    public void setTutor(Tutor tutor) {
        this.tutor = tutor;
    }

    public Babysitter getBabysitter() {
        return babysitter;
    }

    public void setBabysitter(Babysitter babysitter) {
        this.babysitter = babysitter;
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
        return "ReportTutor{" +
                "reportTutorId=" + reportTutorId +
                ", tutor=" + tutor +
                ", babysitter=" + babysitter +
                ", reportTutorDeclaration='" + reportTutorDeclaration + '\'' +
                ", reportTutorDate=" + reportTutorDate +
                '}';
    }
}
