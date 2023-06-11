package com.softbabysi.demo.Api;

import com.softbabysi.demo.Bl.ChildActivitiesBl;
import com.softbabysi.demo.Bl.UserBl;
import com.softbabysi.demo.Dto.ChildActivitiesFormDto;
import com.softbabysi.demo.Dto.ChildActivitiesFormEditDto;
import com.softbabysi.demo.Dto.ChildFormDto;
import com.softbabysi.demo.Dto.ResponseDto;
import com.softbabysi.demo.entity.ChildActivitiesForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/childActivities")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE})
public class ChildActivitiesApi {
    @Autowired
    private ChildActivitiesBl childActivitiesBl;

    @Autowired
    private UserBl userBl;
    //Crear actividades
    @PostMapping(path = "/activities")
    public ResponseEntity<ResponseDto<ChildActivitiesForm>> createChildActivities(@RequestBody ChildActivitiesFormDto childActivitiesDto, @RequestHeader("Authorization") String token){
        childActivitiesBl.createChildActivities(childActivitiesDto);
        try {
            if(!userBl.validateToken(token)){
                return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(new ResponseDto<>(401, null, "Unauthorized"));
            }
            System.out.println("token autorizado");
            return ResponseEntity.ok(new ResponseDto<>(200, null, "Babysitter created"));
        }catch (Exception e) {
            return ResponseEntity.ok(new ResponseDto<>(500, null, "Error"));

        }

    }

    //Actualizar actividades por id
    @PutMapping(path = "/activities/{id}")
    public ResponseEntity<ResponseDto<ChildActivitiesFormDto>> updateChildActivities(@RequestBody ChildActivitiesFormEditDto childActivitiesFormEditDto, @PathVariable Integer id , @RequestHeader("Authorization") String token){
        System.out.println(childActivitiesFormEditDto);
        childActivitiesBl.updateChildActivities(childActivitiesFormEditDto, id);
        try {
            if(!userBl.validateToken(token)){
                return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(new ResponseDto<>(401, null, "Unauthorized"));
            }
            System.out.println("token autorizado");
            return ResponseEntity.ok(new ResponseDto<>(200, null, "ChildActivities updated"));
        }catch (Exception e) {
            return ResponseEntity.ok(new ResponseDto<>(500, null, "Error"));

        }

    }

    //Eliminar actividades por id
    @DeleteMapping(path = "/activities/{id}")
    public ResponseEntity<ResponseDto<ChildActivitiesForm>> deleteChildActivities(@PathVariable Integer id, @RequestHeader("Authorization") String token){
        childActivitiesBl.deleteChildActivities(id);
        try {
            if(!userBl.validateToken(token)){
                return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(new ResponseDto<>(401, null, "Unauthorized"));
            }
            System.out.println("token autorizado");
            return ResponseEntity.ok(new ResponseDto<>(200, null, "ChildActivities deleted"));
        }catch (Exception e) {
            return ResponseEntity.ok(new ResponseDto<>(500, null, "Error"));

        }

    }

    //Obtener todas las actividades del niño por id del niño
    @GetMapping(path = "/activities/{id}")
    public ResponseEntity<ResponseDto<List<ChildActivitiesForm>>> getChildActivities(@PathVariable Integer id, @RequestHeader("Authorization") String token){
        List<ChildActivitiesForm> childActivitiesFormsList = childActivitiesBl.findByChildId(id);
        try {
            if(!userBl.validateToken(token)){
                return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(new ResponseDto<>(401, null, "Unauthorized"));
            }
            System.out.println("token autorizado");
            return ResponseEntity.ok(new ResponseDto<>(200,childActivitiesFormsList , "ChildActivities deleted"));
        }catch (Exception e) {
            return ResponseEntity.ok(new ResponseDto<>(500, null, "Error"));

        }

    }
}
