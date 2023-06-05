package com.softbabysi.demo.Dto;

public class TokenDto {
    private String authToken;

    public TokenDto() {
    }

    public String getAuthToken() {
        return authToken;
    }

    public void setAuthToken(String authToken) {
        this.authToken = authToken;
    }

    @Override
    public String toString() {
        return "TokenDto{" +
                "authToken='" + authToken + '\'' +
                '}';
    }
}
