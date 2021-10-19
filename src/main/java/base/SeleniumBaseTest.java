package base;

import com.shaft.gui.browser.BrowserFactory;
import com.shaft.gui.element.ElementActions;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;
import utility.Wrappeer;


public class SeleniumBaseTest {


    public static WebDriver driver;
    public static Actions builder;
    public static JavascriptExecutor js;
    public static WebDriverWait wait;
    public static SoftAssert softAssert;
    public static Wrappeer wrapper;
    public static ElementActions elementActions;

    public static void initSingleDriver() {
        driver = BrowserFactory.getBrowser();
        builder = new Actions(driver);
        js = (JavascriptExecutor) driver;
        wrapper = new Wrappeer(driver);
        wait = new WebDriverWait(driver, 20);
        softAssert = new SoftAssert();
        elementActions = new ElementActions(driver);
    }

    public static void click(By element) {
        ElementActions.click(driver, element);
    }

}