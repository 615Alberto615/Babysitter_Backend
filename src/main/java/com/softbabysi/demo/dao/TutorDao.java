package com.softbabysi.demo.dao;

import com.softbabysi.demo.entity.Tutor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TutorDao {
    @Autowired
    private TutorRepository tutorRepository;
    public List<Tutor> getAllTutor(){
        return tutorRepository.findAll();
    }
}
