package com.softbabysi.demo.Dto;
import com.softbabysi.demo.entity.Tutor;
public class TutorEmergencyContactDto {
    private Integer tutorEmergencyContactId;
    private Integer tutorId;
    private String nameContact;
    private String phoneContact;

    public TutorEmergencyContactDto() {
    }

    public TutorEmergencyContactDto(Integer tutorEmergencyContactId, Integer tutorId, String nameContact, String phoneContact) {
        this.tutorEmergencyContactId = tutorEmergencyContactId;
        this.tutorId = tutorId;
        this.nameContact = nameContact;
        this.phoneContact = phoneContact;
    }

    public Integer getTutorEmergencyContactId() {
        return tutorEmergencyContactId;
    }

    public void setTutorEmergencyContactId(Integer tutorEmergencyContactId) {
        this.tutorEmergencyContactId = tutorEmergencyContactId;
    }

    public Integer getTutorId() {
        return tutorId;
    }

    public void setTutorId(Integer tutorId) {
        this.tutorId = tutorId;
    }

    public String getNameContact() {
        return nameContact;
    }

    public void setNameContact(String nameContact) {
        this.nameContact = nameContact;
    }

    public String getPhoneContact() {
        return phoneContact;
    }

    public void setPhoneContact(String phoneContact) {
        this.phoneContact = phoneContact;
    }

    @Override
    public String toString() {
        return "TutorEmergencyContactDto{" +
                "tutorEmergencyContactId=" + tutorEmergencyContactId +
                ", tutorId=" + tutorId +
                ", nameContact='" + nameContact + '\'' +
                ", phoneContact='" + phoneContact + '\'' +
                '}';
    }
}
