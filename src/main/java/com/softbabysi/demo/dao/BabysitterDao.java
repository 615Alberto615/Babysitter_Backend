package com.softbabysi.demo.dao;

import com.softbabysi.demo.entity.Babysitter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BabysitterDao {
    @Autowired
    private BabySitterRepository babySitterRepository;

    public List<Babysitter> getAllBabysitter(){
        return babySitterRepository.findAll();
    }


}
