package com.example.cookbook.model;

import java.sql.Timestamp;

public class Book {
    private String bookId;
    private String bookTitle;
    private String userId;
    private Timestamp createdAt;

    public Book(String bookId, String bookTitle, String author, Timestamp createdAt) {
        this.bookId = bookId;
        this.bookTitle = bookTitle;
        this.userId = author;
        this.createdAt = createdAt;
    }

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }


}
