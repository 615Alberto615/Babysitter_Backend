package com.softbabysi.demo.Dto;

public class ChildDto {
    private Integer childId;
    private Integer tutorId;
    private String childName;
    private String childBirthdate;
    private String childPhoneEmergency;
    private Integer childGender;
    private Integer childTutor;


    public ChildDto() {
    }

    public ChildDto(Integer childId, Integer tutorId, String childName, String childBirthdate, String childPhoneEmergency, Integer childGender, Integer childTutor) {
        this.childId = childId;
        this.tutorId = tutorId;
        this.childName = childName;
        this.childBirthdate = childBirthdate;
        this.childPhoneEmergency = childPhoneEmergency;
        this.childGender = childGender;
        this.childTutor = childTutor;
    }

    public Integer getChildId() {
        return childId;
    }

    public void setChildId(Integer childId) {
        this.childId = childId;
    }

    public Integer getTutorId() {
        return tutorId;
    }

    public void setTutorId(Integer tutorId) {
        this.tutorId = tutorId;
    }

    public String getChildName() {
        return childName;
    }

    public void setChildName(String childName) {
        this.childName = childName;
    }

    public String getChildBirthdate() {
        return childBirthdate;
    }

    public void setChildBirthdate(String childBirthdate) {
        this.childBirthdate = childBirthdate;
    }

    public String getChildPhoneEmergency() {
        return childPhoneEmergency;
    }

    public void setChildPhoneEmergency(String childPhoneEmergency) {
        this.childPhoneEmergency = childPhoneEmergency;
    }

    public Integer getChildGender() {
        return childGender;
    }

    public void setChildGender(Integer childGender) {
        this.childGender = childGender;
    }

    public Integer getChildTutor() {
        return childTutor;
    }

    public void setChildTutor(Integer childTutor) {
        this.childTutor = childTutor;
    }

    @Override
    public String toString() {
        return "ChildDto{" +
                "childId=" + childId +
                ", tutorId=" + tutorId +
                ", childName='" + childName + '\'' +
                ", childBirthdate='" + childBirthdate + '\'' +
                ", childPhoneEmergency='" + childPhoneEmergency + '\'' +
                ", childGender=" + childGender +
                ", childTutor=" + childTutor +
                '}';
    }
}
