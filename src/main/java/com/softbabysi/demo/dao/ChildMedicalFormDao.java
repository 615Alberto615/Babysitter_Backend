package com.softbabysi.demo.dao;

import com.softbabysi.demo.entity.ChildMedicalForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChildMedicalFormDao {
    @Autowired
    private ChildMedicalFormRepository childMedicalFormRepository;

    public List<ChildMedicalForm> getAllChildMedicalForm(){
        return childMedicalFormRepository.findAll();
    }
}
