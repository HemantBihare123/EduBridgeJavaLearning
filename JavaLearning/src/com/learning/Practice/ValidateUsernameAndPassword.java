package com.learning.Practice;

import java.io.FileWriter;
import java.io.IOException;
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

        do {
            System.out.print("Enter your password: ");
            password = scanner.nextLine();
        } while (!User.isValidPassword(password, username));

        try {
            FileWriter writer = new FileWriter("D://users.txt", true);
            writer.write(username + "," + password + "\n");
            writer.close();
            System.out.println("User registered successfully.");
            Login.main(args);
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }

        scanner.close();
    }
}

class User {

    public static boolean isValidUsername(String username) {
        if (username.matches("[a-zA-Z]+")) {
            System.out.println("Username is valid.");
            return true;
        } else {
            System.out.println("Username is invalid. Please try again.");
            return false;
        }
    }

    public static boolean isValidPassword(String password, String username) {
        if (password.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$")) {
            System.out.println("Password is valid.");
            return true;
        } else {
            System.out.println("Password is invalid. Please try again.");
            return false;
        }
    }
}
