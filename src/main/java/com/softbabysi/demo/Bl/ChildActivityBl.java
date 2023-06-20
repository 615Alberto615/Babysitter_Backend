package com.softbabysi.demo.Bl;

import com.softbabysi.demo.Dto.ChildActivityDto;
import com.softbabysi.demo.Dto.ChildActivityEditDto;
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

    //Modificar por id
    public void updateById(Integer id, ChildActivityEditDto childActivityDto){
        ChildActivity childActivity = childActivityRepository.findById(id);
        childActivity.setActivityTableGames(childActivityDto.getActivityTableGames());
        childActivity.setActivityArtsAndCrafts(childActivityDto.getActivityArtsAndCrafts());
        childActivity.setActivityReadingOfBooks(childActivityDto.getActivityReadingOfBooks());
        childActivity.setActivityCookingAndPastry(childActivityDto.getActivityCookingAndPastry());
        childActivity.setActivityOutdoorActivities(childActivityDto.getActivityOutdoorActivities());
        childActivity.setActivityBlockConstruction(childActivityDto.getActivityBlockConstruction());
        childActivity.setActivityRolePlays(childActivityDto.getActivityRolePlays());
        childActivity.setActivityMusicAndDance(childActivityDto.getActivityMusicAndDance());
        childActivity.setActivityExercisesAndYoga(childActivityDto.getActivityExercisesAndYoga());
        childActivity.setActivityGardening(childActivityDto.getActivityGardening());
        childActivity.setActivityConstructionOfFortresses(childActivityDto.getActivityConstructionOfFortresses());
        childActivity.setActivityMoviesAndTvShows(childActivityDto.getActivityMoviesAndTvShows());
        childActivity.setActivityNone(childActivityDto.getActivityNone());
        childActivityRepository.save(childActivity);
    }

    // modificar por id de tutor
    public void updateByTutorId(Integer id, ChildActivityEditDto childActivityDto){
        ChildActivity childActivity = childActivityRepository.findByTutordId(id);
        childActivity.setActivityTableGames(childActivityDto.getActivityTableGames());
        childActivity.setActivityArtsAndCrafts(childActivityDto.getActivityArtsAndCrafts());
        childActivity.setActivityReadingOfBooks(childActivityDto.getActivityReadingOfBooks());
        childActivity.setActivityCookingAndPastry(childActivityDto.getActivityCookingAndPastry());
        childActivity.setActivityOutdoorActivities(childActivityDto.getActivityOutdoorActivities());
        childActivity.setActivityBlockConstruction(childActivityDto.getActivityBlockConstruction());
        childActivity.setActivityRolePlays(childActivityDto.getActivityRolePlays());
        childActivity.setActivityMusicAndDance(childActivityDto.getActivityMusicAndDance());
        childActivity.setActivityExercisesAndYoga(childActivityDto.getActivityExercisesAndYoga());
        childActivity.setActivityGardening(childActivityDto.getActivityGardening());
        childActivity.setActivityConstructionOfFortresses(childActivityDto.getActivityConstructionOfFortresses());
        childActivity.setActivityMoviesAndTvShows(childActivityDto.getActivityMoviesAndTvShows());
        childActivity.setActivityNone(childActivityDto.getActivityNone());
        childActivityRepository.save(childActivity);
    }
}
