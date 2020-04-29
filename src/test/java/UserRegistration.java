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
    public void givenFirstName_ifProper_thenReturnTrue() {
        UserValidate validator = new UserValidate();
        boolean result = validator.checkFirstName("Alekhya");
        Assert.assertTrue(result);
    }

    @Test
    public void givenFirstName_ifShort_thenReturnFalse() {
        UserValidate validator = new UserValidate();
        boolean result = validator.checkFirstName("Al");
        Assert.assertFalse(result);
    }

    @Test
    public void givenFirstName_ifNoUpperCase_thenReturnFalse() {
        UserValidate validator = new UserValidate();
        boolean result = validator.checkFirstName("alekhya");
        Assert.assertFalse(result);
    }

    @Test
    public void givenFirstName_ifContainsNumeric_thenReturnFalse() {
        UserValidate validator = new UserValidate();
        boolean result = validator.checkFirstName("Alekhya1");
        Assert.assertFalse(result);
    }

    @Test
    public void givenFirstName_ifContainsSpecialChar_thenReturnFalse() {
        UserValidate validator = new UserValidate();
        boolean result = validator.checkFirstName("Alekhya$");
        Assert.assertFalse(result);
    }

    @Test
    public void givenLastName_ifProper_thenReturnTrue() {
        UserValidate validator = new UserValidate();
        boolean result = validator.checkLastName("Bathula");
        Assert.assertTrue(result);
    }

    public UserRegistration(String email,Boolean expectedResult) {
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
                {"abc@gmail.com.com", false},
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
    public void givenMobileNumber_ifProper_thenReturnTrue() {
        UserValidate validator = new UserValidate();
        boolean result = validator.checkMobileNumber("91 1234567890");
        Assert.assertTrue(result);
    }

    @Test
    public void givenMobileNumber_ifNoSpace_thenReturnFalse() {
        UserValidate validator = new UserValidate();
        boolean result = validator.checkMobileNumber("911234567890");
        Assert.assertFalse(result);
    }

    @Test
    public void givenMobileNumber_ifContainCharacter_thenReturnFalse() {
        UserValidate validator = new UserValidate();
        boolean result = validator.checkMobileNumber("91 12a457890");
        Assert.assertFalse(result);
    }

    @Test
    public void givenMobileNumber_ifContainSpecialCharacter_thenReturnFalse() {
        UserValidate validator = new UserValidate();
        boolean result = validator.checkMobileNumber("91 1&34567890");
        Assert.assertFalse(result);
    }

    @Test
    public void givenPassword_ifLong_thenReturnTrue() {
        UserValidate validator = new UserValidate();
        boolean result = validator.checkPasswordLength("jnJhufgik4");
        Assert.assertTrue(result);
    }

    @Test
    public void givenPassword_ifShort_thenReturnFalse() {
        UserValidate validator = new UserValidate();
        boolean result = validator.checkPasswordLength("jnJ@4");
        Assert.assertFalse(result);
    }

    @Test
    public void givenPassword_ifAtleastOneUppercase_thenReturnTrue() {
        UserValidate validator = new UserValidate();
        boolean result = validator.checkPasswordWithAtleastOneUppercase("saaRjmHn6rf");
        Assert.assertTrue(result);
    }

    @Test
    public void givenPassword_ifNoUppercase_thenReturnFalse() {
        UserValidate validator = new UserValidate();
        boolean result = validator.checkPasswordLength("jn#hufgik4");
        Assert.assertFalse(result);
    }

    @Test
    public void givenPassword_ifAtleastOneNumericValue_thenReturnTrue() {
        UserValidate validator = new UserValidate();
        boolean result = validator.checkPasswordWithAtleastOneNumber("khws3sVUJG7Fc");
        Assert.assertTrue(result);
    }

    @Test
    public void givenPassword_ifNoNumericValue_thenReturnFalse() {
        UserValidate validator = new UserValidate();
        boolean result = validator.checkPasswordWithAtleastOneNumber("khws%sVUJGFc");
        Assert.assertFalse(result);
    }

    @Test
    public void givenPassword_ifExactlyOneSpecialCharacter_thenReturnTrue() {
        UserValidate validator = new UserValidate();
        boolean result = validator.checkPasswordWithExactlyOneSpecialCharacter("Lg5@jgc68UG6");
        Assert.assertTrue(result);
    }

    @Test
    public void givenPassword_ifNoSpecialCharacter_thenReturnFalse() {
        UserValidate validator = new UserValidate();
        boolean result = validator.checkPasswordWithExactlyOneSpecialCharacter("Lg5jgc68UG6");
        Assert.assertFalse(result);
    }

    @Test
    public void givenPassword_ifMoreThanOneSpecialCharacter_thenReturnFalse() {
        UserValidate validator = new UserValidate();
        boolean result = validator.checkPasswordWithExactlyOneSpecialCharacter("Lg5jg#c6^8UG6");
        Assert.assertFalse(result);
    }
}
