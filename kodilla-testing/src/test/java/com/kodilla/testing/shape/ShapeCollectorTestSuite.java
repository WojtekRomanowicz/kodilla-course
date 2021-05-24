package com.kodilla.testing.shape;
import org.junit.jupiter.api.*;
import com.kodilla.testing.shape.*;

@DisplayName("Shape Collector  Test Suite")
public class ShapeCollectorTestSuite {
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

    @Nested
    @DisplayName("Tests for Shapes")
    class TestedShapes{

        @Test
        void testGetName(){
            //Given
            Shape circle = new Circle("circle",2);

            //When
            String results = circle.getShapeName();
            //Then
            Assertions.assertEquals("circle",results );
        }
        @Test
        void testGetField(){
            //Given
            Shape triangle = new Triangle("triangle", 2, 4);
            //When
            double results = triangle.getField();
            //Then
            Assertions.assertEquals(4,results );
        }

    }

    @Nested
    @DisplayName("Tests for Shapes Collector")
    class TestedShapesCollector{
        @Test
        void testAddFigure(){
            //Given
            ShapeCollector collector = new ShapeCollector();
            //When
            Shape circle = new Circle("circle", 3);
            collector.addFigure(circle);
            //Then
            Assertions.assertEquals(circle,collector.getFigure(0) );
        }
        @Test
        void testRemoveFigure(){
            //Given
            ShapeCollector collector = new ShapeCollector();
            Shape circle = new Circle("circle", 3);
            collector.addFigure(circle);
            //When
            collector.removeFigure(circle);

            //Then
            Assertions.assertEquals(0,collector.getSize() );
        }
        @Test
        void testGetFigure(){
            //Given
            ShapeCollector collector = new ShapeCollector();
            Shape circle = new Circle("circle", 3);
            collector.addFigure(circle);
            //When
            Shape figure = collector.getFigure(0);
            //Then
            Assertions.assertEquals(circle,figure );
        }
        @Test
        void testShowFigures() {
            //Given
            ShapeCollector collector = new ShapeCollector();
            Shape circle = new Circle("circle", 3);
            collector.addFigure(circle);
            //When
           String showFigures = collector.showFigures();

            //Then
            Assertions.assertEquals(showFigures,"circle");
        }
        }

    }

