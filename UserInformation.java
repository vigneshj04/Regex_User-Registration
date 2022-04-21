package com.regex;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserInformation {
    private String firstName;


    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
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