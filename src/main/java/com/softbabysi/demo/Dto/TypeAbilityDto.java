package com.softbabysi.demo.Dto;
public class TypeAbilityDto {
    private Integer typeAbilityId;
    private String ability;

    public TypeAbilityDto() {
    }

    public TypeAbilityDto(Integer typeAbilityId, String ability) {
        this.typeAbilityId = typeAbilityId;
        this.ability = ability;
    }

    public Integer getTypeAbilityId() {
        return typeAbilityId;
    }

    public void setTypeAbilityId(Integer typeAbilityId) {
        this.typeAbilityId = typeAbilityId;
    }

    public String getAbility() {
        return ability;
    }

    public void setAbility(String ability) {
        this.ability = ability;
    }

    @Override
    public String toString() {
        return "TypeAbilityDto{" +
                "typeAbilityId=" + typeAbilityId +
                ", ability='" + ability + '\'' +
                '}';
    }
}

