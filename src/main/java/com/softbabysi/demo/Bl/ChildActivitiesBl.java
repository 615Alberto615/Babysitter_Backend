package com.softbabysi.demo.Bl;

import com.softbabysi.demo.Dto.ChildActivitiesFormDto;
import com.softbabysi.demo.Dto.ChildActivitiesFormEditDto;
import com.softbabysi.demo.dao.ChildActivitiesFormRepository;
import com.softbabysi.demo.entity.Child;
import com.softbabysi.demo.entity.ChildActivitiesForm;
import com.softbabysi.demo.entity.ChildTypeActivities;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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

    // Actualizar actividades por id
    public void updateChildActivities(ChildActivitiesFormEditDto childActivitiesFormEditDto, Integer id){
        Child child = new Child();
        ChildActivitiesForm childActivitiesForm = childActivitiesFormRepository.findByChildActivitiesFormId(id);
        child.setChildId(childActivitiesFormEditDto.getChildId());
        ChildTypeActivities childTypeActivities = new ChildTypeActivities();
        childTypeActivities.setTypeActivitiesId(childActivitiesFormEditDto.getChildTypeActivitiesId());
        childActivitiesForm.setChildTypeActivities(childTypeActivities);
        childActivitiesForm.setChild(child);
        childActivitiesFormRepository.save(childActivitiesForm);
    }

    // Eliminar actividades por id
    public void deleteChildActivities(Integer id){
        ChildActivitiesForm childActivitiesForm = childActivitiesFormRepository.findByChildActivitiesFormId(id);
        childActivitiesFormRepository.delete(childActivitiesForm);
    }

    // Todas las actividades por id de niño
    public List<ChildActivitiesForm> findByChildId(Integer id){
        List<ChildActivitiesForm> childActivitiesFormDtoList = childActivitiesFormRepository.findByChildId(id);
        return childActivitiesFormDtoList;
    }


}
