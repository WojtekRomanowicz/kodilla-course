package com.kodilla.stream.world;

import java.math.BigDecimal;

public final class Country {
    String countryName;
    String peopleQuantity;

    public Country(String countryName, String peopleQuantity) {
        this.countryName = countryName;
        this.peopleQuantity = peopleQuantity;
    }

    public BigDecimal getPeopleQuantity() {

        return new BigDecimal(peopleQuantity);
    }
}
