package org.example;

import java.util.function.Function;
import java.util.regex.Pattern;

public class Validation {
    public static boolean firstNameValidation() throws CustomException {
        String firstName = "Khushi";
        Function<String, Boolean> validateFirstName = name -> name.matches("^[A-Z]{1}[a-z]{2,}$");
        if (validateFirstName.apply(firstName))
        {
            System.out.println("First Name is valid: " + validateFirstName.apply(firstName));
            return true;
        }

        throw new CustomException("Invalid first name");
    }
    public static boolean lastNameValidation() throws CustomException {
        String lastName = "Soni";
        Function<String, Boolean> validateFirstName = name -> name.matches("^[A-Z]{1}[a-z]{2,}$");
        if (validateFirstName.apply(lastName))
        {
            System.out.println("Last Name is valid: " + validateFirstName.apply(lastName));
            return true;
        }
        throw new CustomException("Invalid last name");
    }
    public static boolean emailValidation() throws CustomException {
        String email = "abc.xyz@bl.co.in";
        Function<String, Boolean> validateEmail = name -> name.matches("^abc\\.[A-Za-z]{1,}@bl\\.co\\.[A-Za-z]{2}$");
        if (validateEmail.apply(email))
        {
            System.out.println("Email is valid: " + validateEmail.apply(email));
            return true;
        }
        throw new CustomException("Invalid email");
    }
    public static boolean preDefinedMobileNumber() throws CustomException {
        String mobile = "91 9460984883";
        Function<String, Boolean> validateMobileNumber = name -> name.matches("^[0-9]{2}[ ][0-9]{10}$");
        if (validateMobileNumber.apply(mobile))
        {
            System.out.println("Mobile number is valid: " + validateMobileNumber.apply(mobile));
            return true;
        }
        throw new CustomException("Invalid mobile number");
    }
    public static boolean preDefinedPasswordRule1() throws CustomException {
        String password = "qw9&ertyui";
        Function<String, Boolean> validateMobileNumber = name -> name.matches("^.{8,}$");
        if (validateMobileNumber.apply(password))
        {
            System.out.println("Password is valid: " + validateMobileNumber.apply(password));
            return true;
        }
        throw new CustomException("Invalid password");
    }
    public static boolean preDefinedPasswordRule2() throws CustomException {
        String password2 = "Kwertyui";
        Function<String, Boolean> validateMobileNumber = name -> name.matches("^(?=.*[A-Z]).{8,}$");
        if (validateMobileNumber.apply(password2))
        {
            System.out.println("Password is valid: " + validateMobileNumber.apply(password2));
            return true;
        }
        throw new CustomException("Invalid password");
    }
    public static boolean preDefinedPasswordRule3() throws CustomException {
        String password3 = "K9wertyui";
        Function<String, Boolean> validateMobileNumber = name -> name.matches("^(?=.*[A-Z])(?=.*[0-9]).{8,}$");
        if (validateMobileNumber.apply(password3))
        {
            System.out.println("Password is valid: " + validateMobileNumber.apply(password3));
            return true;
        }
        throw new CustomException("Invalid password");
    }
    public static boolean preDefinedPasswordRule4() throws CustomException {
        String password4 = "Ka7huyK79#A";
        Function<String, Boolean> validateMobileNumber = name -> name.matches("^(?=(?:[^!@#$%^&*()_+\\-=\\[\\]{};':\"\\\\|,.<>\\/?]*[!@#$%^&*()_+\\-=\\[\\]{};':\"\\\\|,.<>\\/?]){1}[^!@#$%^&*()_+\\-=\\[\\]{};':\"\\\\|,.<>\\/?]*$).*[^!@#$%^&*()_+\\-=\\[\\]{};':\"\\\\|,.<>\\/?]*$");
        if (validateMobileNumber.apply(password4))
        {
            System.out.println("Password is valid: " + validateMobileNumber.apply(password4));
            return true;
        }
        throw new CustomException("Invalid password");
    }
    public static boolean emailSamplesValidation() throws CustomException {
        String[] inputs = {"abc.xyz@bl.co.in", "yhz.out&kl.co.in", "abc.ykj@bl.co.ik","yhz.out&kl.co.in"};
        //String regex = "^abc\\.[A-Za-z]{1,}@bl\\.co\\.[A-Za-z]{2}$";
        for(String input: inputs)
        {
            Function<String, Boolean> validateEmail = email -> email.matches("^abc\\.[A-Za-z]{1,}@bl\\.co\\.[A-Za-z]{2}$");
            if (validateEmail.apply(input))
            {
                System.out.println(input +" : is valid: " + validateEmail.apply(input));
                //return true;
            }
            else
            {
                System.out.println(input +" : is valid: " + validateEmail.apply(input));
            }
        }
        throw new CustomException("Invalid email");

    }
    public static boolean multipleEmailValidation(String email) throws CustomException {
        String regex = "^abc\\.[A-Za-z]{1,}@bl\\.co\\.[A-Za-z]{2}$";
        Function<String, Boolean> validateMobileNumber = name -> name.matches("^abc\\.[A-Za-z]{1,}@bl\\.co\\.[A-Za-z]{2}$");
        if (validateMobileNumber.apply(email))
        {
            System.out.println("Password is valid: " + validateMobileNumber.apply(email));
            return true;
        }
        throw new CustomException("Invalid password");
    }
}
