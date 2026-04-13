//Bandile Mthabela ST10480829
package com.mycompany.chat_app_prog5121_a1;
import java.util.Scanner;

public class Chat_App_PROG5121_A1 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("WELCOME TO THE CHAT APP.");
        System.out.println("Please enter username:");
        String username = input.nextLine();
        
        System.out.println("Please enter password.");
        String password = input.nextLine();
        
        if (username.equals(input))
        { 
        System.out.println("Username successfully captured.");
        }else{
        System.out.println("User is not correctly formatted; please ensure that your username contains an underscore and is no more than five characters in length.");
        }
        
        if (password.equals(input))
        {
        System.out.println("Password successfully captured");
        } else
        {
        System.out.println("Password is not correctly formatted; please ensure that the password contains at least eight characters, a capital letter, a number, and a special character.");
        }
        
    

          
    }
}

/*
CODE ATTRIBUTION

Author: Geeks for Geeks
Title: Scanner Class in Java
Date Published: 2025
Link: https://www.geeksforgeeks.org/java/scanner-class-in-java/
Date accessed: 12/04/2026

Author: Den of the Nerds
Title: Username and password Java Tutoria
Date Published: 2016
Link: https://www.youtube.com/watch?v=b9uAoYGg6-M
Date accessed: 13/04/2026
*/