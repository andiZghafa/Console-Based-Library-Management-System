/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.libraryapp;

/**
 *
 * @author WINDOWS 10
 */
public class Book {
    private int bookId;
    private String title;
    private String author;
    private String coverImageUrl;
    private String description;

    public Book(int bookId, String title, String author, String coverImageUrl, String description) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.coverImageUrl = coverImageUrl;
        this.description = description;
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

    public int getBookId() {
        return bookId;
    }

    public String getCoverImageUrl() {
        return coverImageUrl;
    }

    public String getDescription() {
        return description;
    }
    
}
