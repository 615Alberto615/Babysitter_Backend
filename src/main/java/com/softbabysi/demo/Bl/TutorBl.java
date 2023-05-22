package com.softbabysi.demo.Bl;

import com.softbabysi.demo.Dto.TutorDto;
import com.softbabysi.demo.dao.TutorDao;
import com.softbabysi.demo.dao.TutorRepository;
import com.softbabysi.demo.entity.Tutor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TutorBl {
  @Autowired
    private TutorDao tutorDao;
    public List<TutorDto> getAllTutor(){
        List<Tutor> tutors=tutorDao.getAllTutor();

        List<TutorDto> res= new java.util.ArrayList<>();
        tutors.forEach(tutor -> {
            res.add(new TutorDto(tutor.getTutorId(),tutor.getUser().getUserId(),
                    tutor.getTutorStatus()));
        });
        return res;
    }
}
