package com.softbabysi.demo.Bl;

import com.softbabysi.demo.Dto.ChildMedicalFormDto;
import com.softbabysi.demo.dao.ChildMedicalFormRepository;
import com.softbabysi.demo.entity.ChildMedicalForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ChildMedicalFormBl {
    @Autowired
    ChildMedicalFormRepository childMedicalFormRepository;

    //Todos los registros medicos por id de niño
    public ChildMedicalFormDto findByChildId(Integer id){

        ChildMedicalForm childMedicalForm = childMedicalFormRepository.findByChildId(id);
        ChildMedicalFormDto childMedicalFormDto = new ChildMedicalFormDto();
        childMedicalFormDto.setChildId(childMedicalForm.getChild().getChildId());
        childMedicalFormDto.setChildMedicalFormId(childMedicalForm.getChildMedicalFormId());
        childMedicalFormDto.setMedicalAllergieType(childMedicalForm.getMedicalAllergieType());
        childMedicalFormDto.setMedicalMedication(childMedicalForm.getMedicalMedication());
        childMedicalFormDto.setMedicalMedicationUbication(childMedicalForm.getMedicalMedicationUbication());
        return childMedicalFormDto;
    }

}
