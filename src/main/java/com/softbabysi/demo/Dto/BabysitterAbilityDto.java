package com.softbabysi.demo.Dto;

public class BabysitterAbilityDto {
    private Integer babysitterAbilityId;
    private Integer babysitterId;
    private boolean abilityKnowledgeChildDevelopment;
    private boolean abilityEmpeathyAndPatience;
    private boolean abilityEfectiveCommunication;
    private boolean abilityOrganizationalSkills;
    private boolean abilityFlexibilityAndAdaptability;
    private boolean abilityFirstAid;
    private boolean abilityCulturalSensitivity;
    private boolean abilityConflictsResolution;
    private boolean abilityCreativity;
    private boolean abilitySpecialNeeds;
    private boolean abilityCrefulObservation;
    private boolean abilityTasteForTeaching;
    private boolean abilityNone;

    public BabysitterAbilityDto() {
    }

    public BabysitterAbilityDto(Integer babysitterAbilityId, Integer babysitterId, boolean abilityKnowledgeChildDevelopment, boolean abilityEmpeathyAndPatience, boolean abilityEfectiveCommunication, boolean abilityOrganizationalSkills, boolean abilityFlexibilityAndAdaptability, boolean abilityFirstAid, boolean abilityCulturalSensitivity, boolean abilityConflictsResolution, boolean abilityCreativity, boolean abilitySpecialNeeds, boolean abilityCrefulObservation, boolean abilityTasteForTeaching, boolean abilityNone) {
        this.babysitterAbilityId = babysitterAbilityId;
        this.babysitterId = babysitterId;
        this.abilityKnowledgeChildDevelopment = abilityKnowledgeChildDevelopment;
        this.abilityEmpeathyAndPatience = abilityEmpeathyAndPatience;
        this.abilityEfectiveCommunication = abilityEfectiveCommunication;
        this.abilityOrganizationalSkills = abilityOrganizationalSkills;
        this.abilityFlexibilityAndAdaptability = abilityFlexibilityAndAdaptability;
        this.abilityFirstAid = abilityFirstAid;
        this.abilityCulturalSensitivity = abilityCulturalSensitivity;
        this.abilityConflictsResolution = abilityConflictsResolution;
        this.abilityCreativity = abilityCreativity;
        this.abilitySpecialNeeds = abilitySpecialNeeds;
        this.abilityCrefulObservation = abilityCrefulObservation;
        this.abilityTasteForTeaching = abilityTasteForTeaching;
        this.abilityNone = abilityNone;
    }

    public Integer getBabysitterAbilityId() {
        return babysitterAbilityId;
    }

    public void setBabysitterAbilityId(Integer babysitterAbilityId) {
        this.babysitterAbilityId = babysitterAbilityId;
    }

    public Integer getBabysitterId() {
        return babysitterId;
    }

    public void setBabysitterId(Integer babysitterId) {
        this.babysitterId = babysitterId;
    }

    public boolean isAbilityKnowledgeChildDevelopment() {
        return abilityKnowledgeChildDevelopment;
    }

    public void setAbilityKnowledgeChildDevelopment(boolean abilityKnowledgeChildDevelopment) {
        this.abilityKnowledgeChildDevelopment = abilityKnowledgeChildDevelopment;
    }

    public boolean isAbilityEmpeathyAndPatience() {
        return abilityEmpeathyAndPatience;
    }

    public void setAbilityEmpeathyAndPatience(boolean abilityEmpeathyAndPatience) {
        this.abilityEmpeathyAndPatience = abilityEmpeathyAndPatience;
    }

    public boolean isAbilityEfectiveCommunication() {
        return abilityEfectiveCommunication;
    }

    public void setAbilityEfectiveCommunication(boolean abilityEfectiveCommunication) {
        this.abilityEfectiveCommunication = abilityEfectiveCommunication;
    }

    public boolean isAbilityOrganizationalSkills() {
        return abilityOrganizationalSkills;
    }

    public void setAbilityOrganizationalSkills(boolean abilityOrganizationalSkills) {
        this.abilityOrganizationalSkills = abilityOrganizationalSkills;
    }

    public boolean isAbilityFlexibilityAndAdaptability() {
        return abilityFlexibilityAndAdaptability;
    }

    public void setAbilityFlexibilityAndAdaptability(boolean abilityFlexibilityAndAdaptability) {
        this.abilityFlexibilityAndAdaptability = abilityFlexibilityAndAdaptability;
    }

    public boolean isAbilityFirstAid() {
        return abilityFirstAid;
    }

    public void setAbilityFirstAid(boolean abilityFirstAid) {
        this.abilityFirstAid = abilityFirstAid;
    }

    public boolean isAbilityCulturalSensitivity() {
        return abilityCulturalSensitivity;
    }

    public void setAbilityCulturalSensitivity(boolean abilityCulturalSensitivity) {
        this.abilityCulturalSensitivity = abilityCulturalSensitivity;
    }

    public boolean isAbilityConflictsResolution() {
        return abilityConflictsResolution;
    }

    public void setAbilityConflictsResolution(boolean abilityConflictsResolution) {
        this.abilityConflictsResolution = abilityConflictsResolution;
    }

    public boolean isAbilityCreativity() {
        return abilityCreativity;
    }

    public void setAbilityCreativity(boolean abilityCreativity) {
        this.abilityCreativity = abilityCreativity;
    }

    public boolean isAbilitySpecialNeeds() {
        return abilitySpecialNeeds;
    }

    public void setAbilitySpecialNeeds(boolean abilitySpecialNeeds) {
        this.abilitySpecialNeeds = abilitySpecialNeeds;
    }

    public boolean isAbilityCrefulObservation() {
        return abilityCrefulObservation;
    }

    public void setAbilityCrefulObservation(boolean abilityCrefulObservation) {
        this.abilityCrefulObservation = abilityCrefulObservation;
    }

    public boolean isAbilityTasteForTeaching() {
        return abilityTasteForTeaching;
    }

    public void setAbilityTasteForTeaching(boolean abilityTasteForTeaching) {
        this.abilityTasteForTeaching = abilityTasteForTeaching;
    }

    public boolean isAbilityNone() {
        return abilityNone;
    }

    public void setAbilityNone(boolean abilityNone) {
        this.abilityNone = abilityNone;
    }

    @Override
    public String toString() {
        return "BabysitterAbilityDto{" +
                "babysitterAbilityId=" + babysitterAbilityId +
                ", babysitterId=" + babysitterId +
                ", abilityKnowledgeChildDevelopment=" + abilityKnowledgeChildDevelopment +
                ", abilityEmpeathyAndPatience=" + abilityEmpeathyAndPatience +
                ", abilityEfectiveCommunication=" + abilityEfectiveCommunication +
                ", abilityOrganizationalSkills=" + abilityOrganizationalSkills +
                ", abilityFlexibilityAndAdaptability=" + abilityFlexibilityAndAdaptability +
                ", abilityFirstAid=" + abilityFirstAid +
                ", abilityCulturalSensitivity=" + abilityCulturalSensitivity +
                ", abilityConflictsResolution=" + abilityConflictsResolution +
                ", abilityCreativity=" + abilityCreativity +
                ", abilitySpecialNeeds=" + abilitySpecialNeeds +
                ", abilityCrefulObservation=" + abilityCrefulObservation +
                ", abilityTasteForTeaching=" + abilityTasteForTeaching +
                ", abilityNone=" + abilityNone +
                '}';
    }
}
