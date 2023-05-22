package com.softbabysi.demo.Bl;

import com.softbabysi.demo.dao.UserRepository;
import com.softbabysi.demo.entity.User;

import java.util.List;

public class UserBl {
    private UserRepository userRepository;
    public UserBl(UserRepository userRepository){
        this.userRepository=userRepository;

    }
    public User save(User newUser){
        return userRepository.save(newUser);
    }
    public List<User> findAll(){
        return userRepository.findAll();
    }

    /*
    public (){

     */
}
