package com.softbabysi.demo.entity;
import jakarta.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "SE_TUTOR")
public class Tutor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "TUTOR_ID", nullable = false)
    private Integer tutorId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "USER_ID", nullable = false)
    private User user;

    @Column(name = "TUTOR_STATUS", nullable = false)
    private Boolean tutorStatus;

    // Getters and setters...

    public Tutor() {
    }

    public Tutor(Integer tutorId, User user, Boolean tutorStatus) {
        this.tutorId = tutorId;
        this.user = user;
        this.tutorStatus = tutorStatus;
    }

    public Integer getTutorId() {
        return tutorId;
    }

    public void setTutorId(Integer tutorId) {
        this.tutorId = tutorId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Boolean getTutorStatus() {
        return tutorStatus;
    }

    public void setTutorStatus(Boolean tutorStatus) {
        this.tutorStatus = tutorStatus;
    }
}
