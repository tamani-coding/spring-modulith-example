package com.modulith.demo.notification.internal;

import com.modulith.demo.notification.NotificationEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class NotificationListener implements ApplicationListener<NotificationEvent> {

    private static final Logger LOG = LoggerFactory.getLogger(NotificationListener.class);

    @Override
    public void onApplicationEvent(NotificationEvent notification) {
        LOG.info("Received notification by module dependency for product {} in date {} by {}.",
                notification.getNotificationDTO().productName(),
                notification.getNotificationDTO().date(),
                notification.getNotificationDTO().format());
    }
}
