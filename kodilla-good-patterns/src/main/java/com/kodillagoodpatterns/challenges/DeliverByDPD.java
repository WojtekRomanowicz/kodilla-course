package com.kodillagoodpatterns.challenges;

import java.util.Map;

public class DeliverByDPD implements  OrderDelivery{
    boolean isSend;

    @Override
    public void sendOrder(Client client) {
        System.out.println("Your order is delivering by DPD.");
        isSend = true;
    }

    @Override
    public void prepareOrder(Map<Product, Integer> orderList) {
        System.out.println("Your order is preparing to send.");

    }

    @Override
    public boolean getIsSend() {
        return isSend;
    }
}
