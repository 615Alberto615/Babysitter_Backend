package com.softbabysi.demo.Bl;

import com.softbabysi.demo.Dto.ChildDto;
import com.softbabysi.demo.Dto.ChildEditDto;
import com.softbabysi.demo.Dto.ChildFormDto;
import com.softbabysi.demo.dao.ChildDao;
import com.softbabysi.demo.dao.ChildMedicalFormRepository;
import com.softbabysi.demo.dao.ChildRepository;
import com.softbabysi.demo.entity.Child;
import com.softbabysi.demo.entity.ChildMedicalForm;
import com.softbabysi.demo.entity.Tutor;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ChildBl {

    @Autowired
    private ChildDao childDao;
    @Autowired
    private ChildRepository childRepository;
    @Autowired
    private ChildMedicalFormRepository childMedicalFormRepository;




    // Agregar niño

    @Transactional
    public void createChild(ChildFormDto childFormDto){
        /*ChildDto childDto = new ChildDto();
        childDto.setTutorId(childFormDto.getTutor());
        childDto.setChildName(childFormDto.getName());
        childDto.setChildBirthdate(childFormDto.getBirthdate());
        childDto.setChildPhoneEmergency(childFormDto.getPhoneEmergency());
        childDto.setChildGender(childFormDto.getGender());
        childDto.setChildStatus(true);
        Child save = childRepository.save(childDto);*/
        Child child = new Child();
        Tutor tutor = new Tutor();
        tutor.setTutorId(childFormDto.getTutor());
        child.setTutor(tutor);
        child.setChildName(childFormDto.getChildName());
        child.setChildBirthdate(childFormDto.getChildBirthdate());
        child.setChildPhoneEmergency(childFormDto.getChildPhoneEmergency());
        child.setChildGender(childFormDto.getChildGender());
        child.setChildStatus(true);
        Integer childId =child.getChildId();
        childRepository.save(child);

        ChildMedicalForm childMedicalForm = new ChildMedicalForm();
        childMedicalForm.setChild(child);
        childMedicalForm.setMedicalAllergieType(childFormDto.getMedicalAllergieType());
        childMedicalForm.setMedicalMedication(childFormDto.getMedicalMedication());
        childMedicalForm.setMedicalMedicationUbication(childFormDto.getMedicalMedicationUbication());
        childMedicalFormRepository.save(childMedicalForm);

    }


    //Todos los niños del tutor por id
    public List<ChildDto> findAllChildStatus(Integer id){
        List<Child> childList = childRepository.findAllChildStatus(id);
        List<ChildDto> childDtoList = new ArrayList<>();
        for (Child child : childList) {
            ChildDto childDto = new ChildDto();
            childDto.setChildId(child.getChildId());
            childDto.setChildName(child.getChildName());
            childDto.setChildBirthdate(child.getChildBirthdate());
            childDto.setChildPhoneEmergency(child.getChildPhoneEmergency());
            childDto.setChildGender(child.getChildGender());
            childDtoList.add(childDto);
        }
        return childDtoList;
    }

    // Editar el niño
    public void updateChild(ChildEditDto childEditDto, Integer id){

        Child child = childRepository.findByChildId(id);
        child.setChildName(childEditDto.getChildName());
        child.setChildBirthdate(childEditDto.getChildBirthdate());
        child.setChildPhoneEmergency(childEditDto.getChildPhoneEmergency());
        child.setChildGender(childEditDto.getChildGender());
        System.out.println(child);
        childRepository.save(child);
    }
    //eliminar logicamente
    public void deleteChild(Integer id){

        Child child = childRepository.findByChildId(id);
        child.setChildStatus(false);
        childRepository.save(child);
    }

}
