package com.softbabysi.demo.Dto;

public class LoginRequestDto {
    private String email;
    private String secret;

    public LoginRequestDto() {
    }

    public LoginRequestDto(String email, String secret) {
        this.email = email;
        this.secret = secret;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSecret() {
        return secret;
    }

    public void setSecret(String secret) {
        this.secret = secret;
    }

    @Override
    public String toString() {
        return "LoginRequestDto{" +
                "email='" + email + '\'' +
                ", secret='" + secret + '\'' +
                '}';
    }
}
