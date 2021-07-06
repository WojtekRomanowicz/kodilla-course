package com.kodillagoodpatterns.challenges;

import java.util.Scanner;

public class GoodPatternsMain{



        public static void main(String[] args){
                ProductOrderService productOrderService;
                Client client;

                MovieStories.getMovies()
                        .entrySet()
                        .stream()
                        .flatMap(m -> m.getValue().stream())
                        .map(s -> s + "!")
                        .forEach(System.out::print);

//                System.out.println("Witaj w naszym sklepie!");
//                client = makeClient();
//                System.out.println(client.toString());
//                productOrderService = selectOptions(client);
//                productOrderService.makeOrderList();
//                productOrderService.showOrderList();
//                productOrderService.finalizeOrder();








        }

        public static Client makeClient(){
                Client client = new Client();
                Scanner scan = new Scanner(System.in);

                System.out.println("Na początek podaj nam swoje dane.");
                System.out.println("Imie:");
                client.setName(scan.nextLine());
                System.out.println("Nazwisko:");
                client.setSurname(scan.nextLine());
                System.out.println("Kraj:");
                client.setCountry(scan.nextLine());
                System.out.println("Miasto:");
                client.setTown(scan.nextLine());
                System.out.println("Adres:");
                client.setAddress(scan.nextLine());
                System.out.println("Numer elefonu:");
                client.setPhoneNumber(scan.nextLine());
                System.out.println("Adres email:");
                client.setEmail(scan.nextLine());

                return client;
        }
        public static ProductOrderService selectOptions(Client client){

                Scanner scan = new Scanner(System.in);
                System.out.println("Wybierz opcje dostawy:");
                System.out.println("Narazie tylko dpd");
                OrderDelivery orderDelivery = new DeliverByDPD();
                System.out.println("Wybierz opcje informowania o postepach zamowienbia:");
                System.out.println("Narazie tylko email");
                InformationService informationService = new InformClientByEmail();
                System.out.println("Wybierz opcje płatności:");
                System.out.println("Narazie tylko blik");
                PaymentMethod paymentMethod = new BlikPay();





                return new ProductOrderService(informationService, orderDelivery, paymentMethod, client);
        }


}
