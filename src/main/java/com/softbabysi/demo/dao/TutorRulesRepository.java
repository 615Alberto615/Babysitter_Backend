package com.softbabysi.demo.dao;

import com.softbabysi.demo.entity.TutorRules;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface TutorRulesRepository extends JpaRepository<TutorRules, Integer> {

    @Query("SELECT i FROM TutorRules i WHERE i.tutor.tutorId = ?1")
    public List<TutorRules> findTutorRulesByTutorId(Integer id);

}
