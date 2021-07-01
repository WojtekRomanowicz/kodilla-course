package com.kodillagoodpatterns.challenges;


import java.util.Map;

public interface InformationService {

    void sendInfoAboutOrderStatus(boolean isPayed);
    void sendInfoAboutOrderDeliveryStatus(boolean isSend);
    void sendInfoAboutOrder(Map<Product, Integer> orderList, double orderBill);
    String getType();

}
