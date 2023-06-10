package com.softbabysi.demo.Dto;

public class ChildFormDto {
    private Integer tutor;
    private String childName;
    private String childBirthdate;
    private String childPhoneEmergency;
    private Integer childGender;
    private String medicalAllergieType;
    private String medicalMedication;
    private String medicalMedicationUbication;

    public ChildFormDto() {
    }

    public ChildFormDto(Integer tutor, String childName, String childBirthdate, String childPhoneEmergency, Integer childGender, String medicalAllergieType, String medicalMedication, String medicalMedicationUbication) {
        this.tutor = tutor;
        this.childName = childName;
        this.childBirthdate = childBirthdate;
        this.childPhoneEmergency = childPhoneEmergency;
        this.childGender = childGender;
        this.medicalAllergieType = medicalAllergieType;
        this.medicalMedication = medicalMedication;
        this.medicalMedicationUbication = medicalMedicationUbication;
    }

    public Integer getTutor() {
        return tutor;
    }

    public void setTutor(Integer tutor) {
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
        return "ChildFormDto{" +
                "tutor=" + tutor +
                ", childName='" + childName + '\'' +
                ", childBirthdate='" + childBirthdate + '\'' +
                ", childPhoneEmergency='" + childPhoneEmergency + '\'' +
                ", childGender=" + childGender +
                ", medicalAllergieType='" + medicalAllergieType + '\'' +
                ", medicalMedication='" + medicalMedication + '\'' +
                ", medicalMedicationUbication='" + medicalMedicationUbication + '\'' +
                '}';
    }
}
