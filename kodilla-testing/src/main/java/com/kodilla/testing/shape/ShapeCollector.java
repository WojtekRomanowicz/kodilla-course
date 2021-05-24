package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {
    List<Shape> shapeList = new ArrayList<Shape>();
    public ShapeCollector() {
    }
    public void addFigure(Shape shape){
        shapeList.add(shape);

    }
    public void removeFigure(Shape shape){
        if(!shapeList.isEmpty()){
            shapeList.remove(shape);
        }

    }
    public Shape getFigure(int n){

        return shapeList.get(n);
    }
    public String showFigures(){

        return shapeList.get(0).getShapeName();
    }
    public int getSize(){
        return shapeList.size();
    }


}
