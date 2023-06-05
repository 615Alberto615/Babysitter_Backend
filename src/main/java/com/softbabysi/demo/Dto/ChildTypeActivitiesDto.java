package com.softbabysi.demo.Dto;

public class ChildTypeActivitiesDto {
    private Integer typeActivitiesId;

    private String typeActivitie;

    public ChildTypeActivitiesDto() {
    }

    public ChildTypeActivitiesDto(Integer typeActivitiesId, String typeActivitie) {
        this.typeActivitiesId = typeActivitiesId;
        this.typeActivitie = typeActivitie;
    }

    public Integer getTypeActivitiesId() {
        return typeActivitiesId;
    }

    public void setTypeActivitiesId(Integer typeActivitiesId) {
        this.typeActivitiesId = typeActivitiesId;
    }

    public String getTypeActivitie() {
        return typeActivitie;
    }

    public void setTypeActivitie(String typeActivitie) {
        this.typeActivitie = typeActivitie;
    }

    @Override
    public String toString() {
        return "ChildTypeActivitiesDto{" +
                "typeActivitiesId=" + typeActivitiesId +
                ", typeActivitie='" + typeActivitie + '\'' +
                '}';
    }
}
