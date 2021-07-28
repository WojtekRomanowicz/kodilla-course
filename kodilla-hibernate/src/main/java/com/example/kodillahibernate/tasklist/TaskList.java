package com.example.kodillahibernate.tasklist;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
@Table(name = "TASKSLIST")
public class TaskList {
    private int id;
    private String description;
    String listName;

    public TaskList(String description, String listName) {
        this.description = description;
        this.listName = listName;
    }

    public TaskList() {}

    @Id
    @GeneratedValue
    @NotNull
    @Column(name="ID", unique=true)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name = "DESCRIPTION")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Column(name = "LISTNAME")
    public String getListName() {
        return listName;
    }

    public void setListName(String listName) {
        this.listName = listName;
    }
}
