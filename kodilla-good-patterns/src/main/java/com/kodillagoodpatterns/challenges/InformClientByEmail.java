package com.kodillagoodpatterns.challenges;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InformClientByEmail implements InformationService{

    String type = "Email";

    @Override
    public void sendInfoAboutOrderStatus(boolean isPayed) {
        if(isPayed){
            System.out.println("System send email with information about order status");
        }else {
            System.out.println("System send email that ordered things aren't payed yet!");
        }

    }

    @Override
    public void sendInfoAboutOrderDeliveryStatus(boolean isSend) {
        if(isSend){
            System.out.println("System send email with information about delivery status");
        }else {
            System.out.println("System send email that ordered things aren't send yet!");
        }

    }

    @Override
    public void sendInfoAboutOrder(Map<Product, Integer> orderList, double orderBill) {


    }

    @Override
    public String getType() {
        return null;
    }
}
