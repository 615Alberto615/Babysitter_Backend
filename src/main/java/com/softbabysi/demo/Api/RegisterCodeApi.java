package com.softbabysi.demo.Api;

import com.softbabysi.demo.Bl.RegisterCodeBl;
import com.softbabysi.demo.Dto.RegisterCodeDto;
import com.softbabysi.demo.Dto.ResponseDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/registerCode")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE})
public class RegisterCodeApi {

    @Autowired
    private RegisterCodeBl registerCodeBl;

    //crear nuevo codigo de registro
    @PostMapping(path = "/")
    public ResponseEntity<ResponseDto<RegisterCodeDto>> createRegisterCode(@RequestBody RegisterCodeDto registerCodeDto){
        registerCodeBl.createRegisterCode(registerCodeDto);
        return ResponseEntity.ok(new ResponseDto<>(200, null, "Codigo enviado correctamente"));
    }

}
