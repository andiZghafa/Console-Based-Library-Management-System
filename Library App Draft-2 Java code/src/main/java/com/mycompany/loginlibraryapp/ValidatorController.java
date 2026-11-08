/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.loginlibraryapp;

/**
 *
 * @author WINDOWS 10
 */
public class ValidatorController {
    private DatabaseController database;

    public ValidatorController(DatabaseController database) {
        this.database = database;
    }

    public boolean validate(String username, String password) {
        return database.checkCredentials(username, password);
    }
}
