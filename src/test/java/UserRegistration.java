import com.User_Registration.UserValidate.UserValidate;
import org.junit.Assert;
import org.junit.Test;

public class UserRegistration {
    @Test
    public void givenFirstName_ifProper_thenReturnTrue() {
        UserValidate validator = new UserValidate();
        boolean result = validator.checkFirstname("Alekhya");
        Assert.assertTrue(result);
    }
}
