package com.softbabysi.demo.entity;
import jakarta.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "CHILD")
public class Child implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CHILD_ID", nullable = false)
    private Integer childId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "TUTOR_ID", nullable = false)
    private Tutor tutor;

    @Column(name = "CHILD_NAME", nullable = false)
    private String childName;

    @Column(name = "CHILD_BIRTHDATE", nullable = false)
    private String childBirthdate;

    @Column(name = "CHILD_PHONE_EMERGENCY", nullable = false)
    private String childPhoneEmergency;

    @Column(name = "CHILD_GENDER", nullable = false)
    private Integer childGender;

    @Column(name = "CHILD_STATUS", nullable = false)
    private Boolean childStatus;


    // Getters and setters...

    // Otros métodos...


    public Child() {
    }

    public Child(Integer childId, Tutor tutor, String childName, String childBirthdate, String childPhoneEmergency, Integer childGender, Boolean childStatus) {
        this.childId = childId;
        this.tutor = tutor;
        this.childName = childName;
        this.childBirthdate = childBirthdate;
        this.childPhoneEmergency = childPhoneEmergency;
        this.childGender = childGender;
        this.childStatus = childStatus;
    }

    public Integer getChildId() {
        return childId;
    }

    public void setChildId(Integer childId) {
        this.childId = childId;
    }

    public Tutor getTutor() {
        return tutor;
    }

    public void setTutor(Tutor tutor) {
        this.tutor = tutor;
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

    public Boolean getChildStatus() {
        return childStatus;
    }

    public void setChildStatus(Boolean childStatus) {
        this.childStatus = childStatus;
    }

    @Override
    public String toString() {
        return "Child{" +
                "childId=" + childId +
                ", tutor=" + tutor +
                ", childName='" + childName + '\'' +
                ", childBirthdate='" + childBirthdate + '\'' +
                ", childPhoneEmergency='" + childPhoneEmergency + '\'' +
                ", childGender=" + childGender +
                ", childStatus=" + childStatus +
                '}';
    }
}
