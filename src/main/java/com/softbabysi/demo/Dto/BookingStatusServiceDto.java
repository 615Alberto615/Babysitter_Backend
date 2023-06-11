package com.softbabysi.demo.Dto;

public class BookingStatusServiceDto {
    private Integer bookingCompleted;

    private Double bookingAmount;


    public BookingStatusServiceDto() {
    }

    public BookingStatusServiceDto(Integer bookingCompleted, Double bookingAmount) {
        this.bookingCompleted = bookingCompleted;
        this.bookingAmount = bookingAmount;
    }

    public Integer getBookingCompleted() {
        return bookingCompleted;
    }

    public void setBookingCompleted(Integer bookingCompleted) {
        this.bookingCompleted = bookingCompleted;
    }

    public Double getBookingAmount() {
        return bookingAmount;
    }

    public void setBookingAmount(Double bookingAmount) {
        this.bookingAmount = bookingAmount;
    }

    @Override
    public String toString() {
        return "BookingStatusServiceDto{" +
                "bookingCompleted=" + bookingCompleted +
                ", bookingAmount=" + bookingAmount +
                '}';
    }
}
