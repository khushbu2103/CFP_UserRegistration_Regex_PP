import org.example.CustomException;
import org.example.Validation;
import org.junit.Assert;
import org.junit.Test;

import javax.swing.undo.CannotUndoException;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
public class UserRegistration_TestCase {
    @Test
    public void getFirstNameValidation() {
        try {
            Assert.assertTrue(Validation.firstNameValidation());
        }
        catch (CustomException e) {
            System.out.println(e.getMessage());
        }
    }
    @Test
    public void getLastNameValidation()
    {
        try
        {
            Assert.assertTrue(Validation.lastNameValidation());
        }
        catch (CustomException e) {
            System.out.println(e.getMessage());
        }
    }
    @Test
    public void getEmailValidation()
    {
        try {
            Assert.assertTrue(Validation.emailValidation());
        }
        catch (CustomException e) {
            System.out.println(e.getMessage());
        }
    }
    @Test
    public void getMobileNumberValidation()
    {
        try {
            Assert.assertTrue(Validation.preDefinedMobileNumber());
        }
        catch (CustomException e) {
            System.out.println(e.getMessage());
        }
    }
    @Test
    public void getPassWordValidation1()
    {
        try {
            Assert.assertTrue(Validation.preDefinedPasswordRule1());
        }
        catch (CustomException e) {
            System.out.println(e.getMessage());
        }
    }
    @Test
    public void getPassWordValidation2()
    {
        try {
            Assert.assertTrue(Validation.preDefinedPasswordRule2());
        }
        catch (CustomException e) {
            System.out.println(e.getMessage());
        }
    }
    @Test
    public void getPassWordValidation3() {
        try {
            Assert.assertTrue(Validation.preDefinedPasswordRule3());
        }
        catch (CustomException e) {
            System.out.println(e.getMessage());
        }
    }
    @Test
    public void getPassWordValidation4()
    {
        try {
            Assert.assertTrue(Validation.preDefinedPasswordRule4());
        }
        catch (CustomException e) {
        System.out.println(e.getMessage());
    }
    }
    @Test
    public void getEmailSamplesValidation()
    {
        try {
            Assert.assertTrue(Validation.emailSamplesValidation());
        }
        catch (CustomException e) {
        System.out.println(e.getMessage());
    }
    }
    @Test
    public void getMultipleEmailValidation()
    {
        try {
            Assert.assertTrue(Validation.multipleEmailValidation("abc.xyz@bl.co.in"));
        }
        catch (CustomException e) {
            System.out.println(e.getMessage());
        }
        try
        {
            Assert.assertFalse(Validation.multipleEmailValidation("abm.xyz@bl.co.in"));
        }
        catch (CustomException e) {
            System.out.println(e.getMessage());
        }
        try
        {
            Assert.assertFalse(Validation.multipleEmailValidation("abc.xyz@bl.co"));
        }
        catch (CustomException e) {
            System.out.println(e.getMessage());
        }

    }
}
