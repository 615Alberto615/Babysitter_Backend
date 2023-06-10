package com.softbabysi.demo.dao;

import com.softbabysi.demo.entity.Babysitter;
import com.softbabysi.demo.entity.User;
import org.apache.juli.logging.Log;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface BabySitterRepository extends JpaRepository<Babysitter, Long> {

    @Query("SELECT i FROM Babysitter i WHERE i.babysitterStatus = true")
    public List<Babysitter> findAllBabysitterStatus();

}
