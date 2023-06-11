package com.softbabysi.demo.Api;

import com.softbabysi.demo.Bl.TutorEmergencyContactBl;
import com.softbabysi.demo.Bl.UserBl;
import com.softbabysi.demo.Dto.ResponseDto;
import com.softbabysi.demo.Dto.TutorEmergencyContactDto;
import com.softbabysi.demo.entity.TutorEmergencyContact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/tutorEmergencyContact")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE})
public class TutorEmergencyContactApi {

    @Autowired
    private TutorEmergencyContactBl tutorEmergencyContactBl;

    @Autowired
    private UserBl userBl;

    // Mostrar los contactos de emergencia por id tutor
    @GetMapping("/tutor/{id}")
    public ResponseEntity<ResponseDto<List<TutorEmergencyContact>>> findAllTutorEmergencyContact(@PathVariable Integer id, @RequestHeader("Authorization") String token){
        try {
            if(!userBl.validateToken(token)){
                return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(new ResponseDto<>(401, null, "Unauthorized"));
            }
            System.out.println("token autorizado");
            return ResponseEntity.ok(new ResponseDto<>(200, tutorEmergencyContactBl.findTutorEmergencyContact(id), "All tutor emergency contact"));
        }catch (Exception e) {
            System.out.println(e);
            return ResponseEntity.ok(new ResponseDto<>(500, null, "Error"));
        }
    }

    // Agregar contacto de emergencia a un tutor
    @PostMapping(path = "/")
    public ResponseEntity<ResponseDto<TutorEmergencyContact>> createTutorEmergencyContact(@RequestBody TutorEmergencyContactDto tutorEmergencyContactDto, @RequestHeader("Authorization") String token){
        tutorEmergencyContactBl.createTutorEmergencyContact(tutorEmergencyContactDto);
        try {
            if(!userBl.validateToken(token)){
                return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(new ResponseDto<>(401, null, "Unauthorized"));
            }
            System.out.println("token autorizado");
            return ResponseEntity.ok(new ResponseDto<>(200, null, "Tutor emergency contact created"));
        }catch (Exception e) {
            return ResponseEntity.ok(new ResponseDto<>(500, null, "Error"));
        }
    }
}
