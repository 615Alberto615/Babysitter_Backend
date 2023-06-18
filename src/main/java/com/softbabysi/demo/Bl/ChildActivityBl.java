package com.softbabysi.demo.Bl;

import com.softbabysi.demo.Dto.ChildActivityDto;
import com.softbabysi.demo.dao.ChildActivityRepository;
import com.softbabysi.demo.entity.ChildActivity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ChildActivityBl {

    @Autowired
    private ChildActivityRepository childActivityRepository;

    // por id
    public ChildActivityDto findById(Integer id){
        ChildActivity childActivity = childActivityRepository.findById(id);
        ChildActivityDto childActivityDto = new ChildActivityDto();
        childActivityDto.setChildActivityId(childActivity.getChildActivityId());
        childActivityDto.setTutorId(childActivity.getTutor().getTutorId());
        childActivityDto.setActivityTableGames(childActivity.getActivityTableGames());
        childActivityDto.setActivityArtsAndCrafts(childActivity.getActivityArtsAndCrafts());
        childActivityDto.setActivityReadingOfBooks(childActivity.getActivityReadingOfBooks());
        childActivityDto.setActivityCookingAndPastry(childActivity.getActivityCookingAndPastry());
        childActivityDto.setActivityOutdoorActivities(childActivity.getActivityOutdoorActivities());
        childActivityDto.setActivityBlockConstruction(childActivity.getActivityBlockConstruction());
        childActivityDto.setActivityRolePlays(childActivity.getActivityRolePlays());
        childActivityDto.setActivityMusicAndDance(childActivity.getActivityMusicAndDance());
        childActivityDto.setActivityExercisesAndYoga(childActivity.getActivityExercisesAndYoga());
        childActivityDto.setActivityGardening(childActivity.getActivityGardening());
        childActivityDto.setActivityConstructionOfFortresses(childActivity.getActivityConstructionOfFortresses());
        childActivityDto.setActivityMoviesAndTvShows(childActivity.getActivityMoviesAndTvShows());
        childActivityDto.setActivityNone(childActivity.getActivityNone());
        return childActivityDto;
    }

    // por id del tutor
    public ChildActivityDto findByTutorId(Integer id){
        ChildActivity childActivity = childActivityRepository.findByTutordId(id);
        ChildActivityDto childActivityDto = new ChildActivityDto();
        childActivityDto.setChildActivityId(childActivity.getChildActivityId());
        childActivityDto.setTutorId(childActivity.getTutor().getTutorId());
        childActivityDto.setActivityTableGames(childActivity.getActivityTableGames());
        childActivityDto.setActivityArtsAndCrafts(childActivity.getActivityArtsAndCrafts());
        childActivityDto.setActivityReadingOfBooks(childActivity.getActivityReadingOfBooks());
        childActivityDto.setActivityCookingAndPastry(childActivity.getActivityCookingAndPastry());
        childActivityDto.setActivityOutdoorActivities(childActivity.getActivityOutdoorActivities());
        childActivityDto.setActivityBlockConstruction(childActivity.getActivityBlockConstruction());
        childActivityDto.setActivityRolePlays(childActivity.getActivityRolePlays());
        childActivityDto.setActivityMusicAndDance(childActivity.getActivityMusicAndDance());
        childActivityDto.setActivityExercisesAndYoga(childActivity.getActivityExercisesAndYoga());
        childActivityDto.setActivityGardening(childActivity.getActivityGardening());
        childActivityDto.setActivityConstructionOfFortresses(childActivity.getActivityConstructionOfFortresses());
        childActivityDto.setActivityMoviesAndTvShows(childActivity.getActivityMoviesAndTvShows());
        childActivityDto.setActivityNone(childActivity.getActivityNone());
        return childActivityDto;
    }
}
