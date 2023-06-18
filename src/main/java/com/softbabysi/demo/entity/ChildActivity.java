package com.softbabysi.demo.entity;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "CHILD_ACTIVITY")
public class ChildActivity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CHILD_ACTIVITY_ID", nullable = false)
    private Integer childActivityId;

    @OneToOne
    @JoinColumn(name = "TUTOR_ID", nullable = false)
    private Tutor tutor;

    @Column(name = "ACTIVITY_TABLE_GAMES", nullable = false)
    private Boolean activityTableGames;

    @Column(name = "ACTIVITY_ARTS_AND_CRAFTS", nullable = false)
    private Boolean activityArtsAndCrafts;

    @Column(name = "ACTIVITY_READING_OF_BOOKS", nullable = false)
    private Boolean activityReadingOfBooks;

    @Column(name = "ACTIVITY_COOKING_AND_PASTRY", nullable = false)
    private Boolean activityCookingAndPastry;

    @Column(name = "ACTIVITY_OUTDOOR_ACTIVITIES", nullable = false)
    private Boolean activityOutdoorActivities;

    @Column(name = "ACTIVITY_BLOCK_CONSTRUCTION", nullable = false)
    private Boolean activityBlockConstruction;

    @Column(name = "ACTIVITY_ROLE_PLAYS", nullable = false)
    private Boolean activityRolePlays;

    @Column(name = "ACTIVITY_MUSIC_AND_DANCE", nullable = false)
    private Boolean activityMusicAndDance;

    @Column(name = "ACTIVITY_EXERCISES_AND_YOGA", nullable = false)
    private Boolean activityExercisesAndYoga;

    @Column(name = "ACTIVITY_GARDENING", nullable = false)
    private Boolean activityGardening;

    @Column(name = "ACTIVITY_CONSTRUCTION_OF_FORTRESSES", nullable = false)
    private Boolean activityConstructionOfFortresses;

    @Column(name = "ACTIVITY_MOVIES_AND_TV_SHOWS", nullable = false)
    private Boolean activityMoviesAndTvShows;

    @Column(name = "ACTIVITY_NONE", nullable = false)
    private Boolean activityNone;

    public ChildActivity() {
    }

    public ChildActivity(Integer childActivityId, Child child, Boolean activityTableGames, Boolean activityArtsAndCrafts, Boolean activityReadingOfBooks, Boolean activityCookingAndPastry, Boolean activityOutdoorActivities, Boolean activityBlockConstruction, Boolean activityRolePlays, Boolean activityMusicAndDance, Boolean activityExercisesAndYoga, Boolean activityGardening, Boolean activityConstructionOfFortresses, Boolean activityMoviesAndTvShows, Boolean activityNone) {
        this.childActivityId = childActivityId;
        this.tutor = tutor;
        this.activityTableGames = activityTableGames;
        this.activityArtsAndCrafts = activityArtsAndCrafts;
        this.activityReadingOfBooks = activityReadingOfBooks;
        this.activityCookingAndPastry = activityCookingAndPastry;
        this.activityOutdoorActivities = activityOutdoorActivities;
        this.activityBlockConstruction = activityBlockConstruction;
        this.activityRolePlays = activityRolePlays;
        this.activityMusicAndDance = activityMusicAndDance;
        this.activityExercisesAndYoga = activityExercisesAndYoga;
        this.activityGardening = activityGardening;
        this.activityConstructionOfFortresses = activityConstructionOfFortresses;
        this.activityMoviesAndTvShows = activityMoviesAndTvShows;
        this.activityNone = activityNone;
    }

    public Integer getChildActivityId() {
        return childActivityId;
    }

    public void setChildActivityId(Integer childActivityId) {
        this.childActivityId = childActivityId;
    }

    public Tutor getTutor() {
        return tutor;
    }

    public void setTutor(Tutor tutor) {
        this.tutor = tutor;
    }

    public Boolean getActivityTableGames() {
        return activityTableGames;
    }

    public void setActivityTableGames(Boolean activityTableGames) {
        this.activityTableGames = activityTableGames;
    }

    public Boolean getActivityArtsAndCrafts() {
        return activityArtsAndCrafts;
    }

    public void setActivityArtsAndCrafts(Boolean activityArtsAndCrafts) {
        this.activityArtsAndCrafts = activityArtsAndCrafts;
    }

    public Boolean getActivityReadingOfBooks() {
        return activityReadingOfBooks;
    }

    public void setActivityReadingOfBooks(Boolean activityReadingOfBooks) {
        this.activityReadingOfBooks = activityReadingOfBooks;
    }

    public Boolean getActivityCookingAndPastry() {
        return activityCookingAndPastry;
    }

    public void setActivityCookingAndPastry(Boolean activityCookingAndPastry) {
        this.activityCookingAndPastry = activityCookingAndPastry;
    }

    public Boolean getActivityOutdoorActivities() {
        return activityOutdoorActivities;
    }

    public void setActivityOutdoorActivities(Boolean activityOutdoorActivities) {
        this.activityOutdoorActivities = activityOutdoorActivities;
    }

    public Boolean getActivityBlockConstruction() {
        return activityBlockConstruction;
    }

    public void setActivityBlockConstruction(Boolean activityBlockConstruction) {
        this.activityBlockConstruction = activityBlockConstruction;
    }

    public Boolean getActivityRolePlays() {
        return activityRolePlays;
    }

    public void setActivityRolePlays(Boolean activityRolePlays) {
        this.activityRolePlays = activityRolePlays;
    }

    public Boolean getActivityMusicAndDance() {
        return activityMusicAndDance;
    }

    public void setActivityMusicAndDance(Boolean activityMusicAndDance) {
        this.activityMusicAndDance = activityMusicAndDance;
    }

    public Boolean getActivityExercisesAndYoga() {
        return activityExercisesAndYoga;
    }

    public void setActivityExercisesAndYoga(Boolean activityExercisesAndYoga) {
        this.activityExercisesAndYoga = activityExercisesAndYoga;
    }

    public Boolean getActivityGardening() {
        return activityGardening;
    }

    public void setActivityGardening(Boolean activityGardening) {
        this.activityGardening = activityGardening;
    }

    public Boolean getActivityConstructionOfFortresses() {
        return activityConstructionOfFortresses;
    }

    public void setActivityConstructionOfFortresses(Boolean activityConstructionOfFortresses) {
        this.activityConstructionOfFortresses = activityConstructionOfFortresses;
    }

    public Boolean getActivityMoviesAndTvShows() {
        return activityMoviesAndTvShows;
    }

    public void setActivityMoviesAndTvShows(Boolean activityMoviesAndTvShows) {
        this.activityMoviesAndTvShows = activityMoviesAndTvShows;
    }

    public Boolean getActivityNone() {
        return activityNone;
    }

    public void setActivityNone(Boolean activityNone) {
        this.activityNone = activityNone;
    }

    @Override
    public String toString() {
        return "ChildActivity{" +
                "childActivityId=" + childActivityId +
                ", tutor=" + tutor +
                ", activityTableGames=" + activityTableGames +
                ", activityArtsAndCrafts=" + activityArtsAndCrafts +
                ", activityReadingOfBooks=" + activityReadingOfBooks +
                ", activityCookingAndPastry=" + activityCookingAndPastry +
                ", activityOutdoorActivities=" + activityOutdoorActivities +
                ", activityBlockConstruction=" + activityBlockConstruction +
                ", activityRolePlays=" + activityRolePlays +
                ", activityMusicAndDance=" + activityMusicAndDance +
                ", activityExercisesAndYoga=" + activityExercisesAndYoga +
                ", activityGardening=" + activityGardening +
                ", activityConstructionOfFortresses=" + activityConstructionOfFortresses +
                ", activityMoviesAndTvShows=" + activityMoviesAndTvShows +
                ", activityNone=" + activityNone +
                '}';
    }
}
