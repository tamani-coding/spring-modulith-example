package com.modulith.demo.order.internal.config;

import com.modulith.demo.order.internal.dto.ProductOrderCreated;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.modulith.events.EventExternalizationConfiguration;
import org.springframework.modulith.events.RoutingTarget;
import test.OrderCreated;

@Configuration
public class ExternalizeConfig {

    @Bean
    EventExternalizationConfiguration eventExternalizationConfiguration() {
        return EventExternalizationConfiguration
                .externalizing()
                .select(EventExternalizationConfiguration.annotatedAsExternalized())
                .mapping(ProductOrderCreated.class,this::toAvro)
                .route(
                        ProductOrderCreated.class,
                        it -> RoutingTarget
                                .forTarget("order-created-topic")
                                .andKey(String.valueOf(it.orderId()))
                ).build();
    }

    private OrderCreated toAvro(ProductOrderCreated productOrderCreated) {
        var avro = new OrderCreated();
        avro.setOrderId(productOrderCreated.orderId());
        avro.setAddress(productOrderCreated.address());
        avro.setProduct(productOrderCreated.product());
        return avro;
    }

}
