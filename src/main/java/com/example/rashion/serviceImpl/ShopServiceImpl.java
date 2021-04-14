package com.example.rashion.serviceImpl;

import com.example.rashion.model
        .Shop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.rashion.reporsitory.ShopRepository;
import com.example.rashion.request.ShopRequest;
import com.example.rashion.service.ShopService;

import java.util.List;

@Service
public class ShopServiceImpl implements ShopService {

    @Autowired
    private ShopRepository shopRepository;

    @Override
    public String addShop(ShopRequest shopRequest) {
        Shop shopObj = new Shop();
        shopObj.setShopId(shopRequest.getShopId());
        shopObj.setShopName(shopRequest.getShopName());
        shopObj.setShopAddress(shopRequest.getShopAddress());
        shopObj.setProductId(shopRequest.getProductId());
        shopRepository.save(shopObj);
        return "your shop has been added successfully";
    }

    @Override
    public List<Shop> getShopList() {
        return shopRepository.findAll();
    }

    @Override
    public String deleteShop(Integer shopId) {
        shopRepository.deleteById(shopId);
        return "Shop  is deleted sucessfully";
    }
}
