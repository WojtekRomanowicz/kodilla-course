package com.kodilla.patterns.factory.tasks;

import com.kodilla.patterns.factory.Circle;
import com.kodilla.patterns.factory.Rectangle;
import com.kodilla.patterns.factory.Square;

public class TaskFactory {

    public static final String SHOPPING = "SHOPPING";
    public static final String DRIVING = "DRIVING";
    public static final String PAINTING = "PAINTING";

    public final Task makeTask(final String taskClass){
        switch (taskClass) {
            case SHOPPING:
                return new ShoppingTask("Shopping", "jacket", 1);
            case DRIVING:
                return new DrivingTask("Holliday", "Alabama", "car");
            case PAINTING:
                return new PaintingTask("Painting", "various", "picture");
            default:
                return null;
        }
    }
}
