package com.softbabysi.demo.dao;

import com.softbabysi.demo.entity.Notification;
import com.softbabysi.demo.entity.Tutor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NotificationDao {
    @Autowired
    private NotificationRepository notificationRepository;

    public List<Notification> getAllNotification(){
        return notificationRepository.findAll();
    }

}
