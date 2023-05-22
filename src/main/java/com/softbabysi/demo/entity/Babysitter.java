package com.softbabysi.demo.entity;

import jakarta.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "SE_BABYSITTER")
public class Babysitter{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "BABYSITTER_ID", nullable = false)
    private Integer babysitterId;
    /*
    @Column(name = "USER_ID", nullable = false)
    private Integer userId;
    */

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "USER_ID", nullable = false)
    private User user;

    @Column(name = "BABYSITTER_URL", nullable = false)
    private String babysitterUrl;

    @Column(name = "BABYSITTER_STATUS", nullable = false,columnDefinition = "boolean default true")
    private Boolean babysitterStatus;

    @Column(name = "BAYSITTER_CI", nullable = false)
    private String babysitterCI;

    @Column(name = "BABYSITTER_EXTENSION", nullable = false)
    private String babysitterExtension;

    @Column(name = "BABYSITTER_PROFILE_PHOTO", nullable = false)
    private String babysitterProfilePhoto;

    @Column(name = "BABYSITTER_PHONE_CONTACT", nullable = false)
    private String babysitterPhoneContact;

    @Column(name = "BABYSITTER_DESCRIPTION", nullable = false)
    private String babysitterDescription;

    @Column(name = "BABYSITTER_VERIFY", nullable = false, columnDefinition = "boolean default false")
    private Boolean babysitterVerify;

    // Getters and setters...

    public Babysitter() {
    }

    public Babysitter(Integer babysitterId, User user, String babysitterUrl,
                      Boolean babysitterStatus, String babysitterCI, String babysitterExtension,
                      String babysitterProfilePhoto, String babysitterPhoneContact, String babysitterDescription,
                      Boolean babysitterVerify) {
        this.babysitterId = babysitterId;
        this.user = user;
        this.babysitterUrl = babysitterUrl;
        this.babysitterStatus = babysitterStatus;
        this.babysitterCI = babysitterCI;
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

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getBabysitterUrl() {
        return babysitterUrl;
    }

    public void setBabysitterUrl(String babysitterUrl) {
        this.babysitterUrl = babysitterUrl;
    }

    public Boolean getBabysitterStatus() {
        return babysitterStatus;
    }

    public void setBabysitterStatus(Boolean babysitterStatus) {
        this.babysitterStatus = babysitterStatus;
    }

    public String getBabysitterCI() {
        return babysitterCI;
    }

    public void setBabysitterCI(String babysitterCI) {
        this.babysitterCI = babysitterCI;
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
}
