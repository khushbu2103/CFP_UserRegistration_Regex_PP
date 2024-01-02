package org.example;

import java.util.regex.Pattern;

class UserRegistration {
    public static void main(String[] args) {
        System.out.println("Welcome to the user registration program");
        Validation ob = new Validation();
        ob.firstNameValidation();
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
}
