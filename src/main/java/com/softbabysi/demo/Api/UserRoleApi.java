package com.softbabysi.demo.Api;

import com.softbabysi.demo.Bl.UserRoleBl;
import com.softbabysi.demo.entity.UserRole;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/userRole")
public class UserRoleApi {
    @Autowired
    private UserRoleBl userRoleBl;

    //UserRole por id de User
    @GetMapping("/user/{id}")
    public UserRole findUserRoleByUserId(Integer id){
        return userRoleBl.findUserRoleByUserId(id);
    }
}
