package com.example.postAPI.controller.dto;

import java.util.Date;

public class PostDto {
    private String title;
    private String author;
    private Date date;
    private String text;
    private String imageUrl;

    public PostDto(String title, String author, Date date, String text, String imageUrl) {

        this.title = title;
        this.author = author;
        this.date = date;
        this.text = text;
        this.imageUrl = imageUrl;
    }



    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }


}
