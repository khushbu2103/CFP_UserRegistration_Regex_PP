import org.example.Validation;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.assertTrue;
public class UserRegistration_TestCase {
    @Test
    public void getFirstNameValidation() {
        Assert.assertTrue(Validation.firstNameValidation());
    }
}