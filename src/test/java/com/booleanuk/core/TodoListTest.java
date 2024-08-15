package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TodoListTest {
    @Test
    public void exampleTest() {
        String hello = "Hello";
        Assertions.assertEquals("Hello", hello);
        Assertions.assertNotEquals("Goodbye", hello);
    }

    TodoList todoList = new TodoList();

    @Test
    public void testAdd(){
        Task taskOne = new Task("taskOne");
        Assertions.assertEquals("taskOne added.", todoList.add(taskOne));
        Assertions.assertTrue(todoList.tasks.contains(taskOne));
    }

    @Test
    public void testSeeTasks(){
        Task taskOne = new Task("taskOne");
        Task taskTwo = new Task("taskTwo");
        todoList.add(taskOne);
        todoList.add(taskTwo);
        Assertions.assertEquals("taskOne incomplete, taskTwo incomplete", todoList.seeTasks());
    }

    @Test
    public void testChangeStatus(){
        Task taskOne = new Task("taskOne");
        todoList.add(taskOne);
        Assertions.assertTrue(todoList.changeStatus(taskOne, true));
        Assertions.assertFalse(todoList.changeStatus(taskOne, false));
        Assertions.assertFalse(todoList.changeStatus(taskOne, false));
    }
}
