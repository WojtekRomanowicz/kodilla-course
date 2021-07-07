package com.kodillagoodpatterns.Food2Door;

public class Product {
    final private String productName;
    final private double price;
    private boolean isAvailable;
    private String description;

    public Product(String productName, double price, boolean isAvailable) {
        this.productName = productName;
        this.price = price;
        this.isAvailable = isAvailable;
        this.description = "no description yet";
    }

    public Product(Product product) {
        this.productName = product.getProductName();
        this.price = product.getPrice();
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
    public String getDescription() {
        return description;
    }

    public String toString(){
        return "Product basic info: " + '\''
                + "product name: " + productName + '\''
                + "product price: " + price + '\'';
    }
}
