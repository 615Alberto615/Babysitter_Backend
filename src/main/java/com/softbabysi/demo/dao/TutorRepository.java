package com.softbabysi.demo.dao;

import com.softbabysi.demo.Dto.LocationDto;
import com.softbabysi.demo.entity.Babysitter;
import com.softbabysi.demo.entity.Tutor;
import org.apache.juli.logging.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface TutorRepository extends JpaRepository<Tutor, Integer>{

    @Query("SELECT i FROM Tutor i WHERE i.tutorStatus = true")
    public List<Tutor> findAllTutorStatus();

    @Query("SELECT i FROM Tutor i WHERE i.user.userId = ?1")
    public Tutor findTutorByUserId(Integer id);

    Tutor findByTutorId(Integer id);

    //Locacion por tutor
    @Query("SELECT new com.softbabysi.demo.Dto.LocationDto(u.seLocationId) FROM User u JOIN Tutor t ON u.userId = t.user.userId WHERE t.tutorId = ?1")
    LocationDto getLocationByTutorId(Integer id);

    // obtener email por id de tutor
    @Query("SELECT u.userEmail FROM User u JOIN Tutor t ON u.userId = t.user.userId WHERE t.tutorId = ?1")
    String getEmailByTutorId(Integer id);

    // obtener email por id de niñera
    @Query("SELECT u.userEmail FROM User u JOIN Babysitter b ON u.userId = b.user.userId WHERE b.babysitterId = ?1")
    String getEmailByBabysitterId(Integer id);
}