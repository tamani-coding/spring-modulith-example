package com.modulith.demo.notification;

import org.springframework.context.ApplicationEvent;

public class NotificationEvent extends ApplicationEvent {

    public NotificationDTO getNotificationDTO() {
        return notificationDTO;
    }

    private final NotificationDTO notificationDTO;

    public NotificationEvent(Object source, NotificationDTO notificationDTO) {
        super(source);
        this.notificationDTO = notificationDTO;
    }
}
