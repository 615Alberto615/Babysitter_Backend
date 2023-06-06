package com.softbabysi.demo.dao;

import com.softbabysi.demo.entity.TutorEmergencyContact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface TutorEmergencyContactRepository extends JpaRepository<TutorEmergencyContact, Integer> {
    @Query("SELECT i FROM TutorEmergencyContact i WHERE i.tutor.tutorId = ?1")
    public List<TutorEmergencyContact> findTutorEmergencyContactByTutorId(Integer id);

}
