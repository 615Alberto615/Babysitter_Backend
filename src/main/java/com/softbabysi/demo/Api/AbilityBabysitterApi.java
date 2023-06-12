package com.softbabysi.demo.Api;

import com.softbabysi.demo.Bl.AbilityBabysitterBl;
import com.softbabysi.demo.Bl.BookingBl;
import com.softbabysi.demo.Bl.UserBl;
import com.softbabysi.demo.Dto.AbilityBabysitterDto;
import com.softbabysi.demo.Dto.AbilityBabysitterNewDto;
import com.softbabysi.demo.Dto.ResponseDto;
import com.softbabysi.demo.entity.AbilityBabysitter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/abilytybabysitter")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE})
public class AbilityBabysitterApi {
    @Autowired
    private AbilityBabysitterBl abilityBabysitterBl;

    @Autowired
    private UserBl userBl;

    @GetMapping("")
    public ResponseEntity<ResponseDto<List<AbilityBabysitterDto>>> getAllAbilityBabysitter(){
        ResponseDto<List<AbilityBabysitterDto>> responseDto = new ResponseDto<>();
        try {
            responseDto.setCode(0000);
            responseDto.setData(abilityBabysitterBl.getAllAbilityBabysitter());
            responseDto.setMessage("AbilityBabysitter retrieved successfully");
            return ResponseEntity.ok(responseDto);
        }catch (Exception e) {
            responseDto.setCode(500);
            responseDto.setMessage("error");
            return ResponseEntity.ok(responseDto);
        }

    }

    // Agregar por id de babysitter
    @PostMapping("/babysitter/{id}")
    public ResponseEntity<ResponseDto<AbilityBabysitterNewDto>> addAbilityBabysitter(@PathVariable("id") Integer id, @RequestBody AbilityBabysitterNewDto abilityBabysitterDto, @RequestHeader("Authorization") String token){
        abilityBabysitterBl.addAbilityBabysitter(id, abilityBabysitterDto);
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

    // Eliminar por id
    @DeleteMapping(path = "/{id}")
    public ResponseEntity<ResponseDto<AbilityBabysitter>> deleteAbilityBabysitter(@PathVariable Integer id, @RequestHeader("Authorization") String token){
        abilityBabysitterBl.deleteAbilityBabysitter(id);
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
