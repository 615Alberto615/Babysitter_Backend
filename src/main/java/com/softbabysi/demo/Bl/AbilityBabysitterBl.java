package com.softbabysi.demo.Bl;

import com.softbabysi.demo.Dto.AbilityBabysitterDto;
import com.softbabysi.demo.Dto.AbilityBabysitterNewDto;
import com.softbabysi.demo.Dto.ChildDto;
import com.softbabysi.demo.dao.AbilityBabysitterDao;
import com.softbabysi.demo.dao.AbilityBabysitterRepository;
import com.softbabysi.demo.entity.AbilityBabysitter;
import com.softbabysi.demo.entity.Babysitter;
import com.softbabysi.demo.entity.TypeAbility;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AbilityBabysitterBl {
    @Autowired
    private AbilityBabysitterDao abilityBabysitterDao;

    @Autowired
    private AbilityBabysitterRepository abilityBabysitterRepository;

    public List<AbilityBabysitterDto> getAllAbilityBabysitter(){
        List<AbilityBabysitter> abilityBabysitters=abilityBabysitterDao.getAllAbilityBabysitter();

        List<AbilityBabysitterDto> res= new ArrayList<>();
        abilityBabysitters.forEach(abilityBabysitter -> {
            res.add(new AbilityBabysitterDto(abilityBabysitter.getAbilityBabysitterId(),abilityBabysitter.getBabysitter().getBabysitterId(),
                    abilityBabysitter.getTypeAbility().getTypeAbilityId()));
        });
        return res;
    }

    //Agregar por id de babysitter
    public void addAbilityBabysitter(Integer id, AbilityBabysitterNewDto abilityBabysitterDto){
        AbilityBabysitter abilityBabysitter = new AbilityBabysitter();
        Babysitter babysitter = new Babysitter();
        babysitter.setBabysitterId(id);
        abilityBabysitter.setBabysitter(babysitter);
        TypeAbility typeAbility = new TypeAbility();
        typeAbility.setTypeAbilityId(abilityBabysitterDto.getTypeAbilityId());
        abilityBabysitter.setTypeAbility(typeAbility);
        abilityBabysitterRepository.save(abilityBabysitter);
    }

    //eliminar por id
    public void deleteAbilityBabysitter(Integer id){
        abilityBabysitterRepository.deleteById(Long.valueOf(id));
    }


}
