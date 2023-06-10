package com.softbabysi.demo.Bl;

import com.softbabysi.demo.dao.UserRoleRepository;
import com.softbabysi.demo.entity.UserRole;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserRoleBl {

    @Autowired
    private UserRoleRepository userRoleRepository;

    public UserRole findUserRoleByUserId(Integer id){
        UserRole userRole = userRoleRepository.findByUserId(id);
        return userRole;
    }

}
