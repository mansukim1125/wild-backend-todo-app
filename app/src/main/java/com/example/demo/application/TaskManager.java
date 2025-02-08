package com.example.demo.application;

import com.example.demo.domain.Task;
import com.example.demo.domain.TaskStatus;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

public class TaskManager {

    private final List<Task> tasks;

    public TaskManager() {
        this.tasks = new ArrayList<>();
    }

    public Task createTask(String title) {
        String uuid = String.valueOf(UUID.randomUUID());
        Date createdAt = new Date();

        Task newTask = new Task(uuid, title, TaskStatus.INCOMPLETE, createdAt);
        tasks.add(newTask);

        return newTask;
    }

    public Task createTask(String title, int priority) {

    }

    public Task getTaskById(String id) {

    }

    public List<Task> getTasksByStatus(TaskStatus status) {

    }

    public Task changeTaskStatus(String id, TaskStatus status) {

    }

    public Task changeTaskOrder(List<String> order) {

    }
}
