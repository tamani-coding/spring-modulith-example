package com.modulith.demo.notification.internal.controller;

import com.modulith.demo.notification.internal.dto.NotificationDto;
import com.modulith.demo.notification.internal.service.NotificationService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/notification")
@RequiredArgsConstructor
public class NotificationController {

    private final NotificationService notificationService;

    @PostMapping
    public void create(@RequestBody  NotificationDto notificationDto) {
        notificationService.create(notificationDto);
    }

    @GetMapping("/{id}")
    public NotificationDto get(@PathVariable Long id) {
        throw new UnsupportedOperationException("GET notification not implemented");
    }
}
