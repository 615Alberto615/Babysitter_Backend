package com.softbabysi.demo.Api;

import com.softbabysi.demo.Bl.ChildActivityBl;
import com.softbabysi.demo.Bl.UserBl;
import com.softbabysi.demo.Dto.ChildActivityDto;
import com.softbabysi.demo.Dto.ChildActivityEditDto;
import com.softbabysi.demo.Dto.ResponseDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/childActivity")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE})
public class ChilActivityApi {
    @Autowired
    private ChildActivityBl childActivityBl;

    @Autowired
    private UserBl userBl;

    //obtener por id
    @GetMapping("/{id}")
    public ResponseEntity<ResponseDto<ChildActivityDto>> findById(@PathVariable Integer id, @RequestHeader("Authorization") String token){
        ResponseDto<ChildActivityDto> responseDto = new ResponseDto<>();
        try {
            if(!userBl.validateToken(token)){
                return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(new ResponseDto<>(401, null, "Unauthorized"));
            }
            System.out.println("token autorizado");
            responseDto.setCode(200);
            responseDto.setData(childActivityBl.findById(id));
            responseDto.setMessage("ChildActivity retrieved successfully");
            return ResponseEntity.ok(responseDto);
        }catch (Exception e) {
            responseDto.setCode(500);
            responseDto.setMessage("error");
            return ResponseEntity.ok(responseDto);
        }

    }

    //obtener por id del tutor
    @GetMapping("/tutor/{id}")
    public ResponseEntity<ResponseDto<ChildActivityDto>> findByTutorId(@PathVariable Integer id, @RequestHeader("Authorization") String token){
        ResponseDto<ChildActivityDto> responseDto = new ResponseDto<>();
        try {
            if(!userBl.validateToken(token)){
                return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(new ResponseDto<>(401, null, "Unauthorized"));
            }
            System.out.println("token autorizado");
            responseDto.setCode(200);
            responseDto.setData(childActivityBl.findByTutorId(id));
            responseDto.setMessage("ChildActivity retrieved successfully");
            return ResponseEntity.ok(responseDto);
        }catch (Exception e) {
            responseDto.setCode(500);
            responseDto.setMessage("error");
            return ResponseEntity.ok(responseDto);
        }

    }

    // modificar por id
    @PutMapping("/{id}")
    public ResponseEntity<ResponseDto<ChildActivityEditDto>> update(@PathVariable Integer id, @RequestBody ChildActivityEditDto childActivityDto, @RequestHeader("Authorization") String token){
        childActivityBl.updateById(id, childActivityDto);
        try {
            if(!userBl.validateToken(token)){
                return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(new ResponseDto<>(401, null, "Unauthorized"));
            }
            System.out.println("token autorizado");
            return ResponseEntity.ok(new ResponseDto<>(200, null, "ChildActivity updated successfully"));
        } catch (Exception e) {
            return ResponseEntity.ok(new ResponseDto<>(500, null, "error"));
        }

    }


}
