/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.loginlibraryapp;

/**
 *
 * @author WINDOWS 10
 */
public class ListBookController {
    public void getBookList() {
        // Mock data for books
        Book[] books = {
            new Book(1, "Python Basics", 2021, "Author A", 5),
            new Book(2, "Advanced Java", 2020, "Author B", 3)
        };
        for (Book book : books) {
            System.out.println("Book ID: " + book.getBookId() + ", Title: " + book.getTitle() +
                    ", Author: " + book.getAuthor() + ", Copies: " + book.getNumberOfCopies());
        }
    }
}
