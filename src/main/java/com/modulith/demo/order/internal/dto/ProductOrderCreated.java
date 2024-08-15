package com.modulith.demo.order.internal.dto;

import org.springframework.modulith.events.Externalized;

@Externalized("orders.ProductOrderCreated::#{orderId()}")
public record ProductOrderCreated(long orderId, String address, String product) {
}
