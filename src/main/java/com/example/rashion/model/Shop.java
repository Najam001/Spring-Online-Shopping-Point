package com.example.rashion.model;


import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "shop", catalog = "rashion")
public class Shop implements Serializable {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "shopId", unique = true, nullable = false)
    private int shopId;


    @Column(name = "shopName", nullable = false, length = 45)
    private String shopName;

    @Column(name = "shopAddress", nullable = false, length = 45)
    private String shopAddress;

    @JoinColumn(name = "product_id")
    private Integer productId;

    public int getShopId() {
        return shopId;
    }

    public void setShopId(int shopId) {
        this.shopId = shopId;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }


    public String getShopAddress() {
        return shopAddress;
    }

    public void setShopAddress(String shopAddress) {
        this.shopAddress = shopAddress;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    @Override
    public String toString() {
        return "Shop{" +
                "shopId=" + shopId +
                ", shopName='" + shopName + '\'' +
                ", shopAddress='" + shopAddress + '\'' +
                '}';
    }
}