package com.softbabysi.demo.Api;

import com.softbabysi.demo.Bl.ChildActivitiesBl;
import com.softbabysi.demo.Dto.ChildActivitiesFormDto;
import com.softbabysi.demo.Dto.ChildFormDto;
import com.softbabysi.demo.Dto.ResponseDto;
import com.softbabysi.demo.entity.ChildActivitiesForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/childActivities")
public class ChildActivitiesApi {
    @Autowired
    private ChildActivitiesBl childActivitiesBl;

    @PostMapping(path = "/activities")
    public ResponseEntity<ResponseDto<ChildActivitiesForm>> createChildActivities(@RequestBody ChildActivitiesFormDto childActivitiesDto){
        childActivitiesBl.createChildActivities(childActivitiesDto);
        try {
            return ResponseEntity.ok(new ResponseDto<>(200, null, "Babysitter created"));
        }catch (Exception e) {
            return ResponseEntity.ok(new ResponseDto<>(500, null, "Error"));

        }

    }
}