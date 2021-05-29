package com.kodilla.stream.world;

import org.junit.jupiter.api.Test;
import java.math.BigDecimal;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class WorldTestSuite {

    @Test
    void testGetPeopleQuantity(){
        //Given
        World world = new World();
        Continent europe = new Continent("Europe");
        europe.addCountry(new Country("Poland", "401235756"));
        europe.addCountry(new Country("Germany", "1234568496"));
        europe.addCountry(new Country("Spain", "845163186"));
        world.addContinent(europe);
        Continent asia = new Continent("Asia");
        asia.addCountry(new Country("China", "14000786242"));
        asia.addCountry(new Country("India", "16894562195"));
        asia.addCountry(new Country("Japan", "3654452156"));
        world.addContinent(asia);
        //When
        BigDecimal totalPeople = world.getPeopleQuantity();
        //Then
        BigDecimal expectedPeople = new BigDecimal("37030768031");
        assertEquals(expectedPeople, totalPeople);
    }
}
