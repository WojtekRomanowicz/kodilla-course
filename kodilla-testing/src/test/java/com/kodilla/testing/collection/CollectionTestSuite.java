package com.kodilla.testing.collection;

import org.junit.jupiter.api.*;
import com.kodilla.testing.collection.OddNumbersExterminator;

import java.util.ArrayList;
import java.util.List;

@DisplayName("Collection Test Suite")
public class CollectionTestSuite {
    @BeforeEach
    public void before() {
        System.out.println("Test Case: begin");
    }

    @AfterEach
    public void after() {
        System.out.println("Test Case: end");
    }

    @BeforeAll
    public static void beforeAll() {
        System.out.println("Test Suite: begin");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("Test Suite: end");
    }

    @DisplayName("tested function should return empty list" )
    @Test
    void testOddNumbersExterminatorEmptyList(){

        //Given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        List<Integer> testList  = new ArrayList<>();

        //When
        List<Integer> emptyList = oddNumbersExterminator.exterminate(testList);
        System.out.println("Testing empty list" );

        //Then
        Assertions.assertEquals(testList, emptyList);
    }
    @DisplayName("tested function should return list with only even numbers" )
    @Test
    void testOddNumbersExterminatorNormalList(){

        //Given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        List<Integer> testList  = new ArrayList<>();
        List<Integer> evenList  = new ArrayList<>();
        for(int i = 0; i < 20; i++){
            testList.add(i);
            if(i%2 ==0){
                evenList.add(i);
            }
        }

        //When
        List<Integer> testedList = oddNumbersExterminator.exterminate(testList);
        System.out.println("Testing even list" );

        //Then
        Assertions.assertEquals(evenList,testedList);
    }


}
