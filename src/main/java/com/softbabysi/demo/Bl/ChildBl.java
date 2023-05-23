package com.softbabysi.demo.Bl;

import com.softbabysi.demo.Dto.ChildDto;
import com.softbabysi.demo.dao.ChildDao;
import com.softbabysi.demo.entity.Child;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ChildBl {
    @Autowired
    private ChildDao childDao;
    public List<ChildDto> getAllChild(){
        List<Child> childs=childDao.getAllChild();

        List<ChildDto> res= new ArrayList<>();
        childs.forEach(child -> {
            res.add(new ChildDto(child.getChildId(),child.getTutor().getTutorId(),
                    child.getChildName(),child.getChildBirthdate(),child.getChildPhoneEmergency(),
                    child.getChildGender(),child.getChildTutor() ));
        });
        return res;
    }
    //Areglar id en vez de datos tutor

}
