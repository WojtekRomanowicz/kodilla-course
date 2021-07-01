package com.kodillagoodpatterns.challenges;

import java.util.Map;

public interface OrderDelivery {

    void sendOrder(Client client);
    void prepareOrder(Map<Product, Integer> orderList);
    boolean getIsSend();



}
