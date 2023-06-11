package com.softbabysi.demo.Dto;

public class ChildActivitiesFormEditDto {
    private Integer childId;
    private Integer childTypeActivitiesId;

    public ChildActivitiesFormEditDto() {
    }

    public ChildActivitiesFormEditDto(Integer childId, Integer childTypeActivitiesId) {
        this.childId = childId;
        this.childTypeActivitiesId = childTypeActivitiesId;
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
        return "ChildActivitiesFormEditDto{" +
                "childId=" + childId +
                ", childTypeActivitiesId=" + childTypeActivitiesId +
                '}';
    }
}
