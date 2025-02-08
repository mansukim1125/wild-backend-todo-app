package com.example.demo.application;

import com.example.demo.domain.Task;
import com.example.demo.domain.TaskStatus;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

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

    public Task getTaskById(String id) {
        return this.tasks.stream()
            .filter(task -> task.getId().equals(id))
            .findFirst()
            .orElse(null);
    }

    public List<Task> getTasksByStatus(TaskStatus status) {
        return this.tasks.stream()
            .filter(task -> task.getStatus().equals(status))
            .toList();
    }

    public Task changeTaskStatus(String id, TaskStatus status) {

    }

    public Task changeTaskOrder(List<String> order) {

    }
}
