package com.softbabysi.demo.Bl;

import com.softbabysi.demo.Dto.BabysitterDto;
import com.softbabysi.demo.Dto.TutorDto;
import com.softbabysi.demo.Dto.UserBabysitterDto;
import com.softbabysi.demo.Dto.UserDto;
import com.softbabysi.demo.dao.BabySitterRepository;
import com.softbabysi.demo.dao.TutorRepository;
import com.softbabysi.demo.dao.UserRepository;
import com.softbabysi.demo.entity.Babysitter;
import com.softbabysi.demo.entity.Tutor;
import com.softbabysi.demo.entity.User;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserBl {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private BabySitterRepository babySitterRepository;

    @Autowired
    private TutorRepository tutorRepository;

    //Crear una niñera
    @Transactional
    public void createBabysitter(UserBabysitterDto userBabysitterDto){
        // Crear el primer registro en User
        User user = new User();
        user.setSeLocationId(userBabysitterDto.getSeLocationId());
        user.setUserName(userBabysitterDto.getUserName());
        user.setUserLastname(userBabysitterDto.getUserLastname());
        user.setUserEmail(userBabysitterDto.getUserEmail());
        user.setUserSecret(userBabysitterDto.getUserSecret());
        user.setUserPhone(userBabysitterDto.getUserPhone());
        user.setUserAddres(userBabysitterDto.getUserAddres());
        user.setUserStatus(true);
        userRepository.save(user);
        userRepository.flush(); // flush after saving the user
        //Obtener el id generado por el save del anterior registro
        Integer userId = user.getUserId();
        System.out.println("userId: " + userId);
        System.out.println("userBabysitterDto: " + userBabysitterDto);
        // Crear el babysitter
        Babysitter babysitter = new Babysitter();
        babysitter.setUser(user);
        babysitter.setBabysitterStatus(true);
        babysitter.setBabysitterCI("1233432");
        babysitter.setBabysitterExtension(userBabysitterDto.getExtension());
        babysitter.setBabysitterPhoneContact(userBabysitterDto.getPhoneContact());
        babysitter.setBabysitterDescription(userBabysitterDto.getDescription());
        babysitter.setBabysitterVerify(false);
        babySitterRepository.save(babysitter);
    }


    //Crear un tutor
    //Crear un tutor
    @Transactional
    public void createTutor(UserDto userDto){
        // Crear el primer registro en User
        User user = new User();
        user.setSeLocationId(userDto.getSeLocationId());
        user.setUserName(userDto.getUserName());
        user.setUserLastname(userDto.getUserLastname());
        user.setUserEmail(userDto.getUserEmail());
        user.setUserSecret(userDto.getUserSecret());
        user.setUserPhone(userDto.getUserPhone());
        user.setUserAddres(userDto.getUserAddres());
        user.setUserStatus(true);
        userRepository.save(user);
        userRepository.flush(); // flush after saving the user
        //Obtener el id generado por el save del anterior registro
        Integer userId = user.getUserId();
        // Crear el Tutor
        Tutor tutor = new Tutor();
        tutor.setUser(user);
        tutor.setTutorStatus(true);
        tutorRepository.save(tutor);
    }

    //Todos los usuarios activos
    public List<User> findUsersWhitStatusTrue(){
        List<User> users = userRepository.findAllUserStatus();
        return users;
    }

    //Usuario con id
    public User findUserById(Integer id){
        User user = userRepository.findByUserId(id);
        return user;
    }


    public void findAllUsers(){
        List<User> users = userRepository.findAll();
        users.forEach(user -> {
            System.out.println(user.getUserId());
        });
    }

    /*public User save(User newUser){
        return userRepository.save(newUser);
    }
    public List<User> findAll(){
        return userRepository.findAll();
    }*/





    /*
    public (){

     */
}