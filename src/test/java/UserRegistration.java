import com.User_Registration.UserValidate.UserValidate;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

public class UserRegistration {
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

    @Test
    public void givenEmailId_ifProper_thenReturnTrue() {
        UserValidate validator = new UserValidate();
        boolean result = validator.checkEmailId("alekhya0801@gmail.com");
        Assert.assertTrue(result);
    }

    @Test
    public void givenEmailId_ifNotValid_thenReturnFalse() {
        UserValidate validator = new UserValidate();
        boolean result = validator.checkEmailId("alekhya@gmail.");
        Assert.assertFalse(result);
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
    public void givenPassword_ifAtleastOneUppercase_thenReturnTrue() {
        UserValidate validator = new UserValidate();
        boolean result = validator.checkPasswordWithAtleastOneUppercase("saaRjmHn6rf");
        Assert.assertTrue(result);
    }

    @Test
    public void givenPassword_ifAtleastOneNumericValue_thenReturnTrue() {
        UserValidate validator = new UserValidate();
        boolean result = validator.checkPasswordWithAtleastOneNumber("khws3sVUJG7Fc");
        Assert.assertTrue(result);
    }

    @Test
    public void givenPassword_ifExactlyOneSpecialCharacter_thenReturnTrue() {
        UserValidate validator = new UserValidate();
        boolean result = validator.checkPasswordWithExactlyOneSpecialCharacter("Lg5@jgc68UG6");
        Assert.assertTrue(result);
    }
}
