package com.softbabysi.demo.entity;
import jakarta.persistence.*;
import java.io.Serializable;
@Entity
@Table(name = "ABILITY_BABYSITTER")
public class AbilityBabysitter {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ABILITY_BABYSITTER_ID", nullable = false)
    private Integer abilityBabysitterId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "BABYSITTER_ID", nullable = false)
    private Babysitter babysitter;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "TYPE_ABILITY_ID", nullable = false)
    private TypeAbility typeAbility;

    // Getters and setters...

    public AbilityBabysitter() {
    }

    public AbilityBabysitter(Integer abilityBabysitterId, Babysitter babysitter, TypeAbility typeAbility) {
        this.abilityBabysitterId = abilityBabysitterId;
        this.babysitter = babysitter;
        this.typeAbility = typeAbility;
    }

    public Integer getAbilityBabysitterId() {
        return abilityBabysitterId;
    }

    public void setAbilityBabysitterId(Integer abilityBabysitterId) {
        this.abilityBabysitterId = abilityBabysitterId;
    }

    public Babysitter getBabysitter() {
        return babysitter;
    }

    public void setBabysitter(Babysitter babysitter) {
        this.babysitter = babysitter;
    }

    public TypeAbility getTypeAbility() {
        return typeAbility;
    }

    public void setTypeAbility(TypeAbility typeAbility) {
        this.typeAbility = typeAbility;
    }
}
