package com.softbabysi.demo.dao;

import com.softbabysi.demo.entity.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRoleRepository extends JpaRepository<UserRole, Long> {

    @Query("SELECT i FROM UserRole i WHERE i.user.userId = ?1")
    public UserRole findByUserId(Integer id);
}
