package com.softbabysi.demo.Dto;

public class UserDto {
    private Integer userId;
    private Integer seLocationId;
    private String userName;
    private String userLastname;
    private String userEmail;
    private String userAddres;
    private String userPhone;
    private String userSecret;
    private Boolean userStatus;

    public UserDto(Integer userId, Integer seLocationId, String userName, String userLastname, String userEmail, String userAddres, String userPhone, String userSecret, Boolean userStatus) {
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

    public UserDto() {
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
        return "UserDto{" +
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
