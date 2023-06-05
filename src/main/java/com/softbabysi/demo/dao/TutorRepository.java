package com.softbabysi.demo.dao;

import com.softbabysi.demo.entity.Babysitter;
import com.softbabysi.demo.entity.Tutor;
import org.apache.juli.logging.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface TutorRepository extends JpaRepository<Tutor, Long>{

    @Query("SELECT i FROM Tutor i WHERE i.tutorStatus = true")
    public List<Tutor> findAllTutorStatus();

    @Query("SELECT i FROM Tutor i WHERE i.user.userId = ?1")
    public Tutor findTutorByUserId(Integer id);

    Tutor findByTutorId(Integer id);
}
