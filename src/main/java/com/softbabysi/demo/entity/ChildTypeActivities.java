package com.softbabysi.demo.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "CHILD_TYPE_ACTIVITIES")
public class ChildTypeActivities {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "TYPE_ACTIVITIES_ID", nullable = false)
    private Integer typeActivitiesId;

    @Column(name = "TYPE_ACTIVITIE", nullable = false)
    private String typeActivitie;

    public ChildTypeActivities() {
    }

    public ChildTypeActivities(Integer typeActivitiesId, String typeActivitie) {
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
        return "ChildTypeActivities{" +
                "typeActivitiesId=" + typeActivitiesId +
                ", typeActivitie='" + typeActivitie + '\'' +
                '}';
    }
}
