/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.loginlibraryapp;
import java.util.Scanner;

/**
 *
 * @author WINDOWS 10
 */
public class LoginLibraryApp {

    public static void main(String[] args) {
        DatabaseController database = new DatabaseController();
        ValidatorController validator = new ValidatorController(database);
        LoginBoundary loginBoundary = new LoginBoundary(validator);

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter username: ");
        String username = scanner.nextLine();

        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        User user = new User(username, password);

        DashboardBoundary dashboard = loginBoundary.login(user);
        if (dashboard != null) {
            dashboard.display();
            PreviewBookController previewController = dashboard.getPreviewBookController();
            previewController.displayBook(1);
            ListBookController listController = previewController.getListBookController();
            listController.getBookList();
        }

        scanner.close();
    }
}
