package activities;

import base.SeleniumBaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;

public class Assertion extends SeleniumBaseTest {

    String actual;
    String exceptedNameFieldError  ="";//Name is not valid
    String exceptedEmailFieldError ="The Email field is required";//The Email field is required

    public void assertNameField(){
        actual = driver.findElement(By.id("inputName-feedback")).getText();
        Assert.assertEquals(actual,exceptedNameFieldError);
        System.out.println("passed");
    }

    public void assertEamilField(){
        actual = driver.findElement(By.id("inputEmail-feedback")).getText();
        Assert.assertEquals(actual,exceptedEmailFieldError);
        System.out.println("passed");
    }





}


