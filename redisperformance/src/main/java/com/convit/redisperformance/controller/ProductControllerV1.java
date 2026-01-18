package com.convit.redisperformance.controller;

import com.convit.redisperformance.entity.Product;
import com.convit.redisperformance.service.ProductServiceV1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("product/v1")
public class ProductControllerV1 {

    @Autowired
    private ProductServiceV1 service;

    @GetMapping("{id}")
    public Mono<Product> getProduct(@PathVariable int id) {
        return this.service.getProduct(id);
    }

    @PostMapping("{id}")
    public Mono<Product> updateProduct(@PathVariable int id, @RequestBody Mono<Product> productMono) {
        return this.service.updateProduct(id, productMono);
    }
}
