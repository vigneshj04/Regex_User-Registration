package com.regex;
import java.util.*;

public class UserRegistrationMain {

    public static void main(String[] args) {
        System.out.println("Welcome to User Registration using regex program");
        UserRegistrationTest validate= new UserRegistrationTest();
        Scanner scan = new Scanner(System.in);
        System.out.println("1.To Validate the First name.");
        System.out.println("Enter the option number to perform the operation");
        int option = scan.nextInt();
        switch(option){
            case 1:
                System.out.println("Enter the First Name. Note: first letter should be capital");
                String firstName = scan.next();
                validate.validateFirstName(firstName);
                break;
            default:
                System.out.println("Please Enter valid option to validate the pattern");
                break;
        }
    }
}