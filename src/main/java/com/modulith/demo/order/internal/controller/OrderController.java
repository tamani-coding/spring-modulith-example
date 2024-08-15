package com.modulith.demo.order.internal.controller;

import com.modulith.demo.order.internal.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
@RequiredArgsConstructor
public class OrderController {

    private final OrderService orderService;

    @GetMapping("/generate-test-order")
    public void generateTestOrder() {
        orderService.generateTestOrder();
    }
}

