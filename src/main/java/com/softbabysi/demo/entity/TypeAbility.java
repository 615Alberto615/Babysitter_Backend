package com.softbabysi.demo.entity;
import jakarta.persistence.*;
import java.io.Serializable;
@Entity
@Table(name = "TYPE_ABILITY")
public class TypeAbility {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "TYPE_ABILITY_ID", nullable = false)
    private Integer typeAbilityId;

    @Column(name = "ABILITY", nullable = false)
    private String ability;

    // Getters and setters...

    public TypeAbility() {
    }

    public TypeAbility(Integer typeAbilityId, String ability) {
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
}
