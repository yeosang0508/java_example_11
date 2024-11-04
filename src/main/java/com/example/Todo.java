package com.example;

public class Todo {

    private int id;
    private String content;

    public int getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Todo(int id, String content) {
        this.id = id;
        this.content = content;
    }
}
