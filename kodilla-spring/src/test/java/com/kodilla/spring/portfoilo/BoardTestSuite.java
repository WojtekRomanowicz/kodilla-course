package com.kodilla.spring.portfoilo;

import com.kodilla.spring.portfolio.Board;
import com.kodilla.spring.portfolio.BoardConfig;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class BoardTestSuite {

    @Test
    void testTaskAdd() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);

        //When
       List<String> doneList = board.getDoneList().getTasks();
       List<String> inProgressList = board.getInProgressList().getTasks();
       List<String> toDoList = board.getToDoList().getTasks();

       doneList.add("eat");
       inProgressList.add("learn");
       toDoList.add("sleep");

        //Then
        assertEquals("eat", doneList.get(0));
        assertEquals("learn", inProgressList.get(0));
        assertEquals("sleep", toDoList.get(0));

    }
}
