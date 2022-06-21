package com.dmm;

public class Product {
    private int proId;
    private String proName;
    private Category category;

    public Product(int proId, String proName, Category category) {
        this.proId = proId;
        this.proName = proName;
        this.category = category;
    }

    @Override
    public String toString() {
        return "Product{" +
                "proId=" + proId +
                ", proName='" + proName + '\'' +
                ", category=" + category +
                '}';
    }
}
