package com.regex;

import org.junit.Test;

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
    public void validateMobNumber(String number){
        storePattern.setMobileNumber("^[0-9]{2}\s?[0-9]{10}");
        String mobPattern= storePattern.getMobileNumber();
        storePattern.validatingInput(number,mobPattern,"Mobile Number");
    }

    @Test
    public void validatePassword(String password){
        storePattern.setPasswordPattern("(?=.{8,})(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])[0-9a-zA-Z]*[@#$%_!^&*][0-9a-zA-Z]*");
        String passPattern= storePattern.getPasswordPattern();
        storePattern.validatingInput(password,passPattern,"Password");
    }

}