import org.example.Validation;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.assertTrue;
public class UserRegistration_TestCase {
    @Test
    public void getFirstNameValidation() {
        Assert.assertTrue(Validation.firstNameValidation());
    }
    @Test
    public void getLastNameValidation() {
        Assert.assertTrue(Validation.lastNameValidation());
    }
    @Test
    public void getEmailValidation()
    {
        Assert.assertTrue(Validation.emailValidation());
    }
    @Test
    public void getMobileNumberValidation()
    {
        Assert.assertTrue(Validation.preDefinedMobileNumber());
    }
}
