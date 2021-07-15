package com.kodillagoodpatterns.Food2Door;

import java.util.ArrayList;
import java.util.List;

public interface Store {

    void process(Client client, List<OrderedProduct> orderList);
    void addProduct(Product product);
    Product findProduct(String productName);
    void removeProduct(Product product);
     ArrayList<Product> getProductList();
    String getStoreName();

}
