package com.example.rashion.controller;

import com.example.rashion.model.Product;
import com.example.rashion.request.ProductRequest;
import com.example.rashion.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;

@RestController
@RequestMapping("api/v1/product")
public class ProductController {
    @Autowired
    private ProductService productService;
    private Product product;

    @PostMapping("/")
    public Product createProduct(@RequestBody ProductRequest p) {
        product = productService.saveProduct(p);
        return product;
    }

    //   @GetMapping("/getProductById")
    //public Product createProduct(@RequestParam Integer productId){
    //    return productService.getProductById(productId);
}




