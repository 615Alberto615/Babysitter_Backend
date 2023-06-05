package com.softbabysi.demo.Bl;

import com.softbabysi.demo.Dto.ChildActivitiesFormDto;
import com.softbabysi.demo.dao.ChildActivitiesFormRepository;
import com.softbabysi.demo.entity.Child;
import com.softbabysi.demo.entity.ChildActivitiesForm;
import com.softbabysi.demo.entity.ChildTypeActivities;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ChildActivitiesBl {
    @Autowired
    private ChildActivitiesFormRepository childActivitiesFormRepository;

    @Transactional
    public void createChildActivities(ChildActivitiesFormDto childActivitiesFormDto){
        Child child = new Child();
        ChildTypeActivities childTypeActivities = new ChildTypeActivities();
        child.setChildId(childActivitiesFormDto.getChildId());
        childTypeActivities.setTypeActivitiesId(childActivitiesFormDto.getChildTypeActivitiesId());
        ChildActivitiesForm childActivitiesForm = new ChildActivitiesForm();
        childActivitiesForm.setChild(child);
        childActivitiesForm.setChildTypeActivities(childTypeActivities);
        childActivitiesFormRepository.save(childActivitiesForm);
    }

    //Mostrar los tipos de actividades de un niño


}
