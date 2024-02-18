package com.modulith.demo.notification.internal;

import java.util.Date;

public record Notification(String productName, Date date, NotificationType format) {

}
