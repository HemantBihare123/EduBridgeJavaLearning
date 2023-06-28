package com.learning.Practice;

import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Login8 login = new Login8();
        System.out.println("Welcome " + login.username);
        boolean continueTransaction = true;

        do {
            System.out.println("Please select an option:\n"
                    + "1. Check Balance\n"
                    + "2. Deposit\n"
                    + "3. Withdraw");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    ATMMachine.checkBalance();
                    break;
                case 2:
                    ATMMachine.deposit();
                    break;
                case 3:
                    ATMMachine.withdraw();
                    break;
                default:
                    System.out.println("Invalid input");
                    continueTransaction = false;
                    break;
            }

            if (continueTransaction) {
                System.out.println("Do you want to continue? 'Yes' or 'No'");
                String input = sc.next();
                if (input.equalsIgnoreCase("No")) {
                    continueTransaction = false;
                }
            }
        } while (continueTransaction);

        System.out.println("Thank you for using our ATM. Goodbye!");
    }
}

class ATMMachine {
    static int rupee = 500000;

    public static void checkBalance() {
        System.out.println("Your balance is " + rupee);
    }

    public static void deposit() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter deposit amount: ");
        int amount = sc.nextInt();
        rupee += amount;
        System.out.println("Deposit successful.");
        System.out.println("Your new balance is " + rupee);
    }

    public static void withdraw() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter withdrawal amount: ");
        int amount = sc.nextInt();
        if (amount > rupee) {
            System.out.println("Insufficient funds.");
            System.out.println("Your balance is " + rupee);
        } else {
            rupee -= amount;
            System.out.println("Withdrawal successful.");
            System.out.println("Your new balance is " + rupee);
        }
    }
}

class Login8 {
    String username = "John";
}

