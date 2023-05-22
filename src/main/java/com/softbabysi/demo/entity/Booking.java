package com.softbabysi.demo.entity;
import jakarta.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "BOOKING")
public class Booking implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "BOOKING_ID", nullable = false)
    private Integer bookingId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "BABYSITTER_ID", nullable = false)
    private Babysitter babysitter;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "TUTOR_ID", nullable = false)
    private Tutor tutor;

    @Column(name = "BOOKING_CHILD", nullable = false)
    private String bookingChild;

    @Column(name = "BOOKING_ESTIMATED_TIME", nullable = false)
    private Integer bookingEstimatedTime;

    @Column(name = "BOOKING_TIME_STAR", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date bookingTimeStart;

    @Column(name = "BOOKING_TIME_END", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date bookingTimeEnd;

    @Column(name = "BOOKING_DATE", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date bookingDate;

    @Column(name = "BOOKING_STATUS", nullable = false)
    private Boolean bookingStatus;

    @Column(name = "BOOKING_COMPLETED", nullable = false)
    private Integer bookingCompleted;

    @Column(name = "BOOKING_PAID", nullable = false)
    private Boolean bookingPaid;


    // Getters and setters...


    public Booking() {
    }

    public Booking(Integer bookingId, Babysitter babysitter, Tutor tutor, String bookingChild, Integer bookingEstimatedTime, Date bookingTimeStart, Date bookingTimeEnd, Date bookingDate, Boolean bookingStatus, Integer bookingCompleted, Boolean bookingPaid) {
        this.bookingId = bookingId;
        this.babysitter = babysitter;
        this.tutor = tutor;
        this.bookingChild = bookingChild;
        this.bookingEstimatedTime = bookingEstimatedTime;
        this.bookingTimeStart = bookingTimeStart;
        this.bookingTimeEnd = bookingTimeEnd;
        this.bookingDate = bookingDate;
        this.bookingStatus = bookingStatus;
        this.bookingCompleted = bookingCompleted;
        this.bookingPaid = bookingPaid;
    }

    public Integer getBookingId() {
        return bookingId;
    }

    public void setBookingId(Integer bookingId) {
        this.bookingId = bookingId;
    }

    public Babysitter getBabysitter() {
        return babysitter;
    }

    public void setBabysitter(Babysitter babysitter) {
        this.babysitter = babysitter;
    }

    public Tutor getTutor() {
        return tutor;
    }

    public void setTutor(Tutor tutor) {
        this.tutor = tutor;
    }

    public String getBookingChild() {
        return bookingChild;
    }

    public void setBookingChild(String bookingChild) {
        this.bookingChild = bookingChild;
    }

    public Integer getBookingEstimatedTime() {
        return bookingEstimatedTime;
    }

    public void setBookingEstimatedTime(Integer bookingEstimatedTime) {
        this.bookingEstimatedTime = bookingEstimatedTime;
    }

    public Date getBookingTimeStart() {
        return bookingTimeStart;
    }

    public void setBookingTimeStart(Date bookingTimeStart) {
        this.bookingTimeStart = bookingTimeStart;
    }

    public Date getBookingTimeEnd() {
        return bookingTimeEnd;
    }

    public void setBookingTimeEnd(Date bookingTimeEnd) {
        this.bookingTimeEnd = bookingTimeEnd;
    }

    public Date getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(Date bookingDate) {
        this.bookingDate = bookingDate;
    }

    public Boolean getBookingStatus() {
        return bookingStatus;
    }

    public void setBookingStatus(Boolean bookingStatus) {
        this.bookingStatus = bookingStatus;
    }

    public Integer getBookingCompleted() {
        return bookingCompleted;
    }

    public void setBookingCompleted(Integer bookingCompleted) {
        this.bookingCompleted = bookingCompleted;
    }

    public Boolean getBookingPaid() {
        return bookingPaid;
    }

    public void setBookingPaid(Boolean bookingPaid) {
        this.bookingPaid = bookingPaid;
    }
}
