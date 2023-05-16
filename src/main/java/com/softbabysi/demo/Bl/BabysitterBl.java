package com.softbabysi.demo.Bl;

import com.softbabysi.demo.dao.BabySitterRepository;
import com.softbabysi.demo.entity.Babysitter;

import java.util.List;

public class BabysitterBl {
    private BabySitterRepository babySitterRepository;
    public BabysitterBl(BabySitterRepository babySitterRepository){
        this.babySitterRepository=babySitterRepository;

    }
    public Babysitter save(Babysitter newBabysitter){
        return babySitterRepository.save(newBabysitter);
    }
    public List<Babysitter> findAll(){
        return babySitterRepository.findAll();
    }
}
