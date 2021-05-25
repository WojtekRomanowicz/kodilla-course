package com.kodilla.stream.world;

import com.kodilla.stream.forum.ForumUser;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class World {

    List<Continent> continentlist =  new ArrayList<>();

    public void addConinent(Continent continent){
        this.continentlist.add(continent);

    }

    public BigDecimal getPeopleQuantity()
    {
        return (BigDecimal) continentlist.stream()
                .flatMap(continent -> continent.getCountrylist().stream())
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));

    }
}
