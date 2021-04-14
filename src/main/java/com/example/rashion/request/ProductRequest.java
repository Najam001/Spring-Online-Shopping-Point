package com.example.rashion.request;

public class ProductRequest {

    private int product_Id;
    private String productName;

    public int getProduct_Id() {
        return product_Id;
    }

    public void setProduct_Id(int product_Id) {
        this.product_Id = product_Id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    @Override
    public String toString() {
        return "ProductRequest{" +
                "productId=" + product_Id +
                ", productName='" + productName + '\'' +
                '}';
    }
}
