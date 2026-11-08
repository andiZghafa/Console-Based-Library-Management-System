/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.loginlibraryapp;

/**
 *
 * @author WINDOWS 10
 */
public class LoginBoundary {
    private ValidatorController validator;

    public LoginBoundary(ValidatorController validator) {
        this.validator = validator;
    }

    public DashboardBoundary login(User user) {
        if (validator.validate(user.getUsername(), user.getPassword())) {
            System.out.println("Login successful.");
            return new DashboardBoundary();
        } else {
            System.out.println("Wrong username and password.");
            return null;
        }
    }
}
