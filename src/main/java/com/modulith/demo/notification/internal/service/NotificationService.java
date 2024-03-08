package com.modulith.demo.notification.internal.service;

import com.modulith.demo.notification.internal.dto.NotificationDto;
import com.modulith.demo.notification.internal.entity.Notification;
import com.modulith.demo.notification.internal.repository.NotificationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class NotificationService {

    private final NotificationRepository notificationRepository;

    public void create(NotificationDto notificationDto) {
        notificationRepository.save(Notification.builder()
                        .type(notificationDto.type())
                .build());
    }
}
