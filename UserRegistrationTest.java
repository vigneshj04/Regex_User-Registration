package com.regex;

public class UserRegistrationTest {

    public void validateFirstName(String firstName) {
        UserInformation store = new UserInformation();
        store.setFirstName("^[A-Z]{1}[a-z]{3,}$");
        String first = store.getFirstName();
        store.validatingInput(firstName, first, "FirstName");
    }

    public void validateLastName(String lastName) {
        UserInformation f = new UserInformation();
        f.setLastName("^[A-Z]{1}[a-z]{3,}$");
        String last = f.getLastName();
        f.validatingInput(lastName, last, "LastName");
    }

    public void validateEmail(String email) {
        UserInformation storePattern = new UserInformation();
        storePattern.setEmail("^[a-zA-Z]+[a-zA-Z0-9]*[- . + _]?[a-zA-Z0-9]+[@][a-z0-9]+[.]{1}[a-z]+[.]?[a-z]+$");
        String mail = storePattern.getEmail();
        storePattern.validatingInput(email, mail, "Email");

    }
}