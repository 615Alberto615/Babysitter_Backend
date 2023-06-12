package com.softbabysi.demo.Bl;

import com.softbabysi.demo.Dto.TutorRulesDto;
import com.softbabysi.demo.dao.TutorRulesRepository;
import com.softbabysi.demo.entity.Tutor;
import com.softbabysi.demo.entity.TutorRules;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

    public List<TutorRules> findTutorRules(Integer id){
        List<TutorRules> tutorRules = tutorRulesRepository.findTutorRulesByTutorId(id);
        return tutorRules;
    }

    //eliminar por id
    @Transactional
    public void deleteTutorRules(Integer id){
        tutorRulesRepository.deleteById(id);
    }



}
