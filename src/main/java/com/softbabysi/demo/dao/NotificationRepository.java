package com.softbabysi.demo.dao;

import com.softbabysi.demo.entity.Notification;
import com.softbabysi.demo.entity.Tutor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NotificationRepository extends JpaRepository<Notification, Long> {
}
