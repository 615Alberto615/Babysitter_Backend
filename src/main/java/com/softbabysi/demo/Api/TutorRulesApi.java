package com.softbabysi.demo.Api;

import com.softbabysi.demo.Bl.TutorRulesBl;
import com.softbabysi.demo.Dto.ResponseDto;
import com.softbabysi.demo.entity.TutorRules;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/tutorRules")
public class TutorRulesApi {
    @Autowired
    private TutorRulesBl tutorRulesBl;

    //Mostrar los tutores con sus reglas por id tutor
    @GetMapping("/tutor/{id}")
    public ResponseEntity<ResponseDto<List<TutorRules>>> findAllTutorRules(@PathVariable Integer id){
        try {
            return ResponseEntity.ok(new ResponseDto<>(200, tutorRulesBl.findTutorRules(id), "All tutor rules"));
        }catch (Exception e) {
            System.out.println(e);
            return ResponseEntity.ok(new ResponseDto<>(500, null, "Error"));
        }
    }
}
