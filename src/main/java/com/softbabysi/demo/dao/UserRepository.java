package com.softbabysi.demo.dao;

import com.softbabysi.demo.Dto.BabysitterListDto;
import com.softbabysi.demo.Dto.UserLoginDto;
import com.softbabysi.demo.entity.User;
import org.apache.juli.logging.Log;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long>{

    @Query("SELECT i FROM User i WHERE i.userStatus = true")
    public List<User> findAllUserStatus();


    User findByUserId(Integer id);

    //User y su rol
    //@Query("SELECT u.userId, ur.seRoleId, u.userEmail, u.userSecret FROM User u JOIN UserRole ur ON u.userId = ur.user.userId")
    @Query("SELECT new com.softbabysi.demo.Dto.UserLoginDto(u.userId, ur.seRoleId, u.userEmail, u.userSecret) FROM User u JOIN UserRole ur ON u.userId = ur.user.userId")
    List<UserLoginDto> getUserData();

    //Usuario y niñeras (LISTA DE NIÑERAS)
    @Query("SELECT new com.softbabysi.demo.Dto.BabysitterListDto(b.babysitterId, u.seLocationId, u.userName, u.userLastname, u.userEmail, u.userAddres, b.babysitterCI, b.babysitterPhoneContact, b.babysitterDescription, b.babysitterVerify) FROM User u JOIN Babysitter b ON u.userId = b.user.userId WHERE u.userStatus = true ")
    List<BabysitterListDto> getBabysiiterData();

}
