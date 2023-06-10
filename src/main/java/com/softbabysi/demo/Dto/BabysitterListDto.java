package com.softbabysi.demo.Dto;

public class BabysitterListDto {
    private Integer babysitterId;
    private Integer seLocationId;
    private String userName;
    private String userLastName;
    private String userEmail;
    private String userAddres;
    private String babysitterCi;
    private String babysitterPhoneContact;
    private String babysitterDescription;
    private boolean babysitterVerify;

    public BabysitterListDto() {
    }

    public BabysitterListDto(Integer babysitterId, Integer seLocationId, String userName, String userLastName, String userEmail, String userAddres, String babysitterCi, String babysitterPhoneContact, String babysitterDescription, boolean babysitterVerify) {
        this.babysitterId = babysitterId;
        this.seLocationId = seLocationId;
        this.userName = userName;
        this.userLastName = userLastName;
        this.userEmail = userEmail;
        this.userAddres = userAddres;
        this.babysitterCi = babysitterCi;
        this.babysitterPhoneContact = babysitterPhoneContact;
        this.babysitterDescription = babysitterDescription;
        this.babysitterVerify = babysitterVerify;
    }

    public Integer getBabysitterId() {
        return babysitterId;
    }

    public void setBabysitterId(Integer babysitterId) {
        this.babysitterId = babysitterId;
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

    public String getUserLastName() {
        return userLastName;
    }

    public void setUserLastName(String userLastName) {
        this.userLastName = userLastName;
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

    public String getBabysitterCi() {
        return babysitterCi;
    }

    public void setBabysitterCi(String babysitterCi) {
        this.babysitterCi = babysitterCi;
    }

    public String getBabysitterPhoneContact() {
        return babysitterPhoneContact;
    }

    public void setBabysitterPhoneContact(String babysitterPhoneContact) {
        this.babysitterPhoneContact = babysitterPhoneContact;
    }

    public String getBabysitterDescription() {
        return babysitterDescription;
    }

    public void setBabysitterDescription(String babysitterDescription) {
        this.babysitterDescription = babysitterDescription;
    }

    public boolean isBabysitterVerify() {
        return babysitterVerify;
    }

    public void setBabysitterVerify(boolean babysitterVerify) {
        this.babysitterVerify = babysitterVerify;
    }

    @Override
    public String toString() {
        return "BabysitterListDto{" +
                "babysitterId=" + babysitterId +
                ", seLocationId=" + seLocationId +
                ", userName='" + userName + '\'' +
                ", userLastName='" + userLastName + '\'' +
                ", userEmail='" + userEmail + '\'' +
                ", userAddres='" + userAddres + '\'' +
                ", babysitterCi='" + babysitterCi + '\'' +
                ", babysitterPhoneContact='" + babysitterPhoneContact + '\'' +
                ", babysitterDescription='" + babysitterDescription + '\'' +
                ", babysitterVerify=" + babysitterVerify +
                '}';
    }
}
