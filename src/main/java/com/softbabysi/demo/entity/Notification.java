package com.softbabysi.demo.entity;

import jakarta.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "NOTIFICATION")
public class Notification implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "NOTIFICATION_ID", nullable = false)
    private Integer notificationId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "BOOKING_ID", nullable = false)
    private Booking booking;

    @Column(name = "NOTIFICATION_MESSAGE", nullable = false)
    private String notificationMessage;

    // Getters and setters...

    public Notification() {
    }

    public Notification(Integer notificationId, Booking booking, String notificationMessage) {
        this.notificationId = notificationId;
        this.booking = booking;
        this.notificationMessage = notificationMessage;
    }

    public Integer getNotificationId() {
        return notificationId;
    }

    public void setNotificationId(Integer notificationId) {
        this.notificationId = notificationId;
    }

    public Booking getBooking() {
        return booking;
    }

    public void setBooking(Booking booking) {
        this.booking = booking;
    }

    public String getNotificationMessage() {
        return notificationMessage;
    }

    public void setNotificationMessage(String notificationMessage) {
        this.notificationMessage = notificationMessage;
    }
}
