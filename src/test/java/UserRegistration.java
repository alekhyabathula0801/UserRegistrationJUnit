import com.User_Registration.UserValidate.UserValidate;
import org.junit.Assert;
import org.junit.Test;

public class UserRegistration {
    @Test
    public void givenFirstName_ifProper_thenReturnTrue() {
        UserValidate validator = new UserValidate();
        boolean result = validator.checkFirstName("Alekhya");
        Assert.assertTrue(result);
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
    public void givenMobileNumber_ifProper_thenReturnTrue() {
        UserValidate validator = new UserValidate();
        boolean result = validator.checkMobileNumber("91 1234567890");
        Assert.assertTrue(result);
    }

    @Test
    public void givenPassword_ifLong_thenReturnTrue() {
        UserValidate validator = new UserValidate();
        boolean result = validator.checkPasswordLength("jnJfgik4");
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
}
