package com.kodilla.testing.shape;

public class Triangle implements Shape{

    String name;
    double height;
    double baseWidth;

    public Triangle(String name, double height, double baseWidth) {
        this.name = name;
        this.height = height;
        this.baseWidth = baseWidth;
    }

    @Override
    public String getShapeName() {
        return name;
    }

    @Override
    public double getField() {
        return (height*baseWidth)/2;
    }
}
