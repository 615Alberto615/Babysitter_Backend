package com.softbabysi.demo.dao;

import com.softbabysi.demo.entity.Babysitter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BabysitterDao {
    @Autowired
    private BabySitterRepository babySitterRepository;

    public List<Babysitter> getAllBabysitter(){
        return babySitterRepository.findAll();
    }

    public Babysitter saveAndFlush(Babysitter babysitter){
        return babySitterRepository.saveAndFlush(babysitter);
    }

    public Babysitter getUserById(Long id){
        return babySitterRepository.getOne(id);
    }



}
