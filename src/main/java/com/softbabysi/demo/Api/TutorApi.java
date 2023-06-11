package com.softbabysi.demo.Api;

import com.softbabysi.demo.Bl.BabysitterBl;
import com.softbabysi.demo.Bl.TutorBl;
import com.softbabysi.demo.Bl.UserBl;
import com.softbabysi.demo.Dto.BabysitterDto;
import com.softbabysi.demo.Dto.LocationDto;
import com.softbabysi.demo.Dto.ResponseDto;
import com.softbabysi.demo.Dto.TutorDto;
import com.softbabysi.demo.entity.Tutor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/tutor")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE})
public class TutorApi {
    @Autowired
    private TutorBl tutorBl;

    @Autowired
    private UserBl userBl;

    //Todos los tutores
    @GetMapping("/")
    public ResponseEntity<ResponseDto<List<Tutor>>> findAllTutorStatus(@RequestHeader("Authorization") String token){

        try {
            if(!userBl.validateToken(token)){
                return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(new ResponseDto<>(401, null, "Unauthorized"));
            }
            System.out.println("token autorizado");
            return ResponseEntity.ok(new ResponseDto<>(200, tutorBl.findAllTutorStatus(), "All tutor"));
        }catch (Exception e) {
            System.out.println(e);
            return ResponseEntity.ok(new ResponseDto<>(500, null, "Error"));
        }

    }

    // Por ID de tutor

    @GetMapping("/{id}")
    public ResponseEntity<ResponseDto<Tutor>> findTutorById(@PathVariable Integer id, @RequestHeader("Authorization") String token){

        try {
            if(!userBl.validateToken(token)){
                return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(new ResponseDto<>(401, null, "Unauthorized"));
            }
            System.out.println("token autorizado");
            return ResponseEntity.ok(new ResponseDto<>(200, tutorBl.findTutorById(id), "Tutor"));
        }catch (Exception e) {
            System.out.println(e);
            return ResponseEntity.ok(new ResponseDto<>(500, null, "Error"));
        }

    }

    // Tutor por Id de usuario

    @GetMapping("/user/{id}")
    public ResponseEntity<ResponseDto<TutorDto>> findTutorByUserId(@PathVariable Integer id){
        Tutor tutor = tutorBl.findTutorByUserId(id);
        TutorDto tutorDto = new TutorDto();
        tutorDto.setTutorId(tutor.getTutorId());
        tutorDto.setUserId(tutor.getUser().getUserId());
        tutorDto.setTutorStatus(tutor.getTutorStatus());
        System.out.println(tutorDto);
        try {
            return ResponseEntity.ok(new ResponseDto<>(200, tutorDto, "Tutor"));
        }catch (Exception e) {
            System.out.println(e);
            return ResponseEntity.ok(new ResponseDto<>(500, null, "Error"));
        }

    }

    // location por id de tutor
    @GetMapping("/location/{id}")
    public ResponseEntity<ResponseDto<LocationDto>> getLocationByTutorId(@PathVariable Integer id, @RequestHeader("Authorization") String token){
        LocationDto location = tutorBl.getLocationByTutorId(id);
        try {
            if(!userBl.validateToken(token)){
                return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(new ResponseDto<>(401, null, "Unauthorized"));
            }
            System.out.println("token autorizado");
            return ResponseEntity.ok(new ResponseDto<>(200, location, "Location"));
        }catch (Exception e) {
            System.out.println(e);
            return ResponseEntity.ok(new ResponseDto<>(500, null, "Error con locacion"));
        }

    }


}
