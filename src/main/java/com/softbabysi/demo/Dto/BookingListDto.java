package com.softbabysi.demo.Dto;

import java.util.Date;

public class BookingListDto {
    private Integer bookingId;
    private String userName;
    private String userLastName;
    private Integer babysitterId;
    private Integer tutorId;
    private String bookingChild; // Backed dato por default
    private Integer bookingEstimatedTime;
    private Date bookingTimeStart;
    private Date bookingTimeEnd;
    private Date bookingDate;
    private Boolean bookingStatus;
    private Integer bookingCompleted;
    private Boolean bookingPaid;
    private Double bookingAmount;

    public BookingListDto() {
    }

    public BookingListDto(Integer bookingId, String userName, String userLastName, Integer babysitterId, Integer tutorId, String bookingChild, Integer bookingEstimatedTime, Date bookingTimeStart, Date bookingTimeEnd, Date bookingDate, Boolean bookingStatus, Integer bookingCompleted, Boolean bookingPaid, Double bookingAmount) {
        this.bookingId = bookingId;
        this.userName = userName;
        this.userLastName = userLastName;
        this.babysitterId = babysitterId;
        this.tutorId = tutorId;
        this.bookingChild = bookingChild;
        this.bookingEstimatedTime = bookingEstimatedTime;
        this.bookingTimeStart = bookingTimeStart;
        this.bookingTimeEnd = bookingTimeEnd;
        this.bookingDate = bookingDate;
        this.bookingStatus = bookingStatus;
        this.bookingCompleted = bookingCompleted;
        this.bookingPaid = bookingPaid;
        this.bookingAmount = bookingAmount;
    }

    public Integer getBookingId() {
        return bookingId;
    }

    public void setBookingId(Integer bookingId) {
        this.bookingId = bookingId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserLastName() {
        return userLastName;
    }

    public void setUserLastName(String userLastName) {
        this.userLastName = userLastName;
    }

    public Integer getBabysitterId() {
        return babysitterId;
    }

    public void setBabysitterId(Integer babysitterId) {
        this.babysitterId = babysitterId;
    }

    public Integer getTutorId() {
        return tutorId;
    }

    public void setTutorId(Integer tutorId) {
        this.tutorId = tutorId;
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

    public Double getBookingAmount() {
        return bookingAmount;
    }

    public void setBookingAmount(Double bookingAmount) {
        this.bookingAmount = bookingAmount;
    }

    @Override
    public String toString() {
        return "BookingListDto{" +
                "bookingId=" + bookingId +
                ", userName='" + userName + '\'' +
                ", userLastName='" + userLastName + '\'' +
                ", babysitterId=" + babysitterId +
                ", tutorId=" + tutorId +
                ", bookingChild='" + bookingChild + '\'' +
                ", bookingEstimatedTime=" + bookingEstimatedTime +
                ", bookingTimeStart=" + bookingTimeStart +
                ", bookingTimeEnd=" + bookingTimeEnd +
                ", bookingDate=" + bookingDate +
                ", bookingStatus=" + bookingStatus +
                ", bookingCompleted=" + bookingCompleted +
                ", bookingPaid=" + bookingPaid +
                ", bookingAmount=" + bookingAmount +
                '}';
    }
}
