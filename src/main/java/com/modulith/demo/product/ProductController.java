package com.modulith.demo.product;

import com.modulith.demo.product.internal.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    private final ProductService productService;

    public ProductController (ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/test")
    public void test() {
        productService.create(new Product("iPad", "fancy", 2000));
    }

}
