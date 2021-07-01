package com.kodillagoodpatterns.challenges;

import java.util.*;

public class ProductOrderService {

    private final InformationService informationService;
    private final OrderDelivery orderDelivery;
    private final PaymentMethod paymentMethod;
    private Map<Product, Integer> orderList;
    private final Client client;
    private List<Product> productList;

    public ProductOrderService(InformationService informationService, OrderDelivery orderDelivery,
                               PaymentMethod paymentMethod, Client client) {
        this.informationService = informationService;
        this.orderDelivery = orderDelivery;
        this.paymentMethod = paymentMethod;
        this.client = client;
    }

    public void showOrderList(){

        System.out.println("Oto twoje zamowienie:");
        System.out.println("Produkt     Cena    Ilosc");
        int i = 1;

        for(Map.Entry<Product, Integer> entry : orderList.entrySet()){

            System.out.println(i + ". " + entry.getKey().getProductName() + "    "
            + entry.getKey().getPrice() + "     " + entry.getValue());

        }
    }

    public void  makeOrderList(){
        orderList = new HashMap<Product, Integer>();
        boolean isEndOfOrder = false;
        Scanner scan = new Scanner(System.in);

        while(!isEndOfOrder){
            System.out.println("Podaj nazwe produktu: ");
            String productName = scan.nextLine();
            System.out.println("Podaj ilość: ");
            String productQuantity = scan.nextLine();
            int i = Integer.parseInt(productQuantity);
            orderList.put(new Product(productName, 5, true ), i);
            System.out.println("Chcesz zamówić kolejny produkt? (Y/N): ");
            String nextProduct = scan.nextLine();
            if((nextProduct.equals("n")) || (nextProduct.equals("N"))){
                isEndOfOrder = true;
                System.out.println("Dziękujemy za zlozenie zamowienia! ");
                System.out.println("Na podany  " + informationService.getType() + "wyslaliśmy " +
                        "potwierdzenie zamówienia");
                paymentMethod.calculateOrderBill(orderList);
                informationService.sendInfoAboutOrder(orderList, paymentMethod.getOrderBill() );

            }else {
                System.out.println(" ");
                System.out.println("Kolejny produkt ");
            }

        }
        orderDelivery.prepareOrder(orderList);



    }

    public void finalizeOrder(){

        paymentMethod.pay(client);

        if(paymentMethod.getIsPayed()){

            orderDelivery.sendOrder(client);

        }
        informationService.sendInfoAboutOrderStatus(paymentMethod.getIsPayed());
        informationService.sendInfoAboutOrderDeliveryStatus(orderDelivery.getIsSend());

    }
}
