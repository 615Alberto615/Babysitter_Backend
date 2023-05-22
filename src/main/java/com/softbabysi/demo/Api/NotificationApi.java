package com.softbabysi.demo.Api;

import com.softbabysi.demo.Bl.NotificationBl;
import com.softbabysi.demo.Dto.NotificationDto;
import com.softbabysi.demo.Dto.ResponseDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/notification")
public class NotificationApi {
    @Autowired
    private NotificationBl notificationBl;
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
            return ResponseEntity.ok(responseDto);
        }

    }
}
