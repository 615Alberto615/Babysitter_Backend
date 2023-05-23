package com.softbabysi.demo.dao;

import com.softbabysi.demo.entity.Review;
import com.softbabysi.demo.entity.TypeAbility;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TypeAbilityDao {
    @Autowired
    private TypeAbilityRepository typeAbilityRepository;

    public List<TypeAbility> getAllTypeAbility(){
        return typeAbilityRepository.findAll();
    }
}
