package com.example.kodillahibernate.tasklist.dao;

//import com.example.kodillahibernate.task.Task;
//import com.example.kodillahibernate.task.TaskFinancialDetails;
//import com.example.kodillahibernate.task.dao.TaskDao;
//import com.example.kodillahibernate.tasklist.TaskList;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.junit.jupiter.api.Test;
//
//import java.math.BigDecimal;
//import java.util.List;
//import java.util.Optional;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//@SpringBootTest
//class TaskListDaoTestSuite {
//
//    @Autowired
//    private TaskListDao taskListDao;
//    private static final String DESCRIPTION = "Test: Learn Hibernate";
//
//    @Test
//    void testTaskListDaoSave() {
//        //Given
//        TaskList taskList = new TaskList(DESCRIPTION, "Testing list");
//
//        //When
//        taskListDao.save(taskList);
//
//        //Then
//        int id = taskList.getId();
//        Optional<TaskList> readTask = taskListDao.findById(id);
//        assertTrue(readTask.isPresent());
//
//        //CleanUp
//        taskListDao.deleteById(id);
//    }
//
//    @Test
//    void testTaskListDaoFindByDuration() {
//        //Given
//        TaskList taskList = new TaskList(DESCRIPTION, "TestingTaskList");
//        taskListDao.save(taskList);
//        String listName = taskList.getListName();
//
//        //When
//        List<TaskList> readTasksList = taskListDao.findByListName(listName);
//
//        //Then
//        assertEquals(listName, readTasksList.get(0).getListName());
//
//        //CleanUp
//        int id = readTasksList.get(0).getId();
//        taskListDao.deleteById(id);
//    }
//
//    @Test
//    void testTaskListDaoSaveWithTasks() {
//        //Given
//        Task task = new Task("Test: Learn Hibernate", 14);
//        Task task2 = new Task("Test: Write some entities", 3);
//        TaskFinancialDetails tfd = new TaskFinancialDetails(new BigDecimal(20), false);
//        TaskFinancialDetails tfd2 = new TaskFinancialDetails(new BigDecimal(10), false);
//        task.setTaskFinancialDetails(tfd);
//        task2.setTaskFinancialDetails(tfd2);
//        TaskList taskList = new TaskList("LISTNAME", "ToDo tasks");
//        taskList.getTasks().add(task);
//        taskList.getTasks().add(task2);
//        task.setTaskList(taskList);
//        task2.setTaskList(taskList);
//
//        //When
//        taskListDao.save(taskList);
//        int id = taskList.getId();
//
//        //Then
//        assertNotEquals(0, id);
//
//        //CleanUp
//        taskListDao.deleteById(id);
//    }
//}