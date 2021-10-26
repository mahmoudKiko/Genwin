package activities;

import base.SeleniumBaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class LoginAssertions extends SeleniumBaseTest {

    String actual;
    String expectedEmptyEmailFieldErrorMessage="The email field is required";
    String expectedInvalidEmailFieldErrorMessage="The email field must be a valid email";
    String expectedEmptyPasswordFieldErrorMessage="The password field is required";

    public void emptyEmailFieldAssert(){
        actual = driver.findElement(By.id("input-username-feedback")).getText();
        Assert.assertEquals(actual,expectedEmptyEmailFieldErrorMessage);
    }
    public void invalidEmailFieldAssert(){
        actual = driver.findElement(By.id("input-username-feedback")).getText();
        Assert.assertEquals(actual,expectedInvalidEmailFieldErrorMessage);
    }
    public void emptyPasswordFieldAssert(){
        actual = driver.findElement(By.id("input-password-feedback")).getText();
        Assert.assertEquals(actual,expectedEmptyPasswordFieldErrorMessage);
    }
}
