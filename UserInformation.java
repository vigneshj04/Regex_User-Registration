package com.regex;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserInformation {
    private String firstName;
    private String lastName;
    public  String email;

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return lastName;
    }

    public void validatingInput(String input,String checkPattern,String option){
        Pattern pattern = Pattern.compile(checkPattern);
        Matcher matcher = pattern.matcher(input);
        if (matcher.matches())
            System.out.println("Entered "+option+ " : " +input+" is valid");
        else
            System.out.println("Entered "+option+ " : " +input+" is invalid");
    }

}