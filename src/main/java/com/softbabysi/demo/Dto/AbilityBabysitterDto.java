package com.softbabysi.demo.Dto;
public class AbilityBabysitterDto {
    private Integer abilityBabysitterId;
    private Integer babysitterId;
    private Integer typeAbilityId;

    public AbilityBabysitterDto() {
    }

    public AbilityBabysitterDto(Integer abilityBabysitterId, Integer babysitterId, Integer typeAbilityId) {
        this.abilityBabysitterId = abilityBabysitterId;
        this.babysitterId = babysitterId;
        this.typeAbilityId = typeAbilityId;
    }

    public Integer getAbilityBabysitterId() {
        return abilityBabysitterId;
    }

    public void setAbilityBabysitterId(Integer abilityBabysitterId) {
        this.abilityBabysitterId = abilityBabysitterId;
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
}
