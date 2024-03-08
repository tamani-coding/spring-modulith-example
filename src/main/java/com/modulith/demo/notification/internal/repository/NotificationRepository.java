package com.modulith.demo.notification.internal.repository;

import com.modulith.demo.notification.internal.entity.Notification;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NotificationRepository extends JpaRepository<Notification, Long> {

}
