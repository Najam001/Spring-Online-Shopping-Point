package com.example.rashion.controller;
import com.example.rashion.model.Shop;
import com.example.rashion.request.CategoryRequest;
import com.example.rashion.request.ProductRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.rashion.request.ShopRequest;
import com.example.rashion.service.ShopService;
import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.*;

@RestController
@RequestMapping("/shop")
public class ShopController {

    @Autowired
    private ShopService shopService;
    /*Add a new shop*/
    @PostMapping(path = "/")
    public String addNewShop(@RequestBody ShopRequest shopRequest)   {
        return shopService.addShop(shopRequest);
    }
   // public String createProduct(@RequestBody ProductRequest product){
     //   return productService.saveProduct(product);
   // }

    /** Get all shops**/
    @GetMapping(path = "/")
    public List<Shop> getAllShopList() {
        return shopService.getShopList();
    }

    @DeleteMapping(path = "/shop/{shopId}")
    public String deleteShop(@PathVariable Integer shopId) {
      return   shopService.deleteShop(shopId);
    }
}
