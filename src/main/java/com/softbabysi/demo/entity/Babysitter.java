package com.softbabysi.demo.entity;

import jakarta.persistence.*;

import java.util.Date;


@Entity
@Table(name = "SE_BABYSITTER")
public class Babysitter {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "BABYSITTER_ID")
    private Long babysitterId;

    @Column(name = "BAYSITTER_CI", nullable = false)
    private String babysitterCi;

    @Column(name = "BABYSITTER_EXTENSION", nullable = false)
    private String babysitterExtension;

    @Column(name = "BABYSITTER_PROFILE_PHOTO", nullable = false)
    private String babysitterProfilePhoto;

    @Column(name = "BABYSITTER_PHONE_CONTACT", nullable = false)
    private String babysitterPhoneContact;

    @Column(name = "BABYSITTER_DESCRIPTION", nullable = false)
    private String babysitterDescription;

    @Column(name = "TX_DATE", nullable = false)
    private Date txDate;

    @Column(name = "TX_USER")
    private String txUser;

    @Column(name = "TX_HOST")
    private String txHost;

    // Constructor, getters, and setters
    // ...


    public Babysitter(Long babysitterId, String babysitterCi, String babysitterExtension, String babysitterProfilePhoto, String babysitterPhoneContact, String babysitterDescription, Date txDate, String txUser, String txHost) {
        this.babysitterId = babysitterId;
        this.babysitterCi = babysitterCi;
        this.babysitterExtension = babysitterExtension;
        this.babysitterProfilePhoto = babysitterProfilePhoto;
        this.babysitterPhoneContact = babysitterPhoneContact;
        this.babysitterDescription = babysitterDescription;
        this.txDate = txDate;
        this.txUser = txUser;
        this.txHost = txHost;
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

    public Date getTxDate() {
        return txDate;
    }

    public void setTxDate(Date txDate) {
        this.txDate = txDate;
    }

    public String getTxUser() {
        return txUser;
    }

    public void setTxUser(String txUser) {
        this.txUser = txUser;
    }

    public String getTxHost() {
        return txHost;
    }

    public void setTxHost(String txHost) {
        this.txHost = txHost;
    }

    public Babysitter() {
    }




}
