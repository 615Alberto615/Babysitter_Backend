package com.softbabysi.demo.dao;

import com.softbabysi.demo.entity.AbilityBabysitter;
import com.softbabysi.demo.entity.Review;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AbilityBabysitterDao {
    @Autowired
    private AbilityBabysitterRepository abilityBabysitterRepository;

    public List<AbilityBabysitter> getAllAbilityBabysitter(){
        return abilityBabysitterRepository.findAll();
    }
}
