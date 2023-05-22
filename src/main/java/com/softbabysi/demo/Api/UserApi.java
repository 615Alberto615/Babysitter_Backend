package com.softbabysi.demo.Api;

import com.softbabysi.demo.Bl.UserBl;
import com.softbabysi.demo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/vi/user")
public class UserApi {
    /*
    @Autowired
    private UserBl UserBl;
    @GetMapping("")
    public ResponseEntity<ResponseDto<List<User>>> getAllUser(){
        ret
    }
     */
}
