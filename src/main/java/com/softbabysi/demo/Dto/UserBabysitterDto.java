package com.softbabysi.demo.Dto;

public class UserBabysitterDto {

    private Integer location;
    private String name;
    private String lastname;
    private String email;
    private String addres;
    private String phone;
    private String secret;
    private String CI;
    private String extension;
    private String phoneContact;
    private String description;

    public UserBabysitterDto() {
    }

    public UserBabysitterDto(Integer location, String name, String lastname, String email, String addres, String phone, String secret, String CI, String extension, String phoneContact, String description) {
        this.location = location;
        this.name = name;
        this.lastname = lastname;
        this.email = email;
        this.addres = addres;
        this.phone = phone;
        this.secret = secret;
        this.CI = CI;
        this.extension = extension;
        this.phoneContact = phoneContact;
        this.description = description;
    }

    public Integer getLocation() {
        return location;
    }

    public void setLocation(Integer location) {
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddres() {
        return addres;
    }

    public void setAddres(String addres) {
        this.addres = addres;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getSecret() {
        return secret;
    }

    public void setSecret(String secret) {
        this.secret = secret;
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
                "location=" + location +
                ", name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", email='" + email + '\'' +
                ", addres='" + addres + '\'' +
                ", phone='" + phone + '\'' +
                ", secret='" + secret + '\'' +
                ", CI='" + CI + '\'' +
                ", extension='" + extension + '\'' +
                ", phoneContact='" + phoneContact + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
