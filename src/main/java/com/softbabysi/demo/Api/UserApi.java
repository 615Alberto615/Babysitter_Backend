package com.softbabysi.demo.Api;

import com.softbabysi.demo.Bl.UserBl;
import com.softbabysi.demo.Dto.*;
import com.softbabysi.demo.entity.Tutor;
import com.softbabysi.demo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/user")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE})
public class UserApi {

    @Autowired
    private UserBl userBl;


    //Crear babysitter
    @PostMapping(path = "/babysitter/")
    public ResponseEntity<ResponseDto<User>> createBabysitter(@RequestBody UserBabysitterDto userBabysitterDto){
        userBl.createBabysitter(userBabysitterDto);
        try {
            return ResponseEntity.ok(new ResponseDto<>(200, null, "Babysitter created"));
        }catch (Exception e){
            e.printStackTrace();
            return ResponseEntity.ok(new ResponseDto<>(500, null, "Error"));
        }

    }

    //Crear tutor
    @PostMapping(path = "/tutor/")
    public ResponseEntity<ResponseDto<User>> createTutor(@RequestBody UserDto userDto){
        userBl.createTutor(userDto);
        try {
            return ResponseEntity.ok(new ResponseDto<>(200, null, "Tutor created"));
        }catch (Exception e){
            return ResponseEntity.ok(new ResponseDto<>(500, null, "Error"));
        }
    }
    //Post para el login
    @PostMapping("/login")
    public ResponseEntity<ResponseDto<UserLoginDto>> login(@RequestBody LoginRequestDto loginRequest) {
        String email = loginRequest.getEmail();
        String secret = loginRequest.getSecret();

        UserLoginDto user = userBl.getUsersData(email, secret);

        try {
            if (user != null) {
                return ResponseEntity.ok(new ResponseDto<>(200, user, "Login successful"));
            } else {
                return ResponseEntity.ok(new ResponseDto<>(401, null, "Incorrect credentials"));
            }
        } catch (Exception e) {
            return ResponseEntity.ok(new ResponseDto<>(500, null, "Server error"));
        }
    }
    /*@PostMapping("/login")
    public ResponseEntity<ResponseDto<UserLoginDto>> login(@RequestBody LoginRequestDto loginRequest) {
        String email = loginRequest.getEmail();
        String secret = loginRequest.getSecret();

        UserLoginDto user = userBl.getUsersData(email, secret);
        try {

            if (user != null) {
                return ResponseEntity.ok(new ResponseDto<>(200, user, "Login successful"));
            } else {
                return ResponseEntity.ok(new ResponseDto<>(401, null, "Error de credenciales incorrectas"));
            }
        } catch (Exception e) {
            return ResponseEntity.ok(new ResponseDto<>(500, null, "Error del servidor"));
        }
    }*/

    //Todos los usuarios con status true @RequestHeader("Authorization") String token

    @GetMapping(path = "/")
    public ResponseEntity<ResponseDto<List<User>>> findUsersWhitStatusTrue(@RequestHeader("Authorization") String token){
        //UserBl userBl = new UserBl();
        if(!userBl.validateToken(token)){
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(new ResponseDto<>(401, null, "Unauthorized"));
        }
        System.out.println("token autorizado");
        return ResponseEntity.ok(new ResponseDto<>(200, userBl.findUsersWhitStatusTrue(), "All user"));
    }

    //Usuario por id
    @GetMapping(path = "/{id}")
    public ResponseEntity<ResponseDto<User>> findUserById(@PathVariable Integer id, @RequestHeader("Authorization") String token){
        if (!userBl.validateToken(token)){
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(new ResponseDto<>(401, null, "Unauthorized"));
        }
        return ResponseEntity.ok(new ResponseDto<>(200, userBl.findUserById(id), "User"));
    }

    //Eliminar logicamente el usuario
    @DeleteMapping(path = "/{id}")
    public ResponseEntity<ResponseDto<User>> deleteUser(@PathVariable Integer id, @RequestHeader("Authorization") String token){
        if (!userBl.validateToken(token)){
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(new ResponseDto<>(401, null, "Unauthorized"));
        }
        userBl.deleteUser(id);
        return ResponseEntity.ok(new ResponseDto<>(200, null, "User deleted"));
    }

    //Actualizar usuario
    @PutMapping(path = "/{id}")
    public ResponseEntity<ResponseDto<User>> updateUser(@PathVariable Integer id, @RequestBody UserEditDto userEditDto, @RequestHeader("Authorization") String token){
        if (!userBl.validateToken(token)){
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(new ResponseDto<>(401, null, "Unauthorized"));
        }
        userBl.updateUser(id, userEditDto);
        return ResponseEntity.ok(new ResponseDto<>(200, null, "User updated"));
    }

    //Actualizar el secret del usuario
    @PutMapping(path = "/secret/{id}")
    public ResponseEntity<ResponseDto<User>> updateSecret(@PathVariable Integer id, @RequestBody UserEditSecretDto userEditSecretDto, @RequestHeader("Authorization") String token){
        if (!userBl.validateToken(token)){
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(new ResponseDto<>(401, null, "Unauthorized"));
        }
        userBl.updatePassword(id, userEditSecretDto);
        return ResponseEntity.ok(new ResponseDto<>(200, null, "Secret updated"));
    }



}