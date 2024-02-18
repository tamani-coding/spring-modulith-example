package com.modulith.demo.product;

import com.modulith.demo.notification.NotificationDTO;
import com.modulith.demo.notification.NotificationEvent;
import com.modulith.demo.product.internal.Product;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class ProductService {

    private final ApplicationEventPublisher events;

    public ProductService(ApplicationEventPublisher events) {
        this.events = events;
    }

    public void create(Product product) {
        events.publishEvent(
                new NotificationEvent(
                        this, new NotificationDTO(
                            product.name(), new Date(), "SMS"
                        )
                )
        );
    }

}
