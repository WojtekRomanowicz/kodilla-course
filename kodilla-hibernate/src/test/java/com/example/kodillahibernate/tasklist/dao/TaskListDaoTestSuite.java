package com.example.kodillahibernate.tasklist.dao;

import com.example.kodillahibernate.task.dao.TaskDao;
import com.example.kodillahibernate.tasklist.TaskList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class TaskListDaoTestSuite {

    @Autowired
    private TaskListDao taskListDao;
    private static final String DESCRIPTION = "Test: Learn Hibernate";

    @Test
    void testTaskListDaoSave() {
        //Given
        TaskList taskList = new TaskList(DESCRIPTION, "Testing list");

        //When
        taskListDao.save(taskList);

        //Then
        int id = taskList.getId();
        Optional<TaskList> readTask = taskListDao.findById(id);
        assertTrue(readTask.isPresent());

        //CleanUp
        taskListDao.deleteById(id);
    }

    @Test
    void testTaskListDaoFindByDuration() {
        //Given
        TaskList taskList = new TaskList(DESCRIPTION, "TestingTaskList");
        taskListDao.save(taskList);
        String listName = taskList.getListName();

        //When
        List<TaskList> readTasksList = taskListDao.findByListName(listName);

        //Then
        assertEquals(listName, readTasksList.get(0).getListName());

        //CleanUp
        int id = readTasksList.get(0).getId();
        taskListDao.deleteById(id);
    }
}