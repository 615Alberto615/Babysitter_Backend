package com.softbabysi.demo.Bl;

import com.softbabysi.demo.Dto.BabysitterAbilityDto;
import com.softbabysi.demo.dao.BabysitterAbilityRepository;
import com.softbabysi.demo.entity.BabysitterAbility;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BabysitterAbilityBl {

    @Autowired
    private BabysitterAbilityRepository babysitterAbilityRepository;

    // por id
    public BabysitterAbilityDto findById(Integer id){

        BabysitterAbility babysitterAbility = babysitterAbilityRepository.findById(id);
        BabysitterAbilityDto babysitterAbilityDto = new BabysitterAbilityDto();
        babysitterAbilityDto.setBabysitterAbilityId(babysitterAbility.getBabysitterAbilityId());
        babysitterAbilityDto.setBabysitterId(babysitterAbility.getBabysitter().getBabysitterId());
        babysitterAbilityDto.setAbilityKnowledgeChildDevelopment(babysitterAbility.getAbilityKnowledgeChildDevelopment());
        babysitterAbilityDto.setAbilityEmpeathyAndPatience(babysitterAbility.getAbilityEmpathyAndPatience());
        babysitterAbilityDto.setAbilityEfectiveCommunication(babysitterAbility.getAbilityEffectiveCommunication());
        babysitterAbilityDto.setAbilityOrganizationalSkills(babysitterAbility.getAbilityOrganizationalSkills());
        babysitterAbilityDto.setAbilityFlexibilityAndAdaptability(babysitterAbility.getAbilityFlexibilityAndAdaptability());
        babysitterAbilityDto.setAbilityFirstAid(babysitterAbility.getAbilityFirstAid());
        babysitterAbilityDto.setAbilityCulturalSensitivity(babysitterAbility.getAbilityCulturalSensitivity());
        babysitterAbilityDto.setAbilityConflictsResolution(babysitterAbility.getAbilityConflictResolution());
        babysitterAbilityDto.setAbilityCreativity(babysitterAbility.getAbilityCreativity());
        babysitterAbilityDto.setAbilitySpecialNeeds(babysitterAbility.getAbilitySpecialNeeds());
        babysitterAbilityDto.setAbilityCrefulObservation(babysitterAbility.getAbilityCarefulObservation());
        babysitterAbilityDto.setAbilityTasteForTeaching(babysitterAbility.getAbilityTasteForTeaching());
        babysitterAbilityDto.setAbilityNone(babysitterAbility.getAbilityNone());
        return babysitterAbilityDto;
    }

    //por id de la babysitter
    public BabysitterAbilityDto findByBabysitterId(Integer id){
        BabysitterAbility babysitterAbility = babysitterAbilityRepository.findByBabysitterId(id);
        BabysitterAbilityDto babysitterAbilityDto = new BabysitterAbilityDto();
        babysitterAbilityDto.setBabysitterAbilityId(babysitterAbility.getBabysitterAbilityId());
        babysitterAbilityDto.setBabysitterId(babysitterAbility.getBabysitter().getBabysitterId());
        babysitterAbilityDto.setAbilityKnowledgeChildDevelopment(babysitterAbility.getAbilityKnowledgeChildDevelopment());
        babysitterAbilityDto.setAbilityEmpeathyAndPatience(babysitterAbility.getAbilityEmpathyAndPatience());
        babysitterAbilityDto.setAbilityEfectiveCommunication(babysitterAbility.getAbilityEffectiveCommunication());
        babysitterAbilityDto.setAbilityOrganizationalSkills(babysitterAbility.getAbilityOrganizationalSkills());
        babysitterAbilityDto.setAbilityFlexibilityAndAdaptability(babysitterAbility.getAbilityFlexibilityAndAdaptability());
        babysitterAbilityDto.setAbilityFirstAid(babysitterAbility.getAbilityFirstAid());
        babysitterAbilityDto.setAbilityCulturalSensitivity(babysitterAbility.getAbilityCulturalSensitivity());
        babysitterAbilityDto.setAbilityConflictsResolution(babysitterAbility.getAbilityConflictResolution());
        babysitterAbilityDto.setAbilityCreativity(babysitterAbility.getAbilityCreativity());
        babysitterAbilityDto.setAbilitySpecialNeeds(babysitterAbility.getAbilitySpecialNeeds());
        babysitterAbilityDto.setAbilityCrefulObservation(babysitterAbility.getAbilityCarefulObservation());
        babysitterAbilityDto.setAbilityTasteForTeaching(babysitterAbility.getAbilityTasteForTeaching());
        babysitterAbilityDto.setAbilityNone(babysitterAbility.getAbilityNone());
        return babysitterAbilityDto;
    }


}
