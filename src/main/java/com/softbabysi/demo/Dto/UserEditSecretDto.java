package com.softbabysi.demo.Dto;

public class UserEditSecretDto {
    private String userEmail;
    private String userSecret;

    public UserEditSecretDto() {
    }

    public UserEditSecretDto(String userEmail, String userSecret) {
        this.userEmail = userEmail;
        this.userSecret = userSecret;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserSecret() {
        return userSecret;
    }

    public void setUserSecret(String userSecret) {
        this.userSecret = userSecret;
    }

    @Override
    public String toString() {
        return "UserEditSecretDto{" +
                "userEmail='" + userEmail + '\'' +
                ", userSecret='" + userSecret + '\'' +
                '}';
    }
}
