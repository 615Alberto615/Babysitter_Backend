package com.softbabysi.demo.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "SE_ROLE_USER")
public class UserRole {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ROLE_USER_ID", nullable = false)
    private Integer roleUserId;

    @Column(name = "SE_ROLE_ID", nullable = false)
    private Integer seRoleId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "USER_ID", nullable = false)
    private User user;

    public UserRole() {
    }

    public UserRole(Integer roleUserId, Integer seRoleId, User user) {
        this.roleUserId = roleUserId;
        this.seRoleId = seRoleId;
        this.user = user;
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

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "UserRole{" +
                "roleUserId=" + roleUserId +
                ", seRoleId=" + seRoleId +
                ", user=" + user +
                '}';
    }
}
