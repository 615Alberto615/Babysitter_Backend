package com.softbabysi.demo.Dto;

public class UserRoleDto {
    private Integer roleUserId;
    private Integer seRoleId;
    private Integer userId;

    public UserRoleDto() {
    }

    public UserRoleDto(Integer roleUserId, Integer seRoleId, Integer userId) {
        this.roleUserId = roleUserId;
        this.seRoleId = seRoleId;
        this.userId = userId;
    }

    public Integer getRoleUserId() {
        return roleUserId;
    }

    public void setRoleUserId(Integer roleUserId) {
        this.roleUserId = roleUserId;
    }

    public Integer getSeRoleId() {
        return seRoleId;
    }

    public void setSeRoleId(Integer seRoleId) {
        this.seRoleId = seRoleId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "UserRoleDto{" +
                "roleUserId=" + roleUserId +
                ", seRoleId=" + seRoleId +
                ", userId=" + userId +
                '}';
    }
}
