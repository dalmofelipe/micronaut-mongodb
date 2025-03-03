package com.dalmofelipe.mongodb.core.domain;

import java.time.LocalDateTime;

public class Comment {

    private String id;
    private String content;
    private String author;
    private LocalDateTime createdAt;

    {
        this.createdAt = LocalDateTime.now();
    }

    public Comment() {}

    public Comment(String content, String author) {
        this.content = content;
        this.author = author;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }
}