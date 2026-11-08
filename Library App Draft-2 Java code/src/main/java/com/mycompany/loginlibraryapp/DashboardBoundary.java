/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.loginlibraryapp;

/**
 *
 * @author WINDOWS 10
 */
public class DashboardBoundary {
    public void display() {
        System.out.println("Displaying dashboard...");
    }

    public PreviewBookController getPreviewBookController() {
        return new PreviewBookController();
    }
}
