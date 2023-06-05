package com.softbabysi.demo.Api;

import com.softbabysi.demo.Bl.UserBl;
import com.softbabysi.demo.Dto.*;
import com.softbabysi.demo.entity.Tutor;
import com.softbabysi.demo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/vi/user")
public class UserApi {

    @Autowired
    private UserBl userBl;



    @PostMapping(path = "/babysitter/")
    public ResponseEntity<ResponseDto<User>> createBabysitter(@RequestBody UserBabysitterDto userBabysitterDto){
        userBl.createBabysitter(userBabysitterDto);
        try {
            return ResponseEntity.ok(new ResponseDto<>(200, null, "Babysitter created"));
        }catch (Exception e){
            return ResponseEntity.ok(new ResponseDto<>(500, null, "Error"));
        }

    }

    @PostMapping(path = "/tutor/")
    public ResponseEntity<ResponseDto<User>> createTutor(@RequestBody UserDto userDto){
        userBl.createTutor(userDto);
        try {
            return ResponseEntity.ok(new ResponseDto<>(200, null, "Tutor created"));
        }catch (Exception e){
            return ResponseEntity.ok(new ResponseDto<>(500, null, "Error"));
        }
    }

    @GetMapping(path = "/")
    public ResponseEntity<ResponseDto<List<User>>> findUsersWhitStatusTrue(){
        return ResponseEntity.ok(new ResponseDto<>(200, userBl.findUsersWhitStatusTrue(), "All user"));
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<ResponseDto<User>> findUserById(@PathVariable Integer id){
        return ResponseEntity.ok(new ResponseDto<>(200, userBl.findUserById(id), "User"));
    }


    /*
    @Autowired
    private UserBl UserBl;
    @GetMapping("")
    public ResponseEntity<ResponseDto<List<User>>> getAllUser(){
        ret
    }
     */
}
