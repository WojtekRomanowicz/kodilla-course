package com.kodilla.patterns2.decorator.pizza;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PizzaOrderTestSuite {

    @Test
    public void testBasicPizzaOrderGetCost(){
        //Given
        PizzaOrder pizzaOrder = new Margherita();
        //When
        BigDecimal calculatedCost = pizzaOrder.getCost();
        //Then
        assertEquals(new BigDecimal(15), calculatedCost);
    }

    @Test
    public void testBasicPizzaOrderGetDescription(){
        //Given
        PizzaOrder pizzaOrder = new Margherita();
        //When
        String description = pizzaOrder.getDescription();
        //Then
        assertEquals("Pizza with: potato sauce, mozzarella, ", description);
    }

    @Test
    public void testPizzaOrderDecoratorsGetCost(){
        //Given
        PizzaOrder pizzaOrder = new Margherita();
        pizzaOrder = new CheeseDecorator(pizzaOrder);
        pizzaOrder = new HamDecorator(pizzaOrder);
        pizzaOrder = new MushroomsDecorator(pizzaOrder);
        //When
        BigDecimal calculatedCost = pizzaOrder.getCost();
        //Then
        assertEquals(new BigDecimal(24), calculatedCost);
    }

    @Test
    public void testPizzaOrderDecoratorsGetDescription(){
        //Given
        PizzaOrder pizzaOrder = new Margherita();
        pizzaOrder = new CheeseDecorator(pizzaOrder);
        pizzaOrder = new HamDecorator(pizzaOrder);
        pizzaOrder = new MushroomsDecorator(pizzaOrder);
        //When
        String description = pizzaOrder.getDescription();
        //Then
        assertEquals("Pizza with: potato sauce, mozzarella, extra portion of cheese, ham, mushrooms", description);
    }
}
