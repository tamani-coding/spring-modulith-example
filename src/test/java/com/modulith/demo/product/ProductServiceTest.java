package com.modulith.demo.product;

import com.modulith.demo.product.internal.Product;
import com.modulith.demo.product.internal.service.ProductService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.context.ApplicationEventPublisher;

@ExtendWith(MockitoExtension.class)
public class ProductServiceTest {

    @Mock
    ApplicationEventPublisher applicationEventPublisher;

    @InjectMocks
    ProductService productService;

    @Test
    void test_product () {
        productService.create(new Product("iPad", "fancy", 2000));
    }

}
