package com.regex;

public class UserRegistrationTest {

    public void validateFirstName(String firstName){
        UserInformation store =new UserInformation();
        store.setFirstName("^[A-Z]{1}[a-z]{3,}$");
        String first= store.getFirstName();
        store.validatingInput(firstName,first,"FirstName");
    }
}
