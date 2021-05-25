package com.kodilla.stream.array;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

public interface ArrayOperations {
    static double getAverage(int[] numbers){

        System.out.println("Array elements: ");
        IntStream.range(0, numbers.length)
                .map(n -> numbers[n])
                .forEach(System.out::println);

        double average = IntStream.range(0, numbers.length)
                .map(n -> numbers[n])
                .average().getAsDouble();

        return average;
    }
}
