/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.loginlibraryapp;

/**
 *
 * @author WINDOWS 10
 */
public class PreviewBookController {
    public void displayBook(int bookId) {
        System.out.println("Displaying preview for book ID: " + bookId);
    }

    public ListBookController getListBookController() {
        return new ListBookController();
    }
}
