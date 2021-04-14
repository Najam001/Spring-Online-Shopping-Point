package com.example.rashion.model;

import javax.persistence.*;

@Entity
@Table(name = "product", catalog = "rashion")
public class Product extends Object{

    private int product_Id;
    private String product_Name;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_Id", unique = true, nullable = false)
    public int getProduct_Id() {
        return product_Id;
    }

    public void setProduct_Id(int product_Id) {
        this.product_Id = product_Id;
    }

    @Column(name = "product_Name", nullable = false, length = 45)
    public String getProductName() {
        return product_Name;
    }


    public void setProductName(String productName) {
        this.product_Name = productName;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + product_Id +
                ", productName='" + product_Name + '\'' +
                '}';
    }

}
