package com.softbabysi.demo.Bl;

import com.softbabysi.demo.Dto.NotificationDto;
import com.softbabysi.demo.Dto.TutorDto;
import com.softbabysi.demo.dao.NotificationDao;
import com.softbabysi.demo.dao.NotificationRepository;
import com.softbabysi.demo.entity.Booking;
import com.softbabysi.demo.entity.Notification;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NotificationBl {
    @Autowired
    private NotificationDao notificationDao;

    @Autowired
    private NotificationRepository notificationRepository;

    public List<NotificationDto> getAllNotification(){
        List<Notification> notifications=notificationDao.getAllNotification();

        List<NotificationDto> res= new java.util.ArrayList<>();
        notifications.forEach(notification -> {
            res.add(new NotificationDto(notification.getNotificationId(),notification.getBooking().getBookingId(),
                    notification.getNotificationMessage()));
        });
        return res;
    }

    //Guardar una notificacion
    @Transactional
    public void saveNotification(NotificationDto notificationDto){
        Notification notification = new Notification();
        Booking booking = new Booking();
        booking.setBookingId(notificationDto.getBookingId());
        notification.setBooking(booking);
        notification.setNotificationMessage(notificationDto.getNotificationMessage());
        notificationRepository.save(notification);
    }
}
