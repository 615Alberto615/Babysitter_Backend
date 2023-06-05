package com.softbabysi.demo.Dto;

public class BabysitterDto {
    private Integer babysitterId;
    private Integer UserId;
    private boolean babysitterStatus;
    private String babysitterCi;
    private String babysitterExtension;
    private String babysitterPhoneContact;
    private String babysitterDescription;
    private boolean babysitterVerify;

    public BabysitterDto() {
    }

    public BabysitterDto(Integer babysitterId, Integer userId, boolean babysitterStatus, String babysitterCi, String babysitterExtension, String babysitterPhoneContact, String babysitterDescription, boolean babysitterVerify) {
        this.babysitterId = babysitterId;
        UserId = userId;
        this.babysitterStatus = babysitterStatus;
        this.babysitterCi = babysitterCi;
        this.babysitterExtension = babysitterExtension;
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

    public boolean isBabysitterStatus() {
        return babysitterStatus;
    }

    public void setBabysitterStatus(boolean babysitterStatus) {
        this.babysitterStatus = babysitterStatus;
    }

    public String getBabysitterCi() {
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
        return "BabysitterDto{" +
                "babysitterId=" + babysitterId +
                ", UserId=" + UserId +
                ", babysitterStatus=" + babysitterStatus +
                ", babysitterCi='" + babysitterCi + '\'' +
                ", babysitterExtension='" + babysitterExtension + '\'' +
                ", babysitterPhoneContact='" + babysitterPhoneContact + '\'' +
                ", babysitterDescription='" + babysitterDescription + '\'' +
                ", babysitterVerify=" + babysitterVerify +
                '}';
    }
}
