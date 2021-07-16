package com.kodilla.patterns.factory.tasks;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TaskFactoryTestSuite {

    @Test
    void testFactoryDrivingTask(){
        //Given
        TaskFactory taskFactory = new TaskFactory();

        //When
        Task drivingTask = taskFactory.makeTask(TaskFactory.DRIVING);
        System.out.println(drivingTask.getTaskName() + " task now is " + drivingTask.isTaskExecuted());
        drivingTask.executeTask();

        //Then
        assertEquals("Holliday", drivingTask.getTaskName());
        assertEquals(true, drivingTask.isTaskExecuted());
    }

    @Test
    void testFactoryShoppingTask(){
        //Given
        TaskFactory taskFactory = new TaskFactory();

        //When
        Task shoppingTask = taskFactory.makeTask(TaskFactory.SHOPPING);
        System.out.println(shoppingTask.getTaskName() + " task now is " + shoppingTask.isTaskExecuted());
        shoppingTask.executeTask();

        //Then
        assertEquals("Shopping", shoppingTask.getTaskName());
        assertEquals(true, shoppingTask.isTaskExecuted());
    }

    @Test
    void testFactoryPaintingTask(){
        //Given
        TaskFactory taskFactory = new TaskFactory();

        //When
        Task paintingTask = taskFactory.makeTask(TaskFactory.PAINTING);
        System.out.println(paintingTask.getTaskName() + " task now is " + paintingTask.isTaskExecuted());
        paintingTask.executeTask();

        //Then
        assertEquals("Painting", paintingTask.getTaskName());
        assertEquals(true, paintingTask.isTaskExecuted());
    }
}
