package com.softbabysi.demo.Dto;

public class ChildEditDto {
    private String childName;
    private String childBirthdate;
    private String childPhoneEmergency;
    private Integer childGender;

    public ChildEditDto() {
    }

    public ChildEditDto(String childName, String childBirthdate, String childPhoneEmergency, Integer childGender) {
        this.childName = childName;
        this.childBirthdate = childBirthdate;
        this.childPhoneEmergency = childPhoneEmergency;
        this.childGender = childGender;
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

    @Override
    public String toString() {
        return "ChildEditDto{" +
                "childName='" + childName + '\'' +
                ", childBirthdate='" + childBirthdate + '\'' +
                ", childPhoneEmergency='" + childPhoneEmergency + '\'' +
                ", childGender=" + childGender +
                '}';
    }
}
