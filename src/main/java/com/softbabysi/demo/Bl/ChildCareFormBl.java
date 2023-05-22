package com.softbabysi.demo.Bl;

import com.softbabysi.demo.Dto.ChildCareFormDto;
import com.softbabysi.demo.dao.ChildCareFormDao;
import com.softbabysi.demo.entity.ChildCareForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ChildCareFormBl {
    @Autowired
    private ChildCareFormDao childCareFormDao;

    public List<ChildCareFormDto> getAllChildCareForm(){
        List<ChildCareForm> childCareForms=childCareFormDao.getAllChildCareForm();

        List<ChildCareFormDto> res= new ArrayList<>();
        childCareForms.forEach(childCareForm -> {
            res.add(new ChildCareFormDto(childCareForm.getChildCareFormId(),childCareForm.getChildId(),
                    childCareForm.getFromField1(),childCareForm.getFromField2(),childCareForm.getFromField3(),
                    childCareForm.getFromField4(),childCareForm.getFromField5(),childCareForm.getFromField6(),
                    childCareForm.getFromField7(),childCareForm.getFromField8(),childCareForm.getFromField9(),
                    childCareForm.getFromField10(),childCareForm.getFromField11()));
        });
        return res;
    }
}
