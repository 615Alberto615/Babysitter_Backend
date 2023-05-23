package com.softbabysi.demo.entity;
import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "REPORT_BABYSITTER")
public class ReportBabysitter {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "REPORT_BABYSITTER_ID", nullable = false)
    private Integer reportBabysitterId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "TUTOR_ID", nullable = false)
    private Tutor tutor;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "BABYSITTER_ID", nullable = false)
    private Babysitter babysitter;

    @Column(name = "REPORT_BABYSITTER_DECLARATION", nullable = false)
    private String reportBabysitterDeclaration;

    @Column(name = "REPORT_BABYSITTER_DATE", nullable = false)
    private Date reportBabysitterDate;

    // Getters and setters...

    public ReportBabysitter() {
    }

    public ReportBabysitter(Integer reportBabysitterId, Tutor tutor, Babysitter babysitter, String reportBabysitterDeclaration, Date reportBabysitterDate) {
        this.reportBabysitterId = reportBabysitterId;
        this.tutor = tutor;
        this.babysitter = babysitter;
        this.reportBabysitterDeclaration = reportBabysitterDeclaration;
        this.reportBabysitterDate = reportBabysitterDate;
    }

    public Integer getReportBabysitterId() {
        return reportBabysitterId;
    }

    public void setReportBabysitterId(Integer reportBabysitterId) {
        this.reportBabysitterId = reportBabysitterId;
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
}
