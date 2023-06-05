package com.softbabysi.demo.entity;

import jakarta.persistence.*;
@Entity
@Table(name = "TUTOR_RULES")
public class TutorRules {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name= "TUTOR_RULES_ID", nullable = false)
    private Integer tutorRulesId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "TUTOR_ID", nullable = false, unique = true)
    private Tutor tutor;

    @Column(name = "RULES_HOME", nullable = false)
    private String rulesHome;

    public TutorRules() {
    }

    public TutorRules(Integer tutorRulesId, Tutor tutor, String rulesHome) {
        this.tutorRulesId = tutorRulesId;
        this.tutor = tutor;
        this.rulesHome = rulesHome;
    }

    public Integer getTutorRulesId() {
        return tutorRulesId;
    }

    public void setTutorRulesId(Integer tutorRulesId) {
        this.tutorRulesId = tutorRulesId;
    }

    public Tutor getTutor() {
        return tutor;
    }

    public void setTutor(Tutor tutor) {
        this.tutor = tutor;
    }

    public String getRulesHome() {
        return rulesHome;
    }

    public void setRulesHome(String rulesHome) {
        this.rulesHome = rulesHome;
    }

    @Override
    public String toString() {
        return "TutorRules{" +
                "tutorRulesId=" + tutorRulesId +
                ", tutor=" + tutor +
                ", rulesHome='" + rulesHome + '\'' +
                '}';
    }
}
