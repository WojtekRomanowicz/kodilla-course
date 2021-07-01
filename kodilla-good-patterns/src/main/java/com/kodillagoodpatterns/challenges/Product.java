package com.kodillagoodpatterns.challenges;

public class Product {
    final private String productName;
    final private double price;
    private boolean isAvailable;
    private String description;

    public Product(String productName, double price, boolean isAvailable) {
        this.productName = productName;
        this.price = price;
        this.isAvailable = isAvailable;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public String getDescription() {
        return description;
    }
}
