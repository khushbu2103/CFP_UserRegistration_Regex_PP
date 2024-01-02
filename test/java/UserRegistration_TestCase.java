import org.example.Validation;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
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
    @Test
    public void getPassWordValidation1()
    {
        Assert.assertTrue(Validation.preDefinedPasswordRule1());
    }
    @Test
    public void getPassWordValidation2()
    {
        Assert.assertTrue(Validation.preDefinedPasswordRule2());
    }
    @Test
    public void getPassWordValidation3()
    {
        Assert.assertTrue(Validation.preDefinedPasswordRule3());
    }
    @Test
    public void getPassWordValidation4()
    {
        Assert.assertTrue(Validation.preDefinedPasswordRule4());
    }
    @Test
    public void getEmailSamplesValidation()
    {
        Assert.assertTrue(Validation.emailSamplesValidation());
    }
    @Test
    public void getMultipleEmailValidation()
    {
        Assert.assertTrue(Validation.multipleEmailValidation("abc.xyz@bl.co.in"));
        Assert.assertFalse(Validation.multipleEmailValidation("abm.xyz@bl.co.in"));
        Assert.assertFalse(Validation.multipleEmailValidation("abc.xyz@bl.co"));

    }
}
