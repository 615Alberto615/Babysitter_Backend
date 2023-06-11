package com.softbabysi.demo.Api;

import com.softbabysi.demo.Bl.UserBl;
import com.softbabysi.demo.Bl.UserRoleBl;
import com.softbabysi.demo.entity.UserRole;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/userRole")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE})

public class UserRoleApi {
    @Autowired
    private UserRoleBl userRoleBl;

    @Autowired
    private UserBl userBl;

    //UserRole por id de User
    @GetMapping("/user/{id}")
    public UserRole findUserRoleByUserId(@PathVariable Integer id, @RequestHeader("Authorization") String token ){
        if (!userBl.validateToken(token)) {
            return userRoleBl.findUserRoleByUserId(id);
        }
        return null;
    }
}
