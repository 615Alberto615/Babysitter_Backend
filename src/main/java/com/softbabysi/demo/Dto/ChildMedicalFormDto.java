package com.softbabysi.demo.Dto;

public class ChildMedicalFormDto {
    private Integer childMedicalFormId;
    private Integer childId;
    private String medicalAllergieType;
    private String medicalMedication;
    private String medicalMedicationUbication;

    public ChildMedicalFormDto() {
    }

    public ChildMedicalFormDto(Integer childMedicalFormId, Integer childId, String medicalAllergieType, String medicalMedication, String medicalMedicationUbication) {
        this.childMedicalFormId = childMedicalFormId;
        this.childId = childId;
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

    public Integer getChildId() {
        return childId;
    }

    public void setChildId(Integer childId) {
        this.childId = childId;
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
        return "ChildMedicalFormDto{" +
                "childMedicalFormId=" + childMedicalFormId +
                ", childId=" + childId +
                ", medicalAllergieType='" + medicalAllergieType + '\'' +
                ", medicalMedication='" + medicalMedication + '\'' +
                ", medicalMedicationUbication='" + medicalMedicationUbication + '\'' +
                '}';
    }
}
