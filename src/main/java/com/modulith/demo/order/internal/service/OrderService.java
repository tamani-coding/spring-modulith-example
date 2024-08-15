package com.modulith.demo.order.internal.service;

import com.modulith.demo.order.internal.dto.ProductOrderCreated;
import com.modulith.demo.order.internal.entity.ProductOrder;
import com.modulith.demo.order.internal.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

@Service
@RequiredArgsConstructor
@Slf4j
public class OrderService {

    private final ApplicationEventPublisher events;

    private final OrderRepository orderRepository;

    @Transactional
    public void generateTestOrder() {
        var random = Math.floor(Math.random() * 100);
        var address = String.format("Address: %s", random);
        var product = String.format("Product: %s", random);
        var order = ProductOrder
                .builder()
                .address(address)
                .product(product)
                .build();

        order = orderRepository.save(order);
        log.info("stored order {}", order.getId());

        events.publishEvent(new ProductOrderCreated(
                order.getId(), order.getAddress(), order.getProduct()));
    }

}
