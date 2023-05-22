package com.softbabysi.demo.dao;

import com.softbabysi.demo.entity.ChildCareForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChildCareFormDao {
    @Autowired
    private ChildCareFormRepository childCareFormRepository;

    public List<ChildCareForm> getAllChildCareForm(){
        return childCareFormRepository.findAll();
    }
}
