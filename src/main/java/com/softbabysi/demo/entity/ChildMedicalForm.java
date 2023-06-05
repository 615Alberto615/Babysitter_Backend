package com.softbabysi.demo.entity;

import jakarta.persistence.*;
@Entity
@Table(name = "CHILD_MEDICAL_FORM")
public class ChildMedicalForm {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name= "CHILD_MEDICAL_FORM_ID", nullable = false)
    private Integer childMedicalFormId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CHILD_ID", nullable = false, unique = true)
    private Child child;

    @Column(name = "MEDICAL_ALLERGIE_TYPE", nullable = false)
    private String medicalAllergieType;

    @Column(name = "MEDICAL_MEDICATION", nullable = false)
    private String medicalMedication;

    @Column(name = "MEDICAL_MEDICATION_UBICATION", nullable = false)
    private String medicalMedicationUbication;

    public ChildMedicalForm() {
    }

    public ChildMedicalForm(Integer childMedicalFormId, Child child, String medicalAllergieType, String medicalMedication, String medicalMedicationUbication) {
        this.childMedicalFormId = childMedicalFormId;
        this.child = child;
        this.medicalAllergieType = medicalAllergieType;
        this.medicalMedication = medicalMedication;
        this.medicalMedicationUbication = medicalMedicationUbication;
    }

    public Integer getChildMedicalFormId() {
        return childMedicalFormId;
    }

    public void setChildMedicalFormId(Integer childMedicalFormId) {
        this.childMedicalFormId = childMedicalFormId;
    }

    public Child getChild() {
        return child;
    }

    public void setChild(Child child) {
        this.child = child;
    }

    public String getMedicalAllergieType() {
        return medicalAllergieType;
    }

    public void setMedicalAllergieType(String medicalAllergieType) {
        this.medicalAllergieType = medicalAllergieType;
    }

    public String getMedicalMedication() {
        return medicalMedication;
    }

    public void setMedicalMedication(String medicalMedication) {
        this.medicalMedication = medicalMedication;
    }

    public String getMedicalMedicationUbication() {
        return medicalMedicationUbication;
    }

    public void setMedicalMedicationUbication(String medicalMedicationUbication) {
        this.medicalMedicationUbication = medicalMedicationUbication;
    }

    @Override
    public String toString() {
        return "ChildMedicalForm{" +
                "childMedicalFormId=" + childMedicalFormId +
                ", child=" + child +
                ", medicalAllergieType='" + medicalAllergieType + '\'' +
                ", medicalMedication='" + medicalMedication + '\'' +
                ", medicalMedicationUbication='" + medicalMedicationUbication + '\'' +
                '}';
    }
}
