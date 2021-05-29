package com.kodilla.stream.world;

import java.util.ArrayList;
import java.util.List;

public class Continent {

    String continentName;
    List<Country> countryList =  new ArrayList<>();

    public Continent(String continentName) {
        this.continentName = continentName;
    }

    public void addCountry(Country country){
        this.countryList.add(country);
    }

    public final List<Country> getCountryList(){
        return new ArrayList<>(countryList);
    }
}
