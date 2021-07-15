package com.kodillagoodpatterns.Food2Door;

import java.util.Scanner;

public class StoreGenerator {
    private StoreClass store;

    public StoreClass generateNewStore(){
        Scanner scan = new Scanner(System.in);
        boolean endOfAddingProducts = false;

        System.out.println("Podaj nazwe sklepu, który chcesz utworzyc: ");
        String storeName = scan.nextLine();
        store = new StoreClass(storeName);

        while(!endOfAddingProducts) {
            addProductToStore();
            System.out.println("Chcesz dodać kolejny produkt? (Y/N): ");
            String nextProduct = scan.nextLine();
            if((nextProduct.equals("n")) || (nextProduct.equals("N"))) {
                endOfAddingProducts = true;
                System.out.println("Skonczyles dodawac produkty do sklepu");

            }else {
                System.out.println(" ");
                System.out.println("Kolejny produkt ");
            }
        }

        System.out.println("Zostal utworzony nowy sklep! ");
        System.out.println("o nazwie: " + store.getStoreName());
        System.out.println("Z następującym asortymentem: ");
        for(Product product : store.getProductList()){
            System.out.println(" ");
            System.out.println(product.toString());
        }

        return store;
    }

    private void addProductToStore(){
        Scanner scan = new Scanner(System.in);

        System.out.println("Podaj nazwe produktu: ");
        String productName = scan.nextLine();
        System.out.println("Podaj cene produktu: ");
        String priece = scan.nextLine();
        double productPriece = Double.parseDouble(priece);
        Product product = new Product(productName, productPriece, true);
        store.addProduct(product);

    }
}
