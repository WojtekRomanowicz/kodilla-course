package com.example.kodillaspring;

import com.kodilla.spring.calculator.Calculator;
import com.kodilla.spring.forum.ForumUser;
import com.kodilla.spring.shape.Circle;
import com.kodilla.spring.shape.Shape;
import com.kodilla.spring.shape.Triangle;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class KodillaSpringApplicationTests {

//    @Test
//    void testCircleLoadedIntoContainer() {
//        //Given
//        ApplicationContext context =
//                new AnnotationConfigApplicationContext("com.kodilla.spring");
//        Shape shape = context.getBean(Circle.class);
//
//        //When
//        String name = shape.getShapeName();
//
//        //Then
//        assertEquals("This is a circle.", name);
//    }
//
//    @Test
//    void testTriangleLoadedIntoContainer() {
//        //Given
//        ApplicationContext context =
//                new AnnotationConfigApplicationContext("com.kodilla.spring");
//        Shape shape = context.getBean(Triangle.class);
//
//        //When
//        String name = shape.getShapeName();
//
//        //Then
//        assertEquals("This is a triangle.", name);
//    }

    @Test
    void testGetUsername(){
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        ForumUser user = context.getBean(ForumUser.class);

        //When
        String name = user.getUsername();

        //Then
        assertEquals("John Smith", name);
    }

    @Test
    void testCalculations(){
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);

        //When
        double add = calculator.add(6, 2);
        double sub = calculator.sub(6, 2);
        double mul = calculator.mul(6, 2);
        double div = calculator.div(6, 2);

        //Then
        assertEquals(8, add);
        assertEquals(4, sub);
        assertEquals(12, mul);
        assertEquals(3, div);

    }

}