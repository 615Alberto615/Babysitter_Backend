package com.softbabysi.demo.Dto;
import com.softbabysi.demo.entity.Tutor;
public class TutorRulesDto {
    private Integer tutorRulesId;
    private Integer tutor;
    private String rulesHome;

    public TutorRulesDto() {
    }

    public TutorRulesDto(Integer tutorRulesId, Integer tutor, String rulesHome) {
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

    public Integer getTutor() {
        return tutor;
    }

    public void setTutor(Integer tutor) {
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
        return "TutorRulesDto{" +
                "tutorRulesId=" + tutorRulesId +
                ", tutor=" + tutor +
                ", rulesHome='" + rulesHome + '\'' +
                '}';
    }
}
