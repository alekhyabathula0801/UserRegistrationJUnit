package com.userRegistration;

import com.User_Registration.UserValidate.UserValidate;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class UserRegistration {
    private final String email;
    private final Boolean expectedResult;
    private UserValidate validator;

    @Before
    public void initialize() {
        validator = new UserValidate();
    }

    @Test
    public void givenFirstName_whenProper_shouldReturnTrue() {
        UserValidate validator = new UserValidate();
        boolean result = validator.checkFirstName("Alekhya");
        Assert.assertTrue(result);
    }

    @Test
    public void givenFirstName_whenShort_shouldReturnFalse() {
        UserValidate validator = new UserValidate();
        boolean result = validator.checkFirstName("Al");
        Assert.assertFalse(result);
    }

    @Test
    public void givenFirstName_whenNoUpperCase_shouldReturnFalse() {
        UserValidate validator = new UserValidate();
        boolean result = validator.checkFirstName("alekhya");
        Assert.assertFalse(result);
    }

    @Test
    public void givenFirstName_whenContainsNumeric_shouldReturnFalse() {
        UserValidate validator = new UserValidate();
        boolean result = validator.checkFirstName("Alekhya1");
        Assert.assertFalse(result);
    }

    @Test
    public void givenFirstName_whenContainsSpecialChar_shouldReturnFalse() {
        UserValidate validator = new UserValidate();
        boolean result = validator.checkFirstName("Alekhya$");
        Assert.assertFalse(result);
    }

    @Test
    public void givenLastName_whenProper_shouldReturnTrue() {
        UserValidate validator = new UserValidate();
        boolean result = validator.checkLastName("Bathula");
        Assert.assertTrue(result);
    }

    public UserRegistration(String email, Boolean expectedResult) {
        this.email = email;
        this.expectedResult =expectedResult;
    }

    @Parameterized.Parameters
    public static Collection email_with_expectedResult() {
        return Arrays.asList(new Object[][]{
                {"abc@yahoo.com", true},
                {"abc-100@yahoo.com", true},
                {"abc.100@yahoo.com", true},
                {"abc111@abc.com", true},
                {"abc-100@abc.net", true},
                {"abc.100@abc.com.au", true},
                {"abc@1.com", true},
                {"abc+100@gmail.com", true},
                {"abc@gmail.com.com", true},
                {"abc", false},
                {"abc@.com.my", false},
                {"abc123@gmail.a", false},
                {"abc123@.com", false},
                {"abc123@.com.com", false},
                {".abc123@abc.com", false},
                {"abc()*@gmail.com", false},
                {"abc@%*.com", false},
                {"abc..2002@gmail.com", false},
                {"abc.@gmail.com", false},
                {"abc@abc@gmail.com", false},
                {"abc@@gmail.com.1a", false},
                {"abc@gmail.com.aa.au", false},
        });
    }

    @Test
    public void givenEmailId_shouldReturnExpectedResult() {
        System.out.println("email id is : " + email);
        Assert.assertEquals(expectedResult, validator.checkEmailId(email));
    }

    @Test
    public void givenMobileNumber_whenProper_shouldReturnTrue() {
        UserValidate validator = new UserValidate();
        boolean result = validator.checkMobileNumber("91 1234567890");
        Assert.assertTrue(result);
    }

    @Test
    public void givenMobileNumber_whenNoSpace_shouldReturnFalse() {
        UserValidate validator = new UserValidate();
        boolean result = validator.checkMobileNumber("911234567890");
        Assert.assertFalse(result);
    }

    @Test
    public void givenMobileNumber_whenContainCharacter_shouldReturnFalse() {
        UserValidate validator = new UserValidate();
        boolean result = validator.checkMobileNumber("91 12a457890");
        Assert.assertFalse(result);
    }

    @Test
    public void givenMobileNumber_whenContainSpecialCharacter_shouldReturnFalse() {
        UserValidate validator = new UserValidate();
        boolean result = validator.checkMobileNumber("91 1&34567890");
        Assert.assertFalse(result);
    }

    @Test
    public void givenPassword_whenLong_shouldReturnTrue() {
        UserValidate validator = new UserValidate();
        boolean result = validator.checkPassword("Aa!a9dhBj7cb");
        Assert.assertTrue(result);
    }

    @Test
    public void givenPassword_whenShort_shouldReturnFalse() {
        UserValidate validator = new UserValidate();
        boolean result = validator.checkPassword("jn2J@4");
        Assert.assertFalse(result);
    }

    @Test
    public void givenPassword_whenAtleastOneUppercase_shouldReturnTrue() {
        UserValidate validator = new UserValidate();
        boolean result = validator.checkPassword("saa^RjmHn6rf");
        Assert.assertTrue(result);
    }

    @Test
    public void givenPassword_whenNoUppercase_shouldReturnFalse() {
        UserValidate validator = new UserValidate();
        boolean result = validator.checkPassword("jn#hufgik4");
        Assert.assertFalse(result);
    }

    @Test
    public void givenPassword_whenAtleastOneNumericValue_shouldReturnTrue() {
        UserValidate validator = new UserValidate();
        boolean result = validator.checkPassword("khws3sV!G7Fc");
        Assert.assertTrue(result);
    }

    @Test
    public void givenPassword_whenNoNumericValue_shouldReturnFalse() {
        UserValidate validator = new UserValidate();
        boolean result = validator.checkPassword("khws%sVUJGFc");
        Assert.assertFalse(result);
    }

    @Test
    public void givenPassword_whenExactlyOneSpecialCharacter_shouldReturnTrue() {
        UserValidate validator = new UserValidate();
        boolean result = validator.checkPassword("Lg5@jgc68UG6");
        Assert.assertTrue(result);
    }

    @Test
    public void givenPassword_whenNoSpecialCharacter_shouldReturnFalse() {
        UserValidate validator = new UserValidate();
        boolean result = validator.checkPassword("Lg5jgc68UG6");
        Assert.assertFalse(result);
    }

    @Test
    public void givenPassword_whenMoreThanOneSpecialCharacter_shouldReturnFalse() {
        UserValidate validator = new UserValidate();
        boolean result = validator.checkPassword("Lg5jg#c6^8UG6");
        Assert.assertFalse(result);
    }
}
