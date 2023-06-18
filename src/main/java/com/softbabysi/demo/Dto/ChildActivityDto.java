package com.softbabysi.demo.Dto;

public class ChildActivityDto {

    private Integer childActivityId;
    private Integer tutorId;
    private boolean activityTableGames;
    private boolean activityArtsAndCrafts;
    private boolean activityReadingOfBooks;
    private boolean activityCookingAndPastry;
    private boolean activityOutdoorActivities;
    private boolean activityBlockConstruction;
    private boolean activityRolePlays;
    private boolean activityMusicAndDance;
    private boolean activityExercisesAndYoga;
    private boolean activityGardening;
    private boolean activityConstructionOfFortresses;
    private boolean activityMoviesAndTvShows;
    private boolean activityNone;

    public ChildActivityDto() {
    }

    public ChildActivityDto(Integer childActivityId, Integer tutorId, boolean activityTableGames, boolean activityArtsAndCrafts, boolean activityReadingOfBooks, boolean activityCookingAndPastry, boolean activityOutdoorActivities, boolean activityBlockConstruction, boolean activityRolePlays, boolean activityMusicAndDance, boolean activityExercisesAndYoga, boolean activityGardening, boolean activityConstructionOfFortresses, boolean activityMoviesAndTvShows, boolean activityNone) {
        this.childActivityId = childActivityId;
        this.tutorId = tutorId;
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

    public Integer getTutorId() {
        return tutorId;
    }

    public void setTutorId(Integer tutorId) {
        this.tutorId = tutorId;
    }

    public boolean isActivityTableGames() {
        return activityTableGames;
    }

    public void setActivityTableGames(boolean activityTableGames) {
        this.activityTableGames = activityTableGames;
    }

    public boolean isActivityArtsAndCrafts() {
        return activityArtsAndCrafts;
    }

    public void setActivityArtsAndCrafts(boolean activityArtsAndCrafts) {
        this.activityArtsAndCrafts = activityArtsAndCrafts;
    }

    public boolean isActivityReadingOfBooks() {
        return activityReadingOfBooks;
    }

    public void setActivityReadingOfBooks(boolean activityReadingOfBooks) {
        this.activityReadingOfBooks = activityReadingOfBooks;
    }

    public boolean isActivityCookingAndPastry() {
        return activityCookingAndPastry;
    }

    public void setActivityCookingAndPastry(boolean activityCookingAndPastry) {
        this.activityCookingAndPastry = activityCookingAndPastry;
    }

    public boolean isActivityOutdoorActivities() {
        return activityOutdoorActivities;
    }

    public void setActivityOutdoorActivities(boolean activityOutdoorActivities) {
        this.activityOutdoorActivities = activityOutdoorActivities;
    }

    public boolean isActivityBlockConstruction() {
        return activityBlockConstruction;
    }

    public void setActivityBlockConstruction(boolean activityBlockConstruction) {
        this.activityBlockConstruction = activityBlockConstruction;
    }

    public boolean isActivityRolePlays() {
        return activityRolePlays;
    }

    public void setActivityRolePlays(boolean activityRolePlays) {
        this.activityRolePlays = activityRolePlays;
    }

    public boolean isActivityMusicAndDance() {
        return activityMusicAndDance;
    }

    public void setActivityMusicAndDance(boolean activityMusicAndDance) {
        this.activityMusicAndDance = activityMusicAndDance;
    }

    public boolean isActivityExercisesAndYoga() {
        return activityExercisesAndYoga;
    }

    public void setActivityExercisesAndYoga(boolean activityExercisesAndYoga) {
        this.activityExercisesAndYoga = activityExercisesAndYoga;
    }

    public boolean isActivityGardening() {
        return activityGardening;
    }

    public void setActivityGardening(boolean activityGardening) {
        this.activityGardening = activityGardening;
    }

    public boolean isActivityConstructionOfFortresses() {
        return activityConstructionOfFortresses;
    }

    public void setActivityConstructionOfFortresses(boolean activityConstructionOfFortresses) {
        this.activityConstructionOfFortresses = activityConstructionOfFortresses;
    }

    public boolean isActivityMoviesAndTvShows() {
        return activityMoviesAndTvShows;
    }

    public void setActivityMoviesAndTvShows(boolean activityMoviesAndTvShows) {
        this.activityMoviesAndTvShows = activityMoviesAndTvShows;
    }

    public boolean isActivityNone() {
        return activityNone;
    }

    public void setActivityNone(boolean activityNone) {
        this.activityNone = activityNone;
    }

    @Override
    public String toString() {
        return "ChildActivityDto{" +
                "childActivityId=" + childActivityId +
                ", tutorId=" + tutorId +
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
