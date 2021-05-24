package com.kodilla.testing.shape;

public class Square implements Shape{
    String name;
    double sideWidth;

    public Square(String name, double sideWidth) {
        this.name = name;
        this.sideWidth = sideWidth;
    }

    @Override
    public String getShapeName() {
        return name;
    }

    @Override
    public double getField() {
        return sideWidth*sideWidth;
    }
}
