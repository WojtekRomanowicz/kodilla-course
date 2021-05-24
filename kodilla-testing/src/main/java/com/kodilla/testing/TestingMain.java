package com.kodilla.testing;
import com.kodilla.testing.user.SimpleUser;
import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args)
    {
        Calculator calculator = new Calculator();
        System.out.println("Calculator add test:");
        if(calculator.add(2,4) == 6){
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }
        System.out.println("Calculator subtract test:");
        if(calculator.subtract(4,2) == 2){
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }


    }
}
