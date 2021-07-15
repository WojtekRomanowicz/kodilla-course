package com.kodillagoodpatterns.Food2Door;


import java.util.ArrayList;
import java.util.List;

public class StoreClass implements Store {
    private String storeName;
    private ArrayList<Product> productList;

    public StoreClass(String storeName) {
        this.storeName = storeName;
        productList = new ArrayList<>();
    }

    public String getStoreName() {
        return storeName;
    }

    public ArrayList<Product> getProductList() {
        return productList;
    }

    public void process(Client client, List<OrderedProduct> orderList){
        System.out.println("Tutaj wykonuje się proces odpowiedni dla danego sklepu ");

    }

   public void addProduct(Product product){
        productList.add(product);
       System.out.println(product.toString());
       System.out.println("Zostal dodany do asortymentu sklepu");
    }

    public Product findProduct(String productName){
        for(Product findingProduct : productList){
            if(findingProduct.getProductName().equals(productName)){
                return findingProduct;
            }
        }
        return null;
    }

    public void removeProduct(Product product){

        if(productList.contains(product)){
            productList.remove(product);
            System.out.println( product.toString());
            System.out.println("Zostal usuniety");
        }else{
            System.out.println("Sklep nie posiada danego produktu w swojej ofercie");
        }
    }



}
