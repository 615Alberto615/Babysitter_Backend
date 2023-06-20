package com.softbabysi.demo.Api;

import com.softbabysi.demo.Bl.BabysitterAbilityBl;
import com.softbabysi.demo.Bl.UserBl;
import com.softbabysi.demo.Dto.BabysitterAbilityDto;
import com.softbabysi.demo.Dto.BabysitterAbilityEditDto;
import com.softbabysi.demo.Dto.ResponseDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/babysitterAbility")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE})
public class BabysitterAbilityApi {

    @Autowired
    private BabysitterAbilityBl babysitterAbilityBl;

    @Autowired
    private UserBl userBl;

    //obtener por id
    @GetMapping("/{id}")
    public ResponseEntity<ResponseDto<BabysitterAbilityDto>> findById(@PathVariable Integer id, @RequestHeader("Authorization") String token){
        ResponseDto<BabysitterAbilityDto> responseDto = new ResponseDto<>();
        try {
            if(!userBl.validateToken(token)){
                return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(new ResponseDto<>(401, null, "Unauthorized"));
            }
            System.out.println("token autorizado");
            responseDto.setCode(200);
            responseDto.setData(babysitterAbilityBl.findById(id));
            responseDto.setMessage("BabysitterAbility retrieved successfully");
            return ResponseEntity.ok(responseDto);
        }catch (Exception e) {
            responseDto.setCode(500);
            responseDto.setMessage("error");
            return ResponseEntity.ok(responseDto);
        }
    }

    //obtener por id de la niñera
    @GetMapping("/babysitter/{id}")
    public ResponseEntity<ResponseDto<BabysitterAbilityDto>> findByBabysitterId(@PathVariable Integer id, @RequestHeader("Authorization") String token){
        ResponseDto<BabysitterAbilityDto> responseDto = new ResponseDto<>();
        try {
            if(!userBl.validateToken(token)){
                return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(new ResponseDto<>(401, null, "Unauthorized"));
            }
            System.out.println("token autorizado");
            responseDto.setCode(200);
            responseDto.setData(babysitterAbilityBl.findByBabysitterId(id));
            responseDto.setMessage("BabysitterAbility retrieved successfully");
            return ResponseEntity.ok(responseDto);
        }catch (Exception e) {
            responseDto.setCode(500);
            responseDto.setMessage("error");
            return ResponseEntity.ok(responseDto);
        }
    }

    //Modificar por id
    @PutMapping("/{id}")
    public ResponseEntity<ResponseDto<BabysitterAbilityDto>> update(@PathVariable Integer id, @RequestBody BabysitterAbilityEditDto babysitterAbilityDto, @RequestHeader("Authorization") String token){
        babysitterAbilityBl.updateById(id, babysitterAbilityDto);
        try {
            if(!userBl.validateToken(token)){
                return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(new ResponseDto<>(401, null, "Unauthorized"));
            }
            System.out.println("token autorizado");
            return ResponseEntity.ok(new ResponseDto<>(200, null, "BabysitterAbility updated successfully"));
        }catch (Exception e) {
            return ResponseEntity.ok(new ResponseDto<>(500, null, "error"));
        }
    }

    //modificar por id de babysitter
    @PutMapping("/babysitter/{id}")
    public ResponseEntity<ResponseDto<BabysitterAbilityDto>> updateByBabysitterId(@PathVariable Integer id, @RequestBody BabysitterAbilityEditDto babysitterAbilityDto, @RequestHeader("Authorization") String token){
        babysitterAbilityBl.updateByBabysitterId(id, babysitterAbilityDto);
        try {
            if(!userBl.validateToken(token)){
                return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(new ResponseDto<>(401, null, "Unauthorized"));
            }
            System.out.println("token autorizado");
            return ResponseEntity.ok(new ResponseDto<>(200, null, "BabysitterAbility updated successfully"));
        }catch (Exception e) {
            return ResponseEntity.ok(new ResponseDto<>(500, null, "error"));
        }
    }
}
