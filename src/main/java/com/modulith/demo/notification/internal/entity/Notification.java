package com.modulith.demo.notification.internal.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(schema = "notification")
@Data
public class Notification {

    @Id
    private Long id;

    private String type;

}
