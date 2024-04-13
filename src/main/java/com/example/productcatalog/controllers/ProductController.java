package com.example.productcatalog.controllers;

import com.example.productcatalog.dtos.ProductDto;
import com.example.productcatalog.models.Product;
import lombok.Getter;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {
    @GetMapping
    private List<Product> getAllProduct() {
        return null;
    }

    @GetMapping({"id"})
    private Product getProduct(@PathVariable("id") Long productId){
        Product product = new Product();
        product.setId(productId);
        product.setName("Iphone");
        product.setPrice(100000D);
        return product;
    }

    @PostMapping
    private Product createProduct(@RequestBody ProductDto productDto){
        return  null;
    }



}
