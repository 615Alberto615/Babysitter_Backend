package com.softbabysi.demo.Dto;

public class AbilityBabysitterNewDto {

    private Integer babysitterId;
    private Integer typeAbilityId;

    public AbilityBabysitterNewDto() {
    }

    public AbilityBabysitterNewDto(Integer babysitterId, Integer typeAbilityId) {
        this.babysitterId = babysitterId;
        this.typeAbilityId = typeAbilityId;
    }

    public Integer getBabysitterId() {
        return babysitterId;
    }

    public void setBabysitterId(Integer babysitterId) {
        this.babysitterId = babysitterId;
    }

    public Integer getTypeAbilityId() {
        return typeAbilityId;
    }

    public void setTypeAbilityId(Integer typeAbilityId) {
        this.typeAbilityId = typeAbilityId;
    }

    @Override
    public String toString() {
        return "AbilityBabysitterNewDto{" +
                "babysitterId=" + babysitterId +
                ", typeAbilityId=" + typeAbilityId +
                '}';
    }
}
