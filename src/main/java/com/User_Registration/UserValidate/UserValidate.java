package com.User_Registration.UserValidate;

import jdk.nashorn.api.scripting.NashornScriptEngine;
import jdk.nashorn.internal.codegen.Compiler;

import java.util.regex.Pattern;

public class UserValidate {
    public static final String FIRST_NAME_PATTERN = "^[A-Z]{1}[a-z]{2,}";
    public boolean checkFirstname(String firstName) {
        Pattern pattern = Pattern.compile(FIRST_NAME_PATTERN);
        return pattern.matcher(firstName).matches();
    }
}