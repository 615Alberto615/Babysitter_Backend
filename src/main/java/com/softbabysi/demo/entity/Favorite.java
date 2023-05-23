package com.softbabysi.demo.entity;
import jakarta.persistence.*;

@Entity
@Table(name = "FAVORITE")
public class Favorite {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "FAVORITE_ID", nullable = false)
    private Integer favoriteId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "TUTOR_ID", nullable = false)
    private Tutor tutor;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "SE_BABYSITTER_ID", nullable = false)
    private Babysitter babysitter;

    // Getters and setters...

    public Favorite() {
    }

    public Favorite(Integer favoriteId, Tutor tutor, Babysitter babysitter) {
        this.favoriteId = favoriteId;
        this.tutor = tutor;
        this.babysitter = babysitter;
    }

    public Integer getFavoriteId() {
        return favoriteId;
    }

    public void setFavoriteId(Integer favoriteId) {
        this.favoriteId = favoriteId;
    }

    public Tutor getTutor() {
        return tutor;
    }

    public void setTutor(Tutor tutor) {
        this.tutor = tutor;
    }

    public Babysitter getBabysitter() {
        return babysitter;
    }

    public void setBabysitter(Babysitter babysitter) {
        this.babysitter = babysitter;
    }
}
