package com.softbabysi.demo.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "CHILD_ACTIVITIES_FORM")
public class ChildActivitiesForm {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CHILD_ACTIVITIE_FORM_ID", nullable = false)
    private Integer childActivitieFormId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CHILD_ID", nullable = false)
    private Child child;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "TYPE_ACTIVITIES_ID", nullable = false)
    private ChildTypeActivities childTypeActivities;

    public ChildActivitiesForm() {
    }

    public ChildActivitiesForm(Integer childActivitieFormId, Child child, ChildTypeActivities childTypeActivities) {
        this.childActivitieFormId = childActivitieFormId;
        this.child = child;
        this.childTypeActivities = childTypeActivities;
    }

    public Integer getChildActivitieFormId() {
        return childActivitieFormId;
    }

    public void setChildActivitieFormId(Integer childActivitieFormId) {
        this.childActivitieFormId = childActivitieFormId;
    }

    public Child getChild() {
        return child;
    }

    public void setChild(Child child) {
        this.child = child;
    }

    public ChildTypeActivities getChildTypeActivities() {
        return childTypeActivities;
    }

    public void setChildTypeActivities(ChildTypeActivities childTypeActivities) {
        this.childTypeActivities = childTypeActivities;
    }

    @Override
    public String toString() {
        return "ChildActivitiesForm{" +
                "childActivitieFormId=" + childActivitieFormId +
                ", child=" + child +
                ", childTypeActivities=" + childTypeActivities +
                '}';
    }
}
