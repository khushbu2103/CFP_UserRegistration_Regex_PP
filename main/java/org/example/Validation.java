package org.example;
import java.util.Scanner;
import java.util.regex.Matcher;
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
                "4.pre defined mobile number validation\n" +
                "5.predefined password min 8 char\n" +
                "6.predefined password min 8 char, atleast 1 uppercase\n" +
                "7.predefined password min 8 char, atleast 1 uppercase, atleat 1 numeric\n" +
                "8.predefined password min 8 char, atleast 1 uppercase, atleat 1 numeric, one special char\n" +
                "9.email samples validation\n" +
                "10.multiple email validation with parameterised test");
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
                case 5:
                    ob.preDefinedPasswordRule1();
                    break;
                case 6:
                    ob.preDefinedPasswordRule2();
                    break;
                case 7:
                    ob.preDefinedPasswordRule3();
                    break;
                case 8:
                    ob.preDefinedPasswordRule4();
                    break;
                case 9:
                    ob.emailSamplesValidation();
                    break;
                case 10:
                    ob.multipleEmailValidation("abc.xyz@bl.co.ii");
                    break;
                default:
                    break;
            }
            System.out.println("Enter your choice");
            System.out.println("enter 0 to exit.\n" +
                    "1.first name validation\n" +
                    "2.last name validation\n" +
                    "3.email validation\n" +
                    "4.pre defined mobile number validation\n" +
                    "5.predefined password min 8 char\n" +
                    "6.predefined password min 8 char, atleast 1 uppercase\n" +
                    "7.predefined password min 8 char, atleast 1 uppercase, atleat 1 numeric\n" +
                    "8.predefined password min 8 char, atleast 1 uppercase, atleat 1 numeric, one special char\n" +
                    "9.email samples validation\n" +
                    "10.multiple email validation with parameterised test");
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
    public static boolean preDefinedPasswordRule1()
    {
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
        }
        return Pattern.matches(regex, password);
    }
    public static boolean preDefinedPasswordRule2()
    {
        String password2 = "Kwertyui";
        String regex = "^(?=.*[A-Z]).{8,}$";
        Pattern pattern = Pattern.compile(regex);
        if (pattern.matcher(password2).matches()) {
            System.out.println( password2 + ": Valid password!");
        }
        else
        {
            System.out.println(password2 + ": Invalid password.");
        }
        return Pattern.matches(regex, password2);
    }
    public static boolean preDefinedPasswordRule3()
    {
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
        }
        return Pattern.matches(regex, password3);
    }
    public static boolean preDefinedPasswordRule4()
    {
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
        }
        return Pattern.matches(regex, password4);
    }
    public static boolean emailSamplesValidation()
    {
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
            }
        }
        return true;
    }
    public static boolean multipleEmailValidation(String email)
    {
        //String[] inputs = {"abc.xyz@bl.co.in", "yhz.out&kl.co.in", "abc.ykj@bl.co.ik"};
        String regex = "^abc\\.[A-Za-z]{1,}@bl\\.co\\.[A-Za-z]{2}$";
        Pattern pattern = Pattern.compile(regex);
        if (pattern.matcher(email).matches()) {
            System.out.println( email + ": Valid email!");
        }
        else
        {
            System.out.println(email + ": Invalid email!");
        }
        return Pattern.matches(regex, email);
    }

}
