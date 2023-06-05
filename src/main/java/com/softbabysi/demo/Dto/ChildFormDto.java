package com.softbabysi.demo.Dto;

public class ChildFormDto {
    private Integer tutor;
    private String Name;
    private String Birthdate;
    private String PhoneEmergency;
    private Integer Gender;
    private String AllergieType;
    private String Medication;
    private String MedicationUbication;

    public ChildFormDto() {
    }

    public ChildFormDto(Integer tutor, String name, String birthdate, String phoneEmergency, Integer gender, String allergieType, String medication, String medicationUbication) {
        this.tutor = tutor;
        Name = name;
        Birthdate = birthdate;
        PhoneEmergency = phoneEmergency;
        Gender = gender;
        AllergieType = allergieType;
        Medication = medication;
        MedicationUbication = medicationUbication;
    }

    public Integer getTutor() {
        return tutor;
    }

    public void setTutor(Integer tutor) {
        this.tutor = tutor;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getBirthdate() {
        return Birthdate;
    }

    public void setBirthdate(String birthdate) {
        Birthdate = birthdate;
    }

    public String getPhoneEmergency() {
        return PhoneEmergency;
    }

    public void setPhoneEmergency(String phoneEmergency) {
        PhoneEmergency = phoneEmergency;
    }

    public Integer getGender() {
        return Gender;
    }

    public void setGender(Integer gender) {
        Gender = gender;
    }

    public String getAllergieType() {
        return AllergieType;
    }

    public void setAllergieType(String allergieType) {
        AllergieType = allergieType;
    }

    public String getMedication() {
        return Medication;
    }

    public void setMedication(String medication) {
        Medication = medication;
    }

    public String getMedicationUbication() {
        return MedicationUbication;
    }

    public void setMedicationUbication(String medicationUbication) {
        MedicationUbication = medicationUbication;
    }

    @Override
    public String toString() {
        return "ChildFormDto{" +
                "tutor=" + tutor +
                ", Name='" + Name + '\'' +
                ", Birthdate='" + Birthdate + '\'' +
                ", PhoneEmergency='" + PhoneEmergency + '\'' +
                ", Gender=" + Gender +
                ", AllergieType='" + AllergieType + '\'' +
                ", Medication='" + Medication + '\'' +
                ", MedicationUbication='" + MedicationUbication + '\'' +
                '}';
    }
}
