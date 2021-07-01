package com.kodillagoodpatterns.challenges;

import java.util.Map;

public interface PaymentMethod {


     void calculateOrderBill(Map<Product, Integer> orderList);
     void pay(Client client);
     boolean getIsPayed();
     double getOrderBill();


}
