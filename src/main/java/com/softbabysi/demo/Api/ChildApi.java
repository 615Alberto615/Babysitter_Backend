package com.softbabysi.demo.Api;

import com.softbabysi.demo.Bl.ChildBl;
import com.softbabysi.demo.Dto.ChildDto;
import com.softbabysi.demo.Dto.ChildEditDto;
import com.softbabysi.demo.Dto.ChildFormDto;
import com.softbabysi.demo.Dto.ResponseDto;
import com.softbabysi.demo.entity.Child;
import com.softbabysi.demo.entity.ChildActivitiesForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/child")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE})
public class ChildApi {
    @Autowired
    private ChildBl childBl;

    //
    @GetMapping(path = "/tutor/{id}")
    public ResponseEntity<ResponseDto<List<ChildDto>>> findAllChildStatus(@PathVariable Integer id){
        return ResponseEntity.ok(new ResponseDto<>(200, childBl.findAllChildStatus(id), "All child"));
    }

    //Se agrega un niño
    @PostMapping(path = "/")
    public ResponseEntity<ResponseDto<Child>> createChild(@RequestBody ChildFormDto childFormDto){
        childBl.createChild(childFormDto);
        try {
            return ResponseEntity.ok(new ResponseDto<>(200, null, "Child created"));
        }catch (Exception e) {
            return ResponseEntity.ok(new ResponseDto<>(500, null, "Error"));

        }

    }
    //Se actualiza un niño
    @PutMapping(path = "/{id}")
    public ResponseEntity<ResponseDto<ChildEditDto>> updateChild(@RequestBody ChildEditDto childEditDto, @PathVariable Integer id ){
        childBl.updateChild(childEditDto, id);
        try {
            return ResponseEntity.ok(new ResponseDto<>(200, null, "Child updated"));
        }catch (Exception e) {
            return ResponseEntity.ok(new ResponseDto<>(500, null, "Error"));

        }
    }
}
