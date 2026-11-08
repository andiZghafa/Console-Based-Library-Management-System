/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.libraryapp;

/**
 *
 * @author WINDOWS 10
 */
public class UserBook {
    private User user;
    private Book book;
    private Status status;

    public UserBook(User user, Book book, Status status) {
        this.user = user;
        this.book = book;
        this.status = status;
    }

    public User getUser() {
        return user;
    }

    public Book getBook() {
        return book;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
    
    
}
