package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class World {

    List<Continent> continentList =  new ArrayList<>();

    public void addContinent(Continent continent){
        this.continentList.add(continent);
    }

    public BigDecimal getPeopleQuantity() {
        return (BigDecimal) continentList.stream()
                .flatMap(continent -> continent.getCountryList().stream())
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));
    }
}
