package com.kodilla.patterns.builder.bigmac;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BigmacTestSuite {

    @Test
    void testNewBigmac(){
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuildier()
                .bun("normal")
                .burgers(1)
                .sauce("barbecue")
                .ingredient("onion")
                .ingredient("lettuce")
                .ingredient("cheese")
                .build();

        System.out.println(bigmac);

        //When
        int howManyIngredients = bigmac.getIngredients().size();
        String whatBun = bigmac.getBun();

        //Then
        assertEquals(3, howManyIngredients);
        //Then
        assertEquals("normal", whatBun);
    }
}
