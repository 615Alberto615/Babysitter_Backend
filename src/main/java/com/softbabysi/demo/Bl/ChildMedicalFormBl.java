package com.softbabysi.demo.Bl;

import com.softbabysi.demo.dao.ChildMedicalFormRepository;
import com.softbabysi.demo.entity.ChildMedicalForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ChildMedicalFormBl {
    @Autowired
    ChildMedicalFormRepository childMedicalFormRepository;

    //Todos los registros medicos por id de niño
    public ChildMedicalForm findByChildId(Integer id){
        ChildMedicalForm childMedicalForm = childMedicalFormRepository.findByChildId(id);
        return childMedicalForm;
    }

}
