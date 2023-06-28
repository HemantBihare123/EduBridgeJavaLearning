package com.learning.Practice;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String username;
        String password;
        System.out.println("Welcome to the Login Page...");
        do {
            System.out.print("Enter your username: ");
            username = scanner.nextLine();
        } while (!User1.isValidUsername(username));

        do {
            System.out.print("Enter your password: ");
            password = scanner.nextLine();
        } while (!User1.isValidPassword(password));

        if (User1.isRegisteredUser(username, password)) {
            System.out.println("Login successful.");
        } else {
            System.out.println("Invalid username or password.");
        }

        scanner.close();
    }
}

class User1 {

    public static boolean isValidUsername(String username) {
        if (username.matches("[a-zA-Z0-9_]+")) {
            System.out.println("Username is valid.");
            return true;
        } else {
            System.out.println("Username is invalid. Please try again.");
            return false;
        }
    }

    public static boolean isValidPassword(String password) {
        if (password.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$")) {
            System.out.println("Password is valid.");
            return true;
        } else {
            System.out.println("Password is invalid. Please try again.");
            return false;
        }
    }

    public static boolean isRegisteredUser(String username, String password) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("D://users.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                String[] user = line.split(",");
                if (user[0].equals(username) && user[1].equals(password)) {
                    reader.close();
                    return true;
                }
            }
            reader.close();
            return false;
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
            return false;
        }
    }
}

