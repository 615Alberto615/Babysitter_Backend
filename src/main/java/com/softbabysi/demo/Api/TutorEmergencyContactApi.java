package com.softbabysi.demo.Api;

import com.softbabysi.demo.Bl.TutorEmergencyContactBl;
import com.softbabysi.demo.Dto.ResponseDto;
import com.softbabysi.demo.Dto.TutorEmergencyContactDto;
import com.softbabysi.demo.entity.TutorEmergencyContact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/tutorEmergencyContact")
public class TutorEmergencyContactApi {

    @Autowired
    private TutorEmergencyContactBl tutorEmergencyContactBl;
    // Mostrar los contactos de emergencia por id tutor
    @GetMapping("/tutor/{id}")
    public ResponseEntity<ResponseDto<List<TutorEmergencyContact>>> findAllTutorEmergencyContact(@PathVariable Integer id){
        try {
            return ResponseEntity.ok(new ResponseDto<>(200, tutorEmergencyContactBl.findTutorEmergencyContact(id), "All tutor emergency contact"));
        }catch (Exception e) {
            System.out.println(e);
            return ResponseEntity.ok(new ResponseDto<>(500, null, "Error"));
        }
    }

    // Agregar contacto de emergencia a un tutor
    @PostMapping(path = "/")
    public ResponseEntity<ResponseDto<TutorEmergencyContact>> createTutorEmergencyContact(@RequestBody TutorEmergencyContactDto tutorEmergencyContactDto){
        tutorEmergencyContactBl.createTutorEmergencyContact(tutorEmergencyContactDto);
        try {
            return ResponseEntity.ok(new ResponseDto<>(200, null, "Tutor emergency contact created"));
        }catch (Exception e) {
            return ResponseEntity.ok(new ResponseDto<>(500, null, "Error"));
        }
    }
}
