import activities.LoginImplementation;
import base.SeleniumBaseTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Login {
    LoginImplementation loginImplementation;

    @BeforeClass
    public void beforeRunning() {
        loginImplementation = new LoginImplementation();
    }

    @Test
    public void phase1Happyscenario() {
        loginImplementation.fillHappyScenario();
    }
   /* @Test
    public void phase2scenario() {
        loginImplementation.fillScenarioWithoutEmail_Validation();
    }
    @Test
    public void phase3scenario() {
        loginImplementation.fillScenarioWithoutPassword_Validation();
    }
    @Test
    public void phase4scenario() {
        loginImplementation.fillScenarioWithInvalidEmail_Validation();
    }*/
    @AfterTest
    public void afterTest(){
        SeleniumBaseTest.driver.quit();
    }
}
