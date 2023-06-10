package com.softbabysi.demo.dao;

import com.softbabysi.demo.entity.Child;
import com.softbabysi.demo.entity.Tutor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ChildRepository extends JpaRepository<Child, Long> {

    @Query("SELECT i FROM Child i WHERE i.childStatus = true AND i.tutor.tutorId = ?1")
    public List<Child> findAllChildStatus(Integer id);



}
