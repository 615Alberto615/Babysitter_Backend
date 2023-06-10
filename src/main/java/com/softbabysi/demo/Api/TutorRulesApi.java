package com.softbabysi.demo.Api;

import com.softbabysi.demo.Bl.TutorRulesBl;
import com.softbabysi.demo.Dto.ResponseDto;
import com.softbabysi.demo.Dto.TutorRulesDto;
import com.softbabysi.demo.entity.TutorRules;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/tutorRules")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE})

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

    // Agregar reglas a un tutor
    @PostMapping(path = "/")
    public ResponseEntity<ResponseDto<TutorRules>> createTutorRules(@RequestBody TutorRulesDto tutorRulesDto){
        tutorRulesBl.createTutorRules(tutorRulesDto);
        try {
            return ResponseEntity.ok(new ResponseDto<>(200, null, "Tutor rules created"));
        }catch (Exception e) {
            return ResponseEntity.ok(new ResponseDto<>(500, null, "Error"));
        }

    }
}
