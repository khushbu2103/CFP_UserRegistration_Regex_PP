package org.example;

import java.util.regex.Pattern;

public class Validation {
    public static boolean firstNameValidation() throws CustomException {
        String firstName = "Khushi";
        String regex = "^[A-Z]{1}[a-z]{2,}$";
        Pattern pattern = Pattern.compile(regex);
        if (pattern.matcher(firstName).matches()) {
            System.out.println(firstName + ": Valid first name!");
        } else {
            System.out.println(firstName + ": Invalid first name!");
            throw new CustomException("Invalid first name");
        }
        return Pattern.matches(regex, firstName);
    }
    public static boolean lastNameValidation() throws CustomException {
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
            throw new CustomException("Invalid last name");
        }
        return Pattern.matches(regex, lastName);
    }
    public static boolean emailValidation() throws CustomException {
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
            throw new CustomException("Invalid email");
        }
        return Pattern.matches(regex, email);
    }
    public static boolean preDefinedMobileNumber() throws CustomException {
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
            throw new CustomException("Invalid mobile number");
        }
        return Pattern.matches(regex, mobile);
    }
    public static boolean preDefinedPasswordRule1() throws CustomException {
        String password = "qw9&ertyui";
        String regex = "^.{8,}$";
        Pattern pattern = Pattern.compile(regex);
        if (pattern.matcher(password).matches())
        {
            System.out.println( password + ": Valid password!");
        }
        else
        {
            System.out.println(password + ": Invalid password.");
            throw new CustomException("Invalid password");
        }
        return Pattern.matches(regex, password);
    }
    public static boolean preDefinedPasswordRule2() throws CustomException {
        String password2 = "Kwertyui";
        String regex = "^(?=.*[A-Z]).{8,}$";
        Pattern pattern = Pattern.compile(regex);
        if (pattern.matcher(password2).matches()) {
            System.out.println( password2 + ": Valid password!");
        }
        else
        {
            System.out.println(password2 + ": Invalid password.");
            throw new CustomException("Invalid password");
        }
        return Pattern.matches(regex, password2);
    }
    public static boolean preDefinedPasswordRule3() throws CustomException {
        String password3 = "K9wertyui";
        //String[] inputs = {"K9wertyui", "vhn9KHhbh", "kjhgftv"};
        String regex = "^(?=.*[A-Z])(?=.*[0-9]).{8,}$";
        Pattern pattern = Pattern.compile(regex);
        if (pattern.matcher(password3).matches()) {
            System.out.println( password3 + ": Valid password!");
        }
        else
        {
            System.out.println(password3 + ": Invalid password.");
            throw new CustomException("Invalid password");
        }
        return Pattern.matches(regex, password3);
    }
    public static boolean preDefinedPasswordRule4() throws CustomException {
        String password4 = "Ka7huyK79#A";
        //String[] inputs = {"K9we&tyu#i", "Khn9Kh%bhp", "kjhgftv"};
        String regex = "^(?=(?:[^!@#$%^&*()_+\\-=\\[\\]{};':\"\\\\|,.<>\\/?]*[!@#$%^&*()_+\\-=\\[\\]{};':\"\\\\|,.<>\\/?]){1}[^!@#$%^&*()_+\\-=\\[\\]{};':\"\\\\|,.<>\\/?]*$).*[^!@#$%^&*()_+\\-=\\[\\]{};':\"\\\\|,.<>\\/?]*$";
        //String regex = "^(?=[0-9]*[A-Z])(?=[a-zA-z]*[0-9]).{8,}$";
        Pattern pattern = Pattern.compile(regex);
        if (pattern.matcher(password4).matches()) {
            System.out.println( password4 + ": Valid email!");
        }
        else
        {
            System.out.println(password4 + ": Invalid email.");
            throw new CustomException("Invalid password");
        }
        return Pattern.matches(regex, password4);
    }
    public static boolean emailSamplesValidation() throws CustomException {
        String[] inputs = {"abc.xyz@bl.co.in", "yhz.out&kl.co.in", "abc.ykj@bl.co.ik"};
        String regex = "^abc\\.[A-Za-z]{1,}@bl\\.co\\.[A-Za-z]{2}$";
        Pattern pattern = Pattern.compile(regex);
        for (String input: inputs) {
            if (pattern.matcher(input).matches()) {
                System.out.println( input + ": Valid email!");
            }
            else
            {
                System.out.println(input + ": Invalid email!");
                throw new CustomException("Invalid email");

            }
        }
        return true;
    }
    public static boolean multipleEmailValidation(String email) throws CustomException {
        //String[] inputs = {"abc.xyz@bl.co.in", "yhz.out&kl.co.in", "abc.ykj@bl.co.ik"};
        String regex = "^abc\\.[A-Za-z]{1,}@bl\\.co\\.[A-Za-z]{2}$";
        Pattern pattern = Pattern.compile(regex);
        if (pattern.matcher(email).matches()) {
            System.out.println( email + ": Valid email!");
        }
        else
        {
            System.out.println(email + ": Invalid email!");
             throw new CustomException("Invalid email");
        }
        return Pattern.matches(regex, email);
    }
}
