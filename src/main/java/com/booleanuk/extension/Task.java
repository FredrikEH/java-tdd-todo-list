package com.booleanuk.extension;

import java.util.UUID;

public class Task {

    private String name;
    private String id;
    private Boolean completed;

    Task(String name){
        this.name = name;
        this.id = generateId();
        this.completed = false;
    }

    private String generateId(){
        final String uuid = UUID.randomUUID().toString().replace("-", "");
        return uuid;
    }

    public String getName(){return this.name;}
    public Boolean getCompleted(){return this.completed;}
    public void setCompleted(Boolean bool){this.completed = bool;}
    public String getId(){return this.id;}
    public void setId(String newId){this.id = newId;}

}
