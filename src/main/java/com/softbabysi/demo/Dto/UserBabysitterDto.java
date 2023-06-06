package com.softbabysi.demo.Dto;

public class UserBabysitterDto {

    private Integer seLocationId;
    private String userName;
    private String userLastname;
    private String userEmail;
    private String userAddres;
    private String userPhone;
    private String userSecret;
    private String CI;
    private String extension;
    private String phoneContact;
    private String description;

    public UserBabysitterDto() {
    }

    public UserBabysitterDto(Integer seLocationId, String userName, String userLastname, String userEmail, String userAddres, String userPhone, String userSecret, String CI, String extension, String phoneContact, String description) {
        this.seLocationId = seLocationId;
        this.userName = userName;
        this.userLastname = userLastname;
        this.userEmail = userEmail;
        this.userAddres = userAddres;
        this.userPhone = userPhone;
        this.userSecret = userSecret;
        this.CI = CI;
        this.extension = extension;
        this.phoneContact = phoneContact;
        this.description = description;
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

    public String getCI() {
        return CI;
    }

    public void setCI(String CI) {
        this.CI = CI;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public String getPhoneContact() {
        return phoneContact;
    }

    public void setPhoneContact(String phoneContact) {
        this.phoneContact = phoneContact;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "UserBabysitterDto{" +
                "seLocationId=" + seLocationId +
                ", userName='" + userName + '\'' +
                ", userLastname='" + userLastname + '\'' +
                ", userEmail='" + userEmail + '\'' +
                ", userAddres='" + userAddres + '\'' +
                ", userPhone='" + userPhone + '\'' +
                ", userSecret='" + userSecret + '\'' +
                ", CI='" + CI + '\'' +
                ", extension='" + extension + '\'' +
                ", phoneContact='" + phoneContact + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
