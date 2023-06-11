package com.softbabysi.demo.Dto;

public class LocationDto {
    private Integer seLocationId;

    public LocationDto() {
    }

    public LocationDto(Integer seLocationId) {
        this.seLocationId = seLocationId;
    }

    public Integer getSeLocationId() {
        return seLocationId;
    }

    public void setSeLocationId(Integer seLocationId) {
        this.seLocationId = seLocationId;
    }

    @Override
    public String toString() {
        return "LocationDto{" +
                "seLocationId=" + seLocationId +
                '}';
    }
}
