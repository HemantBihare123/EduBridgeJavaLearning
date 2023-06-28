package com.learning.DecisionControl;

import java.util.Scanner;

public class ValidateUsernameAndPassword {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String username;
        String password;

        do {
            System.out.print("Enter your username: ");
            username = scanner.nextLine();
        } while (!User.isValidUsername(username));

        System.out.println("Username is valid.");

        System.out.print("Enter your password: ");
        password = scanner.nextLine();

        while (!User.isValidPassword(password)) {
            System.out.println("Password is invalid. Please try again.");
            System.out.print("Enter your password: ");
            password = scanner.nextLine();
        }

        System.out.println("Password is valid.");

        // Code to register the user with the validated username and password goes here

        scanner.close();
    }
}

class User {

    public static boolean isValidUsername(String username) {
        if (username.matches("[a-zA-Z]+")) {
            return true;
        } else {
            System.out.println("Username is invalid. Please try again.");
            return false;
        }
    }

    public static boolean isValidPassword(String password) {
        if (password.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$")) {
            return true;
        } else {
            return false;
        }
    }
}
