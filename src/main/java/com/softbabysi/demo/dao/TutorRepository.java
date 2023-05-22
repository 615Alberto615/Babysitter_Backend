package com.softbabysi.demo.dao;

import com.softbabysi.demo.entity.Babysitter;
import com.softbabysi.demo.entity.Tutor;
import org.apache.juli.logging.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TutorRepository extends JpaRepository<Tutor, Long>{

}
