package com.softbabysi.demo.Api;

import com.softbabysi.demo.Bl.NotificationBl;
import com.softbabysi.demo.Bl.UserBl;
import com.softbabysi.demo.Dto.NotificationDto;
import com.softbabysi.demo.Dto.ResponseDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/notification")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE})
public class NotificationApi {
    @Autowired
    private NotificationBl notificationBl;
    @Autowired
    private UserBl userBl;

    @GetMapping("")
    public ResponseEntity<ResponseDto<List<NotificationDto>>> getAllNotification(){
        ResponseDto<List<NotificationDto>> responseDto = new ResponseDto<>();
        try {
            responseDto.setCode(0000);
            responseDto.setData(notificationBl.getAllNotification());
            responseDto.setMessage("Notification retrieved successfully");
            return ResponseEntity.ok(responseDto);
        }catch (Exception e) {
            responseDto.setCode(500);
            responseDto.setMessage("error");
            responseDto.setMessage(e.getMessage());
            return ResponseEntity.ok(responseDto);
        }

    }
    // enviar notificacion
    @PostMapping("")
    public ResponseEntity<ResponseDto<NotificationDto>> saveNotification(@RequestBody NotificationDto notificationDto, @RequestHeader("Authorization") String token){
        ResponseDto<NotificationDto> responseDto = new ResponseDto<>();
        notificationBl.saveNotification(notificationDto);
        try {
            if (!userBl.validateToken(token)){
                return ResponseEntity.status(401).body(new ResponseDto<>(401, null, "Unauthorized"));
            }
            responseDto.setCode(0000);
            responseDto.setData(null);
            responseDto.setMessage("Notification saved successfully");
            return ResponseEntity.ok(responseDto);
        }catch (Exception e) {
            responseDto.setCode(500);
            responseDto.setMessage("error");
            responseDto.setMessage(e.getMessage());
            return ResponseEntity.ok(responseDto);
        }

    }

}
