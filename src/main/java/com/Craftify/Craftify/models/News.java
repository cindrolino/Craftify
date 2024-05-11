package com.Craftify.Craftify.models;
import jakarta.persistance.*;

public class News {
    private String title;
    private String description;
    private String author;
    private String url;
    private String date;
    public News(String title, String description, String author, String url, String date) {
        this.title = title;
        this.description = description;
        this.author = author;
        this.url = url;
        this.date = date;
    }

}
