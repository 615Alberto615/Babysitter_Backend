package com.softbabysi.demo.Api;

import com.softbabysi.demo.Bl.ChildMedicalFormBl;
import com.softbabysi.demo.Bl.UserBl;
import com.softbabysi.demo.Dto.ChildMedicalFormDto;
import com.softbabysi.demo.Dto.ResponseDto;
import com.softbabysi.demo.entity.ChildActivitiesForm;
import com.softbabysi.demo.entity.ChildMedicalForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/childMedicalForm")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE})
public class ChildMedicalFormApi {
    @Autowired
    private ChildMedicalFormBl childMedicalFormBl;

    @Autowired
    private UserBl userBl;

    // Todos los registros medicos por id de niño
    @GetMapping(path = "/{id}/")
    public ResponseEntity<ResponseDto<ChildMedicalFormDto>>  findByChildId(@PathVariable Integer id, @RequestHeader("Authorization") String token){

        if (!userBl.validateToken(token)) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(new ResponseDto<>(401, null, "Unauthorized"));
        }
        return ResponseEntity.ok(new ResponseDto<>(200, childMedicalFormBl.findByChildId(id), "All child"));

    }


}
