package com.softbabysi.demo.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "SE_ROLE_USER")
public class RoleUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ROLE_USER_ID", nullable = false)
    private Integer roleUserId;

    @Column(name = "SE_ROLE_ID", nullable = false)
    private Integer seRoleId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "USER_ID", nullable = false)
    private User user;
}
