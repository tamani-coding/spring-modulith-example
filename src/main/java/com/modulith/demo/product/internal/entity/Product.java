package com.modulith.demo.product.internal.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(schema = "product")
@Data
public class Product {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private String description;

}
