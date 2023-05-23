package com.softbabysi.demo.Api;

import com.softbabysi.demo.Bl.BookingBl;
import com.softbabysi.demo.Bl.TypeAbilityBl;
import com.softbabysi.demo.Dto.ResponseDto;
import com.softbabysi.demo.Dto.TypeAbilityDto;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/TypeAbility")
public class TypeAbilityApi {
    @Autowired
    private TypeAbilityBl typeAbilityBl;

    @GetMapping("")
    public ResponseEntity<ResponseDto<List<TypeAbilityDto>>> getAllTypeAbility(){
        ResponseDto<List<TypeAbilityDto>> responseDto = new ResponseDto<>();
        try {
            responseDto.setCode(0000);
            responseDto.setData(typeAbilityBl.getAllTypeAbility());
            responseDto.setMessage("TypeAbility retrieved successfully");
            return ResponseEntity.ok(responseDto);
        }catch (Exception e) {
            responseDto.setCode(500);
            responseDto.setMessage("error");
            return ResponseEntity.ok(responseDto);
        }

    }


}
