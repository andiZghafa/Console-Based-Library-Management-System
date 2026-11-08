/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.libraryapp;

import java.util.ArrayList;

/**
 *
 * @author WINDOWS 10
 */
public class LibraryApp {

    public static void main(String[] args) {     
        // Create two users
        User john = new User(1, "john_doe", "john@example.com", "password123");
        User jane = new User(2, "jane_smith", "jane@example.com", "mypassword");

        // Create two books
        Book book1 = new Book(1, "The Martian", "Andy Weir", "http://example.com/martian.jpg", "A novel about surviving on Mars");
        Book book2 = new Book(2, "1984", "George Orwell", "http://example.com/1984.jpg", "A dystopian novel about totalitarianism");

        // Create two statuses
        Status reading = new Status(1, "Reading");
        Status read = new Status(2, "Read");

        // Create an ArrayList to store UserBook objects
        ArrayList<UserBook> userBooks = new ArrayList<>();

        // Add UserBook relationships to the array (John and Jane's books)
        userBooks.add(new UserBook(john, book1, reading)); // John is "Reading" The Martian
        userBooks.add(new UserBook(jane, book2, read));    // Jane has "Read" 1984
        
        System.out.println("<================ Library App ==================>");
        System.out.println("<=========== By Bismillah Nilai A ==============>");
        
        System.out.println("<===============================================>");
        
        // Print out each user's book and status from the array
        int i = 1;
        for (UserBook userBook : userBooks) {
            System.out.println(i + ". " +  userBook.getUser().getUsername() + " has " + userBook.getStatus().getStatusName() + " \"" +
                               userBook.getBook().getTitle() + "\" by " + userBook.getBook().getAuthor());
            System.out.println("<===============================================>");
            i = i + 1;
        }
    }
}
