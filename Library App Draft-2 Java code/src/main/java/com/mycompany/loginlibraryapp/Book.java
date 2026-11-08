/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.loginlibraryapp;

/**
 *
 * @author WINDOWS 10
 */
public class Book {
    private int bookId;
    private String title;
    private int year;
    private String author;
    private int numberOfCopies;

    public Book(int bookId, String title, int year, String author, int numberOfCopies) {
        this.bookId = bookId;
        this.title = title;
        this.year = year;
        this.author = author;
        this.numberOfCopies = numberOfCopies;
    }

    public int getBookId() {
        return bookId;
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    public String getAuthor() {
        return author;
    }

    public int getNumberOfCopies() {
        return numberOfCopies;
    }
}
