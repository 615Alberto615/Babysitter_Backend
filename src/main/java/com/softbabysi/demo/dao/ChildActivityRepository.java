package com.softbabysi.demo.dao;

import com.softbabysi.demo.entity.ChildActivity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ChildActivityRepository extends JpaRepository<ChildActivity, Long> {

    //por id
    @Query("SELECT i FROM ChildActivity i WHERE i.childActivityId = ?1")
    public ChildActivity findById(Integer id);

    //por id del tutor
    @Query("SELECT i FROM ChildActivity i WHERE i.tutor.tutorId = ?1")
    public ChildActivity findByTutordId(Integer id);
}
