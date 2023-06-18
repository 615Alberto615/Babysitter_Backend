package com.softbabysi.demo.entity;


import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "ABYSITTER_ABILITY")
public class BabysitterAbility implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "BABYSITTER_ABILITY_ID", nullable = false)
    private Integer babysitterAbilityId;

    @OneToOne
    @JoinColumn(name = "BABYSITTER_ID", nullable = false)
    private Babysitter babysitter;

    @Column(name = "ABILITY_KNOWLEDGE_CHILD_DEVELOPMENT", nullable = false)
    private Boolean abilityKnowledgeChildDevelopment;

    @Column(name = "ABILITY_EMPATHY_AND_PATIENCE", nullable = false)
    private Boolean abilityEmpathyAndPatience;

    @Column(name = "ABILITY_EFFECTIVE_COMMUNICATION", nullable = false)
    private Boolean abilityEffectiveCommunication;

    @Column(name = "ABILITY_ORGANIZATIONAL_SKILLS", nullable = false)
    private Boolean abilityOrganizationalSkills;

    @Column(name = "ABILITY_FLEXIBILITY_AND_ADAPTABILITY", nullable = false)
    private Boolean abilityFlexibilityAndAdaptability;

    @Column(name = "ABIITY_FIRST_AID", nullable = false)
    private Boolean abilityFirstAid;

    @Column(name = "ABILITY_CULTURAL_SENSITIVITY", nullable = false)
    private Boolean abilityCulturalSensitivity;

    @Column(name = "ABILITY_CONFLICT_RESOLUTION", nullable = false)
    private Boolean abilityConflictResolution;

    @Column(name = "ABILITY_CREATIVITY", nullable = false)
    private Boolean abilityCreativity;

    @Column(name = "ABILITY_SPECIAL_NEEDS", nullable = false)
    private Boolean abilitySpecialNeeds;

    @Column(name = "ABILITY_CAREFUL_OBSERVATION", nullable = false)
    private Boolean abilityCarefulObservation;

    @Column(name = "ABILITY_TASTE_FOR_TEACHING", nullable = false)
    private Boolean abilityTasteForTeaching;

    @Column(name = "ABILITY_NONE", nullable = false)
    private Boolean abilityNone;

    public BabysitterAbility() {
    }

    public BabysitterAbility(Integer babysitterAbilityId, Babysitter babysitter, Boolean abilityKnowledgeChildDevelopment, Boolean abilityEmpathyAndPatience, Boolean abilityEffectiveCommunication, Boolean abilityOrganizationalSkills, Boolean abilityFlexibilityAndAdaptability, Boolean abilityFirstAid, Boolean abilityCulturalSensitivity, Boolean abilityConflictResolution, Boolean abilityCreativity, Boolean abilitySpecialNeeds, Boolean abilityCarefulObservation, Boolean abilityTasteForTeaching, Boolean abilityNone) {
        this.babysitterAbilityId = babysitterAbilityId;
        this.babysitter = babysitter;
        this.abilityKnowledgeChildDevelopment = abilityKnowledgeChildDevelopment;
        this.abilityEmpathyAndPatience = abilityEmpathyAndPatience;
        this.abilityEffectiveCommunication = abilityEffectiveCommunication;
        this.abilityOrganizationalSkills = abilityOrganizationalSkills;
        this.abilityFlexibilityAndAdaptability = abilityFlexibilityAndAdaptability;
        this.abilityFirstAid = abilityFirstAid;
        this.abilityCulturalSensitivity = abilityCulturalSensitivity;
        this.abilityConflictResolution = abilityConflictResolution;
        this.abilityCreativity = abilityCreativity;
        this.abilitySpecialNeeds = abilitySpecialNeeds;
        this.abilityCarefulObservation = abilityCarefulObservation;
        this.abilityTasteForTeaching = abilityTasteForTeaching;
        this.abilityNone = abilityNone;
    }

    public Integer getBabysitterAbilityId() {
        return babysitterAbilityId;
    }

    public void setBabysitterAbilityId(Integer babysitterAbilityId) {
        this.babysitterAbilityId = babysitterAbilityId;
    }

    public Babysitter getBabysitter() {
        return babysitter;
    }

    public void setBabysitter(Babysitter babysitter) {
        this.babysitter = babysitter;
    }

    public Boolean getAbilityKnowledgeChildDevelopment() {
        return abilityKnowledgeChildDevelopment;
    }

    public void setAbilityKnowledgeChildDevelopment(Boolean abilityKnowledgeChildDevelopment) {
        this.abilityKnowledgeChildDevelopment = abilityKnowledgeChildDevelopment;
    }

    public Boolean getAbilityEmpathyAndPatience() {
        return abilityEmpathyAndPatience;
    }

    public void setAbilityEmpathyAndPatience(Boolean abilityEmpathyAndPatience) {
        this.abilityEmpathyAndPatience = abilityEmpathyAndPatience;
    }

    public Boolean getAbilityEffectiveCommunication() {
        return abilityEffectiveCommunication;
    }

    public void setAbilityEffectiveCommunication(Boolean abilityEffectiveCommunication) {
        this.abilityEffectiveCommunication = abilityEffectiveCommunication;
    }

    public Boolean getAbilityOrganizationalSkills() {
        return abilityOrganizationalSkills;
    }

    public void setAbilityOrganizationalSkills(Boolean abilityOrganizationalSkills) {
        this.abilityOrganizationalSkills = abilityOrganizationalSkills;
    }

    public Boolean getAbilityFlexibilityAndAdaptability() {
        return abilityFlexibilityAndAdaptability;
    }

    public void setAbilityFlexibilityAndAdaptability(Boolean abilityFlexibilityAndAdaptability) {
        this.abilityFlexibilityAndAdaptability = abilityFlexibilityAndAdaptability;
    }

    public Boolean getAbilityFirstAid() {
        return abilityFirstAid;
    }

    public void setAbilityFirstAid(Boolean abilityFirstAid) {
        this.abilityFirstAid = abilityFirstAid;
    }

    public Boolean getAbilityCulturalSensitivity() {
        return abilityCulturalSensitivity;
    }

    public void setAbilityCulturalSensitivity(Boolean abilityCulturalSensitivity) {
        this.abilityCulturalSensitivity = abilityCulturalSensitivity;
    }

    public Boolean getAbilityConflictResolution() {
        return abilityConflictResolution;
    }

    public void setAbilityConflictResolution(Boolean abilityConflictResolution) {
        this.abilityConflictResolution = abilityConflictResolution;
    }

    public Boolean getAbilityCreativity() {
        return abilityCreativity;
    }

    public void setAbilityCreativity(Boolean abilityCreativity) {
        this.abilityCreativity = abilityCreativity;
    }

    public Boolean getAbilitySpecialNeeds() {
        return abilitySpecialNeeds;
    }

    public void setAbilitySpecialNeeds(Boolean abilitySpecialNeeds) {
        this.abilitySpecialNeeds = abilitySpecialNeeds;
    }

    public Boolean getAbilityCarefulObservation() {
        return abilityCarefulObservation;
    }

    public void setAbilityCarefulObservation(Boolean abilityCarefulObservation) {
        this.abilityCarefulObservation = abilityCarefulObservation;
    }

    public Boolean getAbilityTasteForTeaching() {
        return abilityTasteForTeaching;
    }

    public void setAbilityTasteForTeaching(Boolean abilityTasteForTeaching) {
        this.abilityTasteForTeaching = abilityTasteForTeaching;
    }

    public Boolean getAbilityNone() {
        return abilityNone;
    }

    public void setAbilityNone(Boolean abilityNone) {
        this.abilityNone = abilityNone;
    }

    @Override
    public String toString() {
        return "BabysitterAbility{" +
                "babysitterAbilityId=" + babysitterAbilityId +
                ", babysitter=" + babysitter +
                ", abilityKnowledgeChildDevelopment=" + abilityKnowledgeChildDevelopment +
                ", abilityEmpathyAndPatience=" + abilityEmpathyAndPatience +
                ", abilityEffectiveCommunication=" + abilityEffectiveCommunication +
                ", abilityOrganizationalSkills=" + abilityOrganizationalSkills +
                ", abilityFlexibilityAndAdaptability=" + abilityFlexibilityAndAdaptability +
                ", abilityFirstAid=" + abilityFirstAid +
                ", abilityCulturalSensitivity=" + abilityCulturalSensitivity +
                ", abilityConflictResolution=" + abilityConflictResolution +
                ", abilityCreativity=" + abilityCreativity +
                ", abilitySpecialNeeds=" + abilitySpecialNeeds +
                ", abilityCarefulObservation=" + abilityCarefulObservation +
                ", abilityTasteForTeaching=" + abilityTasteForTeaching +
                ", abilityNone=" + abilityNone +
                '}';
    }
}
