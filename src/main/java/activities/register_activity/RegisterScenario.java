package activities.register_activity;

import base.SeleniumBaseTest;
import com.shaft.gui.browser.BrowserActions;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import utility.ElementCSS;
import utility.ElementID;
import utility.Strings;

public class RegisterScenario extends SeleniumBaseTest {


    By userName = By.id(ElementID.USER_NAME);
    By email = By.id(ElementID.EMAIL);
    By password = By.id(ElementID.PASSWORD);
    By createAccount = By.cssSelector(ElementCSS.CREATEACCOUNT);

    public RegisterScenario() {
        initSingleDriver();
        //initMultiDriver();
        enterRegister();
    }

    public void enterRegister() {
        BrowserActions.navigateToURL(driver, Strings.REGISTER_URL);
    }

    public void enterFillUserName(String username) {
        wait.until(ExpectedConditions.presenceOfElementLocated(userName)).sendKeys(username);
    }
    public void enterFillEmail(String mail) {
        wait.until(ExpectedConditions.presenceOfElementLocated(email)).sendKeys(mail);
    }
    public void enterFillPassword(String pass) {
        wait.until(ExpectedConditions.presenceOfElementLocated(password)).sendKeys(pass);
    }
    public void clickOnCreateAccount(){
        wrapper.ClickButtonUsingJavaScript(driver, createAccount);
    }
}