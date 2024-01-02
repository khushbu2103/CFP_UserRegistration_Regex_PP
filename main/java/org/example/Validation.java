package org.example;

import java.util.Scanner;
import java.util.regex.Pattern;

class UserRegistration {
    public static void main(String[] args) {
        System.out.println("Welcome to the user registration program");
        Validation ob = new Validation();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any regex validation");
        System.out.println("1.first name validation\n" +
                "2.last name validation");
        int option = sc.nextInt();
        int choice;
        do {
            switch (option) {
                case 1:
                    ob.firstNameValidation();
                    break;
                case 2:
                    ob.lastNameValidation();
                    break;
                default:
                    break;
            }
            System.out.println("Enter your choice");
            System.out.println("enter 0 to exit.\n" +
                    "1.first name validation\n" +
                    "2.last name validation");
            choice = sc.nextInt();
        } while (choice != 0);
    }
}
public class Validation {
    public static boolean firstNameValidation() {
        String firstName = "Khushi";
        String regex = "^[A-Z]{1}[a-z]{2,}$";
        Pattern pattern = Pattern.compile(regex);
        if (pattern.matcher(firstName).matches()) {
            System.out.println(firstName + ": Valid first name!");
        } else {
            System.out.println(firstName + ": Invalid first name!");
        }
        return Pattern.matches(regex, firstName);
    }
    public static boolean lastNameValidation()
    {
        String lastName = "Soni";
        String regex = "^[A-Z]{1}[a-z]{2,}$";
        Pattern pattern = Pattern.compile(regex);
        if(pattern.matcher(lastName).matches())
        {
            System.out.println(lastName + ": Valid last name!");
        }
        else
        {
            System.out.println(lastName + ": Invalid last name!");
        }
        return Pattern.matches(regex, lastName);
    }
}
