package com.kodilla.testing.shape;

public class Circle implements Shape {

    String name;
    double radius;

    public Circle(String name, double radius) {
        this.name = name;
        this.radius = radius;
    }

    @Override
    public String getShapeName() {
        return name;
    }

    @Override
    public double getField() {

        return 3.14*(radius*radius);
    }
}
