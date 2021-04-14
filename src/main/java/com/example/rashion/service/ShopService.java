package com.example.rashion.service;

import com.example.rashion.model.Shop;
import com.example.rashion.request.ShopRequest;

import java.util.List;

public interface ShopService {

     String addShop(ShopRequest shop);

     List<Shop> getShopList();

     String deleteShop(Integer shopId);

}