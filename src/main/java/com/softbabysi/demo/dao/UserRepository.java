package com.softbabysi.demo.dao;

import com.softbabysi.demo.entity.User;
import org.apache.juli.logging.Log;
import org.springframework.data.jpa.repository.JpaRepository;
public interface UserRepository extends JpaRepository<User, Long>{
}
