package com.example.rashion.service;

import com.example.rashion.model.Product;
import com.example.rashion.request.ProductRequest;

public interface ProductService {
    Product saveProduct(ProductRequest product);

   // Product getProductById(Integer productId);
}
