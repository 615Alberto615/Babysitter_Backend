package com.softbabysi.demo.dao;

import com.softbabysi.demo.entity.User;
import org.apache.juli.logging.Log;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long>{

    @Query("SELECT i FROM User i WHERE i.userStatus = true")
    public List<User> findAllUserStatus();


    User findByUserId(Integer id);
}
