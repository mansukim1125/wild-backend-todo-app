package com.example.demo.domain;

import java.util.Date;

public class Task {
    private String id;
    private String title;
    private int priority;
    private TaskStatus status;
    private Date createdAt;

    public Task(String id, String title, int priority, TaskStatus status, Date createdAt) {
        this.id = id;
        this.title = title;
        this.priority = priority;
        this.status = status;
        this.createdAt = createdAt;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public int getPriority() {
        return priority;
    }

    public TaskStatus getStatus() {
        return status;
    }

    public Date getCreatedAt() {
        return createdAt;
    }
}
