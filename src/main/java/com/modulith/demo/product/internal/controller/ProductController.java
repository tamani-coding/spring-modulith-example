package com.modulith.demo.product.internal.controller;

import com.modulith.demo.product.internal.Product;
import com.modulith.demo.product.internal.dto.ProductDto;
import com.modulith.demo.product.internal.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

    @GetMapping("/{id}")
    public ProductDto get(@PathVariable Long id) {
        throw new UnsupportedOperationException("GET product not implemented");
    }

    @GetMapping("/test")
    public void test() {
        productService.create(new Product("iPad", "fancy", 2000));
    }

}
