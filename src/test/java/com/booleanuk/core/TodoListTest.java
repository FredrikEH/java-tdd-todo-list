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
        //Assertions.assertTrue(todoList.tasks.contains("taskOne"));
    }
}
