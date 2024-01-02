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
                "2.last name validation\n" +
                "3.email validation\n" +
                "4.pre defined mobile number validation");
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
                case 3:
                    ob.emailValidation();
                    break;
                case 4:
                    ob.preDefinedMobileNumber();
                    break;
                default:
                    break;
            }
            System.out.println("Enter your choice");
            System.out.println("enter 0 to exit.\n" +
                    "1.first name validation\n" +
                    "2.last name validation\n" +
                    "3.email validation\n" +
                    "4.pre defined mobile number validation");
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
    public static boolean emailValidation()
    {
        String email = "abc.xyz@bl.co.in";
        // String[] inputs = {"abc.xyz@bl.co.in", "yhz.out&kl.co.in", "abc.ykj@bl.co.ik"};
        String regex = "^abc\\.[A-Za-z]{1,}@bl\\.co\\.[A-Za-z]{2}$";
        Pattern pattern = Pattern.compile(regex);
        if (pattern.matcher(email).matches()) {
            System.out.println( email + ": Valid email!");
        }
        else
        {
            System.out.println(email + ": Invalid email.");
        }
        return Pattern.matches(regex, email);
    }
    public static boolean preDefinedMobileNumber()
    {
        String mobile = "91 9460984883";
        //String[] inputs = {"91 9460984883", "946098488398", "912 7654327654"};
        String regex = "^[0-9]{2}[ ][0-9]{10}$";
        Pattern pattern = Pattern.compile(regex);
        if (pattern.matcher(mobile).matches()) {
            System.out.println( mobile + ": Valid mobile number!");
        }
        else
        {
            System.out.println(mobile + ": Invalid mobile number!");
        }
        return Pattern.matches(regex, mobile);
    }
}
