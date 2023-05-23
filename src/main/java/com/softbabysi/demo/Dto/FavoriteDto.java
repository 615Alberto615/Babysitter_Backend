package com.softbabysi.demo.Dto;

public class FavoriteDto {
    private Integer favoriteId;
    private Integer tutorId;
    private Integer babysitterId;

    public FavoriteDto() {
    }

    public FavoriteDto(Integer favoriteId, Integer tutorId, Integer babysitterId) {
        this.favoriteId = favoriteId;
        this.tutorId = tutorId;
        this.babysitterId = babysitterId;
    }

    public Integer getFavoriteId() {
        return favoriteId;
    }

    public void setFavoriteId(Integer favoriteId) {
        this.favoriteId = favoriteId;
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
}
