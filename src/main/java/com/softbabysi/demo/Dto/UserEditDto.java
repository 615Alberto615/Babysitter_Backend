package com.softbabysi.demo.Dto;

public class UserEditDto {
    private Integer seLocationId;
    private String userName;
    private String userLastname;
    private String userAddres;
    private String userPhone;

    public UserEditDto() {
    }

    public UserEditDto(Integer seLocationId, String userName, String userLastname, String userAddres, String userPhone) {
        this.seLocationId = seLocationId;
        this.userName = userName;
        this.userLastname = userLastname;
        this.userAddres = userAddres;
        this.userPhone = userPhone;
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

    @Override
    public String toString() {
        return "UserEditDto{" +
                "seLocationId=" + seLocationId +
                ", userName='" + userName + '\'' +
                ", userLastname='" + userLastname + '\'' +
                ", userAddres='" + userAddres + '\'' +
                ", userPhone='" + userPhone + '\'' +
                '}';
    }
}
