package com.softbabysi.demo.entity;

import jakarta.persistence.*;
@Entity
@Table(name = "TUTOR_EMERGENCY_CONTACT")
public class TutorEmergencyContact {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name= "TUTOR_EMERGENCY_CONTACT_ID", nullable = false)
    private Integer tutorEmergencyContactId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "TUTOR_ID", nullable = false, unique = true)
    private Tutor tutor;

    @Column(name = "NAME_CONTACT", nullable = false)
    private String nameContact;

    @Column(name = "PHONE_CONTACT", nullable = false)
    private String phoneContact;

    public TutorEmergencyContact() {
    }

    public TutorEmergencyContact(Integer tutorEmergencyContactId, Tutor tutor, String nameContact, String phoneContact) {
        this.tutorEmergencyContactId = tutorEmergencyContactId;
        this.tutor = tutor;
        this.nameContact = nameContact;
        this.phoneContact = phoneContact;
    }

    public Integer getTutorEmergencyContactId() {
        return tutorEmergencyContactId;
    }

    public void setTutorEmergencyContactId(Integer tutorEmergencyContactId) {
        this.tutorEmergencyContactId = tutorEmergencyContactId;
    }

    public Tutor getTutor() {
        return tutor;
    }

    public void setTutor(Tutor tutor) {
        this.tutor = tutor;
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
        return "TutorEmergencyContact{" +
                "tutorEmergencyContactId=" + tutorEmergencyContactId +
                ", tutor=" + tutor +
                ", nameContact='" + nameContact + '\'' +
                ", phoneContact='" + phoneContact + '\'' +
                '}';
    }
}
