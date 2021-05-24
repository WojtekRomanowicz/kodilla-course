package com.kodilla.testing.collection;

import java.util.ArrayList;
import java.util.List;

public class OddNumbersExterminator {
    public OddNumbersExterminator() {
    }
    public List<Integer> exterminate(List<Integer> numbers){
        List<Integer> evenNumbers = new ArrayList<>();

        for(Integer a : numbers){
            if(a%2 == 0){
                evenNumbers.add(a);
            }
        }
        return evenNumbers;
    }
}
