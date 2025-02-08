package com.example.demo.domain;

import java.util.Date;

public class Task {
    private String id;
    private String title;
    private TaskStatus status;
    private Date createdAt;

    public Task(String id, String title, TaskStatus status, Date createdAt) {
        this.id = id;
        this.title = title;
        this.status = status;
        this.createdAt = createdAt;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public TaskStatus getStatus() {
        return status;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setStatus(TaskStatus status) {
        this.status = status;
    }
}
