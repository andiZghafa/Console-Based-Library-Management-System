/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.loginlibraryapp;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author WINDOWS 10
 */
public class DatabaseController {
    private Map<String, String> users = new HashMap<>();

    public DatabaseController() {
        // Adding some users to the database
        users.put("student", "password123");
        users.put("lecturer", "lecturerpass");
    }

    public boolean checkCredentials(String username, String password) {
        return users.containsKey(username) && users.get(username).equals(password);
    }
}
