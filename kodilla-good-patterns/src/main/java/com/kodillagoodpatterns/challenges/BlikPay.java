package com.kodillagoodpatterns.challenges;


import java.util.Map;
import java.util.Scanner;


public class BlikPay implements PaymentMethod {

    double orderBill;
    boolean isPayed = false;

    @Override
    public void calculateOrderBill(Map<Product, Integer> orderList) {


        for(Map.Entry<Product, Integer> entry : orderList.entrySet()){
            double price = entry.getKey().getPrice();
            int quantity = entry.getValue();

            orderBill += (price * quantity);

        }
        System.out.println("Your have to pay: " + orderBill);
    }


    @Override
    public void pay(Client client) {
        System.out.println("You choose Blik as your payment method!");
        System.out.println( client.toString());
        System.out.println("Are your personal data correct? (Y/N)");
        Scanner scan = new Scanner(System.in);
        String correctData = scan.nextLine();
        if(correctData.equals("y") || correctData.equals("Y")){
            System.out.println("Zaraz zostaniesz przekierowany do systemu platnosci");
            isPayed = true;
        }else{
            System.out.println("Popraw swoje dane i wroc do nas!");
            isPayed = false;
        }


    }

    @Override
    public boolean getIsPayed() {
        return isPayed;
    }

    @Override
    public double getOrderBill() {
        return orderBill;
    }
}
