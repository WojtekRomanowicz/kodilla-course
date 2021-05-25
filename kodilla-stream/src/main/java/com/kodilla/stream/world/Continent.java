package com.kodilla.stream.world;

import java.util.ArrayList;
import java.util.List;

public class Continent {

    String continentName;
    List<Country> countrylist =  new ArrayList<>();

    public Continent(String continentName) {
        this.continentName = continentName;
    }

    public void addCountry(Country country){
        this.countrylist.add(country);
    }

    public final List<Country> getCountrylist(){

        return new ArrayList<>(countrylist);
    }
}
