package com.softbabysi.demo.Bl;

import com.softbabysi.demo.Dto.AbilityBabysitterDto;
import com.softbabysi.demo.Dto.ChildDto;
import com.softbabysi.demo.dao.AbilityBabysitterDao;
import com.softbabysi.demo.entity.AbilityBabysitter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AbilityBabysitterBl {
    @Autowired
    private AbilityBabysitterDao abilityBabysitterDao;
    public List<AbilityBabysitterDto> getAllAbilityBabysitter(){
        List<AbilityBabysitter> abilityBabysitters=abilityBabysitterDao.getAllAbilityBabysitter();

        List<AbilityBabysitterDto> res= new ArrayList<>();
        abilityBabysitters.forEach(abilityBabysitter -> {
            res.add(new AbilityBabysitterDto(abilityBabysitter.getAbilityBabysitterId(),abilityBabysitter.getBabysitter().getBabysitterId(),
                    abilityBabysitter.getTypeAbility().getTypeAbilityId()));
        });
        return res;


    }
}
