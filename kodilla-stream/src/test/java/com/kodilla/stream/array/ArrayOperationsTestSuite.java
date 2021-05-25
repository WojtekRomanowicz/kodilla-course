package com.kodilla.stream.array;

import org.junit.jupiter.api.Test;

import java.util.OptionalDouble;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayOperationsTestSuite {

    @Test
    void testGetAverage(){

        //Given
        int[] numbers = {12, 16, 18, 92, 3, 7, 51};

        //When
        double expected = 28.428;
        double  actual = ArrayOperations.getAverage(numbers);

        //Then
        assertEquals(expected, actual, 0.2);
    }
}
