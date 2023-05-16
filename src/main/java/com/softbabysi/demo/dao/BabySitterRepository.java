package com.softbabysi.demo.dao;

import com.softbabysi.demo.entity.Babysitter;
import org.apache.juli.logging.Log;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BabySitterRepository extends JpaRepository<Babysitter, Log> {

}
