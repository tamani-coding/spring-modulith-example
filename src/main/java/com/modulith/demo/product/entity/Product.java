package com.modulith.demo.product.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(schema = "product")
@Data
public class Product {

    @Id
    private Long id;

    private String name;

    private String description;

}
