package com.softbabysi.demo.Bl;

import com.softbabysi.demo.Dto.TutorRulesDto;
import com.softbabysi.demo.dao.TutorRulesRepository;
import com.softbabysi.demo.entity.Tutor;
import com.softbabysi.demo.entity.TutorRules;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TutorRulesBl {

    @Autowired
    private TutorRulesRepository tutorRulesRepository;

    @Transactional
    public void  createTutorRules(TutorRulesDto tutorRulesDto){
        TutorRules tutorRules = new TutorRules();
        Tutor tutor = new Tutor();
        tutor.setTutorId(tutorRulesDto.getTutor());
        tutorRules.setTutor(tutor);
        tutorRules.setRulesHome(tutorRulesDto.getRulesHome());
        tutorRulesRepository.save(tutorRules);
    }

    public List<TutorRulesDto> findTutorRules(Integer id){
        List<TutorRules> tutorRules = tutorRulesRepository.findTutorRulesByTutorId(id);
        List<TutorRulesDto> tutorRulesDto = new ArrayList<>();
        for (TutorRules tutorRules1 : tutorRules){
            TutorRulesDto tutorRulesDto1 = new TutorRulesDto();
            tutorRulesDto1.setTutorRulesId(tutorRules1.getTutorRulesId());
            tutorRulesDto1.setTutor(tutorRules1.getTutor().getTutorId());
            tutorRulesDto1.setRulesHome(tutorRules1.getRulesHome());
            tutorRulesDto.add(tutorRulesDto1);
        }
        return tutorRulesDto;
    }

    //eliminar por id
    @Transactional
    public void deleteTutorRules(Integer id){
        tutorRulesRepository.deleteById(id);
    }



}
