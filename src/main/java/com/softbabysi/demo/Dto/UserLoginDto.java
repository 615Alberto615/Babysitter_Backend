package com.softbabysi.demo.Dto;

public class UserLoginDto {
    private Integer userId;
    private Integer seRoleId;
    private String userEmail;
    private String userSecret;
    private String token;

    public UserLoginDto() {
    }

    public UserLoginDto(Integer userId, Integer seRoleId, String userEmail, String userSecret, String token) {
        this.userId = userId;
        this.seRoleId = seRoleId;
        this.userEmail = userEmail;
        this.userSecret = userSecret;
        this.token = token;
    }

    public UserLoginDto(Integer userId, Integer seRoleId, String userEmail, String userSecret) {
        this.userId = userId;
        this.seRoleId = seRoleId;
        this.userEmail = userEmail;
        this.userSecret = userSecret;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getSeRoleId() {
        return seRoleId;
    }

    public void setSeRoleId(Integer seRoleId) {
        this.seRoleId = seRoleId;
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

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    @Override
    public String toString() {
        return "UserLoginDto{" +
                "userId=" + userId +
                ", seRoleId=" + seRoleId +
                ", userEmail='" + userEmail + '\'' +
                ", userSecret='" + userSecret + '\'' +
                ", token='" + token + '\'' +
                '}';
    }
}
