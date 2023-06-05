package com.softbabysi.demo.entity;

import jakarta.persistence.*;
import java.io.Serializable;


@Entity
@Table(name = "SE_USER")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "USER_ID", nullable = false)
    private Integer userId;

    @Column(name = "SE_LOCATION_ID", nullable = false)
    private Integer seLocationId;

    @Column(name = "USER_NAME", nullable = false)
    private String userName;

    @Column(name = "USER_LASTNAME", nullable = false)
    private String userLastname;

    @Column(name = "USER_EMAIL", nullable = false)
    private String userEmail;

    @Column(name = "USER_ADDRES", nullable = false)
    private String userAddres;

    @Column(name = "USER_PHONE", nullable = false)
    private String userPhone;

    @Column(name = "USER_SECRET", nullable = false)
    private String userSecret;

    @Column(name = "USER_STATUS", nullable = false)
    private Boolean userStatus;
    /*
    @OneToMany(FetchType.LAZY, mappedBy = "USER_ID")

     */
    // Getters and setters...

    public User() {
    }

    public User(Integer userId, Integer seLocationId, String userName, String userLastname, String userEmail, String userAddres, String userPhone, String userSecret, Boolean userStatus) {
        this.userId = userId;
        this.seLocationId = seLocationId;
        this.userName = userName;
        this.userLastname = userLastname;
        this.userEmail = userEmail;
        this.userAddres = userAddres;
        this.userPhone = userPhone;
        this.userSecret = userSecret;
        this.userStatus = userStatus;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getSeLocationId() {
        return seLocationId;
    }

    public void setSeLocationId(Integer seLocationId) {
        this.seLocationId = seLocationId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserLastname() {
        return userLastname;
    }

    public void setUserLastname(String userLastname) {
        this.userLastname = userLastname;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserAddres() {
        return userAddres;
    }

    public void setUserAddres(String userAddres) {
        this.userAddres = userAddres;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public String getUserSecret() {
        return userSecret;
    }

    public void setUserSecret(String userSecret) {
        this.userSecret = userSecret;
    }

    public Boolean getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(Boolean userStatus) {
        this.userStatus = userStatus;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", seLocationId=" + seLocationId +
                ", userName='" + userName + '\'' +
                ", userLastname='" + userLastname + '\'' +
                ", userEmail='" + userEmail + '\'' +
                ", userAddres='" + userAddres + '\'' +
                ", userPhone='" + userPhone + '\'' +
                ", userSecret='" + userSecret + '\'' +
                ", userStatus=" + userStatus +
                '}';
    }
}
