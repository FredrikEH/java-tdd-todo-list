package com.booleanuk.core;

import java.util.ArrayList;

public class TodoList {

    ArrayList<Task> tasks = new ArrayList<>();

    public String add(Task task){
        tasks.add(task);
        String result = task.getName() + " added.";
        return result;
    }
}
