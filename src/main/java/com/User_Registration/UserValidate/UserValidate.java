package com.User_Registration.UserValidate;

import java.util.regex.Pattern;

public class UserValidate {
    public static final String NAME_PATTERN = "^[A-Z][a-z]{2,}";
    public static final String EMAIL_PATTERN = "^[a-zA-Z0-9]+([._+-][0-9a-zA-Z]+)*@[a-zA-Z0-9]+.[a-zA-Z]{2,4}([.][a-zA-Z]{2,3})?$";
    public static final String MOBILE_NUMBER_PATTERN = "^[0-9]{1,3}[ ][0-9]{10}$";
    public static final String PASSWORD_PATTERN = "(?=.*[A-Z])(?=.*[^0-9a-zA-Z])(?=.*[0-9]).{8,}";

    public boolean checkFirstName(String firstName) {
        Pattern pattern = Pattern.compile(NAME_PATTERN);
        return pattern.matcher(firstName).matches();
    }

    public boolean checkLastName(String lastName) {
        Pattern pattern = Pattern.compile(NAME_PATTERN);
        return pattern.matcher(lastName).matches();
    }

    public boolean checkEmailId(String emailId) {
        Pattern pattern = Pattern.compile(EMAIL_PATTERN);
        return pattern.matcher(emailId).matches();
    }

    public boolean checkMobileNumber(String mobileNumber) {
        Pattern pattern = Pattern.compile(MOBILE_NUMBER_PATTERN);
        return pattern.matcher(mobileNumber).matches();
    }

    public boolean checkPassword(String password) {
        Pattern pattern = Pattern.compile(PASSWORD_PATTERN);
        return pattern.matcher(password).matches();
    }
}