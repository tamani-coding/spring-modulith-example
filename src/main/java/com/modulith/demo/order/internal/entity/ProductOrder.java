package com.modulith.demo.order.internal.entity;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;

@jakarta.persistence.Entity
@Table(schema = "ORDERS")
@Data
@Builder
public class ProductOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "product_order_id_generator")
    @SequenceGenerator(name = "product_order_id_generator", sequenceName = "ORDERS.ORDER_SEQUENCE", allocationSize = 1)
    private long id;

    private String address;

    private String product;

}
