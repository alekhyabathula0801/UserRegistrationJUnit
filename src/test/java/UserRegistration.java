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
        boolean result = validator.checkPassword("jnsAXt$#NJ4");
        Assert.assertTrue(result);
    }
}
