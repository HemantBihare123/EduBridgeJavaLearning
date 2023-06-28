package com.learning.Encapsulation;

import java.util.Scanner;

public class User {
    private String username;
    private String password;
    
    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }
    
    public String getUsername() {
        return username;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }
    
    public String getPassword() {
        return password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
   
   

        public void setnewPassword(String newPassword) {
            this.password = newPassword;
        }

        // other methods and variables here
    

    
    public boolean authenticate(String username, String password) {
        return this.username.equals(username) && this.password.equals(password);
    }
    
    public static void main(String[] args) {
    	
    	    Scanner sc = new Scanner(System.in);
    	    System.out.print("Enter username: ");
    	    String username = sc.nextLine();
    	    if (username.isEmpty()) {
    	        System.out.println("Username cannot be empty. Please enter a value:");
    	        username = sc.nextLine();
    	    }
    	    System.out.print("Enter password: ");
    	    String password = sc.nextLine();
    	    if (password.isEmpty()) {
    	        System.out.println("Password cannot be empty. Please enter a value:");
    	        password = sc.nextLine();
    	    }
    	    
    	    User user = new User(username, password);
    	    user.setPassword("newPassword");
    	    
    	    System.out.println("Username: " + user.getUsername());
    	    System.out.println("Password: " + user.getPassword());
    	
   
    }
}

