package com.softbabysi.demo.dao;

import com.softbabysi.demo.entity.Child;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChildDao {
    @Autowired
    private ChildRepository childRepository;
    public List<Child> getAllChild(){
        return childRepository.findAll();
    }
}
