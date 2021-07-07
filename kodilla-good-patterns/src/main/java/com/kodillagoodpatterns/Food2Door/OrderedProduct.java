package com.kodillagoodpatterns.Food2Door;

public class OrderedProduct extends Product{

   private int quantity;

    public OrderedProduct(String productName, double price, boolean isAvailable) {
        super(productName, price, isAvailable);
    }
    public OrderedProduct(Product product){
        super(product);
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
