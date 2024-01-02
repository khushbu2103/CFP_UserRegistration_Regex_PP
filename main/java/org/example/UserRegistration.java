package org.example;
import java.util.Scanner;

public class UserRegistration {
    public static void main(String[] args) throws CustomException {
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
