package com.kodillagoodpatterns.Food2Door;

import java.util.ArrayList;


public class StoreManager {
    ArrayList<Store> storeList;

    public StoreManager() {
        this.storeList = new ArrayList<>();
    }

    public void addStoreToList(Store store){
        storeList.add(store);
    }

    public void RemoveStoreFromList(String storeName){
        storeList.removeIf(n -> n.getStoreName().equals(storeName));

    }

    public Store getStore(String storeName){
        for(Store store : storeList){
            if(store.getStoreName().equals(storeName)){
                return store;
            }
        }
        System.out.println(" ");
        System.out.println("Nie znaleziono sklepu! ");
        return null;
    }

    public ArrayList<Store> getStoreList(){
        return storeList;
    }


}
