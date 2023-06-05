package com.softbabysi.demo.Dto;

public class ChildActivitiesFormDto {
    private Integer childActivitieFormId;
    private Integer childId;
    private Integer childTypeActivitiesId;

    public ChildActivitiesFormDto() {
    }

    public ChildActivitiesFormDto(Integer childActivitieFormId, Integer childId, Integer childTypeActivitiesId) {
        this.childActivitieFormId = childActivitieFormId;
        this.childId = childId;
        this.childTypeActivitiesId = childTypeActivitiesId;
    }

    public Integer getChildActivitieFormId() {
        return childActivitieFormId;
    }

    public void setChildActivitieFormId(Integer childActivitieFormId) {
        this.childActivitieFormId = childActivitieFormId;
    }

    public Integer getChildId() {
        return childId;
    }

    public void setChildId(Integer childId) {
        this.childId = childId;
    }

    public Integer getChildTypeActivitiesId() {
        return childTypeActivitiesId;
    }

    public void setChildTypeActivitiesId(Integer childTypeActivitiesId) {
        this.childTypeActivitiesId = childTypeActivitiesId;
    }

    @Override
    public String toString() {
        return "ChildActivitiesFormDto{" +
                "childActivitieFormId=" + childActivitieFormId +
                ", childId=" + childId +
                ", childTypeActivitiesId=" + childTypeActivitiesId +
                '}';
    }
}
