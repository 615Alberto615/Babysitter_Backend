package com.softbabysi.demo.Bl;

import com.softbabysi.demo.Dto.TutorDto;
import com.softbabysi.demo.dao.TutorDao;
import com.softbabysi.demo.dao.TutorRepository;
import com.softbabysi.demo.entity.Tutor;
import com.softbabysi.demo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TutorBl {

    @Autowired
    private TutorRepository tutorRepository;
    @Autowired
    private TutorDao tutorDao;
    //Todos los tutores activos
    public List<Tutor> findAllTutorStatus(){
        List<Tutor> tutor = tutorRepository.findAllTutorStatus();
        return tutor;
    }
    // tutor por id
    public Tutor findTutorById(Integer id){
        Tutor tutor = tutorRepository.findByTutorId(id);

        return tutor;
    }

    //tutor por id usuario
    public Tutor findTutorByUserId(Integer id){
        Tutor tutor = tutorRepository.findTutorByUserId(id);

        return tutor;
    }





}
