package com.softbabysi.demo.Api;

import com.softbabysi.demo.Bl.ChildCareFormBl;
import com.softbabysi.demo.Dto.ChildCareFormDto;
import com.softbabysi.demo.Dto.ChildDto;
import com.softbabysi.demo.Dto.ResponseDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/childcareform")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE})
public class ChilCareFormApi {
    @Autowired
    private ChildCareFormBl childCareFormBl;

    @GetMapping("")
    public ResponseEntity<ResponseDto<List<ChildCareFormDto>>> getAllChildCareForm(){
        ResponseDto<List<ChildCareFormDto>> responseDto = new ResponseDto<>();
        try {
            responseDto.setCode(0000);
            responseDto.setData(childCareFormBl.getAllChildCareForm());
            responseDto.setMessage("ChildCareForm retrieved successfully");
            return ResponseEntity.ok(responseDto);
        }catch (Exception e) {
            responseDto.setCode(500);
            responseDto.setMessage("error");
            return ResponseEntity.ok(responseDto);
        }

    }

    // Obtener todos los formularios de un niño
    /*@GetMapping("/{id}")
    public ResponseEntity<ResponseDto<List<ChildCareFormDto>>> getAllChildCareFormByChildId(@PathVariable Integer id){
        ResponseDto<List<ChildCareFormDto>> responseDto = new ResponseDto<>();
        try {
            responseDto.setCode(0000);
            responseDto.setData(childCareFormBl.getAllChildCareFormByChildId(id));
            responseDto.setMessage("ChildCareForm retrieved successfully");
            return ResponseEntity.ok(responseDto);
        }catch (Exception e) {
            responseDto.setCode(500);
            responseDto.setMessage("error");
            return ResponseEntity.ok(responseDto);
        }

    }*/



}
