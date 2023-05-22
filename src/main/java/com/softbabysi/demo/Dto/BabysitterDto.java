package com.softbabysi.demo.Dto;

public class BabysitterDto {
    private Integer babysitterId;
    private Integer UserId;
    private String babysitterUrl;
    private boolean babysitterStatus;
    private String babysitterCi;
    private String babysitterExtension;
    private String babysitterProfilePhoto;
    private String babysitterPhoneContact;
    private String babysitterDescription;
    private boolean babysitterVerify;

    public BabysitterDto() {
    }

    public BabysitterDto(Integer babysitterId, Integer userId, String babysitterUrl, boolean babysitterStatus, String babysitterCi, String babysitterExtension, String babysitterProfilePhoto, String babysitterPhoneContact, String babysitterDescription, boolean babysitterVerify) {
        this.babysitterId = babysitterId;
        UserId = userId;
        this.babysitterUrl = babysitterUrl;
        this.babysitterStatus = babysitterStatus;
        this.babysitterCi = babysitterCi;
        this.babysitterExtension = babysitterExtension;
        this.babysitterProfilePhoto = babysitterProfilePhoto;
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

    public Integer getUserId() {
        return UserId;
    }

    public void setUserId(Integer userId) {
        UserId = userId;
    }

    public String getBabysitterUrl() {
        return babysitterUrl;
    }

    public void setBabysitterUrl(String babysitterUrl) {
        this.babysitterUrl = babysitterUrl;
    }

    public boolean getBabysitterStatus() {
        return babysitterStatus;
    }

    public void setBabysitterStatus(boolean babysitterStatus) {
        this.babysitterStatus = babysitterStatus;
    }

    public String getBabysitterCI() {
        return babysitterCi;
    }

    public void setBabysitterCi(String babysitterCi) {
        this.babysitterCi = babysitterCi;
    }

    public String getBabysitterExtension() {
        return babysitterExtension;
    }

    public void setBabysitterExtension(String babysitterExtension) {
        this.babysitterExtension = babysitterExtension;
    }

    public String getBabysitterProfilePhoto() {
        return babysitterProfilePhoto;
    }

    public void setBabysitterProfilePhoto(String babysitterProfilePhoto) {
        this.babysitterProfilePhoto = babysitterProfilePhoto;
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

    public Boolean getBabysitterVerify() {
        return babysitterVerify;
    }

    public void setBabysitterVerify(Boolean babysitterVerify) {
        this.babysitterVerify = babysitterVerify;
    }

    @Override
    public String toString() {
        return "BabysitterDto{" +
                "babysitterId=" + babysitterId +
                ", UserId=" + UserId +
                ", babysitterUrl='" + babysitterUrl + '\'' +
                ", babysitterStatus=" + babysitterStatus +
                ", babysitterCi='" + babysitterCi + '\'' +
                ", babysitterExtension='" + babysitterExtension + '\'' +
                ", babysitterProfilePhoto='" + babysitterProfilePhoto + '\'' +
                ", babysitterPhoneContact='" + babysitterPhoneContact + '\'' +
                ", babysitterDescription='" + babysitterDescription + '\'' +
                ", babysitterVerify=" + babysitterVerify +
                '}';
    }
}
