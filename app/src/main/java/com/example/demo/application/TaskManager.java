package com.example.demo.application;

import com.example.demo.domain.Task;
import com.example.demo.domain.TaskStatus;

import java.util.ArrayList;
import java.util.List;

public class TaskManager {

    private final List<Task> tasks;

    public TaskManager() {
        this.tasks = new ArrayList<>();
    }

    public Task createTask(String title) {

    }

    public Task createTask(String title, int priority) {

    }

    public Task getTaskById(String id) {

    }

    public List<Task> getTasksByStatus(TaskStatus status) {

    }

    public void changeTaskStatus(TaskStatus status) {

    }

    
}
