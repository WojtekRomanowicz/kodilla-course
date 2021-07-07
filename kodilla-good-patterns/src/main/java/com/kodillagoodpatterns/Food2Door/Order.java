package com.kodillagoodpatterns.Food2Door;

import java.util.ArrayList;;
import java.util.Scanner;

public class Order {
    private Client client;
    private int orderID;
    private double orderBill;
    private ArrayList<OrderedProduct> orderList;
    private ArrayList<Store> storeList;
    private Store store;

    public Order(Client client, int orderID,  ArrayList<Store> storeList) {
        this.client = client;
        this.orderID = orderID;
        this.storeList = storeList;
    }


    private void calculateBill(){
        for(OrderedProduct product : orderList) {
            orderBill += product.getPrice() * product.getQuantity();
        }
    }
    public boolean makeOrder(){
        boolean isEndOfOrder = false;
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj nazwe sklepu w ktorym chcesz zrobic zakupy: ");
        String storeName = scan.nextLine();

        store = findStore(storeName);
        if(store == null){
            System.out.println("Nie znaleziono sklepu!");

            return false;
        }

        orderList = new ArrayList<>();

        while(!isEndOfOrder) {

            System.out.println("Podaj nazwe produktu: ");
            String productName = scan.nextLine();
            Product product = store.findProduct(productName);

            if(product == null){
                System.out.println("Nie znaleziono produktu!");
                System.out.println("Sprobuj jeszcze raz");
            }else{
                OrderedProduct orderedProduct = new OrderedProduct(product);
                System.out.println(orderedProduct.getDescription());
                System.out.println("Podaj ilosc: ");
                String productQuantity = scan.nextLine();
                int quantity = Integer.parseInt(productQuantity);
                orderedProduct.setQuantity(quantity);
                orderList.add(orderedProduct);
            }

            System.out.println("Chcesz zamowic kolejny produkt? (Y/N): ");
            String nextProduct = scan.nextLine();
            if((nextProduct.equals("n")) || (nextProduct.equals("N"))){
                isEndOfOrder = true;
                System.out.println("Dziękujemy za zlozenie zamowienia! ");
                System.out.println("Twoje zamówienie składa się z wybranych produtów:");

                for(OrderedProduct endOrder : orderList){
                    System.out.println(endOrder.getProductName() + " w cenie" + endOrder.getPrice() + "   " + " w ilosci: " + endOrder.getQuantity());
                }
                calculateBill();
                System.out.println(" za zakupy zaplacisz "+ orderBill);
                store.process(client, orderList);

            }else {
                System.out.println(" ");
                System.out.println("Kolejny produkt ");
            }



        }
        return true;
    }

    private Store findStore(String storeName){
        for(Store store : storeList){
            if(store.getStoreName().equals(storeName)){
                System.out.println("Witaj w sklepie" + storeName);
                return store;
            }
        }
        System.out.println("Nie znaleziono sklepu!");

        return null;
    }
}
