package com.softbabysi.demo.Bl;

import com.softbabysi.demo.Dto.TypeAbilityDto;
import com.softbabysi.demo.dao.TypeAbilityDao;
import com.softbabysi.demo.entity.TypeAbility;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TypeAbilityBl {
    @Autowired
    private TypeAbilityDao typeAbilityDao;

    public List<TypeAbilityDto> getAllTypeAbility(){
        List<TypeAbility> typeAbilities=typeAbilityDao.getAllTypeAbility();
        List<TypeAbilityDto> res= new ArrayList<>();
        typeAbilities.forEach(typeAbility -> {
            res.add(new TypeAbilityDto(typeAbility.getTypeAbilityId(),typeAbility.getAbility()));
        });
        return res;
    }
}
