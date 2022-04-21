package com.regex;

import org.junit.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistrationTest {
    UserInformation storePattern = new UserInformation();

    @Test
    public void validateFirstName(String firstName) {
        storePattern.setFirstName("^[A-Z]{1}[a-z]{3,}$");
        String first = storePattern.getFirstName();
        storePattern.validatingInput(firstName, first, "FirstName");
    }

    @Test
    public void validateLastName(String lastName) {
        storePattern.setLastName("^[A-Z]{1}[a-z]{3,}$");
        String last = storePattern.getLastName();
        storePattern.validatingInput(lastName, last, "LastName");
    }

    @Test
    public void validateEmail(String email) {
        storePattern.setEmail("^[a-zA-Z]+[a-zA-Z0-9]*[- . + _]?[a-zA-Z0-9]+[@][a-z0-9]+[.]{1}[a-z]+[.]?[a-z]+$");
        String mail = storePattern.getEmail();
        storePattern.validatingInput(email, mail, "Email");
    }

    @Test
    public void validateMobNumber(String number) {
        storePattern.setMobileNumber("^[0-9]{2}\s?[0-9]{10}");
        String mobPattern = storePattern.getMobileNumber();
        storePattern.validatingInput(number, mobPattern, "Mobile Number");
    }

    @Test
    public void validatePassword(String password) {
        storePattern.setPasswordPattern("(?=.{8,})(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])[0-9a-zA-Z]*[@#$%_!^&*][0-9a-zA-Z]*");
        String passPattern = storePattern.getPasswordPattern();
        storePattern.validatingInput(password, passPattern, "Password");
    }

    @Test
    public static void validateEmailsList(String[] emails) {
        for (int i = 0; i <= emails.length; i++) {
            Pattern pattern = Pattern.compile("^[a-zA-Z]+[a-zA-Z0-9]*[- . + _]?[a-zA-Z0-9]+[@][a-z0-9]+[.][a-z]+[.]?[a-z]+$");
            Matcher matcher = pattern.matcher(emails[i]);
            if (matcher.matches()) {
                System.out.println(emails + " : This Email id is valid");
            } else {
                System.out.println(emails + " : This Email id is Invalid");
            }
        }
    }
}   