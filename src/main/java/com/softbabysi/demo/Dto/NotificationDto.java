package com.softbabysi.demo.Dto;

public class NotificationDto {

    private Integer notificationId;
    private Integer bookingId;
    private Integer notificationMessage;

    public NotificationDto() {
    }

    public NotificationDto(Integer notificationId, Integer bookingId, Integer notificationMessage) {
        this.notificationId = notificationId;
        this.bookingId = bookingId;
        this.notificationMessage = notificationMessage;
    }

    public Integer getNotificationId() {
        return notificationId;
    }

    public void setNotificationId(Integer notificationId) {
        this.notificationId = notificationId;
    }

    public Integer getBookingId() {
        return bookingId;
    }

    public void setBookingId(Integer bookingId) {
        this.bookingId = bookingId;
    }

    public Integer getNotificationMessage() {
        return notificationMessage;
    }

    public void setNotificationMessage(Integer notificationMessage) {
        this.notificationMessage = notificationMessage;
    }
}
