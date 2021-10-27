package activities;

import base.SeleniumBaseTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import utility.Strings;

public class LoginImplementation {
    LoginScenario loginScenario;
    LoginAssertions loginAssertions;

    public LoginImplementation () {loginScenario = new LoginScenario();}
    public void fillHappyScenario(){
        loginScenario.enterFillEmail("Peter.rimon1995@gmail.com");
        loginScenario.enterFillPassword("asd@123456");
        loginScenario.clickOnLoginButton();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Assert.assertEquals(Strings.AdminPage_Dashboard, SeleniumBaseTest.driver.getCurrentUrl());
    }

  /*  public void fillScenarioWithoutEmail_Validation(){
        loginScenario.enterFillPassword("asd@123456");
        loginScenario.clickOnLoginButton();

        loginAssertions.emptyEmailFieldAssert();
    }
    public void fillScenarioWithoutPassword_Validation(){
        loginScenario.enterFillEmail("Peter.rimon1995@gmail.com");
        loginScenario.clickOnLoginButton();
        loginAssertions.emptyPasswordFieldAssert();
    }
    public void fillScenarioWithInvalidEmail_Validation(){
        loginScenario.enterFillEmail("Peter");
        loginScenario.clickOnLoginButton();
        loginAssertions.invalidEmailFieldAssert();
    }*/
}
