package com.modulith.demo.order.internal.repository;

import com.modulith.demo.order.internal.entity.ProductOrder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<ProductOrder, Long> {

}
