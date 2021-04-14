package com.example.rashion.serviceImpl;

import com.example.rashion.model.Product;
import com.example.rashion.reporsitory.ProductRepository;
import com.example.rashion.request.ProductRequest;
import com.example.rashion.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public Product saveProduct(ProductRequest product) {
        Product product1 = new Product();
        product1.setProduct_Id(product.getProduct_Id());
        product1.setProductName(product.getProductName());
        productRepository.save(product1);
        return product1;
    }

   /* @Override
    public Product getProductById(Integer productId) {

        return  productRepository.findByProduct_Id(productId);


    }
*/
}
