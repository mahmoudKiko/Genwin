package activities;
import base.SeleniumBaseTest;
import com.shaft.gui.browser.BrowserActions;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import utility.ElementCSS;
import utility.ElementID;
import utility.Strings;

public class LoginScenario extends SeleniumBaseTest{

       By email = By.id(ElementID.LOGIN_EMAIL);
       By password = By.id(ElementID.LOGIN_PASSWORD);
       By loginBtn = By.cssSelector(ElementCSS.LOGIN_BTN);

        public LoginScenario() {
            initSingleDriver();
            enterLogin();
        }

        public void enterLogin() {
            BrowserActions.navigateToURL(driver, Strings.LOGIN_URL);
        }

        public void enterFillEmail(String mail) {
            wait.until(ExpectedConditions.presenceOfElementLocated(email)).sendKeys(mail);
        }
        public void enterFillPassword(String pass) {
            wait.until(ExpectedConditions.presenceOfElementLocated(password)).sendKeys(pass);
        }
        public void clickOnLoginButton(){

            wrapper.ClickButtonUsingJavaScript(driver, loginBtn);
        }
        public void EndTestCase(){
            driver.close();
        }
}
