package com.booleanuk.core;

import java.util.ArrayList;

public class TodoList {

    ArrayList<Task> tasks = new ArrayList<>();

    public String add(Task task){
        tasks.add(task);
        String result = task.getName() + " added.";
        return result;
    }

    public String seeTasks(){
        String result = "";
        for(Task task : tasks){
            result += task.getName();

            if(task.getCompleted()){
                result += " completed";
            }
            else{
                result += " incomplete";
            }

            if(tasks.getLast() != task){
                result += ", ";
            }
        }
        return result;
    }

    public Boolean changeStatus(Task task){
        /*if(!tasks.contains(task)){
            throw new Exception("Task not found!");
        }*/
        if(tasks.contains(task)){
            if(task.getCompleted()){
                task.setCompleted(false);
            }
            else{
                task.setCompleted(true);
            }
        }
        return task.getCompleted();
    }



}
