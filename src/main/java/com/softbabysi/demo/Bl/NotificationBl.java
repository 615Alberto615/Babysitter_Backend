package com.softbabysi.demo.Bl;

import com.softbabysi.demo.Dto.NotificationDto;
import com.softbabysi.demo.Dto.TutorDto;
import com.softbabysi.demo.dao.NotificationDao;
import com.softbabysi.demo.entity.Notification;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NotificationBl {
    @Autowired
    private NotificationDao notificationDao;
    public List<NotificationDto> getAllNotification(){
        List<Notification> notifications=notificationDao.getAllNotification();

        List<NotificationDto> res= new java.util.ArrayList<>();
        notifications.forEach(notification -> {
            res.add(new NotificationDto(notification.getNotificationId(),notification.getBooking().getBookingId(),
                    notification.getNotificationMessage()));
        });
        return res;
    }
}
