package com.softbabysi.demo.Api;

import com.softbabysi.demo.Bl.AbilityBabysitterBl;
import com.softbabysi.demo.Bl.BookingBl;
import com.softbabysi.demo.Dto.AbilityBabysitterDto;
import com.softbabysi.demo.Dto.ResponseDto;
import com.softbabysi.demo.entity.AbilityBabysitter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/abilytybabysitter")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE})
public class AbilityBabysitterApi {
    @Autowired
    private AbilityBabysitterBl abilityBabysitterBl;

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



}
