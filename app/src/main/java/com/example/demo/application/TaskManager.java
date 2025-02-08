package com.example.demo.application;

import com.example.demo.domain.Task;
import com.example.demo.domain.TaskStatus;

import java.util.*;
import java.util.stream.IntStream;

public class TaskManager {

    private final List<Task> tasks;

    public TaskManager() {
        this.tasks = new LinkedList<>();
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
        Task task = this.getTaskById(id);
        task.setStatus(status);
        return task;
    }

    public Task changeTaskPriority(String id, int priority) {
        int targetIndex = IntStream.range(0, this.tasks.size())
            .filter(i -> this.tasks.get(i).getId().equals(id))
            .findFirst()
            .orElse(-1);

        if (targetIndex == -1) {
            // TODO: throw exception..
            return null;
        }

        Task task = this.tasks.remove(targetIndex);
        this.tasks.add(priority, task);

        return task;
    }
}
