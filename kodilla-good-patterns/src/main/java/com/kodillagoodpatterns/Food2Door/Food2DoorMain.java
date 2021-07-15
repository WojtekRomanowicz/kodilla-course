package com.kodillagoodpatterns.Food2Door;
import java.util.Scanner;

public class Food2DoorMain {
    public static void main(String[] args){
        String adminPassword = "1234";
        Scanner scan = new Scanner(System.in);
        StoreManager storeManager = new StoreManager();
        StoreGenerator storeGenerator = new StoreGenerator();

        StoreClass ExtraFoodShop = new StoreClass("ExtraFoodShop");
        storeManager.addStoreToList(ExtraFoodShop);

        storeManager.getStore("ExtraFoodShop").addProduct(new Product("mleko", 4.29, true));
        storeManager.getStore("ExtraFoodShop").addProduct(new Product("jajka", 6.74, true));
        storeManager.getStore("ExtraFoodShop").addProduct(new Product("fajki", 16, true));
        storeManager.getStore("ExtraFoodShop").addProduct(new Product("woda", 2, true));


        System.out.println("Witaj w aplikacji Food2Door");
        System.out.println("Wybierz co chcesz zrobic");
        System.out.println("Zrobic zakupy wcisnij 1");
        System.out.println("Zarzadzac sklepami wcisnij 2");
        String decision = scan.nextLine();
        Integer dec = Integer.parseInt(decision);
        System.out.println(decision);
        switch (dec){
            case 1:
            System.out.println("");
            System.out.println("Wybrales zakupy, podaj swoje dane potrzebne do zrealizowania zamowienia:");
            Client client = makeClient();
            Order order = new Order(client, 1, storeManager.getStoreList());
            boolean orderResult = false;
            while(!orderResult){
                orderResult = order.makeOrder();
                if(orderResult == false) {
                    System.out.println("");
                    System.out.println("Coś poszlo nie tak!");
                    System.out.println("Czy chcesz sprobowac ponownie? (Y/N)");
                    decision = scan.nextLine();
                    if (decision.equals("n") || decision.equals("N")) {
                        orderResult = true;
                     }
                    }
                }
            break;

            case 2:
            System.out.println("");
            System.out.println("Wybrales zarzadzanie sklepami");
            System.out.println("Aby uzyskac dostęp podaj haslo:");
            String password = scan.nextLine();
            if(adminPassword.equals(password)) {
                System.out.println("Wybierz co chcesz zrobic:");
                System.out.println("Dodać sklep wcisnij 1");
                System.out.println("Usunąc sklep wcisnij 2");
                System.out.println("Edytowac zawartosc wybranego sklepu wcisnij 3");
                decision = scan.nextLine();
                int a = Integer.parseInt(decision);
                switch (a) {
                    case 1:

                        storeManager.addStoreToList(storeGenerator.generateNewStore());
                        break;
                    case 2:
                        System.out.println("");
                        System.out.println("Podaj nazwe sklepu:");
                        storeManager.RemoveStoreFromList(scan.nextLine());
                        break;

                    case 3:
                        System.out.println("");
                        System.out.println("Podaj nazwe sklepu:");
                        String storeName = scan.nextLine();
                        for (Store store : storeManager.getStoreList()) {
                            if (store.getStoreName().equals(storeName)) {
                                System.out.println("Mozesz edytowac sklep");
                            }
                        }
                        break;

                    default : {
                        System.out.println("Wybrałes zla opcje!");
                    }
                }
            }
            break;
            default: {
                System.out.println("Wybrałes zla opcje!");
            }
        }
        }

    public static Client makeClient(){
        Client newClient =  new Client();
        Scanner scan = new Scanner(System.in);

        System.out.println("Na początek podaj nam swoje dane.");
        System.out.println("Imie:");
        newClient.setName(scan.nextLine());
        System.out.println("Nazwisko:");
        newClient.setSurname(scan.nextLine());
        System.out.println("Kraj:");
        newClient.setCountry(scan.nextLine());
        System.out.println("Miasto:");
        newClient.setTown(scan.nextLine());
        System.out.println("Adres:");
        newClient.setAddress(scan.nextLine());
        System.out.println("Numer elefonu:");
        newClient.setPhoneNumber(scan.nextLine());
        System.out.println("Adres email:");
        newClient.setEmail(scan.nextLine());

        return newClient;
    }

    }



